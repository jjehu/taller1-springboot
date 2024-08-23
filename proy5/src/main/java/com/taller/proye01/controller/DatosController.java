package com.taller.proye01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.proye01.model.DatosModel;
import com.taller.proye01.model.dto.DatosDtoI;
import com.taller.proye01.repository.DatosRepo;
import com.taller.proye01.service.DatosService;

@RestController
public class DatosController {
	
	@Autowired
	public DatosRepo datrep;

	@GetMapping("/datos")
	public List<DatosModel> listaDatos(){
		return datrep.findAll();
	}
	
	//Con interfaces
	@Autowired
	public DatosService servicios;
	
	@GetMapping("/datosdto")
	public List<DatosDtoI> listaDatosdto(){
		return servicios.findByDatos();
	}
	
}
