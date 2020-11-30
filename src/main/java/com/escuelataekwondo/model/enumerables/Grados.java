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
	PRIMER_DAN(11),
	SEGUNDO_DAN(22),
	TERCER_DAN(33),
	CUARTO_DAN(44),
	QUINTO_DAN(55),
	SEXTO_DAN(66),
	SEPTIMO_DAN(77),
	OCTAVO_DAN(88),
	NOVENO_DAN(99),
	DECIMO_DAN(100);
	
	private final int grado;
	Grados(int grado){
		this.grado=grado;
	}
	
	public int getGrado() {
		return grado;
	}
	
	
}
