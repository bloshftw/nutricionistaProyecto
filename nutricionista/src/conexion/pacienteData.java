package conexion;

import entidades.paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class pacienteData {
    
    
        private Connection con = null;
    
    public pacienteData(){
        con = Conexion.getConexion();
    }
    //agregar un paciente
    public void agregarPaciente(paciente paciente){
        String sql = "INSERT INTO paciente(nombre, apellido, edad, altura, pesoActuacl, pesoBuscado, condicion) VALUES"
                + " (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getEdad());
            ps.setInt(4, paciente.getAltura());
            ps.setFloat(5, paciente.getPesoActual());
            ps.setFloat(6, paciente.getPesoBuscado());
            ps.setString(7, paciente.getSexo());
            ps.setString(8, paciente.getCondicion());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                paciente.setNroPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null," - Paciente añadido con exito.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla paciente "+ex.getMessage());
        }                   
    }
    
    /*Llenar ComboBox con pacientes*/
  
    public void rellenarComboBox(String tabla, String valor, JComboBox combo){
    
        String sql = "SELECT * FROM " + tabla;
        Statement st;
        
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
            combo.addItem(rs.getString(valor));
            
            }
        } catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "error" + e.toString());
            
        }
    }
    
    public paciente obtenerPacientePorNombre(String nombre) {
        paciente paciente = null; 
        String query = "SELECT * FROM paciente WHERE nombre = ?"; 

        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, nombre); 
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int nroPaciente = rs.getInt("nroPaciente");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                int altura = rs.getInt("altura");
                String sexo = rs.getString("sexo");
                float pesoActual = rs.getFloat("pesoActual");
                float pesoBuscado = rs.getFloat("pesoBuscado");
                String condicionEspecial = rs.getString("condicionEspecial");

          
                paciente = new paciente(nroPaciente, nombre, apellido, edad, altura, pesoActual, pesoBuscado, sexo, condicionEspecial);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el paciente: " + e.getMessage());
        }


        return paciente; 
    }

    
}
