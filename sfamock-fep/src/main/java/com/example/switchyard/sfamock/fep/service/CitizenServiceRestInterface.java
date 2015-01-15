package com.example.switchyard.sfamock.fep.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.example.switchyard.sfamock.fep.model.Citizen;

@Path("/citizen")
public interface CitizenServiceRestInterface {

	@POST
    @Path("/create")
    @Consumes("application/xml")
	public Citizen process(Citizen citizen);

	@GET
    @Path("/get/{id}")
    @Produces("application/text")
	public String getCitizen(@PathParam("id") String id);

}
