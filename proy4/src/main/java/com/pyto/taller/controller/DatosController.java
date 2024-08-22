package com.pyto.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyto.taller.model.DatosModel;
import com.pyto.taller.model.dto.DatosDTO;
import com.pyto.taller.repository.DatosRepo;
import com.pyto.taller.service.DatosService;

@RestController
public class DatosController {
	
	@Autowired
	public DatosRepo datrep;
	
	@Autowired
	public DatosService servicio;
	
	@GetMapping("/datos")
	public List<DatosModel> listaDatos(){
		return datrep.findAll();
	}
	
	@GetMapping("/datosconDTO")
	public List<DatosDTO> listaDatosconDTO(){
		return servicio.findByDatos();
	}
	
}
