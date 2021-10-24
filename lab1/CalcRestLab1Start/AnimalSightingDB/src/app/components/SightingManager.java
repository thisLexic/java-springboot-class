package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Sighting;
import app.repository.SightingRepository;

@Component
public class SightingManager {
	
	@Autowired
	private SightingRepository sightingRepository;
	
	public Sighting save(Sighting sighting) {
		return sightingRepository.save(sighting);
	}
}

