package com.ipartek.pojo;

public class TelevisorPlano extends Televisor {
	
	private String tipoPantalla;
	
	public TelevisorPlano() {
		super();
		this.tipoPantalla = tipoPantalla;
	}
	
	public TelevisorPlano(String nombre, int precio, int pulgadas, String tipoPantalla) {
		super(nombre, precio, pulgadas);
		this.tipoPantalla = tipoPantalla;
	}

	
	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}


	@Override
	public String toString() {
		return "TelevisorPlano [tipoPantalla=" + tipoPantalla + "]";
	}



}
