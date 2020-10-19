package com.ipartek.ejercicios.estructurascondicionales;

import java.util.Scanner;

/**
 * Pedir por teclado al usuario que introduzca una distancia en cm
 *Una vez introducida, se solicitará que escoja a que unidad se van a convertir, introduciendo la opción por teclado
 * <ul>
 *<li>A convertir a metros</li>
 *<li>B: convertir a pulgadas</li>
 *<li>C: convertir a pies</li>
 *<li>D:convertir a yardas</li>
 *</ul>

 * @author Arturo Montañez
 *
 */

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float distancia = 0;
		char opcion;
		
		System.out.println("Introduce una distancia en centimetros:");
		distancia = Integer.parseInt(sc.nextLine());
		
		do {
			System.out.println("Elija una opción de conversion");
			System.out.println("A: Convertir a metros");
			System.out.println("B: Convertir a pulgadas");
			System.out.println("C: Convertir a pies");
			System.out.println("D: Convertir a yardas"); 
			System.out.println("E: Salir del menu");


			opcion = Character.toUpperCase(sc.nextLine().charAt(0));
			
			if (opcion == 'A') {
				System.out.println(Math.round(distancia) + " centimetros son " + (distancia*0.01) + " metros.");
			}
			if (opcion == 'B') {
				System.out.println(Math.round(distancia) + " centimetros son " + (distancia*0.39379) + " pulgadas.");
			}
			if (opcion == 'C') {
				System.out.println(Math.round(distancia) + " centimetros son " + (distancia*0.0328084) + " pies.");
			}
			if (opcion == 'D') {
				System.out.println(Math.round(distancia) + " centimetros son " + (distancia*0.0109361) + " yardas.");
			}
			
			System.out.println("");
			System.out.println("----------------------------------------------------------------");
			System.out.println("");
		}
			
		//while (opcion != 'A' && opcion != 'B' && opcion != 'C' && opcion != 'D' && opcion != 'E');{
		while (opcion != 'E');
		
		
		sc.close();
		System.out.println("Aplicación finalizada");	
		

		}		
}
