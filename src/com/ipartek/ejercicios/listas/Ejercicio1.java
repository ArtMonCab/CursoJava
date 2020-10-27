package com.ipartek.ejercicios.listas;

import java.util.ArrayList;

import java.util.Scanner;

import com.ipartek.pojo.Perro;


/**
 * Crear una lista de nombres de alumnos, donde se guardaran con strings.<br>
 * Insertar diez nombres de alumnos en la lista.br> 
 * Mostrar los diez nombres recorriendo la lista con un foreach.br>
 * 
 * 
 * @author Arturo Montañez
 *
 */

public class Ejercicio1 {
	
	static ArrayList<String> listaAlumnos = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		
		insertarAlumnos();
		
		mostrarAlumnos();
		
	}
	
	
	private static void insertarAlumnos() {
		
		Scanner sc = new Scanner(System.in);
		
		//listaAlumnos = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el nombre del alumno " + (i + 1));
			listaAlumnos.add(sc.nextLine());
			
		}
		
		sc.close();
		
		
	}

	private static void mostrarAlumnos() {
		for (String nombre: listaAlumnos) {
			
			  System.out.println(nombre);
			  
			}
		
	}
}
