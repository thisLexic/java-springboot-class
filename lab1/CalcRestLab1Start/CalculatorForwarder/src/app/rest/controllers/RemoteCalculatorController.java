package app.rest.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.RemoteCalculatorComponent;

@Component
@Path("/remotecalc")
public class RemoteCalculatorController {
	
	
	Logger logger = LoggerFactory.getLogger(RemoteCalculatorController.class);

	
	@Autowired
	RemoteCalculatorComponent calculator;

	@GET
	@Path("/add")
	@Produces(MediaType.TEXT_PLAIN)
	public String add(@QueryParam("a") double a, @QueryParam("b") double b) throws Exception
	{
		return calculator.add(a, b);
	}

	@POST
	@Path("/subtract")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String subtract(@FormParam("a") double a, @FormParam("b") double b) throws Exception
	{
		return calculator.subtract(a, b);
	}
	
	@GET
	@Path("/multiply")
	@Produces(MediaType.TEXT_PLAIN)
	public String multiply(@QueryParam("a") double a, @QueryParam("b") double b) throws Exception
	{
		return calculator.multiply(a, b);
	}
	
	@GET
	@Path("/divide")
	@Produces(MediaType.TEXT_PLAIN)
	public String divide(@QueryParam("a") double a, @QueryParam("b") double b) throws Exception
	{
		return calculator.divide(a, b);
	}
	
	@GET
	@Path("/sqrt")
	@Produces(MediaType.TEXT_PLAIN)
	public String sqrt(@QueryParam("a") double a) throws Exception
	{
		return calculator.sqrt(a);
	}
	
	
	
}
