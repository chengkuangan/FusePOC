package com.jboss.poc.processor;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.TrustManager;
import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transport.http.HTTPConduit;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class ProxyProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		String httpPath = (String) exchange.getIn().getHeader(Exchange.HTTP_PATH);
		String httpMethod = (String) exchange.getIn().getHeader(Exchange.HTTP_METHOD);
		String queryString = (String) exchange.getIn().getHeader(Exchange.HTTP_QUERY);
		String server = (String) exchange.getProperty("qradar.server");
		
		//System.out.println("ProxyProcessor -> httpPath: " + httpPath);
		
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		queryString = (queryString !=null && queryString.trim().length() > 0) ? "?" + queryString : "";
		String url = server + "/" + httpPath + queryString;
		
		// --- comment the following line if need to use Basic Authentication ----- //
		WebClient client = WebClient.create(url, providers);
		// --- uncomment the following line to enable basic authentication  ------//
		// --- WebClient client = WebClient.create(url, providers, "admin", "P@ssw0rd", null);
		
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
		
		//WebClient client = WebClient.create("http://" + server + "/" + "/incidents", providers);
		client = client.accept("application/json").type("application/json");
		Response r = null;
		if (httpMethod.equalsIgnoreCase("POST")) {
			r = client.post(exchange.getIn().getBody());
		}
		else {
			r = client.get();
		}
		
		String resp = r.readEntity(String.class);
		exchange.getOut().setBody(resp);
		
				
	}
	

}
