package conexion;

import java.sql.*;


public class Conexion {

    // URL de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_nutricionista";
    private static final String USER = "root";         // Usuario de la BD (por defecto en XAMPP suele ser 'root')
    private static final String PASSWORD = "";         // Contraseña de la BD (por defecto suele estar vacía)

    // Bloque static para cargar el driver de MySQL
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver MySQL cargado correctamente.");
        } catch (ClassNotFoundException e) {
            System.err.println("No se pudo cargar el driver de MySQL.");
            e.printStackTrace();
        }
    }

    // Método que retorna la conexión a la BD
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }
        return connection;
    }

    static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
