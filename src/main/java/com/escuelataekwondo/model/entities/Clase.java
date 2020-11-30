package com.escuelataekwondo.model.entities;

import java.util.Date;

public class Clase {
	//TODO ClaseBuilder at @see builder package
	
	private Date fecha;
	private int idClase;
	private int idEscuela;
	private int duracion;
	private String comentarios;
	
	public int getIdClase() {
		return idClase;
	}
	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIdEscuela() {
		return idEscuela;
	}
	public void setIdEscuela(int idEscuela) {
		this.idEscuela = idEscuela;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getDuracion() {
		return duracion;
	}
	
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
}
