package com.mbkd.be.bookingapi.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Theater extends BaseEntity{
    private String name;
	

	@ManyToMany
	List<Movie> movie;

	@ManyToOne
	private Location location;

	private Double latitude;

	@OneToOne
	Address address;
}
