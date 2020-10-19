package com.ipartek.ejercicios.variablesyoperadores;
/**
 * Realizar un programa que realice la siguiente operación: crear tres variables de tipo Byte, llamadas num1, num2, resultado.<br> 
 * Asignar los valores 255 y 223. Sumarlas y guardarlo en resultado. Comprueba si el resultado da 478.<br>  
 * Si no lo da, buscar una solución al problema para solucionarlo.
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		/*byte num1 = 255;
		byte num2 = 223;
		byte int resultado = num1 + num2;
		*/
		
		
		//short num1 = 255;
		//short num2 = 223;
		//int resultado = num1 + num2;
		
		byte num1 = -1; 
		int num1entero = (num1 & 0xFF); // 255
		//  System.out.println(num1entero); 
		  
		  byte num2 = -33; 
		  int num2entero = (num2 & 0xFF); // 223
		//  System.out.println(num2entero); 
		 
		  int resultado = num1entero + num2entero;
		  
		  System.out.println("El resultado es " + resultado);

		
		//System.out.println("La suma " + num1 +" y " + num2 + " es " + resultado);
		
		/*byte num1 = (byte) 255;
		byte num2 = (byte) 223;
		byte result = (byte) (num1 + num2);

		if (result == 478) {

		  System.out.println("El resultado es 478. Esta OK" + result);

		  } else {

		   System.out.println("ERROR. El resultado no es 478 es " + result);
		  */
		
	}

}
