package mf0227.uf2404.actividad3;

/**
 * Clase que implementa las funciones de LibroDao
 * 
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//import com.ipartek.pojo.Libro;

public class ImplementarLibroDAO implements LibroDao {
	
	private HashMap<Integer, Libro> hmLibros = new HashMap<Integer, Libro>();
	
	//private ArrayList<Libro> lista = new ArrayList<Libro>();
	private int indice = 0;
	private static ImplementarLibroDAO INSTANCE = null;
	
	
	public ImplementarLibroDAO() {
		super();
		hmLibros.put(1, new Libro(1,"El profundo espacio exterior",100));
		hmLibros.put(2, new Libro(2, "Decisiones",210));
		hmLibros.put(3, new Libro(3, "El año de la hortaliza", 180));
		hmLibros.put(4, new Libro(4, "¿Quien dijo miedo?",253));
		hmLibros.put(5, new Libro(5, "Venganza",195));

		indice = 6;
	
	}
	
	public static synchronized ImplementarLibroDAO getInstance() {
		
		if ( INSTANCE == null ) {
			INSTANCE = new ImplementarLibroDAO();
		}
		
		return INSTANCE;
	}

	@Override
	public List<Libro> getAll() {
		ArrayList<Libro> libros =  new ArrayList<>(hmLibros.values());
		
		//Ordenacion por defecto que hemos definido en el Libro implements Comparable
		Collections.sort(libros);
		
		return libros;
	}

	@Override
	public Libro getById(int id) {
		
		Libro liburu = null;
		
		//Recorro el hashMap para ver si existe un libro con esa ID
		for  (Iterator itLibro = hmLibros.keySet().iterator(); itLibro.hasNext();) {
			int indice = (Integer) itLibro.next();
			Libro value = hmLibros.get(indice);
			if (value.getId() == id) {
				liburu = value;
				break;
			}
			
		}
		

		return liburu;
	}

	@Override
	public boolean delete(int id) {
		boolean centinela = false;;
		
		//Recorro el hashMap para ver si existe un libro con esa ID
		for  (Iterator itLibro = hmLibros.keySet().iterator(); itLibro.hasNext();) {
			int indice = (Integer) itLibro.next();
			Libro value = hmLibros.get(indice);
			if (value.getId() == id) {
				centinela = true;
				break;
			}
			
		}
		
		//Si el libro con esa ID existe, lo borro.
		if (centinela) { 
			hmLibros.remove(id);
		}
		return centinela;
	}

	@Override
	public boolean insert(Libro l) {
		
		boolean centinela = false;
		boolean resultado = false;
		String nombreLibro = l.getNombre();
		
		
		
		// recorrer con un Iterator para ver si existe un libero con el mismo nombre en el hashMap
		for (Iterator<Libro> itLibro = hmLibros.values().iterator(); itLibro.hasNext();) {
			
			Libro libroIteracion = itLibro.next();
			
			//Compruebo que no tenga lel mismo titulo
			if (nombreLibro.equalsIgnoreCase(libroIteracion.getNombre())) {
				centinela = false;
				break;
			}
			
			
		}
		
		//Si titulo son correctos, se introduce el libro
		if (centinela) {
			l.setId(indice);
			hmLibros.put(indice, l);
			indice++;
			centinela = true;
			
		}


		
		return centinela;
	}

}
