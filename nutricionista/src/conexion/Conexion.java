package conexion;

import java.sql.*;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/proyectonutri";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection con = null;

    private Conexion() {
        try {
            // Cargar el driver
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el Driver: " + ex.getMessage());
        }
    }

     public static Connection getConexion() {
        if (con == null) {
            try {
                con = (Connection) DriverManager.getConnection(URL, USUARIO, PASSWORD);
                System.out.println("Conexión establecida correctamente.");
            } catch (SQLException ex) {
                System.out.println("Error en la conexión: " + ex.getMessage());
            }
        }
        return con;
    }
     
     public static void cerrarConexion() {
        if (con != null) {
            try {
                con.close();
                con = null;
                System.out.println("Conexión cerrada.");
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
    }
}
