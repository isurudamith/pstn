package com.slts.pstn.fault.action;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/login")
public class Login {
	
    @GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String Log() {
		String responses ="HELLO";
		return responses ;
	}
//	
//	@GET
//	@Produces
//	public String Log(MediaType) {
//		String responses =null;
//		return responses ;
//	}


}
