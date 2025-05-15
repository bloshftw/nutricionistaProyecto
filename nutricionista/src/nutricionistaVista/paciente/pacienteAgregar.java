/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package nutricionistaVista.paciente;

import Imagenes.JPanelImage;
import conexion.pacienteData;
import entidades.paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class pacienteAgregar extends javax.swing.JPanel {

    
    public pacienteAgregar() {
        initComponents();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPacienteAgregar = new javax.swing.JPanel();
        jLNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        inputApellido = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jLEdad = new javax.swing.JLabel();
        inputEdad = new javax.swing.JTextField();
        inputAltura = new javax.swing.JTextField();
        jLAltura = new javax.swing.JLabel();
        jLcm = new javax.swing.JLabel();
        jLKGActual = new javax.swing.JLabel();
        inputPesoActual = new javax.swing.JTextField();
        jLPesoActual = new javax.swing.JLabel();
        inputHombre = new javax.swing.JRadioButton();
        jLGenero = new javax.swing.JLabel();
        inputMujer = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLCondicionAlimenticia = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        inputCeliaco = new javax.swing.JRadioButton();
        inputVegetariano = new javax.swing.JRadioButton();
        inputIntolerante = new javax.swing.JRadioButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLtituloPaciente = new java.awt.Label();
        jLPesoActual1 = new javax.swing.JLabel();
        inputSubirPeso = new javax.swing.JRadioButton();
        inputBajarPeso = new javax.swing.JRadioButton();
        inputMantenerPeso = new javax.swing.JRadioButton();

        jLNombre.setText("Nombre:");

        inputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreActionPerformed(evt);
            }
        });

        jLApellido.setText("Apellido:");

        jLEdad.setText("Edad:");

        jLAltura.setText("Altura:");

        jLcm.setText("M.CM");

        jLKGActual.setText("KG");

        jLPesoActual.setText("Peso Actual:");

        inputHombre.setText("Hombre");
        inputHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHombreActionPerformed(evt);
            }
        });

        jLGenero.setText("Genero:");

        inputMujer.setText("Mujer");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nutricionista.png"))); // NOI18N

        jLCondicionAlimenticia.setText("Condicion alimenticia:");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputCeliaco.setText("Celiaco");

        inputVegetariano.setText("Vegetariano");

        inputIntolerante.setText("Intolerante a la lactosa");
        inputIntolerante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIntoleranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(inputCeliaco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(inputIntolerante))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(inputVegetariano)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCeliaco)
                    .addComponent(inputIntolerante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(inputVegetariano)
                .addGap(25, 25, 25))
        );

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLtituloPaciente.setAlignment(java.awt.Label.CENTER);
        jLtituloPaciente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLtituloPaciente.setText("Ingreso de datos de Paciente");

        jLPesoActual1.setText("Objetivo:");

        inputSubirPeso.setText("Subir de peso");

        inputBajarPeso.setText("Bajar de peso");

        inputMantenerPeso.setText("Mantener Peso");

        javax.swing.GroupLayout jPanelPacienteAgregarLayout = new javax.swing.GroupLayout(jPanelPacienteAgregar);
        jPanelPacienteAgregar.setLayout(jPanelPacienteAgregarLayout);
        jPanelPacienteAgregarLayout.setHorizontalGroup(
            jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLtituloPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacienteAgregarLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacienteAgregarLayout.createSequentialGroup()
                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLNombre)
                                .addGap(23, 23, 23)
                                .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputNombre)
                                    .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLPesoActual)
                                .addComponent(jLAltura)
                                .addComponent(jLEdad)
                                .addComponent(jLApellido))
                            .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                                .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLGenero))
                                    .addComponent(jLPesoActual1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(inputPesoActual, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(inputAltura)
                                            .addComponent(inputEdad))
                                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLKGActual))
                                            .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLcm))))
                                    .addComponent(inputMujer)
                                    .addComponent(inputHombre)
                                    .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                                        .addComponent(inputSubirPeso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputBajarPeso)
                                        .addGap(4, 4, 4)
                                        .addComponent(inputMantenerPeso)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacienteAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(330, 330, 330))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacienteAgregarLayout.createSequentialGroup()
                                .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacienteAgregarLayout.createSequentialGroup()
                                        .addComponent(jLCondicionAlimenticia)
                                        .addGap(72, 72, 72)))
                                .addGap(265, 265, 265))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacienteAgregarLayout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))))
        );
        jPanelPacienteAgregarLayout.setVerticalGroup(
            jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLtituloPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLApellido)
                            .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEdad)
                            .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAltura)
                            .addComponent(inputAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcm)))
                    .addComponent(jLabel13))
                .addGap(23, 23, 23)
                .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                        .addComponent(jLCondicionAlimenticia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPesoActual)
                            .addComponent(inputPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLKGActual))
                        .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLGenero))
                            .addGroup(jPanelPacienteAgregarLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanelPacienteAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLPesoActual1)
                                    .addComponent(inputSubirPeso)
                                    .addComponent(inputBajarPeso)
                                    .addComponent(inputMantenerPeso))
                                .addGap(18, 18, 18)
                                .addComponent(inputHombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputMujer)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPacienteAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPacienteAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombreActionPerformed

    private void inputHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHombreActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombre = inputNombre.getText();
        String apellido = inputApellido.getText();
        int edad = Integer.parseInt(inputEdad.getText());
        double peso = Double.parseDouble(inputPesoActual.getText());
        double altura = Double.parseDouble(inputAltura.getText());
        String sexo = "";
        
        //Definir el sexo
        if (inputHombre.isSelected()){
        sexo = "hombre";
        } else if (inputMujer.isSelected()){
        sexo = "mujer";
        }
        
        //Definir El objetivo
        
        String objetivo = "";
        
        if (inputSubirPeso.isSelected()){
        objetivo = "subir";
        } else if (inputBajarPeso.isSelected()){
        objetivo = "bajar";
        } else if (inputMantenerPeso.isSelected()){
        objetivo = "mantener";
        }
        
        boolean vegetariano = inputVegetariano.isSelected();
        boolean celiaco = inputCeliaco.isSelected();
        boolean intoleranteLactosa = inputIntolerante.isSelected();
        
        //Se crea el objeto paciente
        paciente pac = new paciente(nombre, apellido, edad, peso, altura, sexo, objetivo, vegetariano, celiaco, intoleranteLactosa);
        
        //Se inicializa el objeto que contiene la funcion para insertar pacientes
        pacienteData pacData = new pacienteData();
        
        boolean exito = pacData.insertarPaciente(pac);
        
        if (exito = true){
        JOptionPane.showMessageDialog(this, "Paciente añadido con exito!");
        } else {
        JOptionPane.showMessageDialog(this, "Hubo un error al agregar el paciente");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    }//GEN-LAST:event_btnSalirActionPerformed

    private void inputIntoleranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIntoleranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIntoleranteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField inputAltura;
    private javax.swing.JTextField inputApellido;
    private javax.swing.JRadioButton inputBajarPeso;
    private javax.swing.JRadioButton inputCeliaco;
    private javax.swing.JTextField inputEdad;
    private javax.swing.JRadioButton inputHombre;
    private javax.swing.JRadioButton inputIntolerante;
    private javax.swing.JRadioButton inputMantenerPeso;
    private javax.swing.JRadioButton inputMujer;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputPesoActual;
    private javax.swing.JRadioButton inputSubirPeso;
    private javax.swing.JRadioButton inputVegetariano;
    private javax.swing.JLabel jLAltura;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCondicionAlimenticia;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLGenero;
    private javax.swing.JLabel jLKGActual;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPesoActual;
    private javax.swing.JLabel jLPesoActual1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLcm;
    private java.awt.Label jLtituloPaciente;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPacienteAgregar;
    // End of variables declaration//GEN-END:variables
}
