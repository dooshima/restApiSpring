package com.angerdooshima.StartSpring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angerdooshima.StartSpring.model.Person;
import com.angerdooshima.StartSpring.services.PersonService;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	//post request
	@PostMapping
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	
	//get request
	@GetMapping
	public List<Person> getAllPeople(){
		return personService.getAllPeople();
	}
}
