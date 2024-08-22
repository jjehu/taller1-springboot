package com.pyto.taller.service;

import java.util.List;

import com.pyto.taller.model.dto.DatosDTO;

public interface DatosService {
	List<DatosDTO> findByDatos();
}
