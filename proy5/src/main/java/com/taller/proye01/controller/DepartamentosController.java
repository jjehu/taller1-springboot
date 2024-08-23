package com.taller.proye01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.proye01.model.DepartamentosModel;
import com.taller.proye01.repository.DepartamentosRepo;

@RestController
public class DepartamentosController {

	@Autowired
	public DepartamentosRepo deprep;

	@GetMapping("/departamentos")
	public List<DepartamentosModel> listaSystemUsers(){
		return deprep.findAll();
	}
}
