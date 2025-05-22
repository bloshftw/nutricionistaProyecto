package conexion;

import entidades.dieta;
import entidades.dietaDetalle;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase para manejar operaciones de Dieta en la base de datos
 * @author ferna
 */
public class dietaData {
   private Connection con = null;
    
    public dietaData() {
        con = Conexion.getConnection(); 
    }
    
    public boolean guardarDieta(dieta dieta, List<dietaDetalle> detalles) {
        String sqlDieta = "INSERT INTO dieta (idPaciente, nombre, descripcion, tipo, calorias, tasaMetabolica, fechaCreacion, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlDetalle = "INSERT INTO dietadetalle (idDieta, idAlimento, comida, posicion, porciones, calorias) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            con.setAutoCommit(false); // Iniciar transacción
            
            // 1. Insertar la dieta principal
            PreparedStatement psDieta = con.prepareStatement(sqlDieta, Statement.RETURN_GENERATED_KEYS);
            psDieta.setInt(1, dieta.getIdPaciente());
            psDieta.setString(2, dieta.getNombre());
            psDieta.setString(3, dieta.getDescripcion());
            psDieta.setString(4, dieta.getTipo());
            psDieta.setDouble(5, dieta.getCalorias());
            psDieta.setDouble(6, dieta.getTasaMetabolica());
            psDieta.setDate(7, Date.valueOf(dieta.getFechaCreacion()));
            psDieta.setBoolean(8, dieta.isEstado());
            
            int filasAfectadas = psDieta.executeUpdate();
            
            if (filasAfectadas == 1) {
                // Obtener el ID generado para la dieta
                ResultSet rs = psDieta.getGeneratedKeys();
                if (rs.next()) {
                    int idDietaGenerado = rs.getInt(1);
                    dieta.setIdDieta(idDietaGenerado);
                    
                    // 2. Insertar los detalles de la dieta
                    PreparedStatement psDetalle = con.prepareStatement(sqlDetalle);
                    
                    for (dietaDetalle detalle : detalles) {
                        detalle.setIdDieta(idDietaGenerado);
                        psDetalle.setInt(1, detalle.getIdDieta());
                        psDetalle.setInt(2, detalle.getIdAlimento());
                        psDetalle.setString(3, detalle.getComida());
                        psDetalle.setInt(4, detalle.getPosicion());
                        psDetalle.setInt(5, detalle.getPorciones());
                        psDetalle.setDouble(6, detalle.getCalorias());
                        psDetalle.addBatch();
                    }
                    
                    int[] resultadosBatch = psDetalle.executeBatch();
                    
                    // Verificar que todos los detalles se insertaron correctamente
                    boolean todosExitosos = true;
                    for (int resultado : resultadosBatch) {
                        if (resultado == Statement.EXECUTE_FAILED) {
                            todosExitosos = false;
                            break;
                        }
                    }
                    
                    if (todosExitosos) {
                        con.commit(); // Confirmar transacción
                        JOptionPane.showMessageDialog(null, "Dieta guardada exitosamente");
                        return true;
                    } else {
                        con.rollback(); // Deshacer cambios
                        JOptionPane.showMessageDialog(null, "Error al guardar los detalles de la dieta");
                        return false;
                    }
                }
            }
            
            con.rollback(); // Deshacer cambios si no se pudo insertar la dieta
            return false;
            
        } catch (SQLException ex) {
            try {
                con.rollback(); // Deshacer cambios en caso de error
            } catch (SQLException e) {
                System.out.println("Error al hacer rollback: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Dieta: " + ex.getMessage());
            return false;
        } finally {
            try {
                con.setAutoCommit(true); // Restaurar auto-commit
            } catch (SQLException e) {
                System.out.println("Error al restaurar auto-commit: " + e.getMessage());
            }
        }
    }
    
    // Método para obtener todas las dietas de un paciente
    public List<dieta> obtenerDietasPorPaciente(int idPaciente) {
        List<dieta> dietas = new ArrayList<>();
        String sql = "SELECT * FROM dieta WHERE idPaciente = ? AND estado = 1 ORDER BY fechaCreacion DESC";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                dieta dieta = new dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setIdPaciente(rs.getInt("idPaciente"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setDescripcion(rs.getString("descripcion"));
                dieta.setTipo(rs.getString("tipo"));
                dieta.setCalorias(rs.getDouble("calorias"));
                dieta.setTasaMetabolica(rs.getDouble("tasaMetabolica"));
                dieta.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                dieta.setEstado(rs.getBoolean("estado"));
                
                dietas.add(dieta);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener dietas: " + ex.getMessage());
        }
        
        return dietas;
    }
    
    // Método para obtener los detalles de una dieta
    public List<dietaDetalle> obtenerDetallesDieta(int idDieta) {
        List<dietaDetalle> detalles = new ArrayList<>();
        String sql = "SELECT * FROM dietadetalle WHERE idDieta = ? ORDER BY comida, posicion";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                dietaDetalle detalle = new dietaDetalle();
                detalle.setIdDetalle(rs.getInt("idDetalle"));
                detalle.setIdDieta(rs.getInt("idDieta"));
                detalle.setIdAlimento(rs.getInt("idAlimento"));
                detalle.setComida(rs.getString("comida"));
                detalle.setPosicion(rs.getInt("posicion"));
                detalle.setPorciones(rs.getInt("porciones"));
                detalle.setCalorias(rs.getDouble("calorias"));
                
                detalles.add(detalle);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener detalles de dieta: " + ex.getMessage());
        }
        
        return detalles;
    }
}