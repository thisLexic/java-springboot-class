package app.components;

import org.springframework.stereotype.Component;

@Component
public class DTO {

	private String location;
	private Double latitude;
	private Double longitude;
	private String type;
	private String color;
	private Boolean neutered;
	private String animalDescription;
	private String comment;
	
	public DTO() {}
	
	public DTO(
			String location,
			Double latitude,
			Double longitude,
			String type,
			String color,
			Boolean neutered,
			String animalDescription,
			String comment
			) {
		super();
		this.location = location;
		this.latitude = latitude;
		this.longitude = longitude;
		this.type = type;
		this.color = color;
		this.neutered = neutered;
		this.animalDescription = animalDescription;
		this.comment = comment;
	}
	
	public String getLocation() {
		return location;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public Boolean getNeutered() {
		return neutered;
	}

	public String getAnimalDescription() {
		return animalDescription;
	}

	public String getComment() {
		return comment;
	}
}