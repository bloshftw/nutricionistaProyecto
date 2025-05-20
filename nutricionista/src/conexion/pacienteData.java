/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import entidades.paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferna
 */
public class pacienteData {
    
    // Método para insertar un nuevo paciente en la base de datos
    public boolean insertarPaciente(paciente paciente) {
        String sql = "INSERT INTO Paciente (nombre, apellido, edad, peso, altura, sexo, objetivo, vegetariano, celiaco, intoleranteLactosa) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getEdad());
            ps.setDouble(4, paciente.getPeso());
            ps.setDouble(5, paciente.getAltura());
            ps.setString(6, paciente.getSexo());
            ps.setString(7, paciente.getObjetivo());
            ps.setBoolean(8, paciente.isVegetariano());
            ps.setBoolean(9, paciente.isCeliaco());
            ps.setBoolean(10, paciente.isIntoleranteLactosa());
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
       //Metodo para modificar un paciente
    
        public boolean actualizarPaciente(paciente paciente) {
    String sql = "UPDATE Paciente SET nombre = ?, apellido = ?, edad = ?, peso = ?, " +
                 "altura = ?, sexo = ?, objetivo = ?, vegetariano = ?, celiaco = ?, " +
                 "intoleranteLactosa = ? WHERE idPaciente = ?";
    
    try (Connection con = Conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        // Establecer los parámetros según los campos de tu clase paciente
        ps.setString(1, paciente.getNombre());
        ps.setString(2, paciente.getApellido());
        ps.setInt(3, paciente.getEdad());
        ps.setDouble(4, paciente.getPeso());
        ps.setDouble(5, paciente.getAltura());
        ps.setString(6, paciente.getSexo());
        ps.setString(7, paciente.getObjetivo());
        ps.setBoolean(8, paciente.isVegetariano());
        ps.setBoolean(9, paciente.isCeliaco());
        ps.setBoolean(10, paciente.isIntoleranteLactosa());
        ps.setInt(11, paciente.getIdPaciente()); // ID para la cláusula WHERE
        
        // Ejecutar la actualización
        int filasAfectadas = ps.executeUpdate();
        
        // Si filasAfectadas > 0, significa que se actualizó al menos un registro
        return filasAfectadas > 0;
        
    } catch (SQLException e) {
        e.printStackTrace();
        System.err.println("Error al actualizar el paciente: " + e.getMessage());
        return false;
    }
}
    
    
    
       // Método para eliminar un paciente a partir de su id
    public boolean eliminarPaciente(int idPaciente) {
        String sql = "DELETE FROM Paciente WHERE idPaciente = ?";
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, idPaciente);
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    // Método para obtener todos los pacientes
    public List<paciente> obtenerPacientes() {
        List<paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Paciente";
        try (Connection con = Conexion.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            
            while (rs.next()) {
                paciente p = new paciente(
                        rs.getInt("idPaciente"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getDouble("peso"),
                        rs.getDouble("altura"),
                        rs.getString("sexo"),
                        rs.getString("objetivo"),
                        rs.getBoolean("vegetariano"),
                        rs.getBoolean("celiaco"),
                        rs.getBoolean("intoleranteLactosa")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    // Métodos para actualizar y eliminar pacientes se pueden implementar de forma similar
}
    
    
    

