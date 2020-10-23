
package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

public class Utilidades implements IFunciones{
	
	 static final char LETRAS_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
			    'H', 'L', 'C', 'K', 'E' };
	
	/**
	 * Calcula la letra del DNI
	 * @param numeros String son los 8 numeros del DNI
	 * @return dni completo con los numeros + letra
	 * @throws Exception si no pasamos como parametros 8 numeros
	 */
	static public String calcularLetraDni ( String numeros ) throws Exception {
		
		char letra;
		
		if ( numeros == null ) {
			throw new Exception("No puede ser null");
		}
		
		if ( numeros.length() != 8 ) {
			throw new Exception("Los numeros de un dni son 8");
		}
		
		try {
			int posicion =  Integer.parseInt(numeros) % 23;
			letra = LETRAS_DNI[posicion];
			
		}catch (Exception e) {
			throw new Exception("No es un numero correcto " + numeros);
		}	
		
		return numeros + letra;
	}

	@Override
	public String pedirNombre() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		
		System.out.println ("Introduce un nombre");
		nombre = sc.nextLine();
		sc.close();
		
		//Miro si el nombre tiene más de un caracter
		if (nombre.length() <= 1) {
			throw new Exception("El nombre es muy corto");
		}
		
		//Compruebo que el nombre no tenga ningun numero
		for (int i = 0; i < nombre.length(); i++) {
			if (Character.isDigit(nombre.charAt(i))) {
				throw new Exception("El nombre no puede contener ningún número");
			}
		}
		return nombre;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {

		
		switch (tipoLoteria) { 
		//switch (opcion) {
		case LOTERIA_BONOLOTO:
			System.out.println("Los numeros premiados de la loteria primitica son: 1 - 4 - 5 - 16 - 23 - 43 Complementario: 15 Reintegro: 0");
			break;
		case LOTERIA_EUROMILLON:
			System.out.println("Los numeros premiados de la loteria primitica son: 5 - 6 - 15 - 37 - 42 Estrellas: 3 - 4");
			break;	
		case LOTERIA_QUINIELA:
			System.out.println("La combinación ganadora de la quiniela es 2 - 2 - X - 1 - 1 - 2 - 1 - X - 1 - 1 - 2 - 2 Pleno al 15: X");
			break;

		default:
			//TODO que no salga este mensaje cuando le doy a la opcion de salir.
			//if (!salir) {
				throw new Exception("Ese tipo de loteria no existe");
			//}
		}
		
	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {
		
		float vueltas = 0;
		if (dineroEntregado > precioProducto) {
			throw new Exception("El dinero entregado no es suficiente");
		}
		
		vueltas = dineroEntregado - precioProducto;
		
		return vueltas;
	}

	@Override
	public Serie pedirDatosPorConsola() {
		// TODO Auto-generated method stub
		return null;
	}

}
