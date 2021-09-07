package app.rest.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.CalculatorComponent;

@Component
@Path("/calculator")
public class Controller {
	
	
	Logger logger = LoggerFactory.getLogger(Controller.class);

	
	@Autowired
	CalculatorComponent calculator;

	@GET
	@Path("/add")
	@Produces(MediaType.TEXT_PLAIN)
	public double add(@QueryParam("a") double a, @QueryParam("b") double b)
	{
		return calculator.add(a, b);
	}

	@POST
	@Path("/subtract")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public double subtract(@QueryParam("a") double a, @QueryParam("b") double b)
	{
		return calculator.subtract(a, b);
	}
	
	@GET
	@Path("/multiply")
	@Produces(MediaType.TEXT_PLAIN)
	public double multiply(@QueryParam("a") double a, @QueryParam("b") double b)
	{
		return calculator.multiply(a, b);
	}
	
	@GET
	@Path("/divide")
	@Produces(MediaType.TEXT_PLAIN)
	public double divide(@QueryParam("a") double a, @QueryParam("b") double b)
	{
		return calculator.divide(a, b);
	}
	
	@GET
	@Path("/sqrt")
	@Produces(MediaType.TEXT_PLAIN)
	public double sqrt(@QueryParam("a") double a)
	{
		return calculator.sqrt(a);
	}
	
	
	
}
