package com.tarefa.banco.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarefa.banco.model.Person;
import com.tarefa.banco.repository.PersonRepository;

@Service
public class PersonService {
	
	private final PersonRepository personRepository;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public Optional<Person> getByPersonId(UUID id) {
		return personRepository.findById(id);
	}
	
	public Person createPerson(Person newPerson) {
		return personRepository.save(newPerson);
	}
}
