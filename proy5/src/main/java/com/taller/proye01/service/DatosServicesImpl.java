package com.taller.proye01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller.proye01.model.dto.DatosDtoI;
import com.taller.proye01.repository.DatosRepo;

@Service
public class DatosServicesImpl implements DatosService{

	@Autowired
	public DatosRepo repositorio;
	
	@Override
	public List<DatosDtoI> findByDatos() {
		return repositorio.findBy();
	}
	
}
