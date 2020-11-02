package com.ipartek.pojo;

public interface Vehiculo {
	
    public final static int VEL_MAX_COCHE = 150;
    public final static int VEL_MAX_BICI = 50;
    public final static int VEL_MAX_PATINETE= 80;
    
    
    void Arrancar();
    void Acelerar(int incrementoVel);
    void Frenar(int decrementoVel);
    void Apagar();

}
