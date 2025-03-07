package conexion;

import entidades.alimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ferna
 */
public class alimentoData {
    
      // Método para insertar un nuevo alimento en la base de datos
    public boolean insertarAlimento(alimento alimento) {
        String sql = "INSERT INTO Alimento (nombre, categoria, calorias, aptoCeliacos, bajoLactosa) " +
                     "VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
             
            ps.setString(1, alimento.getNombre());
            ps.setString(2, alimento.getCategoria());
            ps.setDouble(3, alimento.getCalorias());
            ps.setBoolean(4, alimento.isAptoCeliacos());
            ps.setBoolean(5, alimento.isBajoLactosa());
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Método para eliminar un alimento a partir de su id
    public boolean eliminarAlimento(int idAlimento) {
        String sql = "DELETE FROM Alimento WHERE idAlimento = ?";
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, idAlimento);
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
