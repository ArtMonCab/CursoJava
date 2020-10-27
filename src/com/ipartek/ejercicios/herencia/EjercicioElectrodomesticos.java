package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Televisor;
import com.ipartek.pojo.TelevisorPlano;

public class EjercicioElectrodomesticos {

	public static void main(String[] args) {


		ArrayList<Electrodomestico> lista = new ArrayList<>();

		Electrodomestico elec1 = new Electrodomestico();
		elec1.setNombre("Lavadora BALAY");
		elec1.setPrecio(300);		
		lista.add(elec1);

		Televisor tele = new Televisor();
		tele.setNombre("Telefunken");
		tele.setPrecio(400);
		tele.setPulgadas(30);
		lista.add(tele);

		TelevisorPlano tele2 = new TelevisorPlano();
		tele2.setNombre("LG enorme");
		tele2.setPrecio(600);
		tele2.setPulgadas(100);
		tele2.setTipoPantalla("XL");
		lista.add(tele2);


		// ArrayList<TelevisorPlano> listaTVPlanas = new ArrayList<>();
		// listaTVPlanas.add(elec1);


		for ( Electrodomestico elec : lista) {
			
			// En vez de usar syso, castear y mostrar datos con getters
			// System.out.println(elec.toString());
			
			// CUIDADO con la Exception, hay que preguntar siempre con instanceof, descomentar la linea de abajo y probar
			// TelevisionPlana ttt = (TelevisionPlana)elec1;
										
			System.out.printf("Nombre: %s \n", elec.getNombre());
			System.out.printf("Precio: %s \n", elec.getPrecio());				
			
						
			if ( elec instanceof Televisor ) {				
				Televisor tv = (Televisor)elec;
				System.out.printf("Pulgadas: %s \n", tv.getPulgadas());				
			}
			
			if ( elec instanceof TelevisorPlano ) {					
				TelevisorPlano tvp = (TelevisorPlano)elec;
				System.out.printf("Tipo pantalla %s \n" ,tvp.getTipoPantalla() );				
			}
			
			System.out.println("------------------------------------------------------");
			
			
		}// for
		System.out.println("Salimos");

	}

}