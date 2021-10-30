package app.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Tag;
import app.repository.TagRepository;

@Component
public class TagManager {
	@Autowired
	private TagRepository tagRepoitory;
	
	public Tag add(Tag name) {
		return tagRepoitory.save(name);
	}
	
	public List<Tag> read(String name){
		return tagRepoitory.findByName(name);
	}
}
