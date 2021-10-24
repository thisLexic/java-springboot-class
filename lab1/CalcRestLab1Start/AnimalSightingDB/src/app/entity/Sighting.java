package app.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="sighting")
public class Sighting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	private Long animalId;
	
	@Column
	private String location;
	
	@Column
	private Double latitude;
	
	@Column
	private Double longitude;
	
	@Column
	private String comment;
	
	public Sighting() {}
	{
	}
	
	public Sighting(Long animalId, String location, Double latitude, Double longitude, String comment) {
		super();
		this.animalId = animalId;
		this.location = location;
		this.latitude = latitude;
		this.longitude = longitude;
		this.comment = comment;
	}
}

