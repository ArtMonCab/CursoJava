package com.ipartek.ejercicios.abstracta;

/**
 * Como es final la clase, termina la posiblidad de herencia
 * @author ur00
 *
 */
public final class LineaColor extends Linea {

	String color;
	
	@Override
	void dibujar() {		
		// super.dibujar();
		System.out.println("Dibujo Linea de color es " + color);
	}
	
	
	void dibujar(String color) {		
		// super.dibujar();
		this.color = color;
		System.out.println("Dibujo Linea de color es " + this.color);
	}
	
}
