package com.github.natanlf;

import com.github.natanlf.dto.input.BuildCarDTO;
import com.github.natanlf.model.Car;
import com.github.natanlf.service.CarService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResource {

    @Inject
    CarService service;

    @POST
    public Response BuildCar(BuildCarDTO inputDto) {
        Car car = service.buildCar(inputDto.modelo, inputDto.versao);
        return Response.ok(car).build();
    }
}
