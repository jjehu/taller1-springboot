package com.pyto.taller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyto.taller.model.DatosModel;
import com.pyto.taller.model.dto.DatosDTO;

public interface DatosRepo extends JpaRepository<DatosModel, String>{
	List<DatosDTO> findBy();
}
