package app.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Location;
import app.entity.Sighting;
import app.entity.StrayAnimal;
import app.repository.StrayAnimalRepository;

@Component
public class StrayAnimalManager {

	@Autowired
	private LocationManager locationManager;

	@Autowired
	private SightingManager sightingManager;

	@Autowired
	private StrayAnimalManager strayAnimalManager;
	
	@Autowired
	private StrayAnimalRepository strayRepository;
	
	public StrayAnimal save(StrayAnimal staryAnimal) {
		return strayRepository.save(staryAnimal);
	}

	public DTO createEntry(DTO animalSighting) {
		String type = animalSighting.getType();
		String color = animalSighting.getColor();
		Boolean neutered = animalSighting.getNeutered();
		String animalDescription = animalSighting.getAnimalDescription();
		StrayAnimal strayAnimal = strayAnimalManager.save(new StrayAnimal(type, color, neutered, animalDescription));

		String location = animalSighting.getLocation();
		List<Location> locations = locationManager.findByLocationName(location);
	    
		Double latitude = animalSighting.getLatitude();
		Double longitude = animalSighting.getLongitude();
		String comment = animalSighting.getComment();
		if(locations.isEmpty()) {
			sightingManager.save(new Sighting(strayAnimal.getId(), location, latitude, longitude, comment));
			locationManager.save(new Location(location, latitude, longitude));
		} else {
			sightingManager.save(new Sighting(strayAnimal.getId(), location, locations.get(0).getLatitude(), locations.get(0).getLongitude(), comment));
		}		    
		
		return animalSighting;
	}
	
	public List<StrayAnimal> findByType(String type){
		return strayRepository.findByType(type);
	}
	
	public List<StrayAnimal> findByNeutered(boolean neutered){
		return strayRepository.findByNeutered(neutered);
	}
}
