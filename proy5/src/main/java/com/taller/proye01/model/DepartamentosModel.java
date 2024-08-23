package com.taller.proye01.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="departamentos")
public class DepartamentosModel {
	
	@Id
	@Column(name="codd")
	int codd;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="direccion")
	String direccion;
	
	@Column(name="estado")
	int estado;

	public int getCodd() {
		return codd;
	}

	public void setCodd(int codd) {
		this.codd = codd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}