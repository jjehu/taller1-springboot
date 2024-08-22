package com.pyto.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyto.taller.model.PersonalModel;
import com.pyto.taller.repository.PersonalRepo;

@RestController
public class PersonalController {
	@Autowired
	public PersonalRepo perrepo;
	
	@GetMapping("/api/personal")
	public ResponseEntity<List<PersonalModel>> listaPersonal(){
		return ResponseEntity.ok(perrepo.findAll());
	}
	
}
