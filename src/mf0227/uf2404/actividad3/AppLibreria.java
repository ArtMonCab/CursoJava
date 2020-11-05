package mf0227.uf2404.actividad3;

/**
 * Main de la aplicacion. 
 */

import java.util.ArrayList;
import java.util.Scanner;

//import com.ipartek.modelo.ImplementarLibroDAO;
//import com.ipartek.pojo.Libro;

public class AppLibreria extends AppGestion{
	
	static String opcion = "";   // opcion seleccionada en el menu por el usuario
	//static private ImplementarLibroDAO modelo = new ImplementarLibroDAO();
	static private LibroDao modelo = ImplementarLibroDAO.getInstance();
	static private ArrayList<Libro> lista = new ArrayList<Libro>();
	static private Scanner sc = new Scanner(System.in);
	static private AppLibreria app = new AppLibreria();
	
	public static void main(String[] args) {

		
		inicializarDatos();
		
		
		boolean salir = false;
		
		do {
			System.out.println("");
			System.out.println("");
			System.out.println("-------------------------------------------------");
			System.out.println("");
			System.out.println("***********  GESTION DE LIBRERIA   **************");
			
			
			pintarMenu(NOMBRE_POJO);
			
			System.out.println("");
			System.out.println("--------------------------------------------------");
			System.out.println("");
			System.out.println("Introduzca una opción: ");
			System.out.println("");
			
			opcion = sc.nextLine();	
			
			switch (opcion.toUpperCase()) { 
			
			case OP_LISTAR:
				app.listar();
				break;
			case OP_CREAR:
				app.crear();
				break;	
			case OP_ELIMINAR:
				app.eliminar();
				break;
			case OP_MODIFICAR:
				app.modificar();
				break;
			case OP_MOSTRAR:
				app.mostrar();
				break;
			case OP_SALIR:
				salir = true;
				System.out.println("***********  Programa finalizado   **************");
				break;
			default:
					System.out.println("Escoge una opcion correcta");
			}
		}while(!salir);
		
		sc.close();
	}
	@Override
	protected void modificar() {

		System.out.println("Opcion Modificar libro en construccion");
		System.out.println("");
		
	}
	
	@Override
	protected void eliminar() {
		int idLibro = 0;
		boolean repetir = true;
		char confirmacion = ' ';
		
		//Pongo el listado de libros disponibles para que sea más facil ver cual quiero eliminar
		app.listar();
		System.out.println("");
		//Compruebo que el ID es correcto
		do {
			try {
				System.out.println("Introduzca el ID del libro que desea eliminar");
				idLibro = Integer.parseInt(sc.nextLine());
				repetir = false;
			}catch (Exception E){
				System.out.println("El ID debe ser un numero entero");
				repetir = true;
			}
		}while(repetir);
		
		repetir = true;
		
		//Pido confirmacion de la baja
		do {
			System.out.printf("¿Desea eliminar el libro con el ID " + idLibro + "(S/N)?");			
			confirmacion = Character.toUpperCase(sc.nextLine().charAt(0));
			
			if (confirmacion == 'S') {
				if (modelo.delete(idLibro)) {
					System.out.println("Libro correctamente eliminado");
					System.out.println("");
					System.out.println("");
					//Pongo el listado de libros para comprobar que se haya borrado
					//listar();
					app.listar();
				}else {
					System.out.println("No se ha podido borrar el libro porque su ID no existe");
				}					
			}		

		}while((confirmacion != 'S') && (confirmacion != 'N'));
			
		
		
	}

	@Override
	protected void listar() {

		lista = (ArrayList<Libro>) modelo.getAll();
	    for (int i=0;i<lista.size();i++) {   
	    	System.out.println("Id: " + lista.get(i).getId() +
	    			" - Titulo: " + lista.get(i).getNombre() +
	    			" - Numero de paginas: : " + lista.get(i).getNumeroPaginas());
	    
	    	
	    			
	      }
		
	}
	
	@Override
	protected void crear() {
		//Libro liburu = new Libro();
		boolean repetir = true;
		String nombre ="";
		int paginas = 0;
		

		System.out.println("Introduce el titulo del libro: ");
		//liburu.setNombre(sc.nextLine());
		nombre = sc.nextLine();
		
		//Compruebo que el numero de paginas es un valor correcto
		do {
			try {
				System.out.println("Introduce el numero de paginas del libro: ");
				//liburu.setNumeroPaginas(Integer.parseInt(sc.nextLine()));
				paginas = Integer.parseInt(sc.nextLine());
				repetir = false;
			}catch (Exception E){
				System.out.println("El numero de paginas debe ser un numero entero");
				repetir = true;
			}
		}while(repetir);

		Libro liburu = new Libro(0, nombre, paginas);
		
		//Llamar a modelo
		if(modelo.insert(liburu)) {
			System.out.println ("Libro introducido correctamente, su nuevo id es  " + liburu.getId());
		}else {
			System.out.println("No se ha podido dar de alta el libro porque alguno de sus valores no es correcto");
		
		}
	}
	
	protected static void inicializarDatos() {
		System.out.println("Opcion Inicializar datos en construccion");
		System.out.println("");
		
	}
	
	@Override
	protected void mostrar() {
		int idLibro;
		Libro liburu = null;
		boolean repetir = true;
		//Compruebo que el ID es correcto
		do {
			try {
				System.out.println("Introduce el ID del libro: ");
				idLibro = Integer.parseInt(sc.nextLine());
				liburu = modelo.getById(idLibro);
				repetir = false;
			}catch (Exception E){
				System.out.println("El ID debe ser un numero entero");
				repetir = true;
			}
		}while(repetir);

		if (liburu != null){
			System.out.println("ID: " + liburu.getId() + " - Titulo: " + liburu.getNombre() + " - Numero de paginas: " + liburu.getNumeroPaginas());
		}else {
			System.out.println("No existe un libro con ese ID");
		
		}
				
		
	}


	
}
