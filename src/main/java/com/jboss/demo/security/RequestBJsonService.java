package com.jboss.demo.security;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RequestBJsonService {
	
	public RequestBJsonService(){}
	
	@POST
	@Path("/reqb")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public RequestB doSecurity(RequestB request){
		return request;
	}
}
