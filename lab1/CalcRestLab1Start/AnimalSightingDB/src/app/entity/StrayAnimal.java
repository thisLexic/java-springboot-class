package app.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="stray_animal")
public class StrayAnimal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	private String type;
	
	@Column
	private String color;
	
	@Column
	private Boolean neutered;
	
	@Column
	private String description;
	
	public StrayAnimal() {}
	{
	}
	
	public StrayAnimal(String type, String color, Boolean neutered, String description) {
		super();
		this.type = type;
		this.color = color;
		this.neutered = neutered;
		this.description = description;
	}

	public Long getId() {
		return id;
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

	public String getDescription() {
		return description;
	}
}