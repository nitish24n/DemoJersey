package com.myCode.DemoJersey.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.myCode.DemoJersey.model.ErrorMessage;

@Provider
public class NoDataFoundExceptionMapper implements ExceptionMapper<NoDataFoundException>{

	@Override
	public Response toResponse(NoDataFoundException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(),404);
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}
   
}
