package mf0227.uf2404.actividad2;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deberá almacenarse dentro de esta<br>
 * lista los objetos de tipo coche que crearemos<br>
 * <br>
 * La clase coche tendrá los siguientes atributos: matricula, marca, modelo, color, potencia, cilindrada<br>
 * Para rellenar la lista se creara un menú que nos solicitara introducir los datos por teclado, y una vez<br>
 * leídos todos, se guardaran en un objeto que se añadirá a la lista y nos pedirá que indiquemos si<br>
 * queremos introducir un vehículo más o no.<br>
 * <br>
 * Una vez que no queramos introducir más coches, nos mostrara todo el contenido en pantalla.<br>
 * 
 * @author Arturo Montañez Cabanillas
 * 
 * @version 2.0
 * 
 * Añado controles para que cuando meta la matricula, la marca, el modelo y el  color.<br>
 * Los controles para la potencia y la cilindrada ya estaba hechos en la versión 1.0<br>
 * no se puedan meter un valor blanco o nulo.																																																				
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Coche> listaCoches = new ArrayList<Coche>();
	
	
	public static void main(String[] args) {
		
			inicializarListaCoches();
		
			introducirDatos();
			
			mostrarDatos();
		
			sc.close();
	}
	
	
	private static void introducirDatos() {
		
		boolean repetir = true;
		char opcion ='S';
		String dato = "";
		
		do{
			System.out.println("Introducir los datos del coche");
			System.out.println("==============================");
			System.out.println("");
			
			Coche coche = new Coche();

			//Matricula
			//Para controlar que no se meta un dato vacio
			do {
				System.out.println("Introducir la matricula del coche: ");
				dato = sc.nextLine();
				if ((dato.isEmpty()) || (dato.equals(" "))) {
					System.out.println("No se puede introducir una matricula vacia");
					repetir = true;
				}else {
					repetir = false;
				}
			}while (repetir);
			coche.setMatricula(dato);
			
			//Marca
			//Para controlar que no se meta un dato vacio
			do {
				System.out.println("Introducir la marca del coche: ");
				dato = sc.nextLine();
				if ((dato.isEmpty()) || (dato.equals(" "))) {
					System.out.println("No se puede introducir una marca vacia");
					repetir = true;
				}else {
					repetir = false;
				}
			}while (repetir);
			coche.setMarca(dato);
			
			//Modelo
			//Para controlar que no se meta un dato vacio
			do {
				System.out.println("Introducir el modelo del coche: ");
				dato = sc.nextLine();
				if ((dato.isEmpty()) || (dato.equals(" "))) {
					System.out.println("No se puede introducir un modelo vacio");
					repetir = true;
				}else {
					repetir = false;
				}
			}while (repetir);
			coche.setModelo(dato);
			
			
			//Color
			//Para controlar que no se meta un dato vacio
			do {
				System.out.println("Introducir el color del coche: ");
				dato = sc.nextLine();
				if ((dato.isEmpty()) || (dato.equals(" "))) {
					System.out.println("No se puede introducir un color vacio");
					repetir = true;
				}else {
					repetir = false;
				}
			}while (repetir);
			coche.setColor(dato);
			
			do {
				try {
					System.out.println("Introducir la potencia del coche: ");
					coche.setPotencia(Integer.parseInt(sc.nextLine()));
					repetir = false;
				}catch  (Exception e) {
					System.out.println("La potencia debe ser un número entero ");
					repetir = true;
				}
			}while(repetir);
			
			do {
				try {
					System.out.println("Introducir la cilindrada del coche: ");

					coche.setCilindrada(Integer.parseInt(sc.nextLine()));
					repetir = false;
				}catch  (Exception e) {
					System.out.println("La cilindrada debe ser un número entero ");
					repetir = true;
				}
				
			}while(repetir);
			
			

			System.out.println("");
			System.out.println("-------------------------------------");
			System.out.println("");
			
			do {
				System.out.println("¿Desea introducir otro coche (S/N)?");
				opcion = Character.toUpperCase(sc.nextLine().charAt(0));
			}while((opcion != 'S') && (opcion != 'N'));
			
			listaCoches.add(coche);
			
		}while (opcion != 'N');
		
		System.out.println("Introducción de datos finalizada");
	}
	
	
	private static void mostrarDatos() {
		
		Coche buga = new Coche();
		System.out.println("Datos de los coches");
		System.out.println("===================");
		System.out.println("");
		for (int i = 0; i < (listaCoches.size()) ; i++) {
			buga = listaCoches.get(i);
			System.out.println("Coche "+ (i+1));
			System.out.println("---------------");
			System.out.println(" ");
			System.out.println("Matricula: " + buga.getMatricula());
			
			System.out.println("Marca:     " + buga.getMarca());
			System.out.println("Modelo:    " + buga.getModelo());
			System.out.println("Color:     " + buga.getColor());
			System.out.println("Potencia:  " + buga.getPotencia());
			System.out.println("Cilindrada:" + buga.getCilindrada());
			System.out.println(" ");
			System.out.println("*******************");
			System.out.println(" ");
			
		}
		
		System.out.println("Programa finalizado");
		
	}
	
	private static void inicializarListaCoches() {
		
		Coche buga = new Coche();

		buga.setMatricula("8669 GNC");
	
		buga.setMarca("Subaru");
		
		buga.setModelo("Legacy");
		
		buga.setColor("Gris");
		
		buga.setPotencia(150);
		
		buga.setCilindrada(2000);
		
		listaCoches.add(buga);
		
		buga = new Coche();
		
		
		buga = new Coche();
		
		buga.setMatricula("6666 DFG");
	
		buga.setMarca("Seat");
		
		buga.setModelo("Ibiza");
		
		buga.setColor("Blanco");
		
		buga.setPotencia(110);
		
		buga.setCilindrada(1000);
		
		listaCoches.add(buga);	
		

		buga = new Coche();
		
		buga.setMatricula("BI 3456 CC");
	
		buga.setMarca("Lancia");
		
		buga.setModelo("Delta");
		
		buga.setColor("Rojo");
		
		buga.setPotencia(300);
		
		buga.setCilindrada(2000);
		
		listaCoches.add(buga);
		
	}
	

}
