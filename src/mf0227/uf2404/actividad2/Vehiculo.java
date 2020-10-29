package mf0227.uf2404.actividad2;

/**
 * Clase que implementa a los objetos de tipo vehiculo.<br>
 * Implementa los metodos que hay en la Iterface IConducible,<br>
 * y tiene como hijo a la clase Coche
 * @author Curso JAVA
 *
 */

public class Vehiculo implements IConducible{
	
	private String color;
	private String matricula;
	private boolean estaArrancado;
	
	
	//Constructores
	public Vehiculo() {
		super();
		this.color = "Blanco";
		this.estaArrancado = false;
	}

	
	//Getters
	public String getColor() {
		return color;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public boolean getEstaArrancado() {
		return estaArrancado;
	}

	
	//Setters
	public void setColor(String color) {
		this.color = color;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	
	
	/**
	 * arrancar: pondrá el atributo estaArrancado a true.<br>
	 * 
	 * @param
	 */
	
	@Override
	public void arrancar() {

		if (this.estaArrancado) {
			System.out.println("El vehiculo ya está arrancado");
		}else {
			this.estaArrancado = true;
		}
	
	}
	
	/**
	 * parar: pondrá el atributo estaArrancado a false.<br>
	 * 
	 * @param
	 */
	
	@Override
	public void parar() {
		if (this.estaArrancado) {
			this.estaArrancado = false;
		}else {
			System.out.println("El vehiculo ya esta parado");
		}	
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + "]";
	}



}
