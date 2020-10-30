package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.PerroDAOSqlite;
//import com.ipartek.modelo.PerroDao;
import com.ipartek.pojo.Perro;

public class AppPerrera {

	// variables globales para esta Clase
	//Las variabes estaticas van a ser compartidas con todos los objetos
	static Scanner sc = null;
	//static ArrayList<Perro> lista = new ArrayList<Perro>();
	static private PerroDAOSqlite dao = new PerroDAOSqlite();
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

		//inicializarDatos();
		
		
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
				System.out.println("Introduce el id del perro:");
				int idPerro = Integer.parseInt(sc.nextLine());
				mostrar(idPerro);
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
		
		ArrayList<Perro> perros = dao.listar();
		for (Perro perro : perros) {
			//TODO dar formato para mostrar solo nombre y raza
			//System.out.println(perro);
			System.out.println( String.format("%31s [%s]  %s Kg", perro.getNombre(), perro.getRaza(), perro.getPeso()  ));
		}
		
	}


	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	/*private static void inicializarDatos() {
		
		lista.add( new Perro("Scubby Doo") );
		lista.add( new Perro("Niebla") );
		lista.add( new Perro("Pequeno ayudante de Santa Claus") );
		lista.add( new Perro("Goofy") );
		
	}*/


	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void crearMenu() {
	
		System.out.println("************************************");
		System.out.println(" "+ OP_LISTAR + ".- Listado de perros");
		System.out.println(" "+ OP_ALTA + ".- Alta de un perro");
		System.out.println(" "+ OP_BAJA + ".- Baja de un perro");
		System.out.println(" "+ OP_MOSTRAR + ".- Mostrar datos de un perro");
		System.out.println(" "+ OP_MODIFICACION + ".- Modificacion de datos de un perro");
		System.out.println(" ");
		System.out.println(" "+ OP_SALIR + " - Salir");
		System.out.println("************************************");
		
		System.out.println("\n Selecciona una opcion del menu:");
		//TODO gestionar errores
		opcion = sc.nextLine();
		
		
	}
	
	private static void crearMenuModificacion() {
		
		System.out.println("************************************");
		System.out.println(" "+ OP_NOMBRE + ".- Modificar nombre");
		System.out.println(" "+ OP_RAZA + ".- Modificar raza");
		System.out.println(" "+ OP_PESO + ".- Modificar peso");
		System.out.println(" "+ OP_VACUNACION + ".- Modificar vacunacion");
		System.out.println(" "+ OP_HISTORIA + ".- Modificar historia");
		System.out.println(" ");
		System.out.println(" "+ OP_SALIR + " - Salir");
		System.out.println("************************************");
		
		System.out.println("\n Selecciona una opcion del menu:");
		opcion = sc.nextLine();
		
	}
	//Aniadir un perro
	private static void alta() {
		
		boolean repetir = true;
		
		Perro perro = new Perro();
		
		System.out.println("Introduce el nombre del nuevo perro:");
		perro.setNombre(sc.nextLine());
		
		System.out.println("Introduce la raza del nuevo perro:");
		perro.setRaza(sc.nextLine());
		
		//Controlo que el peso del perro sea un numero entero
		do {
			try{
				System.out.println("Introduce el peso del nuevo perro:");
				perro.setPeso(Float.parseFloat(sc.nextLine()));
				repetir = false;
			} catch(Exception e) {
				System.out.println("El peso debe ser un núnmero entero. Vuelva a introducirlo");
				repetir = true;
			}
		}while (repetir);
		
		//TODO controlar que meta "S" o "N"
		do {
			try{
				System.out.println("El perro esta vacunado (s/n)?:");
				perro.setVacunado(Boolean.parseBoolean(sc.nextLine()));
				repetir = false;
			} catch(Exception e) {
				System.out.println("Vacunado debe ser un valor booleano2. Vuelva a introducirlo");
				repetir = true;
			}
		}while (repetir);
		
		
		System.out.println("Introduce la historia del nuevo perro:");
		perro.setHistoria(sc.nextLine());
		
		//lista.add(perro);
		//ArrayList<Perro> perros = modelo.listar();
		//ArrayList<Perro> perros = modelo.crear(perro);
		try {
			dao.crear(perro);
			
		}catch (Exception e) {
			System.out.printf("** el nombre del perro %s ya existe \n",perro.getNombre());
		}
		
		
	}
	
	//Borrar un perro
	private static void baja() {
		//TODO poder elegir entre dar de baja por nombre o por posicion dentro de la lista
		String nombrePerro = " ";
		int idPerro = 0;
		String borrar = "S";
		
		
		System.out.println("Introduce el ID del perro que desea dar de baja:");
		idPerro = Integer.parseInt(sc.nextLine());
		
		try {
			System.out.println("Datos del perro que desea dar de baja");
			System.out.println("=====================================");
			mostrar(idPerro);
			System.out.println(" ");
				
			//Pido confirmacion de la baja
			do {
				System.out.println("Esta seguro de que quiere dar de baja al perro con el ID " + idPerro + " ? (S/N)");
				borrar = sc.nextLine();
			}while((!borrar.equalsIgnoreCase("s")) && (!borrar.equalsIgnoreCase("n")));
				
			if (borrar.equalsIgnoreCase("s")){
				dao.eliminar(idPerro);
			}
		}catch (Exception e) {
			System.out.println("No existe un perro con el ID " + idPerro);
		}

		
	}
	
	//Mostrar los datos de un perro
	private static boolean mostrar(int id) {
		
		boolean existe = false;
			
		try {
			Perro perro = dao.recuperar(id);
			System.out.println( String.format("%31s [%s]  %s Kg", perro.getNombre(), perro.getRaza(), perro.getPeso()  ));
			existe = true;
			
			
		}catch (Exception e) {
			System.out.println("El perro con el id " + id +" no existe.");//
			existe = false;
		}

		
		return existe;
	}	
	
	
	//Modificar los datos de un perro
	//TODO modificacion
	private static void modificacion() {
		
		boolean repetir = true;
		//String nombrePerro = s;c.nextLine();
		
		System.out.println("Introduce el id del perro que desea modificar:");
		int idPerro = Integer.parseInt(sc.nextLine());
		/*do {
			try {
				System.out.println("Introduce el id del perro que desea modificar:");
				int idPerro = Integer.parseInt(sc.nextLine());
				repetir = false;
			}catch (Exception e) {
				repetir = true;
			}
		}while(repetir);*/
		
		if(mostrar(idPerro)) {
			Perro perro = new Perro();
			perro = dao.recuperar(idPerro);
			
			
			do {
				crearMenuModificacion();
			
				switch (opcion) {
				case OP_NOMBRE:
					System.out.println("Introduzca el nuevo nombre: ");
					perro.setNombre(sc.nextLine());
					break;
				case OP_RAZA:
					System.out.println("Introduzca la nueva raza: ");
					perro.setRaza(sc.nextLine());
					break;	
				case OP_PESO:
					do {
						try {
							System.out.println("Introduzca el nuevo peso");
							perro.setPeso(Float.parseFloat(sc.nextLine()));
							repetir = false;
						}catch (Exception e) {
							System.out.println("El peso debe ser un numero. Vuelva a introducirlo");
							repetir = true;
						}
					} while(repetir);
					break;
				case OP_VACUNACION:
					do {
						try {
							System.out.println("Introduzca el nuevo valor de vacunación");
							perro.setVacunado(Boolean.parseBoolean(sc.nextLine()));
							repetir = false;
						}catch (Exception e) {
							System.out.println("La vacunacion es un valor booleano. Vuelva a introducirla");
							repetir = true;
						}
					} while(repetir);
					break;
				case OP_HISTORIA:
					System.out.println("Modificar la historia: ");
					perro.setRaza(sc.nextLine());
					break;
				case OP_SALIR:
					crearMenu();
					break;
				default:
					//TODO que no salga este mensaje cuando le doy a la opcion de salir.
					System.out.println("Escoge una opcion correcta");
				}
			}while(!OP_SALIR.equalsIgnoreCase(opcion));
			try {
				dao.modificar(perro);
			}catch(Exception e) {
				System.out.println("Alguno de los datos no es valido. Vuelva a introducirlos");
				modificacion();
			}
		}
		
		
	}
	


}// AppPerrera
