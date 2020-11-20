package com.escuelataekwondo.model.entities;

import com.escuelataekwondo.model.enumerables.Grados;

public class Grado {
	
	private int idGrado;
	private Grados grado;
	private String descripcion;
	
	public Grado(int idGrado, Grados grado, String descripcion) {
		this.idGrado=idGrado;
		this.grado=grado;
		this.descripcion=descripcion;
	}
	
	public Grado(int idGrado, Grados grado) {
		this(idGrado, grado, "Sin descripcion");
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	
	public Grados getGrado() {
		return grado;
	}
}
