package com.pyto.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyto.taller.model.PersonalModel;

public interface PersonalRepo extends JpaRepository<PersonalModel, Integer>{
	
	
}
