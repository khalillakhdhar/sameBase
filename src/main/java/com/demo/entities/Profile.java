package com.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Profile {

	@Id
	private long id;
	private String propos,photo;
	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
}
