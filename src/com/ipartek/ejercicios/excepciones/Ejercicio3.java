package com.ipartek.ejercicios.excepciones;

/**
 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre la letra de la posici�n indicada.<br> 
 * Ll�melo pasando como par�metro  un String sin inicializar.<br> 
 * Dicha llamada se encontrara dentro de un bloque try catch, que en caso de producirse una excepci�n por un paso de par�metros a null,<br>
 * no acabe con la ejecuci�n del programa.<br>
 * As� mismo, se controlara tambi�n que si el numero pasado es mayor que el tama�o del string, capturara el error 
 * y nos solicitara meter un numero valido, indic�ndonos los valores en los que puede estar comprendido 
 * (para este apartado se le pasa como string la cadena de texto �La lluvia en Sevilla no es una maravilla�) 
 * @author Arturo Monta�ez
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
			
				System.out.println("Introduce un n�mero:");
				numero = Integer.parseInt(sc.nextLine());
				
				System.out.println("El caracter en la posici�n " + numero + " es " + texto.charAt(numero));
				isError = false;
			}catch(NumberFormatException e) {
				System.out.println("El dato no es valido. Introduzca un n�mero correcto");
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("El n�mero introducido excede el tama�o del string. Introduzca un n�mero menor de " + texto.length());
			}
		}while (isError);
		
		
		
	}

}
