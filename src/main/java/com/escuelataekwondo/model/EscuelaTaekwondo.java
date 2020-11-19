package com.escuelataekwondo.model;

import com.escuelataekwondo.model.people.Persona;

public class EscuelaTaekwondo {

	private int id;
	private String nombre;
	private String direccion;
	private String telefono;
	private Persona encargado;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEncargado(Persona encargado) {
		this.encargado = encargado;
	}
	
	public Persona getEncargado() {
		return encargado;
	}
	
	@Override
	public String toString() {
		return getNombre()+" "+getId();
	}

}
