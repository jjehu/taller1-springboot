package com.taller.proye01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.proye01.model.MateriasModel;
import com.taller.proye01.repository.MateriasRepo;

@RestController
public class MateriasController {

	@Autowired
	public MateriasRepo matrep;
	
	@GetMapping("/materias")
	public List<MateriasModel> listaMaterias(){
		return matrep.findAll();
	}
	
}
