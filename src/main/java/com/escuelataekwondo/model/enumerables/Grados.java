package com.escuelataekwondo.model.enumerables;

public enum Grados {
	
	BLANCO(0),
	BLANCO_LISTON(12),
	AMARILLO(11),
	AMARILLO_LISTON(10),
	NARANJA(9),
	NARANJA_LISTON(8),
	VERDE(7),
	VERDE_LISTON(6),
	AZUL(5),
	AZUL_LISTON(4),
	ROJO(3),
	ROJINEGRO(2),
	NEGRO(1),
	PRIMER_DAN(1),
	SEGUNDO_DAN(2),
	TERCER_DAN(3),
	CUARTO_DAN(4),
	QUINTO_DAN(5),
	SEXTO_DAN(6),
	SEPTIMO_DAN(7),
	OCTAVO_DAN(8),
	NOVENO_DAN(9),
	DECIMO_DAN(10);
	
	private final int grado;
	Grados(int grado){
		this.grado=grado;
	}
	
	public int getGrado() {
		return grado;
	}
	
	
}
