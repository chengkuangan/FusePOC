package com.jboss.poc.processor;

import java.util.ArrayList;
import java.util.Iterator;
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

public class ResilientAuthProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		//String server = (String) exchange.getProperty("resilient.server");
		String authServer = "https://172.16.6.115/rest/session";		// set the resilient authentication endpoint
		String getServer = "https://172.16.6.115/rest/orgs/210/incidents";	
		
		System.out.println();
		//System.out.println("ResilientAuthProcessor -> URL called -> " + server);
		System.out.println("ResilientAuthProcessor -> URL called -> " + authServer);
		
		// create the JSON provider
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		
		WebClient client = WebClient.create(authServer, providers);
		ProcessorHelper.setJSONContentType(client);
		
		// --- disable SSL cert validation
		ProcessorHelper.disableCNCheck(client);
		
		// --- enable HTTP session
		ProcessorHelper.enableHTTPSession(client);
		
		// START ------- commented out by Gan CK. Recplaced with next section to convert JSON directly to Credential object
		/* Response r = client.post(exchange.getIn().getBody());
		 String resp = r.readEntity(String.class);
		 System.out.println("ResilientAuthProcessor -> response code = " + r.getStatus());
		 exchange.getOut().setBody(resp); 
		 */
		// END ------- commented out by Gan CK. Recplaced with next section to convert JSON directly to Credential object
		
		// START ------ Convert JSON directly to Credential Object
		Response r = client.post(exchange.getIn().getBody());
		System.out.println("ResilientAuthProcessor -> response code = " + r.getStatus());
		Credential cre = r.readEntity(Credential.class);
		String csrfToken = cre.getCsrfToken();
		System.out.println("ResilientAuthProcessor -> csrfToken -> " + csrfToken);
		// END ------ Convert JSON directly to Credential Object
		
		// START ------- Option 1 - Copy cookies from webclient1 to webclient2. Thus allowing creation of 2 different WebClients
		
		WebClient get_client = WebClient.create(getServer, providers);
		ProcessorHelper.setJSONContentType(get_client);
		ProcessorHelper.disableCNCheck(get_client);
		ProcessorHelper.enableHTTPSession(get_client);
		ProcessorHelper.copyCookies(client, get_client);
		// setting the required session id for resilient
		ProcessorHelper.setResilientSessionHeader(get_client, csrfToken);
		Response get_r = get_client.get();
		System.out.println("ResilientAuthProcessor -> URL called -> " + getServer);
		System.out.println("ResilientAuthProcessor -> response code = " + get_r.getStatus());
		String resp = get_r.readEntity(String.class);
		exchange.getOut().setBody(resp);
		
		// END ------- Option 1 - Copy cookies from webclient1 to webclient2
		
		// START ------- Option 2 - Reusing the webclient but set a different context path
		/* 
		ProcessorHelper.setResilientSessionHeader(client, csrfToken);
		client.replacePath("/rest/orgs/210/incidents");
		System.out.println("ResilientAuthProcessor -> calling incidents...");
		r = client.get();
		System.out.println("ResilientAuthProcessor -> response code = " + r.getStatus());
		String resp = r.readEntity(String.class);
		exchange.getOut().setBody(resp);
		*/
		// END ------- Option 2 - Reusing the webclient but set a different context path
		
		// --- changed to GET using the same WebClient.
		/*
		Response r = client.post(exchange.getIn().getBody());
		Credential cre = r.readEntity(Credential.class);
		String csrfToken = cre.getCsrfToken();
		System.out.println("ResilientAuthProcessor -> csrfToken -> " + csrfToken);
		
		client.replacePath("/rest/orgs/210/incidents");
		
		System.out.println("ResilientAuthProcessor -> here 1");
		MultivaluedMap<String, String> headers = client.getHeaders();
		headers.add("X-sess-id", csrfToken);
		
		System.out.println("ResilientAuthProcessor -> here 2");
		
		client.headers(headers);
		
		System.out.println("ResilientAuthProcessor -> here 3");
		
		r = client.get();
		System.out.println("ResilientAuthProcessor -> response code = " + r.getStatus());
		System.out.println("ResilientAuthProcessor -> here 4");
		String resp = r.readEntity(String.class);
		System.out.println("ResilientAuthProcessor -> here 5");
		System.out.println("response -> " + resp);
		System.out.println("ResilientAuthProcessor -> here 6");
		exchange.getOut().setBody(resp);
		*/		
	}
	

}
