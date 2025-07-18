/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package nutricionistaVista.paciente;

import conexion.pacienteData;
import entidades.paciente;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author ferna
 */
public class pacienteEliminar extends javax.swing.JPanel {

    private JComboBox<String> comboPacientes;
    private List<paciente> listaPacientes;
    private pacienteData pacienteData;
    
    public pacienteEliminar() {
        initComponents();
       //Se inicializar el objeto que contiene las funciones
        pacienteData = new pacienteData();
        
      //Nombre de la variable asignada al comboBox "comboBoxPacientes"
      cargarPacientes();
      
      comboBoxPacientes.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarDetallesPaciente();
    }
    });
      
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelEliminarPaciente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxPacientes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        outputPesoPaciente = new javax.swing.JTextField();
        outputEdadPaciente = new javax.swing.JTextField();
        outputSexoPaciente = new javax.swing.JTextField();
        outputAlturaPaciente = new javax.swing.JTextField();
        outputObjetivoPaciente = new javax.swing.JTextField();
        btnEliminarPaciente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rbCeliaco = new javax.swing.JCheckBox();
        rbVegetariano = new javax.swing.JCheckBox();
        rbIntolerante = new javax.swing.JCheckBox();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIMINAR PACIENTES");
        jLabel1.setToolTipText("");

        jPanelEliminarPaciente.setBackground(new java.awt.Color(0, 102, 102));
        jPanelEliminarPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccionar Paciente:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Peso Paciente:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Edad:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sexo:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Altura");

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Objetivo:");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Condicion especial:");

        outputPesoPaciente.setEditable(false);

        outputEdadPaciente.setEditable(false);
        outputEdadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputEdadPacienteActionPerformed(evt);
            }
        });

        outputSexoPaciente.setEditable(false);

        outputAlturaPaciente.setEditable(false);

        outputObjetivoPaciente.setEditable(false);

        btnEliminarPaciente.setText("Eliminar");
        btnEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPacienteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(153, 255, 255));

        rbCeliaco.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbCeliaco.setForeground(new java.awt.Color(0, 0, 0));
        rbCeliaco.setText("Celiaco");

        rbVegetariano.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbVegetariano.setForeground(new java.awt.Color(0, 0, 0));
        rbVegetariano.setText("Vegetariano");

        rbIntolerante.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbIntolerante.setForeground(new java.awt.Color(0, 0, 0));
        rbIntolerante.setText("Intolerante a Lactosa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbCeliaco)
            .addComponent(rbVegetariano)
            .addComponent(rbIntolerante)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbCeliaco, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(rbVegetariano, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbIntolerante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelEliminarPacienteLayout = new javax.swing.GroupLayout(jPanelEliminarPaciente);
        jPanelEliminarPaciente.setLayout(jPanelEliminarPacienteLayout);
        jPanelEliminarPacienteLayout.setHorizontalGroup(
            jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel2))
                    .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(outputObjetivoPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(outputAlturaPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(outputSexoPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(outputEdadPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(outputPesoPaciente, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(btnEliminarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanelEliminarPacienteLayout.setVerticalGroup(
            jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(outputPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(outputEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(outputSexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(outputAlturaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(outputObjetivoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEliminarPacienteLayout.createSequentialGroup()
                                .addComponent(btnEliminarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEliminarPacienteLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jPanelEliminarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEliminarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void outputEdadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputEdadPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputEdadPacienteActionPerformed

    private void btnEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPacienteActionPerformed
        eliminarPaciente();
    }//GEN-LAST:event_btnEliminarPacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarPaciente;
    private javax.swing.JComboBox<String> comboBoxPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelEliminarPaciente;
    private javax.swing.JTextField outputAlturaPaciente;
    private javax.swing.JTextField outputEdadPaciente;
    private javax.swing.JTextField outputObjetivoPaciente;
    private javax.swing.JTextField outputPesoPaciente;
    private javax.swing.JTextField outputSexoPaciente;
    private javax.swing.JCheckBox rbCeliaco;
    private javax.swing.JCheckBox rbIntolerante;
    private javax.swing.JCheckBox rbVegetariano;
    // End of variables declaration//GEN-END:variables

    //Funcion para cargar pacientes al ComboBox
    private void cargarPacientes() {
        listaPacientes = pacienteData.obtenerPacientes();
        //Se limpia el comboBox
        comboBoxPacientes.removeAllItems();
        
        //Se reccore todo
        for (paciente p : listaPacientes){
        comboBoxPacientes.addItem(p.getNombre() + " " +p.getApellido());
        }
    }
    
    private void actualizarDetallesPaciente() {
        int index = comboBoxPacientes.getSelectedIndex();

        if (listaPacientes == null || listaPacientes.isEmpty()) {
            return;
        }

        if (index >= 0 && index < listaPacientes.size()) {
            paciente p = listaPacientes.get(index);
            outputEdadPaciente.setText(String.valueOf(p.getEdad()));
            outputPesoPaciente.setText(String.valueOf(p.getPeso()));
            outputAlturaPaciente.setText(String.format("%.2f", p.getAltura()));
            outputSexoPaciente.setText(p.getSexo());
            outputObjetivoPaciente.setText(p.getObjetivo());

            rbCeliaco.setSelected(p.isCeliaco());
            rbVegetariano.setSelected(p.isVegetariano());
            rbIntolerante.setSelected(p.isIntoleranteLactosa());
        } else {
            limpiarCampos();
        }
    }

    private void limpiarCampos() {
        outputEdadPaciente.setText("");
        outputPesoPaciente.setText("");
        outputAlturaPaciente.setText("");
        outputSexoPaciente.setText("");
        outputObjetivoPaciente.setText("");
        rbCeliaco.setSelected(false);
        rbVegetariano.setSelected(false);
        rbIntolerante.setSelected(false);
    }

    
   private void eliminarPaciente() {
        if (listaPacientes == null || listaPacientes.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay pacientes para eliminar.");
            return;
        }

        int index = comboBoxPacientes.getSelectedIndex();
        if (index < 0 || index >= listaPacientes.size()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un paciente válido.");
            return;
        }

        paciente p = listaPacientes.get(index);
        int confirm = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro de eliminar al paciente " + p.getNombre() + " " + p.getApellido() + "?",
                "Confirmar eliminación",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            boolean exito = pacienteData.eliminarPaciente(p.getIdPaciente());
            if (exito) {
                javax.swing.JOptionPane.showMessageDialog(this, "Paciente eliminado correctamente.");
                cargarPacientes(); // También actualiza la vista del paciente
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar el paciente.");
            }
        }
    }

    
}
