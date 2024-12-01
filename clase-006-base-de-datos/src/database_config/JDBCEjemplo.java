package database_config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class JDBCEjemplo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/movies_db"; // URL de la base de datos "clinica"
        String usuario = "root"; // Nombre de usuario de la base de datos
        String contrasena = ""; // Contraseña de la base de datos

        //utilizamos excepciones para manejar posibles errores de conexión.
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
