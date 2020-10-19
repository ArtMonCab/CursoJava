package com.ipartek.ejercicios.excepciones;

import com.ipartek.pojo.Persona;

import java.util.Scanner;


/**
 * Crea una clase Persona con los atributos nombre y edad. En el m�todo setEdad lanzar una excepci�n<br>
 * si la edad introducida es menor que 0 o mayor que 120.<br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso del constructor vac�o,<br>
 * y lea los datos por teclado y los asigne a los objetos creados. Solo introducir� las personas en la lista si est�n en el rango de edad
 *  indicado, comprob�ndolo mediante el uso de excepciones<br>
 * @author Arturo Monta�ez
 *
 */

public class Ejercicio4 {
	
	public static void main(String[] args){
		Persona p1 = new Persona();
		
		
		try {
			p1.setEdad(99);
			System.out.println("Edad: " + p1.getEdad());
			
		}catch (Exception e){
			System.out.println("Rango incorrecto");
		}
	
	}

}
