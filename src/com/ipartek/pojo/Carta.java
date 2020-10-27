package com.ipartek.pojo;

public class Carta {
	
	private int numero;
	private String palo;
	
	

	public Carta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Carta(int numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}


	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}
	
	

}
