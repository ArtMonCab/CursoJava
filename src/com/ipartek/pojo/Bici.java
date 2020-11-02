package com.ipartek.pojo;

import com.ipartek.pojo.Vehiculo;

public class Bici implements Vehiculo{
	
	int velocidadActual;
	


	boolean estaArrancado;

	@Override
	public void Arrancar() {
		if (!estaArrancado) {
			estaArrancado = true;
		}
	}

	@Override
	public void Acelerar(int incrementoVel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Frenar(int decrementoVel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Apagar() {
		
		if (velocidadActual == 0) {
			estaArrancado = false;
		}
	}
	
	@Override
	public String toString() {
		return "Bici [velocidadActual=" + velocidadActual + ", estaArrancado=" + estaArrancado + "]";
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}
	
	
	

}
