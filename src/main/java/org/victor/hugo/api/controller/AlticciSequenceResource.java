package org.victor.hugo.api.controller;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.victor.hugo.api.exception.AlticciException;
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
	@Operation(summary = "Get valor sequência Alticci",
			description = "Recuperao valor da sequência Alticci conforme o index indicado")
	public Response alticce(@PathParam("index") int index) throws AlticciException {

		if(index < 0) {
			throw new AlticciException("Index deve ser maior ou igual a zero");
		}
		return Response.ok(alticciSequenceService.alticci(index)).build();
	}
}
