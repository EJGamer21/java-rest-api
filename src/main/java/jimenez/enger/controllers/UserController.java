package jimenez.enger.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("users")
public class UserController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAll() {
        return "Hello from controller";
    }
}
