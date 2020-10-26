package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;
import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Jugador;
import com.ipartek.pojo.Televisor;
import com.ipartek.pojo.TelevisorPlano;


/**
 * 
 *  Realizar las siguientes jerarquías de herencia: tendremos una clase padre que se llamara Electrodoméstico.<br>
 *  Dicha clase contara con los atributos nombre y precio. Se realizaran todos los constructores, <br>
 *  métodos get y set necesarios<br>
 *  Una vez creada dicha clase, se creara una serie de clases hijas. La primera será la clase televisor.<br> 
 *  Dicha clase contara con el atributo pulgadas,  así como con todos los constructores y métodos necesarios<br>
 *  para rellenar sus atributos, incluidos los del padre<br>
 *  También se creara una clase televisionPlana, que heredara de televisión, <br>
 *  tendrá el atributo string tipo de pantalla ( tft, plasma,..) y constructores, métodos get y set<br> 
 *  para rellenar los datos de los objetos que se creen, incluyendo todos los atributos de los objetos de <br>
 *  las clases padres de las que heredan<br>
 *  Una vez creado esta jerarquía de herencia, realizar un programa que nos pida insertar televisiones planas<br>
 *  dentro de un array de electrodomésticos. Dicho array constara de 5 electodomesticos, pero lo rellenaremos<br>
 *  con objetos de tipo televisiónPlana.<br>
 *  
 *  
 * @author Arturo Montañez
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
			
			System.out.println("Introduzca el tamaño del televisor "+ (i+1) + " :");
			telePlana.setPulgadas(Integer.parseInt(sc.nextLine()));
			
			System.out.println("Introduzca el tipo de pantalla del televisor "+ (i+1) + " :");
			telePlana.setTipoPantalla(sc.nextLine());
			
			
			listaTelevisoresPlanos.add(telePlana);
			System.out.println("---------------------------------------------------");
			
		}
		
		System.out.println(listaTelevisoresPlanos);
	}

}
