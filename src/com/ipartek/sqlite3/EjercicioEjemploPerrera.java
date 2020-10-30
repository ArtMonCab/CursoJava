package com.ipartek.sqlite3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//import com.ipartek.ejercicios.interfaces.app.Patinete;
import com.ipartek.pojo.Perro;

public class EjercicioEjemploPerrera{

	public static void main(String[] args) throws Exception {

		String sql = "SELECT * FROM perro ORDER BY nombre ASC;";
		ArrayList<Perro> perros = new ArrayList();

		// Todo lo que metamos dentro de los () del try se cierra automaticamente al
		// terminar el try
		// Esto es posible porque los recursos implementan la interfaz AutoClosable
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ddbb/perrera.db");
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				//Patinete patin = new Patinete();
				) {

			
			
			while (rs.next()) {
				
				Perro p = new Perro();
				p.setId( rs.getInt("id"));
				p.setNombre( rs.getString("nombre"));
				p.setRaza( rs.getString("raza"));
				p.setPeso( rs.getFloat("peso"));
				p.setVacunado( rs.getBoolean("vacunado"));
				p.setHistoria( rs.getString("historia"));
				perros.add(p);

			}

			
			for (Perro perro : perros) {
				System.out.println("Nombre: " + perro.getNombre());
				System.out.println("Raza: " + perro.getRaza());
				System.out.println("Peso: " + perro.getPeso() + " kgs");
				if (perro.isVacunado()) {
					System.out.println("Vacunado: Si");
				}else {
					System.out.println("Vacunado: No");
				}
				System.out.println("Historia: " + perro.getHistoria());
				System.out.println("");
				System.out.println("___________________________");
				System.out.println("");
			}
			
		} // try, se cierran Connection, PreparedStatement, ResultSet y Patinete

		System.out.println("terminamos");

	}

}