package app.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
	public List<Location> findByLocationName(String locationName);
}
