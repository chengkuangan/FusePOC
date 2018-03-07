package com.jboss.poc.processor;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.jaxrs.client.WebClient;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class TestBasicAuthProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		String url = "https://postman-echo.com/basic-auth";
		
		WebClient client = WebClient.create(url, providers, "postman", "password", null);
		
		//ClientConfiguration config = WebClient.getConfig(client);
		//config.getHttpConduit().getTlsClientParameters().setDisableCNCheck(true);
				
		System.out.println("TestBasicAuthProcessor -> URL called -> " + url);
		
		client = client.accept("application/json").type("application/json");
		Response r = null;
		r = client.get();
		String resp = r.readEntity(String.class);
		exchange.getOut().setBody(resp);
				
	}
	

}
