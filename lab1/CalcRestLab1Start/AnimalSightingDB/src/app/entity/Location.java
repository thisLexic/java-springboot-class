package app.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="location")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	private String locationName;
	
	@Column
	private Double latitude;
	
	@Column
	private Double longitude;
	
	public Location() {}
	
	public Location(String locationName, Double latitude, Double longitude) {
		super();
		this.locationName = locationName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}
}