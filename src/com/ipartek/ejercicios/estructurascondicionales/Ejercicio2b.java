package com.ipartek.ejercicios.estructurascondicionales;
/**
 * Realiza un programa que pida un numero por consola. <br>
 * En caso de que el numero sea mayor que 50, o menor que 0, indicar que el numero introducido no es valido.
 * Repetirá la pregunta hasta que metamos un valor correcto, y si lo has intentado más de 3 veces te insultará
 * @author Arturo Montañez
 *
 */

import java.util.Scanner;

public class Ejercicio2b {
	static final int VALOR_MINIMO = 0;
	static final int VALOR_MAXIMO = 50;
	static final int INTENTOS = 3;
	public static void main(String[] args) {
		//int numero = 51;
		int numero = 0;
		int intento = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		/*while (numero < 0 || numero > 50){
			if (intento < 3) {
				System.out.println("Introduce un número entre 0 y 50: ");
			}
			else {
				System.out.println("Introduce un número entre 0 y 50, ZOQUETE: ");
			}
			//numero = entrada.nextInt();
			//nextLine es más aconsejable, aunque devuelve un String. Hay que convertirlo a integer.
			numero = Integer.parseInt(entrada.nextLine());
		
		
			
			intento = intento + 1;
	
		}*/
		
		do {
			
			if (intento < INTENTOS) {
				System.out.println("Introduce un número entre 0 y 50: ");
			}
			else {
				System.out.println("Introduce un número entre 0 y 50, ZOQUETE: ");
			}
			//numero = entrada.nextInt();
			//nextLine es más aconsejable, aunque devuelve un String. Hay que convertirlo a integer.
			numero = Integer.parseInt(entrada.nextLine());
		
		
			
			intento++;
			
		}while (numero < VALOR_MINIMO || numero > VALOR_MAXIMO);
		
		if (intento < 3) {
			System.out.println("Bien hecho");
		}
		else {
			System.out.println("Ya era hora, ZOQUETE");
		}
		entrada.close();
	}
}
