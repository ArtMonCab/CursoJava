package com.ipartek.actividades;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 *  Crear un proyecto en modo consola que nos muestre un men� de 3 opciones:<br>
 *  <ul>
 *  <li>Calcular la letra del dni</li>
 *  <li>Calcular medida de cm a pulgadas</li>
 *  <li>Salir</li>
 *  </ul>
 *  Hacer que dicho men� se ejecute en bucle hasta que se pulse salir, y si el usuario escoge cada una<br>
 *  de las funciones, que permita introducir los datos correspondientes por teclado para poder dar el<br>
 *  resultado<br>

 * @author Arturo Monta�ez Cabanillas
 *
 */

import java.util.Scanner;

public class EjercicioPractico1B {
	
	//variables globales para esta Clase
	static Scanner sc = null;
	static String opcion = "";   // opcion seleccionada en el menu por el usuario
	
	//constantes
	
	static final String OP_DNI = "1";
	static final String OP_CONVERSION = "2";
	static final String OP_SALIR = "S";
	
	 static final char LETRAS_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
			    'H', 'L', 'C', 'K', 'E' };
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		boolean salir = false;
			
		do {
			crearMenu();
			switch (opcion.toUpperCase()) { 
			case OP_DNI:
				calcularDNI();
				break;
			case OP_CONVERSION:
				calcularMedida();
				break;	
			case OP_SALIR:
				salir = true;
				System.out.println("***********  Fin del programa   **************");
				break;
			default:
					System.out.println("** Error. Elija una opci�n correcta. **");
			}
		}while(!salir);
		
		sc.close();
		
	}
	
	private static void crearMenu() {
		
		System.out.println("*************  MENU   **************");
		System.out.println(" 1.- Calcular la letra del DNI");
		System.out.println(" 2.- Calcular medida de centimetros a pulgadas");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");
		
		System.out.println("\n Selecciona una opcion del menu:");
		//TODO gestionar errores
		opcion = sc.nextLine();
		
		
	}
	
	private static void calcularDNI() {
		
		boolean correcto = false;
		String numeroDNI = "";
		String todoDNI = "";
		
		do {
			try {
				System.out.println("Introduzca el n�mero del DNI:");
				numeroDNI = sc.nextLine();
				todoDNI= calcularLetraDNI(numeroDNI);
				System.out.println("El DNI es "+ todoDNI);
				correcto = true;
			}catch (Exception e) {
				System.out.println(e.getMessage());
			};
			
		}while(!correcto);
		
		System.out.println(" ");	
		System.out.println("------------------------------------");
		System.out.println(" ");		
		
		
	}
	
	private static void calcularMedida() {
		float distancia = 0;
		boolean correcto = false;
		String pulgadas = "";
		
		do {
			try {
				System.out.println("Introduce una distancia en centimetros:");
				distancia = Float.parseFloat(sc.nextLine());
				correcto = true;
			}catch (Exception e) {
				System.out.println("Debes introducir un n�mero correcto, o poner un punto como separador decimal");
			}
		}while (!correcto);
		//Formateo para que las pulgadas salgan con dos decimales.
		pulgadas = String.format(" %.2f",distancia*0.39379);
		System.out.println(distancia + " centimetros son " + pulgadas + " pulgadas.");
		System.out.println("------------------------------------");
		System.out.println(" ");
		
		
	}
	
	private static String calcularLetraDNI ( String numeroDNI ) throws Exception {
		
		char letra;
		
		if (numeroDNI == null) {
			throw new Exception("Debe introducir un numero");
		}
		
		try {
			int posicion =  Integer.parseInt(numeroDNI) % 23;
			letra = LETRAS_DNI[posicion];
			
		}catch (Exception e) {
			throw new Exception("'" + numeroDNI +"' no es un n�mero de DNI correcto");
		}	
		

		//En caso de que numeroDNI sea un numero, pero no tenga la longitud adecuada
		if ( numeroDNI.length() != 8 ) {
			throw new Exception("Para tener un DNI correcto se necesita un n�mero de 8 d�gitos");
		}
		
		return numeroDNI + letra;
	}

}
