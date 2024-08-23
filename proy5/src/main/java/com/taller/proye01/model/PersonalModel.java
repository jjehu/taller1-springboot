package com.taller.proye01.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="personal")
public class PersonalModel {
	
	@Id
	@Column(name="codper")
	int codper;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="ap")
	String ap;
	
	@Column(name="am")
	String am;
	
	@Column(name="estado")
	int estado;

	public int getCodper() {
		return codper;
	}

	public void setCodper(int codper) {
		this.codper = codper;
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

