package com.ipartek.pojo;

public class Electrodomestico {
	
	private String nombre;
	private int precio;
	
	public Electrodomestico() {
		super();
		this.nombre = nombre;
		this.precio = 4;
	}
	
	public Electrodomestico(String nombre, int precio) {
		this();
		this.nombre = nombre;
		this.precio = 4;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// sobreescribimos al padre que es java.lnag.Object
	@Override
	public String toString() {
		return "Electrodomestico [nombre=" + nombre + ", precio=" + precio + "]";
	}
	


	
	

	
	

}
