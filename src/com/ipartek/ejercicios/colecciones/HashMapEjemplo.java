package com.ipartek.ejercicios.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.ipartek.pojo.Perro;

public class HashMapEjemplo
{
    public static void main(String args[])
    {
		// Definir un HashMap
		HashMap<String, String> global = new HashMap<String, String>();

		// Insertar valores "key"-"value" al HashMap
		global.put("Laura", "667895789");
		global.put("Pepe", "645895756");
		global.put("Abelardo", "55895711");
		global.put("Daniel", "667111788");
		global.put("Arturo", "667598623");

		// probar a meter un duplicado
		global.put("Arturo", "666555444");
		
		// recuperar el value por la Key
		String telefonoPepe = global.get("Pepe");
		
		
		//obtener todas las Keys
		 Set<String> keys = global.keySet();
		
		//obtener todos los values
		 Collection<String> values = global.values();
		
		// Definir Iterator para extraer o imprimir valores
		for (Iterator<String> it = global.keySet().iterator(); it.hasNext();) {
			String key = (String) it.next();
			String value = (String) global.get(key);
			System.out.println("Alumno: " + key + " - " + "Telefono: " + value);
		}

		
		// definir una hashamp con perros la key ser� su id(int) y el value(Perro)		
		HashMap<Integer, Perro> hmPerros = new HashMap<Integer, Perro>();
		
		// meter 2 perros
		Perro perro1 = new Perro("Frank","Carlino",7);
		perro1.setId(13);
		Perro perro2 = new Perro("Cosmos","Labrador", 15);
		perro2.setId(24);
		
		hmPerros.put(13, perro1);
		hmPerros.put(24, perro2);
		
		
		
		// recorrer con un Iterator
		for  (Iterator itPerro = hmPerros.keySet().iterator(); itPerro.hasNext();) {
			int key = (Integer) itPerro.next();
			Perro value = hmPerros.get(key);
			/*System.out.println("");
			System.out.println("===============================");
			System.out.println("");
			System.out.println("Nombre del perro: " + value.getNombre());
			System.out.println("Raza del perro: " + value.getRaza());
			System.out.println("Peso del perro: " + value.getPeso());
			System.out.println("Historia del perro: " + value.getHistoria());
			System.out.println("");
			System.out.println("===============================");
			System.out.println("");*/
			
			System.out.println("");
			System.out.println("===============================");
			System.out.printf("La clave %s pertenece al perro %s \n", key, value);
			System.out.println("");
			System.out.println("===============================");
			System.out.println("");
			
		}
		
		
	}
	
}
