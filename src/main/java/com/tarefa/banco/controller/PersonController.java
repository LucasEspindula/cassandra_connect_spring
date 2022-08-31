package com.tarefa.banco.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarefa.banco.model.Person;
import com.tarefa.banco.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> getPersonById(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(personService.getByPersonId(id));
    }
	
    @PostMapping
    public ResponseEntity<Person> registerNewPoke(@RequestBody Person newPerson) {
        return new ResponseEntity<>(personService.createPerson(newPerson), HttpStatus.CREATED);
    }
} 