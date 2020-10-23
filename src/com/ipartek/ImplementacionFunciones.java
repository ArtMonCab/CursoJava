package com.ipartek;

import com.ipartek.pojo.Serie;

import java.util.Scanner;

public class ImplementacionFunciones implements IFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String pedirNombre() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		
		System.out.println ("Introduce un nombre");
		nombre = sc.nextLine();
		
		//Miro si el nombre tiene algún caracter
		if (nombre.length() < 1) {
			throw new Exception("El nombre tiene que contener alguna letra");
		}
		
		//Compruebo que el nombre no tenga ningun numero
		for (int i = 0; i < nombre.length(); i++) {
			if (Character.isDigit(nombre.charAt(i))) {
				throw new Exception("El nombre no puede contener ningún número");
			}
		}
		return null;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serie pedirDatosPorConsola() {
		// TODO Auto-generated method stub
		return null;
	}

}

