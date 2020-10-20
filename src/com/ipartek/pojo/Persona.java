package com.ipartek.pojo;




public class Persona {
	
	//Constantes
	private static final int EDAD_MINIMA = 0;
	private static final int EDAD_MAXIMA = 120;
	
	//Atributos
	private String nombre;
	private int edad;
	
	//Constructor
	public Persona() {
		super();
		this.nombre = "";
		this.edad = EDAD_MINIMA;
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
			
			//throw new Exception("Error: el rango de la edad es %s - %s ", EDAD_MINIMA, EDAD_MAXIMA);
			throw new Exception(  String.format("***Error: El rango de edad debe ser entre %s y %s años", EDAD_MINIMA, EDAD_MAXIMA) );
			
		}else {
				this.edad = edad;
			}
		

		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
