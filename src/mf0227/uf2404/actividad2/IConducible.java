package mf0227.uf2404.actividad2;

/**
 * Interfaz donne se declaran las funciones arrancar y parar.
 * Estas funciones se implementaran en la clase Vehiculo
 * 
 * @author Arturo Montañez
 *
 */

public interface IConducible {
	
	
	//Arrancar vehiculo. Si existiera el atributo estaArrancado lo pondria a true
	void arrancar();
	
	//Parar vehiculo. Si existiera el atributo estaArrancado lo pondria a true
	void parar();

}
