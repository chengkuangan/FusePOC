package com.jboss.poc.processor;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.jaxrs.client.WebClient;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.jboss.poc.model.Incidents;

public class IncidentsProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Incidents request = exchange.getIn().getBody(Incidents.class);
		String server = (String) exchange.getProperty("resilient.server");
		String message = (String) exchange.getProperty("original.message");
		
		//System.out.println("IncidentsProcessor -> message : " + message);
		
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		/// --- test Org_id = 401
		
		WebClient client = WebClient.create(server + "/210/incidents", providers);
		//WebClient client = WebClient.create("http://" + server + "/" + "/incidents", providers);
		client = client.accept("application/json").type("application/json");
		Response r = client.post(message);
		String resp = r.readEntity(String.class);
		exchange.getOut().setBody("{\"status\":\"ok\"}");

	}
}
