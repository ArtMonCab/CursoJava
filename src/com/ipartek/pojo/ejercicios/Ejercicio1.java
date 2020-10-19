package com.ipartek.pojo.ejercicios;

import com.ipartek.pojo.Perro;

/**
 * La historia de los 8 perros mas famosos.<br>
 * Crear 8 perros con su constructor por defecto y setear el nombre e historia.<br>
 * Mostrar por pantalla sus nombres e historias;
 * 
 * 
 * @see https://blog.patasbox.com/los-8-perros-mas-fomos-de-la-historia/
 * @author Arturo Monta�ez
 *
 */

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Perro snoppy = new Perro();
		
		
		//snoppy.nombre = "Snoppy";
		snoppy.setNombre("Snoppy");
		//snoppy.peso = -12;
		snoppy.setPeso(12);

		System.out.println( snoppy.getNombre() + " " + snoppy.getPeso() + " kg");
		
		
		Perro p1 = new Perro();
		p1.setNombre("Laika");
		p1.setHistoria("Esta famosa perrita sovi�tica fue el primer ser vivo en viajar al espacio. En 1957 emprendi� su viaje y desafortunadamente muri� a las 5 horas de despegar por el estr�s y la falta de ox�geno. Este suceso puso en el punto de mira los experimentos con animales. Desde entonces Laika ha sido un icono en la historia.");
		System.out.println( p1.getNombre() + " " + p1.getHistoria());
		
		Perro p2 = new Perro();
		p2.setNombre("Hachiko");
		p2.setRaza("Akita");
		p2.setHistoria("El perro fiel");
		System.out.println(p2.getNombre() + " " + p2.getHistoria());
		
		Perro p3 = new Perro();
		p3.setNombre("Balto");
		p3.setHistoria("El perro farmaceutico");
		System.out.println( p3.getNombre() + " " + p3.getHistoria());
		
		Perro p4 = new Perro();
		p4.setNombre("Rin tin tin");
		p4.setHistoria("El perro actor");
		System.out.println( p4.getNombre() + " " + p4.getHistoria());
		
		Perro p5 = new Perro();
		p5.setNombre("Stubby");
		p5.setHistoria("El perro soldado");
		System.out.println(p5.getNombre() + " " + p5.getHistoria());
		
		Perro p6 = new Perro();
		p6.setNombre("Pancho");
		p6.setHistoria("El perro de la loter�a");
		System.out.println( p6.getNombre() + " " + p6.getHistoria());
		
		Perro p7 = new Perro();
		p7.setNombre("Greyfriars Bobby");
		p7.setHistoria("El otro perro fiel");
		System.out.println( p7.getNombre() + " " + p7.getHistoria());
		
		Perro p8 = new Perro();
		p8.setNombre("Smoky");
		p8.setHistoria("El perro escudero");
		System.out.println( p8.getNombre() + " " + p8.getHistoria());
		

		

		
		

		
	}

}
