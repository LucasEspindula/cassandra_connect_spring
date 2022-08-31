package com.tarefa.banco.testController;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PersonControllerTest {
	
	  @Test
	    void givenValidBody_mustPostPerson_withStatus201() {
		  
	        String requestBody = "{\r\n"
	        		+ "\"id\": \"6ec67876-28d3-11ed-a261-0242ac120003\",\r\n"
	        		+ "\"firstName\": \"lucas rosa\",\r\n"
	        		+ "\"age\": \"19\"\r\n"
	        		+ "}";

	        given()
	                .header("Content-type", "application/json")
	                .and()
	                .body(requestBody)
	                .when()
	                .post("http://localhost:8080/person")
	                .then()
	                .statusCode(201);
	    }
	  
	    @Test
	    void givenValidId_mustGetPerson_withStatus200() {
	        get("http://localhost:8080/person/6ec67876-28d3-11ed-a261-0242ac120003")
	                .then()
	                .statusCode(200)
	                .body(equalTo("{\r\n"
	                		+ "    \"id\": \"6ec67876-28d3-11ed-a261-0242ac120003\",\r\n"
	                		+ "    \"firstName\": \"lucas rosa\",\r\n"
	                		+ "    \"age\": \"19\"\r\n"
	                		+ "}"));
	    }

}
