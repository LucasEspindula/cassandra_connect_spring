package com.tarefa.banco.model;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Person {

	@PrimaryKey
	private UUID id;

	private String firstName;

	private String age;
	
	@Deprecated
	public Person() {
	}
	
	public Person(UUID id, String firstName, String age) {
		this.id = id;
		this.firstName = firstName;
		this.age = age;
	}

	public UUID getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getAge() {
		return age;
	}
}
