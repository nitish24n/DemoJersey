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
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(),"404", "https://www.google.co.in/search?q=404+error&oq=404+error&aqs=chrome..69i57.4526j0j7&sourceid=chrome&ie=UTF-8");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}
   
}
