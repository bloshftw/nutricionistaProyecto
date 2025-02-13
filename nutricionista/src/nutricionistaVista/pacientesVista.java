package nutricionistaVista;

/**
 *
 * @author ferna
 */
public class pacientesVista extends javax.swing.JPanel {


    public pacientesVista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLtituloPaciente = new java.awt.Label();
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
        jLPesoBuscado = new javax.swing.JLabel();
        inputPesoBuscado = new javax.swing.JTextField();
        jLKGBuscado = new javax.swing.JLabel();
        inputHombre = new javax.swing.JRadioButton();
        jLGenero = new javax.swing.JLabel();
        inputMujer = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLCondicionAlimenticia = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        inputCeliaco2 = new javax.swing.JRadioButton();
        inputVegetariano2 = new javax.swing.JRadioButton();
        inputIntolerante2 = new javax.swing.JRadioButton();
        inputVegano2 = new javax.swing.JRadioButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLtituloPaciente.setAlignment(java.awt.Label.CENTER);
        jLtituloPaciente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLtituloPaciente.setText("Ingreso de datos de Paciente");

        jLNombre.setText("Nombre:");

        inputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreActionPerformed(evt);
            }
        });

        jLApellido.setText("Apellido:");

        jLEdad.setText("Edad:");

        jLAltura.setText("Altura:");

        jLcm.setText("CM");

        jLKGActual.setText("KG");

        jLPesoActual.setText("Peso Actual:");

        jLPesoBuscado.setText("Peso Buscado:");

        inputPesoBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPesoBuscadoActionPerformed(evt);
            }
        });

        jLKGBuscado.setText("KG");

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

        inputCeliaco2.setText("Celiaco");

        inputVegetariano2.setText("Vegetariano");

        inputIntolerante2.setText("Intolerante a la lactosa");

        inputVegano2.setText("Vegano");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(inputCeliaco2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(inputIntolerante2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(inputVegetariano2)
                        .addGap(18, 18, 18)
                        .addComponent(inputVegano2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCeliaco2)
                    .addComponent(inputIntolerante2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputVegetariano2)
                    .addComponent(inputVegano2))
                .addGap(26, 26, 26))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLNombre)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputPesoActual)
                                    .addComponent(inputAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLcm)
                                    .addComponent(jLKGActual)))
                            .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNombre)
                            .addComponent(inputApellido)
                            .addComponent(jLtituloPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLPesoActual)
                        .addComponent(jLAltura)
                        .addComponent(jLEdad)
                        .addComponent(jLApellido))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLGenero)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputMujer)
                                    .addComponent(inputHombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLPesoBuscado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLKGBuscado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLCondicionAlimenticia)
                            .addComponent(jLabel13))
                        .addGap(166, 166, 166))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLtituloPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLApellido)
                            .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEdad)
                            .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAltura)
                            .addComponent(inputAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcm)))
                    .addComponent(jLabel13))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPesoActual)
                            .addComponent(inputPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLKGActual))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPesoBuscado)
                            .addComponent(inputPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLKGBuscado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputHombre)
                            .addComponent(jLGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputMujer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCondicionAlimenticia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombreActionPerformed

    private void inputPesoBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPesoBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPesoBuscadoActionPerformed

    private void inputHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHombreActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField inputAltura;
    private javax.swing.JTextField inputApellido;
    private javax.swing.JRadioButton inputCeliaco2;
    private javax.swing.JTextField inputEdad;
    private javax.swing.JRadioButton inputHombre;
    private javax.swing.JRadioButton inputIntolerante2;
    private javax.swing.JRadioButton inputMujer;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputPesoActual;
    private javax.swing.JTextField inputPesoBuscado;
    private javax.swing.JRadioButton inputVegano2;
    private javax.swing.JRadioButton inputVegetariano2;
    private javax.swing.JLabel jLAltura;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCondicionAlimenticia;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLGenero;
    private javax.swing.JLabel jLKGActual;
    private javax.swing.JLabel jLKGBuscado;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPesoActual;
    private javax.swing.JLabel jLPesoBuscado;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLcm;
    private java.awt.Label jLtituloPaciente;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
