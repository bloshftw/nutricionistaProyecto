package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testConexion {
    public static void main(String[] args) {
        Connection con = Conexion.getConexion(); // Usa la conexión de la clase Conexion

        if (con != null) {
            try {
                // Crear la consulta
                String sql = "SELECT 1"; // Consulta simple para probar conexion
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                // Procesar el resultado
                if (rs.next()) {
                    System.out.println("Consulta ejecutada correctamente. Resultado: " + rs.getInt(1));
                }

                // Cerrar recursos
                rs.close();
                stmt.close();
                Conexion.cerrarConexion();

            } catch (SQLException e) {
                System.out.println("Error en la consulta: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }
}
