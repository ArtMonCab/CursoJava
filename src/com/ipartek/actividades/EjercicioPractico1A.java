package com.ipartek.actividades;

/**
 * Realizar un programa en java que realice la siguiente función: Crear un array de 5 notas que<br>
 * almacenara en formato double.<br>
 * Una vez creado dicho array se rellenaran dichos elementos leyéndolo desde el teclado.<br>
 * Una vez creado el contenido, se calculara la media de las notas así como se mostraran las notas más<br>
 * altas y más bajas de dicho array.<br>

 * @author Arturo Montañez Cabanillas
 *
 */

import java.util.Scanner;

public class EjercicioPractico1A {
	
	public static void main(String[] args) {
		
		//Defino variables
		Scanner sc = new Scanner(System.in);
		int i = 0;
		boolean correcto = false;
		double sumaNotas = 0;
		double notaMaxima = 0;
		//Lo inicializo a 10 para asegurarme que al comparar la nota sea la minima.
		double notaMinima = 10;
		double notas[];
		
		//Creo el Array
		notas = new double[5];
		
		//Introduzco las 5 notas
		do {
	         //System.out.println(notas[i]);
			System.out.println("Introduce la nota "+ (i+1) +" :");
			//Compruebo que cada nota introducida sea la correcta;
			do {
				try {
					notas[i] = Double.parseDouble(sc.nextLine());
					
					//Compruebo que la nota está entre 0 y 10
					if ((notas[i] < 0) || (notas[i] > 10)){
						System.out.println("La nota debe estar entre 0 y 10. Vuelva a introducirla.");
					}else {
						correcto = true;
						i++;
					}
				}catch (Exception e){
					System.out.println("La nota " + (i+1) + " no es correcta ya que no es un número, o usa una coma en vez de un punto en el decimal. Vuelva a introducirla.");
				}				
			}while(!correcto);

	    }while (i < 5);
		
		System.out.println("Las notas son: ");
		for (i=0 ; i < notas.length ; i++) {
			//Actualizo la suma de notas
			sumaNotas = sumaNotas + notas[i];
			
			//Compruebo si es la nota maxima
			if (notaMaxima < notas[i]) {
				notaMaxima = notas[i];
			}
			
			//Compruebo si es la nota minima
			if (notaMinima > notas[i]) {
				notaMinima = notas[i];
			}
			System.out.println( notas[i]);
		}	  
		
		System.out.println(" ");
		System.out.println("------------------");
		System.out.println(" ");
		System.out.println("La nota media es: " + (sumaNotas / 5));
		System.out.println("La nota máxima es: " + notaMaxima);
		System.out.println("La nota mínima es: " + notaMinima);
		
		sc.close();
	}

}
