package com.jboss.poc.processor;

import java.util.Collection;
import java.util.Iterator;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.spi.RestConfiguration;

public class WSContextProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		Collection<Endpoint> eps = exchange.getContext().getEndpoints();
		
		RestConfiguration config = exchange.getContext().getRestConfiguration();
		
		String context = config.getApiContextPath();
		System.out.println("IncidentsService -> WSContextProcessor -> config.getApiContextPath(): " + context);
		
		String data = exchange.getIn().getBody(String.class);
		exchange.setProperty("request_context", context);
		exchange.getOut().setBody(data);
				
	}
}
