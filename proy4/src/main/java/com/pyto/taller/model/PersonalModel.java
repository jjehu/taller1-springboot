package com.pyto.taller.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "personal")
public class PersonalModel {
	@Id
	@Column(name = "codper")
	int codper;
	@Column(name = "nombre")
	String nombre;
	String ap;
	String am;
//@Getter(AccessLevel.NONE)
//@Setter(AccessLevel.NONE)
	int estado;
	
}
