package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;
import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Jugador;
import com.ipartek.pojo.Televisor;
import com.ipartek.pojo.TelevisorPlano;


/**
 * 
 *  Realizar las siguientes jerarqu�as de herencia: tendremos una clase padre que se llamara Electrodom�stico.<br>
 *  Dicha clase contara con los atributos nombre y precio. Se realizaran todos los constructores, <br>
 *  m�todos get y set necesarios<br>
 *  Una vez creada dicha clase, se creara una serie de clases hijas. La primera ser� la clase televisor.<br> 
 *  Dicha clase contara con el atributo pulgadas,  as� como con todos los constructores y m�todos necesarios<br>
 *  para rellenar sus atributos, incluidos los del padre<br>
 *  Tambi�n se creara una clase televisionPlana, que heredara de televisi�n, <br>
 *  tendr� el atributo string tipo de pantalla ( tft, plasma,..) y constructores, m�todos get y set<br> 
 *  para rellenar los datos de los objetos que se creen, incluyendo todos los atributos de los objetos de <br>
 *  las clases padres de las que heredan<br>
 *  Una vez creado esta jerarqu�a de herencia, realizar un programa que nos pida insertar televisiones planas<br>
 *  dentro de un array de electrodom�sticos. Dicho array constara de 5 electodomesticos, pero lo rellenaremos<br>
 *  con objetos de tipo televisi�nPlana.<br>
 *  
 *  
 * @author Arturo Monta�ez
 *
 */

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<TelevisorPlano> listaTelevisoresPlanos = new ArrayList<TelevisorPlano>();

		for (int i = 0; i < 5; i++) {
			TelevisorPlano telePlana = new TelevisorPlano();
			
			System.out.println("Introduzca el nombre del televisor "+ (i+1) + " :");
			telePlana.setNombre(sc.nextLine());
			
			System.out.println("Introduzca el precio del televisor "+ (i+1) + " :");
			telePlana.setPrecio(Integer.parseInt(sc.nextLine()));
			
			System.out.println("Introduzca el tama�o del televisor "+ (i+1) + " :");
			telePlana.setPulgadas(Integer.parseInt(sc.nextLine()));
			
			System.out.println("Introduzca el tipo de pantalla del televisor "+ (i+1) + " :");
			telePlana.setTipoPantalla(sc.nextLine());
			
			
			listaTelevisoresPlanos.add(telePlana);
			System.out.println("---------------------------------------------------");
			
		}
		
		System.out.println(listaTelevisoresPlanos);
	}

}
