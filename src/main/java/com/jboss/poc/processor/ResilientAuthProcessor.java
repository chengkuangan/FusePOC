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

public class ResilientAuthProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		String httpPath = (String) exchange.getIn().getHeader(Exchange.HTTP_PATH);
		String httpMethod = (String) exchange.getIn().getHeader(Exchange.HTTP_METHOD);
		String server = (String) exchange.getProperty("resilient.server");
		
		
		//System.out.println("ProxyProcessor -> httpPath: " + httpPath);
		
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		
		// --- comment the following line if need to use Basic Authentication ----- //
		WebClient client = WebClient.create(server, providers);
		
		ClientConfiguration config = WebClient.getConfig(client);
		HTTPConduit conduit = config.getHttpConduit();
		TLSClientParameters params = conduit.getTlsClientParameters();
		if (params == null) {
			params = new TLSClientParameters();
	        conduit.setTlsClientParameters(params);
		}
		params.setTrustManagers(new TrustManager[] { new DumbX509TrustManager() });
		params.setDisableCNCheck(true);
				
		System.out.println("ProxyProcessor -> URL called -> " + server);
		
		//WebClient client = WebClient.create("http://" + server + "/" + "/incidents", providers);
		client = client.accept("application/json").type("application/json");
		Response r = client.post(exchange.getIn().getBody());
		String resp = r.readEntity(String.class);
		exchange.getOut().setBody(resp);
		
				
	}
	

}
