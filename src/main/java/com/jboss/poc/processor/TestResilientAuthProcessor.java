package com.jboss.poc.processor;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.TrustManager;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transport.http.HTTPConduit;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.jboss.poc.model.resilient.auth.Credential;


public class TestResilientAuthProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		Credential credential = (Credential) exchange.getIn().getBody();
		String httpPath = (String) exchange.getIn().getHeader(Exchange.HTTP_PATH);
		String httpMethod = (String) exchange.getIn().getHeader(Exchange.HTTP_METHOD);
		String server = (String) exchange.getProperty("resilient.server");
		
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		String url = server + "/" + httpPath;
		
		WebClient client = WebClient.create(url, providers);
		MultivaluedMap<String, String> headers = client.getHeaders();
		headers.add("X-sess-id", credential.getCsrfToken());
		client.headers(headers);
		
		
		ClientConfiguration config = WebClient.getConfig(client);
		HTTPConduit conduit = config.getHttpConduit();
		TLSClientParameters params = conduit.getTlsClientParameters();
		if (params == null) {
			params = new TLSClientParameters();
	        conduit.setTlsClientParameters(params);
		}
		params.setTrustManagers(new TrustManager[] { new DumbX509TrustManager() });
		params.setDisableCNCheck(true);
				
		System.out.println("ProxyProcessor -> URL called -> " + url);
		
		client = client.accept("application/json").type("application/json");
		Response r = client.get();
		
		String resp = r.readEntity(String.class);
		exchange.getOut().setBody(resp);
				
	}
	

}
