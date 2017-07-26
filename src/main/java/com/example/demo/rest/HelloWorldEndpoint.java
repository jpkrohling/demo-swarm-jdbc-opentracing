package com.example.demo.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/hello")
public class HelloWorldEndpoint {

    @Inject
    private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response doGet() {
		List<Employee> employees = em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
		return Response.ok(employees).build();
	}
}