package com.pyto.taller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyto.taller.model.dto.DatosDTO;
import com.pyto.taller.repository.DatosRepo;

@Service
public class DatosServiceImpl implements DatosService{

	@Autowired
	public DatosRepo repositorio;
	
	@Override
	public List<DatosDTO> findByDatos() {
		return repositorio.findBy();
	}
	
}
