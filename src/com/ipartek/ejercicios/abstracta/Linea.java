package com.ipartek.ejercicios.abstracta;

public class Linea extends ObjetoGrafico {

	int longitud;
		
	/**
	 * Implementamos el metodo que el padre a declarado abstract
	 */
	@Override
	void dibujar() {
		System.out.println("Dibujo una linea de longitud " + longitud);		
	}

	void dibujar(int longitud) {
		this.longitud = longitud;
		System.out.println("Dibujo una linea de longitud " + this.longitud);		
	}
	
}