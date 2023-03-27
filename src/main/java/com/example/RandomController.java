package com.example;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/random")
public class RandomController {
    private Random random = new Random();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public int getRandomNumber() {
        return random.nextInt();
    }
}
