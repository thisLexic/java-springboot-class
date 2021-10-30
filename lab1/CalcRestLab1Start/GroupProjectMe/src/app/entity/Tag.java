package app.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="tag")
public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	private String name;
	
	public Tag() {}
	
	public Tag(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
	  this.name = name;
	}
}