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
 * @author fernando y luciano 
 */
public class pacienteBuscar extends javax.swing.JPanel {

    private JComboBox<String> comboPacientes;
    private List<paciente> listaPacientes;
    private pacienteData pacienteData;
    
    public pacienteBuscar() {
        initComponents();
        //Inicializar objeto que contiene funciones
        pacienteData = new pacienteData();
        cargarPacientes();
        //Variable comboBox
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        outputAlturaPaciente = new javax.swing.JTextField();
        outputObjetivoPaciente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbCeliaco = new javax.swing.JCheckBox();
        rbVegetariano = new javax.swing.JCheckBox();
        rbIntolerante = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        rbHombre = new javax.swing.JCheckBox();
        rbMujer = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jPanelEliminarPaciente.setBackground(new java.awt.Color(0, 102, 102));
        jPanelEliminarPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccionar Paciente:");

        comboBoxPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPacientesActionPerformed(evt);
            }
        });

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

        outputAlturaPaciente.setEditable(false);

        outputObjetivoPaciente.setEditable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbCeliaco.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbCeliaco.setForeground(new java.awt.Color(0, 0, 0));
        rbCeliaco.setText("Celiaco");

        rbVegetariano.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbVegetariano.setForeground(new java.awt.Color(0, 0, 0));
        rbVegetariano.setText("Vegetariano");

        rbIntolerante.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbIntolerante.setForeground(new java.awt.Color(0, 0, 0));
        rbIntolerante.setText("Intolerante a lactosa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCeliaco)
                    .addComponent(rbVegetariano)
                    .addComponent(rbIntolerante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbCeliaco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbVegetariano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbIntolerante)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbHombre.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbHombre.setForeground(new java.awt.Color(0, 0, 0));
        rbHombre.setText("Hombre");

        rbMujer.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbMujer.setForeground(new java.awt.Color(0, 0, 0));
        rbMujer.setText("Mujer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbHombre)
                    .addComponent(rbMujer))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMujer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelEliminarPacienteLayout = new javax.swing.GroupLayout(jPanelEliminarPaciente);
        jPanelEliminarPaciente.setLayout(jPanelEliminarPacienteLayout);
        jPanelEliminarPacienteLayout.setHorizontalGroup(
            jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputObjetivoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputAlturaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 170, Short.MAX_VALUE))
        );
        jPanelEliminarPacienteLayout.setVerticalGroup(
            jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(outputObjetivoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboBoxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(outputPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(outputEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)))
                            .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEliminarPacienteLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(outputAlturaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel7)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSCAR PACIENTES");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanelEliminarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEliminarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void outputEdadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputEdadPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputEdadPacienteActionPerformed

    private void comboBoxPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPacientesActionPerformed
        actualizarDetallesPaciente();
    }//GEN-LAST:event_comboBoxPacientesActionPerformed

    
    
    //Funcion para cargar pacientes al comboBox
    private void cargarPacientes() {
    listaPacientes = pacienteData.obtenerPacientes();
    //Se limpia el comboBox
    comboBoxPacientes.removeAllItems();
    
    //For each para recorrer todo
    for (paciente p : listaPacientes){
    comboBoxPacientes.addItem(p.getNombre() + " " +p.getApellido());
    }
    }
    
    private void actualizarDetallesPaciente() {
    
    int index = comboBoxPacientes.getSelectedIndex();
        
        if (index >= 0 && index < listaPacientes.size()) {
            paciente p = listaPacientes.get(index);
            
            outputEdadPaciente.setText(String.valueOf(p.getEdad()));
            outputPesoPaciente.setText(String.valueOf(p.getPeso()));
            outputAlturaPaciente.setText(String.valueOf((float) p.getAltura()));
            
            // Configurar el sexo en los radio buttons
           String sexo = "";
 
           rbHombre.setSelected(false);
           rbMujer.setSelected(false);
           
            if ("hombre".equals(p.getSexo())) {
                rbHombre.setSelected(true);
            } else if ("mujer".equals(p.getSexo())) {
                rbMujer.setSelected(true);
            }
            
            //Ajuste para solucionar problemas con la toma de dato
            System.out.println("Objetivo del paciente actual: ");
            System.out.println(p.getObjetivo());
            
            
            
            if ("subir".equalsIgnoreCase(p.getObjetivo())){
            outputObjetivoPaciente.setText("Subir de peso");
            } else if ("bajar".equalsIgnoreCase(p.getObjetivo())){
            outputObjetivoPaciente.setText("Bajar de peso");
            } else if ("mantener".equalsIgnoreCase(p.getObjetivo())){
            outputObjetivoPaciente.setText("Mantener su peso");
            }
            
            
            
           // Configurar condiciones especiales
            rbCeliaco.setSelected(p.isCeliaco());
            rbVegetariano.setSelected(p.isVegetariano());
            rbIntolerante.setSelected(p.isIntoleranteLactosa());
    }
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JCheckBox rbCeliaco;
    private javax.swing.JCheckBox rbHombre;
    private javax.swing.JCheckBox rbIntolerante;
    private javax.swing.JCheckBox rbMujer;
    private javax.swing.JCheckBox rbVegetariano;
    // End of variables declaration//GEN-END:variables
}
