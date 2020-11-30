package com.escuelataekwondo.model.builder;

import java.util.Date;

import com.escuelataekwondo.model.entities.Clase;

public class ClaseBuilder {

	private Clase clase;
	
	public ClaseBuilder(Clase clase) {
		this.clase = clase;
	}
	
	public ClaseBuilder() {
		clase = new Clase();
	}
	
	private Date fecha;
	private int idClase;
	private int idEscuela;
	private int duracion;
	private String comentarios;
	
	public ClaseBuilder setIdClase(int idClase) {
		this.idClase = idClase;
		return this;
	}
	
	public ClaseBuilder setFecha(Date fecha) {
		this.fecha = fecha;
		return this;
	}
	
	public ClaseBuilder setIdEscuela(int idEscuela) {
		this.idEscuela = idEscuela;
		return this;
	}
	
	public ClaseBuilder setDuracion(int duracion) {
		this.duracion = duracion;
		return this;
	}
	
	public ClaseBuilder setComentarios(String comentarios) {
		this.comentarios = comentarios;
		return this;
	}
	
	
	public Clase build() {
		clase.setIdClase(idClase);
		clase.setIdEscuela(idEscuela);
		clase.setComentarios(comentarios);
		clase.setDuracion(duracion);
		clase.setFecha(fecha);
		
		return clase;
	}
	
}
