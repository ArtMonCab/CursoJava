package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import com.ipartek.pojo.Perro;

/**
 * Ejercicio para practicar con ArrayList
 * @author Arturo Montañez
 *
 */

public class EjercicioPerros {
	public static void main(String[] args) {
		
		//Con variables "normales"
		 ArrayList<String> perros = new ArrayList<String>();
		 
		 //Insertar
		 perros.add("Laika");
		 perros.add("Rintintin");
		 perros.add("Lasie");
		 perros.add("Cosmo");
		 perros.add("Scubby");
		 perros.add("Rex");
		 
		 // insertar en una posicion
		 perros.add(1, "Scrappy");
			
		 // reemplazar
		 perros.set(1, "Canelo");
			
		 // eliminar por indice
		 perros.remove(1);
			
		 // eliminar por nombre
		 perros.remove("Rex");
			
		 // recuperar	
		 String s = perros.get(3); 

		 // recuperar longitud
		 perros.size();
			
		 // obtener la posicion de un objeto dentro del array
		 int posicion = perros.indexOf("Repelega");
			
			
		// recorrer para mostrar con Iterator
		for (Iterator<String> iterator = perros.iterator(); iterator.hasNext();) {
				
			String perretes = iterator.next();
			System.out.println(perretes);
		}
		
		//Con objetos
		
		Perro can = new Perro();
		/*Perro can1 = new Perro();
		Perro can2 = new Perro();
		Perro can3 = new Perro();
		Perro can4 = new Perro();*/
		ArrayList<Perro> canes = new ArrayList<Perro>();
		
		//Insertar
		
		/*can1.setNombre("Cosmo");
		canes.add(can1);
		
		can2.setNombre("Scubby Doo");
		canes.add(can2);
		
		can3.setNombre("Niebla");
		canes.add(can3);
		
		can4.setNombre("Pequeño Ayudante de Santa Claus");
		canes.add(can4);*/
		
		canes.add(new Perro("Cosmo"));
		canes.add(new Perro("Scubby Doo"));
		canes.add(new Perro("Goofy"));
		canes.add(new Perro("Niebla"));
		
		// recorrer para mostrar con Iterator
		for (Iterator<Perro> iterator = canes.iterator(); iterator.hasNext();) {
				
			Perro perretes = iterator.next();
			System.out.println(perretes);
		}
		
		//Para borrar un perro de la lista
		for (int i = 0; i < canes.size() ; i++) {
			
			Perro pIteracion = canes.get(i);
			
			if ( "Niebla".equals(pIteracion.getNombre()) ) {
				canes.remove(i);
				break; // salir del for
			}
			
		}// for
		
	}



}
