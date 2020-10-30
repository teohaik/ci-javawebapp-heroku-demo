package com.example;

import java.math.BigInteger;
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

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        BigInteger result = bigA.add(bigB);
        return Response.status(200).entity(result.toString()).build();
    }

}
