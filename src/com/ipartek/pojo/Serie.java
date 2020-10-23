  
package com.ipartek.pojo;

/**
 * Una serie de TV consta de los siguientes atributos:
 * 
 * <ul>
 * <li>Nombre</li>
 * <li>numTemporadas</li>
 * <li>duracion (minutos)</li>
 * <li>plataforma(netflix,plex,hbo,moviestar,...)</li> 
 * </ul>
 * 
 * El constructor debere pasarse siempre el nombre de forma obligatoria..
 * El resto de campos se iniciaalzan a 0 y la plataforma especificar "internet"
 * 
 * @author ur00
 *
 */
public class Serie {
	
	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private int id;  //TODO getter setreers y contructor toString
	private String nombre;
	private int numTemporadas;
	private int duracion;
	private String plataforma;
	
	// Constructores
	///////////////////////////////////////
	public Serie() {
		super();
		this.nombre = "Sin nombre";
		this.numTemporadas = 1;
		this.duracion = 45;
		this.plataforma = "Ninguno";
	}

}
