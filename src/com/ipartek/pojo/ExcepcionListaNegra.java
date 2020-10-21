package com.ipartek.pojo;

public class ExcepcionListaNegra extends Exception{
	
	private int codigoError = 0;
	
	// Constructor
	///////////////////////////////////////
	public ExcepcionListaNegra(int codigoError) {
		super();
		this.codigoError = codigoError;

	}
	
	//Getters y Setters
	
	public int getCodigoError() {
		return codigoError;
	}
	
	public void setNombre(int codigoError) {
		this.codigoError = codigoError;
	}

	
	//toString
	@Override
	public String toString() {
		return "ExcepcionListaNegra [codigoError=" + codigoError + "]";
	}
	
	

}
