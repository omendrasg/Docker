package com.nagarro.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.docker.model.Person;
import com.nagarro.docker.services.PersonService;

@CrossOrigin
@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping("/")
	public String getHTML() {
		return personService.getHTML();
	}

	@RequestMapping("/get")
	public Person getPerson(@RequestParam Long id) {
		return personService.getPerson(id);
	}

	@RequestMapping("/getAll")
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}

}
