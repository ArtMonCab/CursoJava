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
			System.out.println("Introducir la matricula del coche: ");
			coche.setMatricula(sc.nextLine());
			
			//Marca
			System.out.println("Introducir la marca del coche: ");
			coche.setMarca(sc.nextLine());
			
			//Modelo
			System.out.println("Introducir el modelo del coche: ");
			coche.setModelo(sc.nextLine());
			
			//Color
			System.out.println("Introducir el color del coche: ");
			coche.setColor(sc.nextLine());
			
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
		
		Coche buga1 = new Coche();

		buga1.setMatricula("8669 GNC");
	
		buga1.setMarca("Subaru");
		
		buga1.setModelo("Legacy");
		
		buga1.setColor("Gris");
		
		buga1.setPotencia(150);
		
		buga1.setCilindrada(2000);
		
		listaCoches.add(buga1);
		
		
		Coche buga2 = new Coche();
		
		buga2.setMatricula("6666 DFG");
	
		buga2.setMarca("Seat");
		
		buga2.setModelo("Ibiza");
		
		buga2.setColor("Blanco");
		
		buga2.setPotencia(110);
		
		buga2.setCilindrada(1000);
		
		listaCoches.add(buga2);	
		

		Coche buga3 = new Coche();
		
		buga3.setMatricula("BI 3456 CC");
	
		buga3.setMarca("Lancia");
		
		buga3.setModelo("Delta");
		
		buga3.setColor("Rojo");
		
		buga3.setPotencia(300);
		
		buga3.setCilindrada(2000);
		
		listaCoches.add(buga3);
		
	}
	

}
