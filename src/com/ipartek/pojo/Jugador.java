package com.ipartek.pojo;

public class Jugador {
	
	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private int id;  //TODO getter setreers y contructor toString
	private String nombre;
	private int dorsal;

	
	// Constructores
	///////////////////////////////////////
	public Jugador() {
		super();
		this.nombre = " ";
		this.dorsal = 0;

	}
	

	
	//Getters y setters
	///////////////////////////////////////
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

	public int getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

}
