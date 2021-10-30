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

import app.entity.Tag;
import app.components.TagManager;

@Component
@Path("/tag")
public class Controller {

	@Autowired
	private TagManager tagManager;
	
	@POST
	@Path("/addTag")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Tag addSighting(Tag tag) {
		return tagManager.add(tag);
	}
	
	@GET
	@Path("/readTag")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tag> getTag(@QueryParam("name") String name){
		return tagManager.read(name);
	}
}
