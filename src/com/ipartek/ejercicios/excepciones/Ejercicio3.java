package com.ipartek.ejercicios.excepciones;

/**
 * Realice un método que reciba como argumento un String y un número y muestre la letra de la posición indicada.<br> 
 * Llámelo pasando como parámetro  un String sin inicializar.<br> 
 * Dicha llamada se encontrara dentro de un bloque try catch, que en caso de producirse una excepción por un paso de parámetros a null,<br>
 * no acabe con la ejecución del programa.<br>
 * Así mismo, se controlara también que si el numero pasado es mayor que el tamaño del string, capturara el error 
 * y nos solicitara meter un numero valido, indicándonos los valores en los que puede estar comprendido 
 * (para este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla no es una maravilla”) 
 * @author Arturo Montañez
 *
 */

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = "";
		int numero = 0;
		boolean isError = true;
		
		//Lo saco fuera para no tener que volver a introducir el string
		do {
			System.out.println("Introduce un string:");
			texto = sc.nextLine();
		}while (texto.length() > 0);
		
		
		do {
			try {
				//System.out.println("Introduce un string:");
				//texto = sc.nextLine();
			
				System.out.println("Introduce un número:");
				numero = Integer.parseInt(sc.nextLine());
				
				System.out.println("El caracter en la posición " + numero + " es " + texto.charAt(numero));
				isError = false;
			}catch(NumberFormatException e) {
				System.out.println("El dato no es valido. Introduzca un número correcto");
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("El número introducido excede el tamaño del string. Introduzca un número menor de " + texto.length());
			}
		}while (isError);
		
		
		
	}

}
