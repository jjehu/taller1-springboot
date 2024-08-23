package com.taller.proye01.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="materias")
public class MateriasModel {

	@Id
	@Column(name="sigla")
	String sigla;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="cargahora")
	int cargahora;
	
	@Column(name="estado")
	int estado;
		
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCargahora() {
		return cargahora;
	}

	public void setCargahora(int cargahora) {
		this.cargahora = cargahora;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
