package com.ipartek.ejercicios.estructurascondicionales;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * Mostrar al usuario el siguiente menú:
 *  Por favor escoja una opción:
 *  <ul>
 *  <li>A: calcular área de un triangulo</li>
 *	<li>B: calcular el área de un cuadrado</li>
 *	<li>C: calcular el área de un circulo</li>
 *	<li>D: calcular el área de un pentágono</li>
 *  <ul>
 *  Realizad las operaciones adecuadas indicadas en cada categoría. En caso de que no se escoja una opción adecuada, se mostrara un mensaje de error. 
 *  No deberá realizarse este menú en bucle

 * 
 * 
 * @author Arturo Montañez
 *
 */

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcion;
		boolean centinela = false;
		int base;
		int altura;
		int radio;
		int lado;
		int apotema;
		double area;
		DecimalFormat formato = new DecimalFormat("#.###");
		
		System.out.println("Elija una opción:");
		System.out.println("A: Calcular el área de un triangulo");
		System.out.println("B: Calcular el área de un cuadrado");
		System.out.println("C: Calcular el área de un circulo");
		System.out.println("D: Calcular el area de un pentagono"); 
		
		
		do {
			if (centinela) {
				System.out.println("Escoja una opción correcta"); 
			}
			opcion = Character.toUpperCase(sc.nextLine().charAt(0));
			centinela = true;
			
		//TODO hacer los calculos	
		}while (opcion != 'A' && opcion != 'B' && opcion != 'C' && opcion != 'D');
		
		if (opcion == 'A') {
			//Triangulo
			System.out.println("Introduce la longitud de la base:");
			base = Integer.parseInt(sc.nextLine());
			
			System.out.println("Introduce la longitud de la altura:");
			altura = Integer.parseInt(sc.nextLine());
			area = (base * altura * 1.0) /2;
			System.out.println("El área del triangulo es " + area);
			
		}
		if (opcion == 'B') {
			//Cuadrado
			System.out.println("Introduce la longitud de la base:");
			base = Integer.parseInt(sc.nextLine());
			
			System.out.println("Introduce la longitud de la altura:");
			altura = Integer.parseInt(sc.nextLine());
			area = base * altura;
			System.out.println("El área del cuadrado es " + area);
		}
		if (opcion == 'C') {
			//Circulo
			System.out.println("Introduce la longitud del radio");
			radio = Integer.parseInt(sc.nextLine());
			area = 2 * Math.PI * Math.pow(radio, 2);
			System.out.println("El área del circulo es " + area);

		}
		if (opcion == 'D') {
			//Pentagono
			System.out.println("Introduce la longitud del lado:");
			lado = Integer.parseInt(sc.nextLine());
			
			System.out.println("Introduce la longitud de la apotema:");
			apotema = Integer.parseInt(sc.nextLine());
			
			area = (5 * lado * apotema * 1.0) /2;
			System.out.println("El área del triangulo es " + area);
		}
		
		sc.close();
	}
		
	

}
