package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PruebaDataBase {

	public static void main(String[] args) {
		
        String url = "jdbc:postgresql://autorack.proxy.rlwy.net:48000/railway?sslmode=disable";
        String usuario = "postgres";
        String contrasena = "xUoluZqUyDHEkgQSnXkbgqfjZNNYXMKi";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena)) {
            System.out.println("¡Conexión exitosa!");
            String sql = "INSERT INTO PERSONAS (NOMBRE, ALIAS) VALUES (?, ?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, "Lucila Juri");
            stmt.setString(2, "lucilajuri.mp");
            System.out.println(stmt.executeUpdate());
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }

	}

}
