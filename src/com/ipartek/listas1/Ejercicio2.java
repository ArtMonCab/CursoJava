package com.ipartek.listas1;

import java.util.ArrayList;

import java.util.Scanner;

import com.ipartek.pojo.Jugador;
import com.ipartek.pojo.Perro;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos de la clase Jugador,<br> 
 * que tendrá los atributos nombre, de tipo Sting y dorsal de tipo int.<br> 
 * Solicitar los datos de los jugadores por teclado, y una vez introducido el primero, se insertara<br> 
 * en la lista y se preguntara si se desea introducir otro más, para lo cual el usuario escribirá S o N.<br> 
 * En caso afirmativo se volverá a pedir otro más, hasta que el usuario escriba N<br> 
 * 
 * 
 * 
 * @author Arturo Montañez
 *
 */

public class Ejercicio2 {
	
	static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
	
	public static void main(String[] args) {
		
		
		insertarJugadores();
		
		mostrarJugadores();
		
	}
	
	
	private static void insertarJugadores() {
		
		Scanner sc = new Scanner(System.in);
		
		char continuar = 'S';
		
		do {
			Jugador jugador = new Jugador();
			System.out.println("Introduce el nombre del jugador " + (i + 1) + " :");
			jugador.setNombre(sc.nextLine());
			System.out.println("Introduce el dorsal del jugador " + (i + 1) + " :");
			jugador.setDorsal(Integer.parseInt(sc.nextLine()));
			
			System.out.println("-----------------------------------");
			do {
				System.out.println("¿Desea introducir otro jugador (S/N)");
				//continuar = 
			}while ((continuar != 'S') && (continuar != 'N'));
			
		}while (continuar != 'N');
		
		sc.close();
		
		
	}

	private static void mostrarJugadores() {

		
	}
	

}
