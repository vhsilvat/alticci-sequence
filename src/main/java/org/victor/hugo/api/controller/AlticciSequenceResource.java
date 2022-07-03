package org.victor.hugo.api.controller;

import org.victor.hugo.api.service.AlticciSequenceService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/alticci")
public class AlticciSequenceResource {

	@Inject
	AlticciSequenceService alticciSequenceService;

	@GET
	@Path("/{index}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response alticce(@PathParam("index") int index) {
		return Response.ok(alticciSequenceService.alticci(index)).build();
	}
}
