package com.ipartek.ejercicios.excepciones;
/**
 * 
 * @author Arturo Montañez
 *
 */

import java.util.Scanner;

import com.ipartek.Utilidades;

public class EjercicioThrows {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime los 8 numeros de tu dni:");
		String dniNumeros = sc.nextLine();
		
		try {
			String dniCompleto = Utilidades.calcularLetraDni(dniNumeros);
			System.out.println("Tu DNI copleto es: " + dniCompleto);
			
		}catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage() );
		}	
		

		sc.close();
	}
}
