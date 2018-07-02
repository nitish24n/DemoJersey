package com.myCode.DemoJersey.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NoDataFoundExceptionMapper implements ExceptionMapper<NoDataFoundException>{

	@Override
	public Response toResponse(NoDataFoundException ex) {
		// TODO Auto-generated method stub
		return Response.status(Status.NOT_FOUND).build();
	}
   
}
