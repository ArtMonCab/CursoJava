 package mf0227.uf2404.actividad3;

public class Libro implements Comparable<Libro>{
	private int id;
	private String nombre;
	private int numeroPaginas;
	
	
	//Constructores
	public Libro() {
		super();
		this.id = 0;
		this.nombre = "";
		this.numeroPaginas = 0;
	}
	
	
	public Libro(int id, String nombre, int numeroPaginas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeroPaginas = numeroPaginas;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	//toString
	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", numeroPaginas=" + numeroPaginas + "]";
	}


	@Override
	public int compareTo(Libro o) {
		//Comparo por numero de páginas
		//return this.numeroPaginas - o.numeroPaginas;
		
		//Comparo por nombre
		return this.nombre.compareTo(o.nombre);
	}

	
	
	
	

}
