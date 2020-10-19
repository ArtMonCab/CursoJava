package com.ipartek.pojo;




public class Persona {
	private static final int EDAD_MINIMA = 0;
	private static final int EDAD_MAXIMA = 120;
	
	private String nombre;
	private int edad;
	
	//Constructor
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
	}
	
	//Getter y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		
		if ((edad < EDAD_MINIMA) || (edad > EDAD_MAXIMA)) {
			
			throw new Exception("La edad no se encuentra dentro del rango correcto " + EDAD_MINIMA + ".." + EDAD_MAXIMA);
			
		}else {
				this.edad = edad;
			}
		

		
	}

}
