package com.ipartek.ejercicios.excepciones;
/**
 * Implemente un programa que lea un n�mero �a� y otro n�mero �b� y luego calcule �a/b�.<br>
 * Pruebe a introducir b=0 y ver que hace el programa con la divisi�n por cero.<br>
 * Pruebe a introducir b=�Carlos� para ver c�mo se comporta el programa.<br>
 * A�ada excepciones para recoger estas excepciones y avisar del problema al usuario.<br>
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
		
		System.out.println("Introduzca un n�mero: ");
		try{
			a = Integer.parseInt(sc.nextLine());
			b = Integer.parseInt(sc.nextLine());
			System.out.println(a + " entre " + b + " es " + (a / b));
			
		}catch(NumberFormatException e) {
			System.out.println("El dato no es valido. Introduzca un n�mero n�mero correcto");
			
		}catch(ArithmeticException e){
		System.out.println(a + " entre " + b + " da divisi�n por cero");
		
		}catch(Exception e) {
			System.out.println("El dato no es valido. Introduzca un n�mero n�mero correcto");
			
		}
		


		
		sc.close();
	}
	
}
