package com.slts.pstn.fault.action;
//com.slts.pstn.fault.action
//import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/login")
public class Login {
	
  /*  @GET
	@Produces(MediaType.APPLICATION_JSON_TYPE)
    @Path("{name}")
	public String Log(@Context HttpHeaders httpHeaders ,@PathParam("name") String name) {
    	
		String responses ="HELLO"+name;
		return responses ;
	}*/
//	
	
	 @GET
		@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public String Log() {
			String responses ="HELLO";
			return responses ;
		}
	
//	
//	@GET
//	@Produces
//	public String Log(MediaType.) {
//		String responses =null;
//		return responses ;
//	}


}
