package com.angerdooshima.StartSpring.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	//a model for input fields for our db
	private final UUID id;
	private final String name;

	
	public Person(@JsonProperty("id") UUID id,
				  @JsonProperty("name") String name) {
		this.id = id;
		this.name = name;
		
	}


	public UUID getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	
}
