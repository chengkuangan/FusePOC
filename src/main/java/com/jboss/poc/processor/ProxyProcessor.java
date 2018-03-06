package com.jboss.poc.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

import javax.ws.rs.core.Response;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.Processor;
import org.apache.camel.spi.RestConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;

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
		String url = "http://" + server + "/" + httpPath + queryString;
		
		WebClient client = WebClient.create(url, providers);
		
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
		
		/*
		String data = exchange.getIn().getBody(String.class);
		exchange.setProperty("request_context", context);
		exchange.getOut().setBody(data);
		*/
				
	}
}
