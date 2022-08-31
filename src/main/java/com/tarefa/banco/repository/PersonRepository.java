package com.tarefa.banco.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tarefa.banco.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, UUID> {
}
