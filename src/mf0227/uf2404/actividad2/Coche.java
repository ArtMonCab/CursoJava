package mf0227.uf2404.actividad2;

/**
 * Clase que implementa los objetos de tipo coche. Hereda atributos y metodos de la clase Vehiculo.
 * @author Arturo Montañez Cabanillas
 *
 */

public class Coche extends Vehiculo {
	
	//Atributos de la clase
	private String marca;
	private String modelo;
	private int potencia;
	private int cilindrada;
	
	
	//Connstructores
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Coche(String marca, String modelo, int potencia, int cilindrada) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}


	
	//Getters
	
	public String getMarca() {
		return marca;
	}

	
	public String getModelo() {
		return modelo;
	}
	
	
	public int getPotencia() {
		return potencia;
	}
	

	public int getCilindrada() {
		return cilindrada;
	}

	
	//Setters

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}



	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	//toString
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", cilindrada=" + cilindrada
				+ ", getColor()=" + getColor() + ", getMatricula()=" + getMatricula() + "]";
	}
	
	

}
