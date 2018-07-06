package com.mezzofy.coupon.api.utils;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.mezzofy.coupon.api.model.ErrorMessage;

import javax.ws.rs.core.MediaType;

@Provider
public class MainExceptionMapper implements ExceptionMapper<Exception> {

	public Response toResponse(Exception ex) {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
				.entity(new ErrorMessage(new AppException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), ex.getMessage(), ex.getMessage())))
				.type(MediaType.APPLICATION_JSON).
				build();
	}

}