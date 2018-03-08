package com.jboss.poc.services;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface QRadarServices {
	@GET
    @Produces({MediaType.APPLICATION_JSON })
    public String getOffenses();
}

