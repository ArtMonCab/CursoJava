package com.ipartek.ejercicios.variablesyoperadores;

public class Ejercicio1 {
	/*
	 * Ejercicio 1. Para ver los tipos de datos n�mericos
	 * 
	 * https://github.com/ipartek/java_2020_2065

	 */
	public static void main(String[] args) {
			  
			  
			  System.out.println("Datos de tipo primitivo");
			  byte numeroByte = 1;
			  short numeroCorto = 3;
			  int numeroEntero = 2;
			  long numeroDoble = 6;
			  System.out.println("(byte) numeroByte =" + numeroByte);
			  System.out.println("(short) numeroCorto =" + numeroCorto);	
			  System.out.println("(int) numeroEntero =" + numeroEntero);	
			  System.out.println("(long) numeroDoble =" + numeroDoble);	
			  
			  
			//wrappers => son clases que envuelven a las variables primitivas con ciertas utilidades
			  // int     => Integer
			  // float   => Float
			  // char    => Character
			  // boolean => Boolean
			  System.out.println("int");
			  System.out.println("Valor m�ximo:" + Integer.MAX_VALUE);
			  System.out.println("Valor m�nimo:" + Integer.MIN_VALUE);
			  System.out.println("Tama�o en bits :" + Integer.SIZE);
			  
			  System.out.println("1 int = " + Integer.SIZE + " bits");
			  System.out.println("1 short = " + Short.SIZE + " bits");
			  System.out.println("1 byte= " + Byte.SIZE + " bits");
			  System.out.println("1 long = " + Long.SIZE + " bits");

			  

					 

	}

}
