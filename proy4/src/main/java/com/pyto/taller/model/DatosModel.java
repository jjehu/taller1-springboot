package com.pyto.taller.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="datos")
public class DatosModel {
	
	@Id
	@Column(name="login")
	String login;
	
	@Column(name="cedula")
	String cedula;
	
	@Column(name="clave")
	String clave;
	
	@Column(name="estado")
	int estado;
	
	@Column(name="token")
	String token;
	
	}
