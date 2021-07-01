package com.edw.controller;

import com.edw.dto.TransferDto;
import com.edw.model.Transfer;
import com.edw.service.TransferService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;

/**
 * <pre>
 *     com.edw.controller.TransferController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 01 Jul 2021 12:59
 */
@Path("/transfer")
public class TransferController {

    @Inject
    TransferService transferService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        return Response
                .ok(transferService.findAll())
                .build();
    }

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(TransferDto transferDto) {
        try {
            Long id = transferService.create(transferDto);
            return Response // 200
                    .ok(
                            new HashMap() {{
                                put("id", id);
                            }})
                    .build();
        } catch (Exception ex) {
            return Response // error 400
                    .status(400).entity(
                            new HashMap() {{
                                put("error", "failed to insert");
                            }})
                    .build();
        }
    }

}
