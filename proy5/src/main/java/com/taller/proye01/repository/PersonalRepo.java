package com.taller.proye01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taller.proye01.model.PersonalModel;

public interface PersonalRepo extends JpaRepository<PersonalModel, Integer> {

}
