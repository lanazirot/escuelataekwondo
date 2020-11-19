package com.escuelataekwondo.model.builder;

public abstract class PersonaTaekwondoBuilder<T> {
	//General
	protected String nombre;
	protected int edad;
	protected int id;
	protected float peso;
	protected String telefono;
	//Derivates
	protected int idGrado;
	
	public abstract T setNombre(String nombre);
	public abstract T setEdad(int edad);
	public abstract T setId(int id);
	public abstract T setPeso(float peso);
	public abstract T setTelefono(String telefono);
	public abstract T setIdGrado(int idGrado);
	
}
