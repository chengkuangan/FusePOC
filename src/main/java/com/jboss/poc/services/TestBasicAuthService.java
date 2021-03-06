package com.jboss.poc.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;

import com.jboss.poc.model.Incidents;

@Path("/")
public class TestBasicAuthService {
	
	public TestBasicAuthService(){}
	
	@GET
	@Path("/basic-auth")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String doBasicAuth(@Body String data){
		return "{\"status\":\"OK\"}";
	}
	
}

