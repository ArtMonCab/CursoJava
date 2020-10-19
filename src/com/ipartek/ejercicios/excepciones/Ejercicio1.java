package com.ipartek.ejercicios.excepciones;
/**
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego calcule “a/b”.<br>
 * Pruebe a introducir b=0 y ver que hace el programa con la división por cero.<br>
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa.<br>
 * Añada excepciones para recoger estas excepciones y avisar del problema al usuario.<br>
 * 
 * @author Curso JAVA
 *
 */
import java.util.Scanner;
public class Ejercicio1 {
	
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = 0;
		int b = 0;
		float resultado = 0;
		
		System.out.println("Introduzca un número: ");
		try{
			a = Integer.parseInt(sc.nextLine());
			b = Integer.parseInt(sc.nextLine());
			System.out.println(a + " entre " + b + " es " + (a / b));
			
		}catch(NumberFormatException e) {
			System.out.println("El dato no es valido. Introduzca un número número correcto");
			
		}catch(ArithmeticException e){
		System.out.println(a + " entre " + b + " da división por cero");
		
		}catch(Exception e) {
			System.out.println("El dato no es valido. Introduzca un número número correcto");
			
		}
		


		
		sc.close();
	}
	
}
