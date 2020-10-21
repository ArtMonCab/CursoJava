package com.ipartek.ejercicios.estructurascondicionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida un numero por consola. <br>
 * En caso de que el numero sea mayor que 50, o menor que 0, indicar que el numero introducido no es valido.
 * 
 * @author Arturo Montañez
 *
 */

public class Ejercicio2 {
	//Constantes en mayusculas
	static final int VALOR_MINIMO = 0;
	static final int VALOR_MAXIMO = 50;
	public static void main(String[] args) {
		int numero = 0;
		
		System.out.println("Introduce un número: ");
		Scanner entrada = new Scanner(System.in);
		
		//numero = entrada.nextInt();
		//nextLine es m�s aconsejable, aunque devuelve un String. Hay que convertirlo a integer.
		numero = Integer.parseInt(entrada.nextLine());
		
		
		if (numero > VALOR_MAXIMO || numero < VALOR_MINIMO) {
			System.out.println(numero +" no es valido.");
		}
		
		entrada.close();
	}

}
