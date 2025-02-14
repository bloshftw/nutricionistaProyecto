
package nutricionistaVista;

/**
 *
 * @author ferna
 */
public class alimentosVista extends javax.swing.JPanel {


    public alimentosVista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTituloAlimento = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLnombe1 = new javax.swing.JLabel();
        jLTipoDeComida = new javax.swing.JLabel();
        jLCalorias = new javax.swing.JLabel();
        jLDetalle = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLAptoParaVeg = new javax.swing.JLabel();
        jLTacc = new javax.swing.JLabel();
        jLLacteo = new javax.swing.JLabel();
        InputJTNombre = new javax.swing.JTextField();
        InputJTTipoDeComida = new javax.swing.JTextField();
        InputJTCalorias = new javax.swing.JTextField();
        InputJTDetalle = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        InputCBAptoVegetarianos = new javax.swing.JCheckBox();
        InputCBLibreDeTacc = new javax.swing.JCheckBox();
        InputCBLacteo = new javax.swing.JCheckBox();
        jLTituloAgregarAlimentos = new javax.swing.JLabel();
        jP2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLTituloAgregarAlimentos1 = new javax.swing.JLabel();
        jCBSeleccionarAlimento = new javax.swing.JComboBox<>();
        jLSeleccionarAlimento = new javax.swing.JLabel();
        jLNombre2 = new javax.swing.JLabel();
        OutputJTNombre5 = new javax.swing.JTextField();
        OutputJTTipoDeComida5 = new javax.swing.JTextField();
        jLTipoComida2 = new javax.swing.JLabel();
        jLCalorias2 = new javax.swing.JLabel();
        OutputJTCalorias5 = new javax.swing.JTextField();
        OutputJTDetalle5 = new javax.swing.JTextField();
        jLDetalle2 = new javax.swing.JLabel();
        jLAptoParaVegetariano2 = new javax.swing.JLabel();
        OutputCBAptoVegetariano5 = new javax.swing.JCheckBox();
        OutputCBLibreDeTacc5 = new javax.swing.JCheckBox();
        jLTacc2 = new javax.swing.JLabel();
        OutputCBLacteo5 = new javax.swing.JCheckBox();
        jLLacteo2 = new javax.swing.JLabel();
        btnModificar5 = new javax.swing.JButton();
        btnEliminar5 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLTituloAlimento.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLTituloAlimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloAlimento.setText("MENU DE ALIMENTOS");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLnombe1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLnombe1.setText("Nombre:");

        jLTipoDeComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTipoDeComida.setText("Tipo de Comida:");

        jLCalorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLCalorias.setText("Calorias por 100g:");

        jLDetalle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDetalle.setText("Detalle:");

        jLAptoParaVeg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLAptoParaVeg.setText("Apto para Vegetarianos:");

        jLTacc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTacc.setText("Libre de TACC:");

        jLLacteo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLLacteo.setText("Lacteo:");

        jLabel11.setText("Kcal");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        InputCBAptoVegetarianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCBAptoVegetarianosActionPerformed(evt);
            }
        });

        jLTituloAgregarAlimentos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLTituloAgregarAlimentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloAgregarAlimentos.setText("AGREGAR ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLLacteo)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputCBLacteo))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLTacc)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputCBLibreDeTacc))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLAptoParaVeg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(InputCBAptoVegetarianos))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLnombe1)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputJTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLTipoDeComida)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputJTTipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLCalorias)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputJTCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLDetalle)
                                .addGap(18, 18, 18)
                                .addComponent(InputJTDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLTituloAgregarAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addGap(97, 97, 97))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloAgregarAlimentos)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLnombe1)
                            .addComponent(InputJTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTipoDeComida)
                            .addComponent(InputJTTipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCalorias)
                            .addComponent(InputJTCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDetalle)
                            .addComponent(InputJTDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputCBAptoVegetarianos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLAptoParaVeg, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTacc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InputCBLibreDeTacc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLLacteo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InputCBLacteo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnAgregar))
                        .addContainerGap())))
        );

        jP2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLTituloAgregarAlimentos1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLTituloAgregarAlimentos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloAgregarAlimentos1.setText("MODICICAR/ELIMINAR");

        jCBSeleccionarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSeleccionarAlimentoActionPerformed(evt);
            }
        });

        jLSeleccionarAlimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLSeleccionarAlimento.setText("Seleccionar Alimento: ");

        jLNombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLNombre2.setText("Nombre:");

        jLTipoComida2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTipoComida2.setText("Tipo de Comida:");

        jLCalorias2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLCalorias2.setText("Calorias por 100g:");

        jLDetalle2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDetalle2.setText("Detalle:");

        jLAptoParaVegetariano2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLAptoParaVegetariano2.setText("Apto para Vegetarianos:");

        jLTacc2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTacc2.setText("Libre de TACC:");

        jLLacteo2.setText("Lacteo:");

        btnModificar5.setText("Modificar");

        btnEliminar5.setText("Eliminar");

        javax.swing.GroupLayout jP2Layout = new javax.swing.GroupLayout(jP2);
        jP2.setLayout(jP2Layout);
        jP2Layout.setHorizontalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnModificar5)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jP2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLTituloAgregarAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jP2Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jP2Layout.createSequentialGroup()
                            .addComponent(jLNombre2)
                            .addGap(18, 18, 18)
                            .addComponent(OutputJTNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jP2Layout.createSequentialGroup()
                            .addComponent(jLSeleccionarAlimento)
                            .addGap(18, 18, 18)
                            .addComponent(jCBSeleccionarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jP2Layout.createSequentialGroup()
                            .addComponent(jLTipoComida2)
                            .addGap(18, 18, 18)
                            .addComponent(OutputJTTipoDeComida5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jP2Layout.createSequentialGroup()
                            .addComponent(jLCalorias2)
                            .addGap(18, 18, 18)
                            .addComponent(OutputJTCalorias5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jP2Layout.createSequentialGroup()
                            .addComponent(jLDetalle2)
                            .addGap(18, 18, 18)
                            .addComponent(OutputJTDetalle5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jP2Layout.createSequentialGroup()
                            .addComponent(jLTacc2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(OutputCBLibreDeTacc5))
                        .addGroup(jP2Layout.createSequentialGroup()
                            .addComponent(jLAptoParaVegetariano2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(OutputCBAptoVegetariano5))
                        .addGroup(jP2Layout.createSequentialGroup()
                            .addComponent(jLLacteo2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(OutputCBLacteo5)))
                    .addContainerGap(10, Short.MAX_VALUE)))
        );
        jP2Layout.setVerticalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloAgregarAlimentos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP2Layout.createSequentialGroup()
                        .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar5)
                            .addComponent(btnEliminar5))
                        .addContainerGap())))
            .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jP2Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLSeleccionarAlimento)
                        .addComponent(jCBSeleccionarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLNombre2)
                        .addComponent(OutputJTNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(OutputJTTipoDeComida5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLTipoComida2))
                    .addGap(18, 18, 18)
                    .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCalorias2)
                        .addComponent(OutputJTCalorias5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLDetalle2)
                        .addComponent(OutputJTDetalle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLAptoParaVegetariano2)
                        .addComponent(OutputCBAptoVegetariano5))
                    .addGap(18, 18, 18)
                    .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLTacc2)
                        .addComponent(OutputCBLibreDeTacc5))
                    .addGap(18, 18, 18)
                    .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(OutputCBLacteo5)
                        .addComponent(jLLacteo2))
                    .addContainerGap(57, Short.MAX_VALUE)))
        );

        btnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTituloAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InputCBAptoVegetarianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCBAptoVegetarianosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCBAptoVegetarianosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jCBSeleccionarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSeleccionarAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSeleccionarAlimentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox InputCBAptoVegetarianos;
    private javax.swing.JCheckBox InputCBLacteo;
    private javax.swing.JCheckBox InputCBLibreDeTacc;
    private javax.swing.JTextField InputJTCalorias;
    private javax.swing.JTextField InputJTDetalle;
    private javax.swing.JTextField InputJTNombre;
    private javax.swing.JTextField InputJTTipoDeComida;
    private javax.swing.JCheckBox OutputCBAptoVegetariano;
    private javax.swing.JCheckBox OutputCBAptoVegetariano1;
    private javax.swing.JCheckBox OutputCBAptoVegetariano2;
    private javax.swing.JCheckBox OutputCBAptoVegetariano3;
    private javax.swing.JCheckBox OutputCBAptoVegetariano4;
    private javax.swing.JCheckBox OutputCBAptoVegetariano5;
    private javax.swing.JCheckBox OutputCBLacteo;
    private javax.swing.JCheckBox OutputCBLacteo1;
    private javax.swing.JCheckBox OutputCBLacteo2;
    private javax.swing.JCheckBox OutputCBLacteo3;
    private javax.swing.JCheckBox OutputCBLacteo4;
    private javax.swing.JCheckBox OutputCBLacteo5;
    private javax.swing.JCheckBox OutputCBLibreDeTacc;
    private javax.swing.JCheckBox OutputCBLibreDeTacc1;
    private javax.swing.JCheckBox OutputCBLibreDeTacc2;
    private javax.swing.JCheckBox OutputCBLibreDeTacc3;
    private javax.swing.JCheckBox OutputCBLibreDeTacc4;
    private javax.swing.JCheckBox OutputCBLibreDeTacc5;
    private javax.swing.JTextField OutputJTCalorias;
    private javax.swing.JTextField OutputJTCalorias1;
    private javax.swing.JTextField OutputJTCalorias2;
    private javax.swing.JTextField OutputJTCalorias3;
    private javax.swing.JTextField OutputJTCalorias4;
    private javax.swing.JTextField OutputJTCalorias5;
    private javax.swing.JTextField OutputJTDetalle;
    private javax.swing.JTextField OutputJTDetalle1;
    private javax.swing.JTextField OutputJTDetalle2;
    private javax.swing.JTextField OutputJTDetalle3;
    private javax.swing.JTextField OutputJTDetalle4;
    private javax.swing.JTextField OutputJTDetalle5;
    private javax.swing.JTextField OutputJTNombre;
    private javax.swing.JTextField OutputJTNombre1;
    private javax.swing.JTextField OutputJTNombre2;
    private javax.swing.JTextField OutputJTNombre3;
    private javax.swing.JTextField OutputJTNombre4;
    private javax.swing.JTextField OutputJTNombre5;
    private javax.swing.JTextField OutputJTTipoDeComida;
    private javax.swing.JTextField OutputJTTipoDeComida1;
    private javax.swing.JTextField OutputJTTipoDeComida2;
    private javax.swing.JTextField OutputJTTipoDeComida3;
    private javax.swing.JTextField OutputJTTipoDeComida4;
    private javax.swing.JTextField OutputJTTipoDeComida5;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnEliminar3;
    private javax.swing.JButton btnEliminar4;
    private javax.swing.JButton btnEliminar5;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnModificar2;
    private javax.swing.JButton btnModificar3;
    private javax.swing.JButton btnModificar4;
    private javax.swing.JButton btnModificar5;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jCBSeleccionarAlimento;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLAptoParaVeg;
    private javax.swing.JLabel jLAptoParaVegetariano2;
    private javax.swing.JLabel jLCalorias;
    private javax.swing.JLabel jLCalorias2;
    private javax.swing.JLabel jLDetalle;
    private javax.swing.JLabel jLDetalle2;
    private javax.swing.JLabel jLLacteo;
    private javax.swing.JLabel jLLacteo2;
    private javax.swing.JLabel jLNombre2;
    private javax.swing.JLabel jLSeleccionarAlimento;
    private javax.swing.JLabel jLTacc;
    private javax.swing.JLabel jLTacc2;
    private javax.swing.JLabel jLTipoComida2;
    private javax.swing.JLabel jLTipoDeComida;
    private javax.swing.JLabel jLTituloAgregarAlimentos;
    private javax.swing.JLabel jLTituloAgregarAlimentos1;
    private javax.swing.JLabel jLTituloAlimento;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLnombe1;
    private javax.swing.JPanel jP2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
