package com.ipartek;

import com.ipartek.pojo.Serie;

import java.util.Scanner;

public class ProbarInterfaz  {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
			
		/*
		//Pedir nombre
		Utilidades util = new Utilidades();
		String nombre = util.pedirNombre();
		System.out.println("Programa terminado");
		
		//Tipo loteria
		System.out.println("Introduce un tipo de loteria");
		util.imprimirNumeroLoteria(Integer.parseInt(sc.nextLine()));
		
		//Devolver vueltas
		System.out.println("Introduce el precio del producto");
		
		System.out.println("Introduce el dinero entregado");
		
		
		
		sc.close();
		*/
		
		Utilidades util = new Utilidades();
		
		// descomentar par probar los metodos
		// TODO mirar porque falla sacnner al probar los dos metodos seguidos
		/*  
		try {
			String nombre = util.pedirNombre();
			System.out.println("Tu nombre es " + nombre);
			
		}catch (Exception e) {
			System.out.println( e.getMessage() );
		}	
		*/
		
		Serie s = util.pedirDatosPorConsola();
		System.out.println("Tu serie es: " + s);
		
		// pedirNombre();
		System.out.println("El programa terminar");

		
	}

	

}
