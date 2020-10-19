package com.ipartek.ejercicios.variablesyoperadores;

/**
 * Realizar un programa que tenga 2 variables enteras, dividendo y divisor. Meterle valores  enteros y positivos.<br>
 * Realizar la operación división y mostrar el resultado en pantalla<br>
 * Repetir el mismo código con estas variaciones: entero y real, real y entero, real y real<br>
 * Por ultimo, intentar dividir en los cuatro casos anteriores entre 0 y mostrar el resultado en pantalla<br>
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		int DividendoEntero = 13;
		int DivisorEntero = 21;
		float DividendoReal = 21.56f;
		float DivisorReal = 234.56f;
		
		System.out.println(DividendoEntero + " entre "+DivisorEntero+ " igual a " + (DividendoEntero/DivisorEntero));
		System.out.println(DividendoEntero + " entre "+DivisorReal+ " igual a " + (DividendoEntero/DivisorReal));
		System.out.println(DividendoReal + " entre "+DivisorEntero+ " igual a " + (DividendoReal/DivisorEntero));
		System.out.println(DividendoReal + " entre "+DivisorReal+ " igual a " + (DividendoReal/DivisorReal));
		//System.out.println(DividendoEntero + " entre "+DivisorEntero+ " igual a " + (DividendoEntero/0));
		try {
		System.out.println(DividendoEntero + " entre "+DivisorEntero+ " igual a " + (DividendoEntero/0));
		} catch (Exception e) {
			System.out.println(DividendoEntero + " entre 0 da error");
		}
		
		System.out.println(DividendoReal + " entre 0 igual a " + (DividendoReal/0));
	}

}
