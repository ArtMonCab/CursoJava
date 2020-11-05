package com.ipartek.ejercicios.listas;

import com.ipartek.pojo.Carta;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
	
	static final String PALOS_NOMBRES[] = {"Bastos","Copas","Espadas","Oros"};
	static final String CARTAS_NOMBRES[] = {"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Sota","Caballo","Rey"}; 

	static ArrayList<Carta> listaCartas = new ArrayList<Carta>();
	
	
	
	
	public static void main(String[] arg) {
		
		//static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

		crearBaraja();
		
		barajar();
		
		
	}



	private static void barajar() {
		
		int i = 0;
		int contador = 0;
		Carta carta = new Carta();
		
		do {
			i = (int) Math.floor(Math.random()*(0-(listaCartas.size())+1)+(listaCartas.size()));
			
			carta = listaCartas.get(i-1);
			contador++;
			System.out.println("Carta " + contador + " : " + CARTAS_NOMBRES[carta.getNumero()] + " de " + carta.getPalo());
			listaCartas.remove(i-1);
				
			
		}while (!listaCartas.isEmpty());
		
		System.out.println("Final");
	}

	
	
	private static void crearBaraja() {
		
		for (int palo = 0 ; palo < PALOS_NOMBRES.length ; palo++) {
			
			System.out.println(PALOS_NOMBRES[palo]);
			System.out.println( "-----------------");
			for (int numero = 0 ; numero < CARTAS_NOMBRES.length ; numero ++) {
				Carta carta = new Carta(numero, PALOS_NOMBRES[palo]);
				
				listaCartas.add(carta);
				System.out.println(CARTAS_NOMBRES[numero] + " de " + PALOS_NOMBRES[palo]);
			}
			System.out.println( "=======================================================");
			System.out.println( " ");
			
			
			
		}
		

		
	}

	

	
	
}
