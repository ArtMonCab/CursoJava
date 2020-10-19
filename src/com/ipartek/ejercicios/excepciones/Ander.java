package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

public class Ander {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduce un número");
			int numero = Integer.parseInt(sc.nextLine());
			
			//Si la linea de arriba lanza la excepción, las de abajo no se ejecutan.
			System.out.println("Tu número es: " + numero);
			
		}catch (Exception e) {
			//Si queremos ver la traza de la excepción
			e.printStackTrace();
			System.out.println("No es un número valido");
		}finally {//No es obligatorio
			sc.close();
			System.out.println("Cerramos Scanner");
		}
		
		
	}

}
