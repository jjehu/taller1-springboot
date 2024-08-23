package com.taller.proye01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.proye01.model.DocentesModel;
import com.taller.proye01.repository.DocentesRepo;

@RestController
public class DocentesController {

	@Autowired
	public DocentesRepo docrep;

	@GetMapping("/docentes")
	public List<DocentesModel> listaDocentes(){
		return docrep.findAll();
	}
	
}
