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
                    OutputJTTipoDeComida6.setText(a.getCategoria());
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
        OutputJTTipoDeComida6 = new javax.swing.JTextField();
        jLTipoComida3 = new javax.swing.JLabel();
        jLCalorias3 = new javax.swing.JLabel();
        OutputJTCalorias6 = new javax.swing.JTextField();
        OutputCBAptoVegetariano6 = new javax.swing.JCheckBox();
        jLAptoParaVegetariano3 = new javax.swing.JLabel();
        OutputCBLacteo6 = new javax.swing.JCheckBox();
        jLLacteo3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnModificar5 = new javax.swing.JButton();

        jLTituloAgregarAlimentos1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLTituloAgregarAlimentos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloAgregarAlimentos1.setText("ELIMINAR");

        jCBSeleccionarAlimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSeleccionarAlimento1ActionPerformed(evt);
            }
        });

        jLSeleccionarAlimento1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLSeleccionarAlimento1.setText("Seleccionar Alimento: ");

        jLNombre3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLNombre3.setText("Nombre:");

        jLTipoComida3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTipoComida3.setText("Tipo de Comida:");

        jLCalorias3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLCalorias3.setText("Calorias por 100g:");

        jLAptoParaVegetariano3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLAptoParaVegetariano3.setText("Apto para Vegetarianos:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLSeleccionarAlimento1)
                    .addComponent(jLNombre3)
                    .addComponent(jLTipoComida3)
                    .addComponent(jLCalorias3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(OutputJTNombre6)
                    .addComponent(jCBSeleccionarAlimento1, 0, 193, Short.MAX_VALUE)
                    .addComponent(OutputJTTipoDeComida6)
                    .addComponent(OutputJTCalorias6))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLAptoParaVegetariano3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OutputCBAptoVegetariano6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLLacteo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OutputCBLacteo6)))
                .addContainerGap(537, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256)
                        .addComponent(btnModificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLTituloAgregarAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipoComida3)
                    .addComponent(OutputJTTipoDeComida6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OutputJTCalorias6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCalorias3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutputCBAptoVegetariano6)
                    .addComponent(jLAptoParaVegetariano3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OutputCBLacteo6)
                    .addComponent(jLLacteo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBSeleccionarAlimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSeleccionarAlimento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSeleccionarAlimento1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         OutputJTNombre6.setText("");
        OutputJTTipoDeComida6.setText("");
        OutputJTCalorias6.setText("");
        OutputCBAptoVegetariano6.setSelected(false);
        OutputCBLacteo6.setSelected(false);
        jCBSeleccionarAlimento1.setSelectedIndex(-1);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar5ActionPerformed
   
            String nombreSel = (String) jCBSeleccionarAlimento1.getSelectedItem();
            if (nombreSel == null) return;

            alimento sel = null;
            for (alimento a : alimentos) {
                if (a.getNombre().equals(nombreSel)) {
                    sel = a;
                    break;
                }
            }
            if (sel == null) return;

            int resp = JOptionPane.showConfirmDialog(this,
                "¿Eliminar “" + sel.getNombre() + "”?",
                "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (resp != JOptionPane.YES_OPTION) return;

            alimentoData ad = new alimentoData();
            boolean ok = ad.eliminarAlimento(sel.getIdAlimento());
            if (ok) {
                JOptionPane.showMessageDialog(this, "Alimento eliminado.");
                cargarCombo();

            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar.");
            }
     
    }//GEN-LAST:event_btnModificar5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox OutputCBAptoVegetariano6;
    private javax.swing.JCheckBox OutputCBLacteo6;
    private javax.swing.JTextField OutputJTCalorias6;
    private javax.swing.JTextField OutputJTNombre6;
    private javax.swing.JTextField OutputJTTipoDeComida6;
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
    // End of variables declaration//GEN-END:variables



}
