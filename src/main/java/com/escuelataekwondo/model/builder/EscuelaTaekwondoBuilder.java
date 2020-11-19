package com.escuelataekwondo.model.builder;

import com.escuelataekwondo.model.EscuelaTaekwondo;
import com.escuelataekwondo.model.Persona;

public class EscuelaTaekwondoBuilder{
		
	private EscuelaTaekwondo escuela;
	public EscuelaTaekwondoBuilder() {
		escuela = new EscuelaTaekwondo();
	}
	
	public EscuelaTaekwondoBuilder(EscuelaTaekwondo escuela) {
		this.escuela=escuela;
	}
	
	private int id;
	private String nombre;
	private String direccion;
	private String telefono;
	private Persona encargado;
	
	public EscuelaTaekwondoBuilder setId(int id) {
		this.id=id;
		return this;
	}

	public EscuelaTaekwondoBuilder setNombre(String nombre) {
		this.nombre=nombre;
		return this;
	}
	
	public EscuelaTaekwondoBuilder setDireccion(String direccion) {
		this.direccion=direccion;
		return this;
	}
	
	public EscuelaTaekwondoBuilder setTelefono(String telefono) {
		this.telefono=telefono;
		return this;
	}
	
	public EscuelaTaekwondoBuilder setEncargado(Persona encargado) {
		this.encargado=encargado;
		return this;
	}
	
	public EscuelaTaekwondo build() {
		escuela.setNombre(nombre);
		escuela.setDireccion(direccion);
		escuela.setTelefono(telefono);
		escuela.setId(id);
		escuela.setEncargado(encargado);
		return escuela;
	}
	
	
	
}
