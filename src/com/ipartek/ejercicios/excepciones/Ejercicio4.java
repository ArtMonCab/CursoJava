package com.ipartek.ejercicios.excepciones;

import com.ipartek.pojo.Persona;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * Crea una clase Persona con los atributos nombre y edad. <br>
 * En el método setEdad lanzar una excepción si la edad introducida es menor que 0 o mayor que 120.<br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso del constructor vacío, y lea los datos por teclado y los asigne a los objetos creados. Solo introducirá las personas en la lista si están en el rango de edad indicado, comprobándolo mediante el uso de excepciones.
 * <br>
 * Ej: probar a crear las siguientes personas: 
 * <ol>   
 *   <li>“pepe” con 56 años</li>
 *   <li>“matusalem” con 199 años</li>
 *  </ol> 
 *
 * @author ur00
 * @version 1.0
 *
 */

public class Ejercicio4 {
	
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int contador = 0;
		
		// Lo que aparece entre <> se llama CASTEAR y sirve para indicar el tipo de Objetos que tenemos dentro del Array
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		//TODO introducir el número de personas que yo quiera
		System.out.println("Introduce el número de personas que quieres introducir:");
		contador = Integer.parseInt(sc.nextLine());
		System.out.println(contador);	
		
		do {
			try {
			
				Persona p = new Persona();
				System.out.println("Introduce el nombre de la persona:");
				p.setNombre(sc.nextLine());
			
				System.out.println("Introduce la edad de la persona:");
				p.setEdad(Integer.parseInt(sc.nextLine()));
				/*Persona p1 = new Persona();		
				p1.setNombre("Pepe");
				p1.setEdad(56);*/
			
				personas.add(p);
			
				contador--;
			
			
				/*Persona p2 = new Persona();		
				p2.setNombre("Matusalem");
				p2.setEdad(300); // CUIDADO lanza una Exception y va directo al Catch, no ejecuta las lineas de abajo
			
			
				personas.add(p2);*/
			
			}catch (Exception e) {
				System.out.println( e.getMessage() );
			}
			//}finally {
			
				// foreach para iterar sobre el ArrayList<Perona>
				//for (Persona p : personas) {
					//System.out.println(p);
				//}
			
				// for de toda la vida
				/*
				for (int i = 0; i < personas.size(); i++) {
				System.out.println( personas.get(i));
				}
				 */
			
			//}
		}while (contador > 0);
		
		// foreach para iterar sobre el ArrayList<Perona>
		for (Persona p : personas) {
			System.out.println(p);
		}
		
		
		//System.out.println(p); // llamamos al metodo .toString()
		//System.out.println(p.toString());
		
		//
		sc.close();
	}

}
