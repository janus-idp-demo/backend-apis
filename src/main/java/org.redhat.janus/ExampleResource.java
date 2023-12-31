package org.redhat.janus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public UserEntity userinfo() {
        return new UserEntity("John Smith", "jsmith@redhat.com");
    }
}
