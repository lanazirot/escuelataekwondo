package com.escuelataekwondo.model.entities;

import com.escuelataekwondo.model.entities.base.Persona;

public class PersonaTaekwondo extends Persona {
	private int id;
	private int idGrado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdGrado() {
		return idGrado;
	}
	public void setIdGrado(int idGrado) {
		this.idGrado = idGrado;
	}
}
