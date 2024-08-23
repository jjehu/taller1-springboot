package com.taller.proye01.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="docentes")
public class DocentesModel {

	@Id
	@Column(name="cedula")
	String cedula;

	@Column(name="codd")
	int codd;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="ap")
	String ap;
	
	@Column(name="am")
	String am;
	
	@Column(name="estado")
	int estado;
	
	public int getCodd() {
		return codd;
	}

	public void setCodd(int codd) {
		this.codd = codd;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public String getAm() {
		return am;
	}

	public void setAm(String am) {
		this.am = am;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
