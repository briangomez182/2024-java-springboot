package org.example.database_config;

import java.sql.*;

public class JDBCEjemplo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/movies_db?serverTimezone=UTC"; // URL de la base de datos "clinica"
        String usuario = "root"; // Nombre de usuario de la base de datos
        String contrasena = "ROOT"; // Contraseña de la base de datos

        //utilizamos excepciones para manejar posibles errores de conexión.
        try (Connection connection = DriverManager.getConnection(url, usuario, contrasena);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM movies")) {

            while (rs.next()) {
                String titulo = rs.getString("title");
                String rating = rs.getString("rating");
                String premios = rs.getString("awards");

                // ... otros campos de la tabla
                System.out.println("Título: " + titulo + ", Director: " + rating + " , Director: " + rating);
            }
        } catch (
        SQLException e) {
            e.printStackTrace();
        }
    }
}
