package com.jboss.poc.processor;

import javax.net.ssl.TrustManager;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transport.http.HTTPConduit;

public class ProcessorHelper {

	public static void disableCNCheck(WebClient client) {
		
		ClientConfiguration config = WebClient.getConfig(client);
		HTTPConduit conduit = config.getHttpConduit();
		TLSClientParameters params = conduit.getTlsClientParameters();
		if (params == null) {
			params = new TLSClientParameters();
	        conduit.setTlsClientParameters(params);
		}
		params.setTrustManagers(new TrustManager[] { new DumbX509TrustManager() });
		params.setDisableCNCheck(true);
	}
	
	public static void enableHTTPSession(WebClient client) {
		WebClient.getConfig(client).getRequestContext().put(org.apache.cxf.message.Message.MAINTAIN_SESSION, Boolean.TRUE);
	}
	
	public static void copyCookies(WebClient sourceProxy, WebClient targetProxy) {
	    HTTPConduit sourceConduit = WebClient.getConfig(sourceProxy).getHttpConduit();
	    HTTPConduit targetConduit = WebClient.getConfig(targetProxy).getHttpConduit();
	    targetConduit.getCookies().putAll(sourceConduit.getCookies());
	}
	
	public static void setJSONContentType(WebClient client) {
		client = client.accept("application/json").type("application/json");
	}
	
	public static void setResilientSessionHeader(WebClient client, String csrfToken) {
		MultivaluedMap<String, String> headers = client.getHeaders();
		headers.add("X-sess-id", csrfToken);
		client.headers(headers);
	}
	
}
