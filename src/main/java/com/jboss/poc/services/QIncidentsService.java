package com.jboss.poc.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;

import com.jboss.poc.model.Incidents;
import com.jboss.poc.model.resilient.auth.Credential;

@Path("/")
public class QIncidentsService {
	
	public QIncidentsService(){}
	
	@POST
	@Path("/qincidents")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String doPOST(String data){
		return "{\"status\":\"OK\"}";
	}
	
	@GET
	@Path("/api/siem/offenses")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getOffenses(@Body String data){
		return "{\"status\":\"OK\"}";
	}
	
	@POST
	@Path("/api/siem/offenses/{offenses_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String postOffenses(@Body String data, @PathParam("offenses_id") String action){
		return "{\"status\":\"OK\"}";
	}
	
	@GET
	@Path("/api/siem/{action}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getSiemProxyData(@Body String data, @PathParam("action") String action ){
		return "{\"status\":\"OK\"}";
	}
	
	@GET
	@Path("/api/ariel/searches")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getArielSearchesIds(@Body String data){
		return "{\"status\":\"OK\"}";
	}
	
	@GET
	@Path("/api/ariel/searches/{search_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getArielSearchesDataBySearchId(@Body String data, @PathParam("search_id") String search_id){
		return "{\"status\":\"OK\"}";
	}
	
	
	@POST
	@Path("/api/ariel/searches")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String postArielSearches(@Body String data, @QueryParam("query_string") String query_string ){
		return "{\"status\":\"OK\"}";
	}
	
	@GET
	@Path("/api/config/domain_management/domains")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getConfigProxyData(@Body String data, @PathParam("action") String action ){
		return "{\"status\":\"OK\"}";
	}
	
	@GET
	@Path("/api/reference_data/sets")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getReferencedDataSets(@Body String data){
		return "{\"status\":\"OK\"}";
	}
	
	@POST
	@Path("/api/reference_data/sets")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String postReferencedDataSets(@Body String data){
		return "{\"status\":\"OK\"}";
	}
	
	/*
	@POST
	@Path("/rest/session")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public Auth postResilientAuth(@Body String data){
		return null;
	}
	*/
	

}
