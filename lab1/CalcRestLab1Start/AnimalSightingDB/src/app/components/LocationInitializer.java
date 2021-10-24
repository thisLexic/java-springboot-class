package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.repository.LocationRepository;
import app.entity.Location;

@Component
public class LocationInitializer {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@PostConstruct
	public void seedLocations() {
		if(locationRepository.count() == 0) {
			locationRepository.save(new Location("Bellarmine Field", 14.640366, 121.079136));
			locationRepository.save(new Location("Pipac", 14.638913, 121.076668));	
			locationRepository.save(new Location("Dog House", 14.639468, 121.077854));	
			locationRepository.save(new Location("Lover's Lane", 14.639748271508546, 121.07653971679812));	
			locationRepository.save(new Location("Department of Chemistry", 14.639166393684546, 121.07738339269048));	
			locationRepository.save(new Location("ISO Residences", 14.642092241040126, 121.07783363765125));	
			locationRepository.save(new Location("Escaler Hall", 14.638155127052778, 121.0774513942903));	
			locationRepository.save(new Location("ARETE", 14.641415052212867, 121.07578489132361));	
			locationRepository.save(new Location("SOM Forest", 14.638096703661704, 121.0754022679225));	
			locationRepository.save(new Location("Faura Hall", 14.639534667394893, 121.07675799261283));	
		}
	}
}
