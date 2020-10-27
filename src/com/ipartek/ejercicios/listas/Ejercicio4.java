package com.ipartek.ejercicios.listas;

import com.ipartek.pojo.Carta;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
	
	static final String PALOS_NOMBRES[] = {"bastos","copas","espadas","oros"};
	static final String CARTAS_NOMBRES[] = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"}; 

	static ArrayList<Carta> listaCartasSinBarajar = new ArrayList<Carta>();
	static ArrayList<Carta> listaCartasBarajadas = new ArrayList<Carta>();
	
	
	
	
	public static void main(String[] arg) {
		
		//static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

		crearBaraja();
		
		mezclarBaraja();
		
		
	}



	private static void mezclarBaraja() {
		// TODO Auto-generated method stub
		
		boolean centinela = true;
		int max = listaCartasSinBarajar.size() - 1;
		int i = 0;
		
		listaCartasBarajadas.clear();
		
		do {
			i = (int) Math.floor(Math.random()*(0-max+1)+max);
			//listaCartasBarajadas.add(listaCartasSinBarajar.get(i));
			
			try{
				listaCartasSinBarajar.remove(i-1);
			}catch (Exception e){
				
				System.out.println(i + " - " + );System.out.println("Final");
			}
			
		}while (!listaCartasSinBarajar.isEmpty());
		
		System.out.println("Final");
	}

	private static void crearBaraja() {
		// TODO Auto-generated method stub
		
		for (int palo = 0 ; palo < PALOS_NOMBRES.length ; palo++) {
			
			for (int numero = 0 ; numero < CARTAS_NOMBRES.length ; numero ++) {
				Carta carta = new Carta(numero, PALOS_NOMBRES[palo]);
				
				listaCartasSinBarajar.add(carta);
				System.out.println(CARTAS_NOMBRES[numero] + " de " + PALOS_NOMBRES[palo]);
			}
			System.out.println( "----------------------------------------------------");
			
			
			
		}
		

		
	}

	

	
	
}
