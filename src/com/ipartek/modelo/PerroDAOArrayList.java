package com.ipartek.modelo;

import java.util.ArrayList;
import java.util.Iterator;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDao {

	private ArrayList<Perro> lista = new ArrayList<Perro>();
	private int indice = 0;
	private static PerroDAOArrayList INSTANCE = null;
	
	private PerroDAOArrayList() {
		super();
		lista.add(new Perro(1, "Bubba"));
		lista.add(new Perro(2, "Laika"));
		lista.add(new Perro(3, "Rintintin"));
		lista.add(new Perro(4, "Goofy"));
		indice = 5;
	
	}
	
	public static synchronized PerroDAOArrayList getInstance() {
		
		if ( INSTANCE == null ) {
			INSTANCE = new PerroDAOArrayList();
		}
		
		return INSTANCE;
	}
	
	@Override
	public ArrayList<Perro> listar() {		
		return lista;
	}

	@Override
	public Perro recuperar(int id) {
		Perro perro = null;
		
		
		Iterator iterador = lista.iterator();
		 
		//Recorremos la lista hasta encontrar el que quiero
		while (iterador.hasNext()) {
			Perro elemento = (Perro) iterador.next();
			
			if (elemento.getId() == id) {
				perro = elemento;
				break;
			}
		}
		return perro;
	}

	@Override
	public Perro crear(Perro p) throws Exception {
		p.setId(indice);
		lista.add(p);
		indice++;
		return p;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		lista.remove(id);
		Iterator it = lista.iterator();
		indice --;
		return false;
	}



}
