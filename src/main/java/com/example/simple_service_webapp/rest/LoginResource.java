package com.example.simple_service_webapp.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import sun.misc.BASE64Encoder;

import com.example.simple_service_webapp.model.ResponseVO;
import com.example.simple_service_webapp.model.UserLoginVO;

@Path("/version/v{version}/authenticate")
public class LoginResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login(UserLoginVO userLoginVO) {
		String name = userLoginVO.getLogin();
		String password = userLoginVO.getPassword();
		String authString = name + ":" + password;

		@SuppressWarnings("restriction")
		String authStringEnc = new BASE64Encoder().encode(authString.getBytes());

		ResponseVO responseVO = new ResponseVO();

		responseVO.setResponse(Status.OK.getStatusCode());
		responseVO.setReason(Status.OK.getReasonPhrase());

		Response response = Response.ok().entity(responseVO).build();
		response.getHeaders().add("Authorization", "Basic " + authStringEnc);

		return Response.ok().entity(responseVO).build();
	}
}
