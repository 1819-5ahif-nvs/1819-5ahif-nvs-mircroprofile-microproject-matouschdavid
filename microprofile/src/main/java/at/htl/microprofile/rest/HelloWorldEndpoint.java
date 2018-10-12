package at.htl.microprofile.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/home")
public class HelloWorldEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("Welcome to the homepage of David Matousch!").build();
	}
}
