package app.rest.controllers;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import app.entity.StrayAnimal;
import app.components.DTO;
import app.components.StrayAnimalManager;

@Component
@Path("/sighting")
public class Controller {

	@Autowired
	private StrayAnimalManager strayAnimalManager;
	
	@POST
	@Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public DTO addSighting(DTO animalSighting) {
		return strayAnimalManager.createEntry(animalSighting);
	}
	

	@GET
	@Path("/animal/type")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public List<StrayAnimal> getStrayAnimal(@QueryParam("animalType") String animalType){
		return strayAnimalManager.findByType(animalType);
	}
	
	@GET
	@Path("/animal/not_neutered")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StrayAnimal> getIsNeutered(){
		return strayAnimalManager.findByNeutered(false);
	}
}
