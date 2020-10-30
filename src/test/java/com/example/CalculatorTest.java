package com.example;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

public class CalculatorTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(Calculator.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        final String responseMsg = target()
                .path("calc")
                .path("add")
                .path("1000")
                .path("1000").request().get(String.class);

        System.out.println("Responce from adder test = "+responseMsg);
        assertEquals("2000", responseMsg);
    }
}
