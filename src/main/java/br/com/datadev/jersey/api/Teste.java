package br.com.datadev.jersey.api;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Fabrício
 */
@Path("/teste")
public class Teste {

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response getInstanciasPJe() {

        JsonObject json = Json.createObjectBuilder()
                .add("nome", "fabricio")
                .add("status", true)
                .build();
        
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }
}
