package com.taller.proye01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prueba {
	
	@RequestMapping("/uno")
	public String primerMetodo() {
		return "Hola Mundo..";
	}

}
