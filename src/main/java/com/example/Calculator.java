package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("calc")
public class Calculator {


    //will be called like this:
    //https://HOST_APP_NAME/calc/add/52/48

    @GET
    @Path("add/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response adder(
            @PathParam("a") String a,
            @PathParam("b") String b){

        int ai = Integer.valueOf(a);
        int bi = Integer.valueOf(b);
        int result = ai + bi;
        return Response.status(200).entity(result).build();
    }

}
