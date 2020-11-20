package com.escuelataekwondo.model.builder;

import com.escuelataekwondo.model.entities.ProfesorTaekwondo;

public class ProfesorTaekwondoBuilder extends PersonaTaekwondoBuilder<ProfesorTaekwondoBuilder> {

	
	private ProfesorTaekwondo profesor;
	
	 public ProfesorTaekwondoBuilder() {
		profesor = new ProfesorTaekwondo();
	}
	
	public ProfesorTaekwondoBuilder(ProfesorTaekwondo profesor) {
		this.profesor=profesor;
	}
	
	@Override
	public ProfesorTaekwondoBuilder setNombre(String nombre) {
		this.nombre=nombre;
		return this;
	}

	@Override
	public ProfesorTaekwondoBuilder setEdad(int edad) {
		this.edad=edad;
		return this;
	}

	@Override
	public ProfesorTaekwondoBuilder setId(int id) {
		this.id=id;
		return this;
	}

	@Override
	public ProfesorTaekwondoBuilder setPeso(float peso) {
		this.peso=peso;
		return this;
	}

	@Override
	public ProfesorTaekwondoBuilder setTelefono(String telefono) {
		this.telefono=telefono;
		return this;
	}

	@Override
	public ProfesorTaekwondoBuilder setIdGrado(int idGrado) {
		this.idGrado=idGrado;
		return this;
	}

	public ProfesorTaekwondo build() {
		profesor.setIdGrado(idGrado);
		profesor.setNombre(nombre);
		profesor.setEdad(edad);
		profesor.setId(id);
		profesor.setPeso(peso);
		profesor.setTelefono(telefono);		
		return profesor;
	}
	
}
