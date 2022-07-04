package org.victor.hugo.api.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class AlticciExceptionHandler implements ExceptionMapper<AlticciException> {

	@Override
	public Response toResponse(AlticciException e) {
		return Response.status(Response.Status.FORBIDDEN).entity(e.getMessage()).build();
	}
}
