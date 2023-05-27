package org.programacionparaaprender;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/hello")
public class app {

	@ConfigProperty(name="greeting")
	private String greeting;
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("custom/{name}")
    public String customHello(@PathParam("name") String name) {
    	return greeting + " " + name + " how are you doing?";
    }
}
