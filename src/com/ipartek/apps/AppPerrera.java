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
	
	// constantes
	
	//TODO poner como private
	static final String OP_LISTAR = "1";
	static final String OP_ALTA = "2";
	static final String OP_BAJA = "3";
	static final String OP_MOSTRAR = "4";
	static final String OP_MODIFICACION = "5";
	static final String OP_SALIR = "S";
	
	static final String OP_NOMBRE = "1";
	static final String OP_RAZA = "2";
	static final String OP_PESO = "3";
	static final String OP_VACUNACION = "4";
	static final String OP_HISTORIA = "5";
	
	
	public static void main(String[] args) {
		
		
		System.out.println("***********  GESTION DE PERRERA   **************");
		sc = new Scanner(System.in);
		boolean salir = false;

		inicializarDatos();
		
		
		do {
			crearMenu();
		
			switch (opcion.toUpperCase()) { 
			//switch (opcion) {
			case OP_LISTAR:
				listar();
				break;
			case OP_ALTA:
				alta();
				break;	
			case OP_BAJA:
				baja();
				break;
			case OP_MOSTRAR:
				System.out.println("Introduce el nombre del perro:");
				String nombrePerro = sc.nextLine();
				mostrar(nombrePerro);
				break;
			case OP_MODIFICACION:
				modificacion();
				break;
			case OP_SALIR:
				salir = true;
				System.out.println("***********  Hasta luego, Lucasss   **************");
				break;
			default:
				//TODO que no salga este mensaje cuando le doy a la opcion de salir.
				//if (!salir) {
					System.out.println("Escoge una opcion correcta");
				//}
			}
		}while(!salir);
		//}while(!OP_SALIR.equalsIgnoreCase(opcion));
		
		/*
		 * Mejor OP_SALIR.equalsIgnoreCase(opcion)); que opcion.equalsIgnoreCase(OP_SALIR));
		 * Ya que podria darse el caso de que la variable opcion sea NULL
		 */
		 
		
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
		lista.add( new Perro("Pequeno ayudante de Santa Claus") );
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
		System.out.println(" 5.- Modificacion de datos de un perro");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");
		
		System.out.println("\n Selecciona una opcion del menu:");
		//TODO gestionar errores
		opcion = sc.nextLine();
		
		
	}
	
	private static void crearMenuModificacion() {
		
		System.out.println("************************************");
		System.out.println(" 1.- Modificar nombre");
		System.out.println(" 2.- Modificar raza");
		System.out.println(" 3.- Modificar peso");
		System.out.println(" 4.- Modificar vacunacion");
		System.out.println(" 5.- Modificar historia");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");
		
		System.out.println("\n Selecciona una opcion del menu:");
		opcion = sc.nextLine();
		
	}
	//Aniadir un perro
	private static void alta() {
		Perro perro = new Perro();
		System.out.println("Introduce el nombre del nuevo perro:");
		perro.setNombre(sc.nextLine());
		
		System.out.println("Introduce la raza del nuevo perro:");
		perro.setRaza(sc.nextLine());
		
		System.out.println("Introduce el peso del nuevo perro:");
		perro.setPeso(Float.parseFloat(sc.nextLine()));
		
		//TODO controlar que meta "S" o "N"
		System.out.println("El perro esta vacunado (s/n)?:");
		perro.setVacunado(Boolean.parseBoolean(sc.nextLine()));
		
		System.out.println("Introduce la historia del nuevo perro:");
		perro.setHistoria(sc.nextLine());
		
		lista.add(perro);
		
		
	}
	
	//Borrar un perro
	private static void baja() {
		//TODO poder elegir entre dar de baja por nombre o por posicion dentro de la lista
		String nombrePerro = " ";
		String borrar = "S";
		
		System.out.println("Introduce el nombre del perro que desea dar de baja");
		nombrePerro = sc.nextLine();
		
		
		//Para borrar un perro de la lista
		for (int i = 0; i < lista.size() ; i++) {
			
			Perro perro = lista.get(i);
			
			if ( nombrePerro.equals(perro.getNombre()) ) {
				System.out.println("Datos del perro que desea dar de baja");
				System.out.println("=====================================");
				System.out.println( String.format("%s [%s]  %s Kg", perro.getNombre(), perro.getRaza(), perro.getPeso()  ));
				System.out.println(" ");
				
				//Pido confirmacion de la baja
				do {
					System.out.println("Esta seguro de que quiere dar de baja a " + nombrePerro + " ? (S/N)");
					borrar = sc.nextLine();
				}while((!borrar.equalsIgnoreCase("s")) && (!borrar.equalsIgnoreCase("n")));
				
				if (borrar.equalsIgnoreCase("s")){
					lista.remove(i);
				}
				break; // salir del for
			}
			
		}
		
	}
	
	//Mostrar los datos de un perro
	private static boolean mostrar(String nombre) {
		
		boolean existe = false;
		int i = 0;
		do {
			Perro perro = lista.get(i);
			
			if (perro.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println( String.format("%31s [%s]  %s Kg", perro.getNombre(), perro.getRaza(), perro.getPeso()  ));
				existe = true;
				//return true;
			}
			i++;
		}while((!existe) && ( i < lista.size()));
		
		if (!existe) {
			System.out.println ("No tenemos datos de ese perro");
			//return false;
		}
		
		return existe;
	}	
	
	
	//Modificar los datos de un perro
	//TODO modificacion
	private static void modificacion() {
		System.out.println("Introduce el nombre del perro que desea modificar:");
		String nombrePerro = sc.nextLine();
		if(mostrar(nombrePerro)) {
			
			do {
				crearMenuModificacion();
			
				switch (opcion) {
				case OP_NOMBRE:
					System.out.println("Modificar nombre");
					break;
				case OP_RAZA:
					System.out.println("Modificar raza");
					break;	
				case OP_PESO:
					System.out.println("Modificar peso");
					break;
				case OP_VACUNACION:
					System.out.println("Modificar vacunacion");
					break;
				case OP_HISTORIA:
					System.out.println("Modificar historia");
					break;
				case OP_SALIR:
					crearMenu();
					break;
				default:
					//TODO que no salga este mensaje cuando le doy a la opcion de salir.
					System.out.println("Escoge una opcion correcta");
				}
			}while(!OP_SALIR.equalsIgnoreCase(opcion));
		}
	}

}// AppPerrera
