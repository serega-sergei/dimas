package com.example.simple_service_webapp;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import com.example.simple_service_webapp.model.ResponseVO;

@Path("/authenticate")
public class LoginResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseVO login() {

		ResponseVO responseVO = new ResponseVO();

		responseVO.setResponse(Status.OK.getStatusCode());
		responseVO.setReason(Status.OK.getReasonPhrase());

		return responseVO;
	}

}
