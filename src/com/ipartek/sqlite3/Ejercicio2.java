package com.ipartek.sqlite3;

import javax.naming.ldap.LdapName;

import com.ipartek.modelo.PerroDAOSqlite;
import com.ipartek.pojo.Perro;

public class Ejercicio2 {

	public static void main(String[] args) throws Exception {

		
		// Este DAO se encarga de realizara la operaciones de CRUD contra la bbdd
		//PerroDAOSqlite dao = new PerroDAOSqlite();
		PerroDAOSqlite dao = PerroDAOSqlite.getInstance();
		
		
		System.out.println( dao.recuperar(1) );
		System.out.println( dao.recuperar(145) );
		
		
		Perro pNuevo = new Perro("Rintint2", "callejero", 34 );
		try {			
			dao.crear(pNuevo);  // insert
		}catch (Exception e) {
			System.out.printf("** el nombre del perro %s ya existe \n", pNuevo.getNombre());
		}
		
		
		dao.eliminar(4);
		
		
		for (Perro p : dao.listar()) {
			System.out.println(p);
		}

		System.out.println("terminamos");

	}

}