package conexion;

import entidades.alimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<alimento> listarAlimentos() {
        List<alimento> lista = new ArrayList<>();
        String sql = "SELECT * FROM Alimento";
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new alimento(
                    rs.getInt("idAlimento"),
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getDouble("calorias"),
                    rs.getBoolean("aptoCeliacos"),
                    rs.getBoolean("bajoLactosa")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean actualizarAlimento(alimento a) {
        String sql = "UPDATE Alimento SET nombre=?, categoria=?, calorias=?, aptoCeliacos=?, bajoLactosa=? "
                   + "WHERE idAlimento=?";
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getCategoria());
            ps.setDouble(3, a.getCalorias());
            ps.setBoolean(4, a.isAptoCeliacos());
            ps.setBoolean(5, a.isBajoLactosa());
            ps.setInt(6, a.getIdAlimento());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}
