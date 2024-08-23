package com.taller.proye01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taller.proye01.model.DatosModel;
import com.taller.proye01.model.dto.DatosDtoI;

public interface DatosRepo extends JpaRepository<DatosModel, String>{
	List<DatosDtoI> findBy();
}
