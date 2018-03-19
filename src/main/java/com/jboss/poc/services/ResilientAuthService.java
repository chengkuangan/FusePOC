package com.jboss.poc.services;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;

import com.jboss.poc.model.resilient.auth.Credential;

@Path("/")
public class ResilientAuthService {

	@POST
	@Path("/rest/session")
    @Produces({MediaType.APPLICATION_JSON })
    public String authenticate(@Body String credential) {
		return credential;
	}
	
	// --- for testing purpose
	@GET
	@Path("/rest/orgs/210/incidents")
    @Produces({MediaType.APPLICATION_JSON })
    public String testIncidents(String data) {
		return data;
	}
	
}

