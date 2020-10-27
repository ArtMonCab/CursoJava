package com.ipartek.ejercicios.abstracta;

public class RectanguloColor extends Rectangulo {

	String color;
	
	@Override
	void dibujar() {
		System.out.println("Dibujo un rectangulo de "  +  color);

	}
	
	void dibujar(String color) {
		this.color = color;
		System.out.println("Dibujo un rectangulo de "  +  this.color);

	}

}
