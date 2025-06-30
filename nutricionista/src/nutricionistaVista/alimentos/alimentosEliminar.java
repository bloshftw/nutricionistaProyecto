package nutricionistaVista.alimentos;

import conexion.alimentoData;
import entidades.alimento;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class alimentosEliminar extends javax.swing.JPanel {

   private List<alimento> alimentos;
    public alimentosEliminar() {
        initComponents();
        cargarCombo();
        
        jCBSeleccionarAlimento1.addActionListener(evt -> {
            String nombreSel = (String) jCBSeleccionarAlimento1.getSelectedItem();
            if (nombreSel == null) return;
            for(alimento a : alimentos){
                if (a.getNombre().equals(nombreSel)) {
                    OutputJTNombre6.setText(a.getNombre());
                     //Botones
                    
                    //Seteamos
                    
                    rbDesayuno.setSelected(false);
                    rbAlmuerzo.setSelected(false);
                    rbMerienda.setSelected(false);
                    rbCena.setSelected(false);
                    rbColacion.setSelected(false);
                    
                    if (a.getCategoria().equalsIgnoreCase("d")){
                    rbDesayuno.setSelected(true);
                    } else if (a.getCategoria().equalsIgnoreCase("a")){
                    rbAlmuerzo.setSelected(true);
                    } else if (a.getCategoria().equalsIgnoreCase("m")){
                    rbMerienda.setSelected(true);
                    } else if (a.getCategoria().equalsIgnoreCase("c")){
                    rbCena.setSelected(true);
                    } else if (a.getCategoria().equalsIgnoreCase("co"))
                        rbColacion.setSelected(true);
                    OutputJTCalorias6.setText(String.valueOf(a.getCalorias()));
                    OutputCBAptoVegetariano6.setSelected(a.isAptoCeliacos());
                    OutputCBLacteo6.setSelected(a.isBajoLactosa());
                    break;
                }
            }
        });
    }
    private void cargarCombo() {
        alimentoData ad = new alimentoData();
        alimentos = ad.listarAlimentos();
        DefaultComboBoxModel<String> m = new DefaultComboBoxModel<>();
        for (alimento a : alimentos) {
            m.addElement(a.getNombre());
        }
        jCBSeleccionarAlimento1.setModel(m);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTituloAgregarAlimentos1 = new javax.swing.JLabel();
        jCBSeleccionarAlimento1 = new javax.swing.JComboBox<>();
        jLSeleccionarAlimento1 = new javax.swing.JLabel();
        jLNombre3 = new javax.swing.JLabel();
        OutputJTNombre6 = new javax.swing.JTextField();
        jLTipoComida3 = new javax.swing.JLabel();
        jLCalorias3 = new javax.swing.JLabel();
        OutputJTCalorias6 = new javax.swing.JTextField();
        OutputCBAptoVegetariano6 = new javax.swing.JCheckBox();
        jLAptoParaVegetariano3 = new javax.swing.JLabel();
        OutputCBLacteo6 = new javax.swing.JCheckBox();
        jLLacteo3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnModificar5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbDesayuno = new javax.swing.JCheckBox();
        rbAlmuerzo = new javax.swing.JCheckBox();
        rbMerienda = new javax.swing.JCheckBox();
        rbCena = new javax.swing.JCheckBox();
        rbColacion = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 255, 255));

        jLTituloAgregarAlimentos1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLTituloAgregarAlimentos1.setForeground(new java.awt.Color(0, 0, 0));
        jLTituloAgregarAlimentos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloAgregarAlimentos1.setText("ELIMINAR");

        jCBSeleccionarAlimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSeleccionarAlimento1ActionPerformed(evt);
            }
        });

        jLSeleccionarAlimento1.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLSeleccionarAlimento1.setForeground(new java.awt.Color(0, 0, 0));
        jLSeleccionarAlimento1.setText("Seleccionar Alimento: ");

        jLNombre3.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLNombre3.setForeground(new java.awt.Color(0, 0, 0));
        jLNombre3.setText("Nombre:");

        jLTipoComida3.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLTipoComida3.setForeground(new java.awt.Color(0, 0, 0));
        jLTipoComida3.setText("Tipo de Comida:");

        jLCalorias3.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLCalorias3.setForeground(new java.awt.Color(0, 0, 0));
        jLCalorias3.setText("Calorias por 100g:");

        jLAptoParaVegetariano3.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLAptoParaVegetariano3.setForeground(new java.awt.Color(0, 0, 0));
        jLAptoParaVegetariano3.setText("Apto para Vegetarianos:");

        jLLacteo3.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLLacteo3.setForeground(new java.awt.Color(0, 0, 0));
        jLLacteo3.setText("Lacteo:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar5.setText("ELIMINAR");
        btnModificar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar5ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbDesayuno.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbDesayuno.setForeground(new java.awt.Color(0, 0, 0));
        rbDesayuno.setText("Desayuno");

        rbAlmuerzo.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbAlmuerzo.setForeground(new java.awt.Color(0, 0, 0));
        rbAlmuerzo.setText("Almuerzo");

        rbMerienda.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbMerienda.setForeground(new java.awt.Color(0, 0, 0));
        rbMerienda.setText("Merienda");

        rbCena.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbCena.setForeground(new java.awt.Color(0, 0, 0));
        rbCena.setText("Cena");

        rbColacion.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbColacion.setForeground(new java.awt.Color(0, 0, 0));
        rbColacion.setText("Colacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAlmuerzo)
                    .addComponent(rbMerienda)
                    .addComponent(rbDesayuno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCena)
                    .addComponent(rbColacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbDesayuno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlmuerzo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(rbMerienda))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbCena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbColacion)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTituloAgregarAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnModificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLSeleccionarAlimento1)
                            .addComponent(jLNombre3)
                            .addComponent(jLTipoComida3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(OutputJTNombre6)
                                .addComponent(jCBSeleccionarAlimento1, 0, 193, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLCalorias3)
                            .addComponent(jLAptoParaVegetariano3)
                            .addComponent(jLLacteo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OutputCBLacteo6)
                            .addComponent(OutputCBAptoVegetariano6)
                            .addComponent(OutputJTCalorias6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTituloAgregarAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSeleccionarAlimento1)
                    .addComponent(jCBSeleccionarAlimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre3)
                    .addComponent(OutputJTNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLTipoComida3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCalorias3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OutputJTCalorias6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutputCBAptoVegetariano6)
                    .addComponent(jLAptoParaVegetariano3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutputCBLacteo6)
                    .addComponent(jLLacteo3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBSeleccionarAlimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSeleccionarAlimento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSeleccionarAlimento1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        OutputJTNombre6.setText("");
        rbDesayuno.setSelected(false);
        rbAlmuerzo.setSelected(false);
        rbMerienda.setSelected(false);
        rbCena.setSelected(false);
        rbColacion.setSelected(false);
        OutputJTCalorias6.setText("");
        OutputCBAptoVegetariano6.setSelected(false);
        OutputCBLacteo6.setSelected(false);
        jCBSeleccionarAlimento1.setSelectedIndex(-1);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar5ActionPerformed
        String nombreSel = (String) jCBSeleccionarAlimento1.getSelectedItem();

        if (nombreSel == null || nombreSel.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alimento para eliminar.");
            return;
        }
        alimento sel = null;
        for (alimento a : alimentos) {
            if (a.getNombre().equals(nombreSel)) {
                sel = a;
                break;
            }
        }
        if (sel == null) {
            JOptionPane.showMessageDialog(this, "El alimento seleccionado no se encuentra en la lista.");
            return;
        }
        int resp = JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro que desea eliminar \"" + sel.getNombre() + "\"?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION
        );
        if (resp != JOptionPane.YES_OPTION) {
            return;
        }
        alimentoData ad = new alimentoData();
        boolean eliminado = ad.eliminarAlimento(sel.getIdAlimento());

        if (eliminado) {
            JOptionPane.showMessageDialog(this, "Alimento eliminado con éxito.");
            cargarCombo(); 
            btnLimpiarActionPerformed(null); 
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el alimento. Intente nuevamente.");
        }
    
    }//GEN-LAST:event_btnModificar5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox OutputCBAptoVegetariano6;
    private javax.swing.JCheckBox OutputCBLacteo6;
    private javax.swing.JTextField OutputJTCalorias6;
    private javax.swing.JTextField OutputJTNombre6;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar5;
    private javax.swing.JComboBox<String> jCBSeleccionarAlimento1;
    private javax.swing.JLabel jLAptoParaVegetariano3;
    private javax.swing.JLabel jLCalorias3;
    private javax.swing.JLabel jLLacteo3;
    private javax.swing.JLabel jLNombre3;
    private javax.swing.JLabel jLSeleccionarAlimento1;
    private javax.swing.JLabel jLTipoComida3;
    private javax.swing.JLabel jLTituloAgregarAlimentos1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox rbAlmuerzo;
    private javax.swing.JCheckBox rbCena;
    private javax.swing.JCheckBox rbColacion;
    private javax.swing.JCheckBox rbDesayuno;
    private javax.swing.JCheckBox rbMerienda;
    // End of variables declaration//GEN-END:variables



}
