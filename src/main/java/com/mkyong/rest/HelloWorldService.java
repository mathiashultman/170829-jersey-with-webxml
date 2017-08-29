package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// http://localhost:8080/170829-jersey-with-webxml/rest/h/m

@Path("/h")
public class HelloWorldService {

	@GET
	@Path("/h/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String output = "Jersey say : " + msg;
		return Response.status(200).entity(output).build();
	}

	
	@GET
	@Path("/m")
	@Produces({MediaType.APPLICATION_JSON})
	public Person getPerson() {
		Person p = new Person();
		p.setName("huuu");
		return p;
	}
}