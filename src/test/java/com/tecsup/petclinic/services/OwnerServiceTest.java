package com.tecsup.petclinic.services;

import lombok.extern.slf4j.Slf4j;

import org.h2.server.Service;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootTest
@Slf4j
public class OwnerServiceTest {
	
<<<<<<< Upstream, based on branch 'main' of https://github.com/Fendo5242/Lab13
	@GetMapping("/owners/{id}")
	ResponseEntity<Owner> findOne(@PathVariable Long id){
		try {
			return new ResponseEntity<>(Service.findById(id), HttpStatus.OK)
		} catch (OwnerNotFoundException e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND)
		}
	}
	
=======
>>>>>>> 0688148 Sanchez Berru Fernando Jose
}
