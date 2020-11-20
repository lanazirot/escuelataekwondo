package com.escuelataekwondo.model.entities;

import com.escuelataekwondo.model.enumerables.Grados;

public class Grado {
	
	
	private Grados grado;
	private String descripcion;
	
	public Grado(Grados grado, String descripcion) {
		this.grado=grado;
		this.descripcion=descripcion;
	}
	
	public Grado(Grados grado) {
		this(grado, "Sin descripcion");
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	
	public Grados getGrado() {
		return grado;
	}
}
