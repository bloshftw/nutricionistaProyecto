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

/**
 *
 * @author ferna
 */
public class alimentosModificar extends javax.swing.JPanel {

   
    public alimentosModificar() {
        initComponents();  
        
        
        jCBSeleccionarAlimento1.addActionListener(evt -> {
            alimento sel = (alimento) jCBSeleccionarAlimento1.getSelectedItem();
            if (sel != null) {
                OutputJTNombre.setText(sel.getNombre());
                OutputJTTipoDeComida.setText(sel.getCategoria());
                OutputJTCalorias.setText(String.valueOf(sel.getCalorias()));
                OutputCBAptoVegetariano.setSelected(sel.isAptoCeliacos());
                OutputCBLacteo.setSelected(sel.isBajoLactosa());
            }
        });
    }

    private List<alimento> alimentos;

    private void cargarCombo() {
        alimentoData ad = new alimentoData();
        alimentos = ad.listarAlimentos();
        DefaultComboBoxModel<String> m = new DefaultComboBoxModel<>();
        for(alimento a : alimentos){
           m.addElement(a.getNombre());
        }
        jCBSeleccionarAlimento1.setModel(m);

    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificar5 = new javax.swing.JButton();
        jCBSeleccionarAlimento1 = new javax.swing.JComboBox<>();
        jLSeleccionarAlimento1 = new javax.swing.JLabel();
        jLNombre3 = new javax.swing.JLabel();
        OutputJTNombre = new javax.swing.JTextField();
        OutputJTTipoDeComida = new javax.swing.JTextField();
        jLTipoComida3 = new javax.swing.JLabel();
        jLCalorias3 = new javax.swing.JLabel();
        OutputJTCalorias = new javax.swing.JTextField();
        OutputCBAptoVegetariano = new javax.swing.JCheckBox();
        jLAptoParaVegetariano3 = new javax.swing.JLabel();
        OutputCBLacteo = new javax.swing.JCheckBox();
        jLLacteo3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLTituloAgregarAlimentos1 = new javax.swing.JLabel();

        btnModificar5.setText("Modificar");
        btnModificar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar5ActionPerformed(evt);
            }
        });

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

        jLTituloAgregarAlimentos1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLTituloAgregarAlimentos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloAgregarAlimentos1.setText("MODIfICAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLSeleccionarAlimento1)
                            .addComponent(jLNombre3)
                            .addComponent(jLTipoComida3)
                            .addComponent(jLCalorias3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(OutputJTNombre)
                            .addComponent(jCBSeleccionarAlimento1, 0, 193, Short.MAX_VALUE)
                            .addComponent(OutputJTTipoDeComida)
                            .addComponent(OutputJTCalorias))
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258)
                        .addComponent(btnModificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLTituloAgregarAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLAptoParaVegetariano3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OutputCBAptoVegetariano))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLLacteo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OutputCBLacteo)))))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloAgregarAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSeleccionarAlimento1)
                    .addComponent(jCBSeleccionarAlimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre3)
                    .addComponent(OutputJTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipoComida3)
                    .addComponent(OutputJTTipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OutputJTCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCalorias3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutputCBAptoVegetariano)
                    .addComponent(jLAptoParaVegetariano3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OutputCBLacteo)
                    .addComponent(jLLacteo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBSeleccionarAlimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSeleccionarAlimento1ActionPerformed
     
    }//GEN-LAST:event_jCBSeleccionarAlimento1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar5ActionPerformed
        
         alimento sel = (alimento) jCBSeleccionarAlimento1.getSelectedItem();
         if(sel == null) return;
            String nombre  = OutputJTNombre.getText();
            String cat   = OutputJTTipoDeComida.getText();
            double cal     = Double.parseDouble(OutputJTCalorias.getText());
            boolean apto    = OutputCBAptoVegetariano.isSelected();
            boolean lacteo  = OutputCBLacteo.isSelected();
            
            alimento mod = new alimento(sel.getIdAlimento(), nombre, cat, cal, apto, lacteo);
            alimentoData ad = new alimentoData();
            
            boolean ok = ad.actualizarAlimento(mod);
            if(ok){
                JOptionPane.showMessageDialog(this, "Modificado OK");
                cargarCombo();                   // recargo lista
                jCBSeleccionarAlimento1.setSelectedItem(mod);
            }else{
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }
           
    }//GEN-LAST:event_btnModificar5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox OutputCBAptoVegetariano;
    private javax.swing.JCheckBox OutputCBLacteo;
    private javax.swing.JTextField OutputJTCalorias;
    private javax.swing.JTextField OutputJTNombre;
    private javax.swing.JTextField OutputJTTipoDeComida;
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
