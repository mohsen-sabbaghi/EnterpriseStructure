package com.example.restfull.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 @author m-sabbaghi on 11/11/2020
*/
@Path("rest")
public class Ping {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Ping...";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("hi")
    public String hello() {
        return "Hello From " + Ping.class.getSimpleName();
    }

}
