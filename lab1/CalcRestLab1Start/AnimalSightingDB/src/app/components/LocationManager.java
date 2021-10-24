package app.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Location;
import app.repository.LocationRepository;

@Component
public class LocationManager {
	@Autowired
	private LocationRepository locationRepoitory;
	
	public Location save(Location location) {
		return locationRepoitory.save(location);
	}
	
	public List<Location> findByLocationName(String locationName){
		return locationRepoitory.findByLocationName(locationName);
	}
}
