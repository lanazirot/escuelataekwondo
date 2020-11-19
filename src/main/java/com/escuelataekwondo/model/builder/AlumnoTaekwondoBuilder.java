package com.escuelataekwondo.model.builder;

import com.escuelataekwondo.model.people.AlumnoTaekwondo;

public class AlumnoTaekwondoBuilder extends PersonaTaekwondoBuilder<AlumnoTaekwondoBuilder> {
	private AlumnoTaekwondo alumno;
	
	private int idEscuela;
	
	
	public AlumnoTaekwondoBuilder(AlumnoTaekwondo alumno) {
		this.alumno=alumno;
	}
	
	public AlumnoTaekwondoBuilder() {
		alumno = new AlumnoTaekwondo();
	}
	
	public AlumnoTaekwondoBuilder setNombre(String nombre) {
		this.nombre=nombre;
		return this;
	}
	public AlumnoTaekwondoBuilder setEdad(int edad) {
		this.edad=edad;
		return this;
	}
	public AlumnoTaekwondoBuilder setId(int id) {
		this.id=id;
		return this;
	}
	public AlumnoTaekwondoBuilder setPeso(float peso) {
		this.peso=peso;
		return this;
	}
	
	public AlumnoTaekwondoBuilder setTelefono(String telefono) {
		this.telefono=telefono;
		return this;
	}
	
	public AlumnoTaekwondoBuilder setIdGrado(int idGrado) {
		this.idGrado=idGrado;
		return this;
	}
	
	public AlumnoTaekwondoBuilder setIdEscuela(int idEscuela) {
		this.idEscuela=idEscuela;
		return this;
	}
	
	public AlumnoTaekwondo build() {
		alumno.setNombre(nombre);
		alumno.setEdad(edad);
		alumno.setIdEscuela(idEscuela);
		alumno.setIdGrado(idGrado);
		alumno.setPeso(peso);
		alumno.setTelefono(telefono);
		alumno.setId(id);
		return alumno;
	}

	
}
