package app.rest.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.DividerComponent;
import app.components.AdderComponent;

@Component
@Path("/calculator")
public class Controller {
	
	
	Logger logger = LoggerFactory.getLogger(Controller.class);

	
	@Autowired
	DividerComponent divider;
	
	@GET
	@Path("/divide")
	@Produces(MediaType.TEXT_PLAIN)
	public double divide(@QueryParam("a") double a, @QueryParam("b") double b)
	{
		return divider.divide(a, b);
	}

	
	@Autowired
	AdderComponent adder;
	
	@GET
	@Path("/add")
	@Produces(MediaType.TEXT_PLAIN)
	public double add(@QueryParam("a") double a, @QueryParam("b") double b)
	{
		return adder.add(a, b);
	}
}
