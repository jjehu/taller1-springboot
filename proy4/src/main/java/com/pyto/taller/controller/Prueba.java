package com.pyto.taller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prueba {
	
	@RequestMapping("/api/prueba")
	public String primerMetodo() {
		return "Hola Mundo...";
	}

}
