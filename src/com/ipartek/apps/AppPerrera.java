package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;
import com.ipartek.pojo.Perro;

public class AppPerrera {

	// variables globales para esta Clase
	//Las variabes estaticas van a ser compartidas con todos los objetos
	static Scanner sc = null;
	static ArrayList<Perro> lista = new ArrayList<Perro>();
	static String opcion = "";   // opcion seleccionada en el menu por el usuario
	//static boolean salida = false;
	
	// constantes
	static final String OP_LISTAR = "1";
	static final String OP_ALTA = "2";
	static final String OP_BAJA = "3";
	static final String OP_MOSTRAR = "4";
	static final String OP_MODIFICACION = "5";
	static final String OP_SALIR = "S";
	public static void main(String[] args) {
		
		
		System.out.println("***********  GESTION DE PERRERA   **************");
		sc = new Scanner(System.in);

		inicializarDatos();
		
		
		do {
			crearMenu();
		
			//TODO cambiar "1","2","3" etc  por constantes
			//switch (opcion.toUpperCase()) {   Se hace al final en el while
			switch (opcion) {
			case OP_LISTAR:
				listar();
				break;
			case OP_ALTA:
			// TODO resto de opciones
				alta();
				break;	
			case OP_BAJA:
			// TODO resto de opciones
				baja();
				break;
			case OP_MOSTRAR:
			// TODO resto de opciones
				System.out.println("Introduce el nombre del perro:");
				String nombrePerro = sc.nextLine();
				mostrar(nombrePerro);
				break;
			case OP_MODIFICACION:
			// TODO resto de opciones
				modificacion();
				break;
			case OP_SALIR:
			// TODO resto de opciones
				//System.out.println("Salir de la aplicación");
				//salida = false;
				break;
			default:
				System.out.println("Escoge una opción correcta");
			}
		//}while(salida);
		}while(!OP_SALIR.equalsIgnoreCase(opcion));
		
		/*
		 * Mejor OP_SALIR.equalsIgnoreCase(opcion)); que opcion.equalsIgnoreCase(OP_SALIR));
		 * Ya que podria darse el caso de que la variable opcion sea NULL
		 */
		 
		
		System.out.println("***********  Hasta luego, Lucasss   **************");
		sc.close();
		
	}// main


	private static void listar() {
		
		for (Perro perro : lista) {
			//TODO dar formato para mostrar solo nombre y raza
			//System.out.println(perro);
			System.out.println( String.format("%31s [%s]  %s Kg", perro.getNombre(), perro.getRaza(), perro.getPeso()  ));
		}
		
	}


	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	private static void inicializarDatos() {
		
		lista.add( new Perro("Scubby Doo") );
		lista.add( new Perro("Niebla") );
		lista.add( new Perro("Pequeño ayudante de Santa Claus") );
		lista.add( new Perro("Goofy") );
		
	}


	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void crearMenu() {
	
		System.out.println("************************************");
		System.out.println(" 1.- Listado de perros");
		System.out.println(" 2.- Alta de un perro");
		System.out.println(" 3.- Baja de un perro");
		System.out.println(" 4.- Mostrar datos de un perro");
		System.out.println(" 5.- Modificación de datos de un perro");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");
		
		System.out.println("\n Selecciona una opcion del menu:");
		//TODO gestionar errores
		opcion = sc.nextLine();
		
		
	}
	
	//Añadir un perro
	private static void alta() {
		Perro perro = new Perro();
		System.out.println("Introduce el nombre del nuevo perro:");
		perro.setNombre(sc.nextLine());
		
		System.out.println("Introduce la raza del nuevo perro:");
		perro.setRaza(sc.nextLine());
		
		System.out.println("Introduce el peso del nuevo perro:");
		perro.setPeso(Float.parseFloat(sc.nextLine()));
		
		//TODO controlar que meta "S" o "N"
		System.out.println("¿El perro está vacunado (s/n)?:");
		//perro.setVacunado(sc.nextLine());
		perro.setVacunado(Boolean.parseBoolean(sc.nextLine()));
		System.out.println("Introduce la historia del nuevo perro:");
		perro.setHistoria(sc.nextLine());
		
		lista.add(perro);
		
		
	}
	
	//Borrar un perro
	//TODO baja
	private static void baja() {
		//TODO poder elegir entre dar de baja por nombre o por posición dentro de la lista
		String nombrePerro = " ";
		System.out.println("Introduce el nombre del perro que desea dar de baja");
		nombrePerro = sc.nextLine();
		
		
		//Para borrar un perro de la lista
		for (int i = 0; i < lista.size() ; i++) {
			
			Perro pIteracion = lista.get(i);
			
			if ( nombrePerro.equals(pIteracion.getNombre()) ) {
				System.out.println("Datos del perro");
				System.out.println("===============");
				mostrar(nombrePerro);
				lista.remove(i);
				break; // salir del for
			}
			
		}
		
	}
	
	//Mostrar los datos de un perro
	//TODO mostrar
	private static void mostrar(String nombre) {
		System.out.println("El nombre del perro es " + nombre);
	}	
	
	
	//Modificar los datos de un perro
	//TODO modificacion
	private static void modificacion() {
		System.out.println("Modificación de un perro");
	}

}// AppPerrera
