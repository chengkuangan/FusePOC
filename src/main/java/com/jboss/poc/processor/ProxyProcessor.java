package com.jboss.poc.processor;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.core.Response;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.Processor;
import org.apache.camel.spi.RestConfiguration;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
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
		String url = "http://" + server + "/" + httpPath + queryString;
		
		WebClient client = WebClient.create(url, providers, "admin", "P@ssw0rd", null);
		
		HTTPConduit conduit = WebClient.getConfig(client).getHttpConduit();
		TLSClientParameters params = conduit.getTlsClientParameters();
		if (params == null){
	        params = new TLSClientParameters();
	        conduit.setTlsClientParameters(params);
	    }

	    params.setTrustManagers(new TrustManager[] { customTm }); 

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
		
		/*
		String data = exchange.getIn().getBody(String.class);
		exchange.setProperty("request_context", context);
		exchange.getOut().setBody(data);
		*/
				
	}
	
	
	
	private X509TrustManager customTm = new X509TrustManager() {
		
		X509TrustManager x509Tm = null;
		
		public void X509TrustManager() {
			try {
				TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
				for (TrustManager tm : tmf.getTrustManagers()) {
				    if (tm instanceof X509TrustManager) {
				        x509Tm = (X509TrustManager) tm;
				        break;
				    }
				}
			}
			catch(Exception e) {
				
			}
			
		}
		
		@Override
		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			// TODO Auto-generated method stub
			x509Tm.checkClientTrusted(chain, authType);
			
		}

		@Override
		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			x509Tm.checkServerTrusted(chain, authType);
			
		}

		@Override
		public X509Certificate[] getAcceptedIssuers() {
			// TODO Auto-generated method stub
			return x509Tm.getAcceptedIssuers();
		}
	};

}
