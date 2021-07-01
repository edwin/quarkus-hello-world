package com.edw.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

/**
 * <pre>
 *     com.edw.controller.HelloController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 01 Jul 2021 12:30
 */

@Path("/")
public class HelloController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap hello() {
        return new HashMap(){{
            put("hello", "world");
        }};
    }
}
