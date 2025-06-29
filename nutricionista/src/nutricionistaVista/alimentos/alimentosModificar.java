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
        cargarCombo();
        
        
           jCBSeleccionarAlimento2.addActionListener(evt -> {
            String nombreSel = (String) jCBSeleccionarAlimento2.getSelectedItem();
            if (nombreSel == null) return;
            for (alimento a : alimentos) {
                if (a.getNombre().equals(nombreSel)) {
                    OutputJTNombre.setText(a.getNombre());
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
                    OutputJTCalorias.setText(String.valueOf(a.getCalorias()));
                    OutputCBAptoVegetariano.setSelected(a.isAptoCeliacos());
                    OutputCBLacteo.setSelected(a.isBajoLactosa());
                    break;
                }
            }
        });
    }

    private List<alimento> alimentos;

    private void cargarCombo() {
      alimentoData ad = new alimentoData();
        alimentos = ad.listarAlimentos();
       DefaultComboBoxModel<String> m = new DefaultComboBoxModel<>();
        for (alimento a : alimentos) {
            m.addElement(a.getNombre());
        }
        jCBSeleccionarAlimento2.setModel(m); 

    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificar5 = new javax.swing.JButton();
        jLSeleccionarAlimento1 = new javax.swing.JLabel();
        jLNombre3 = new javax.swing.JLabel();
        OutputJTNombre = new javax.swing.JTextField();
        jLTipoComida3 = new javax.swing.JLabel();
        jLCalorias3 = new javax.swing.JLabel();
        OutputJTCalorias = new javax.swing.JTextField();
        OutputCBAptoVegetariano = new javax.swing.JCheckBox();
        jLAptoParaVegetariano3 = new javax.swing.JLabel();
        OutputCBLacteo = new javax.swing.JCheckBox();
        jLLacteo3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLTituloAgregarAlimentos1 = new javax.swing.JLabel();
        jCBSeleccionarAlimento2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        rbDesayuno = new javax.swing.JCheckBox();
        rbAlmuerzo = new javax.swing.JCheckBox();
        rbMerienda = new javax.swing.JCheckBox();
        rbCena = new javax.swing.JCheckBox();
        rbColacion = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 255, 255));

        btnModificar5.setText("Modificar");
        btnModificar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar5ActionPerformed(evt);
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

        jLTituloAgregarAlimentos1.setBackground(new java.awt.Color(0, 0, 0));
        jLTituloAgregarAlimentos1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLTituloAgregarAlimentos1.setForeground(new java.awt.Color(0, 0, 0));
        jLTituloAgregarAlimentos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloAgregarAlimentos1.setText("MODIfICAR");

        jCBSeleccionarAlimento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSeleccionarAlimento2ActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLSeleccionarAlimento1)
                            .addComponent(jLNombre3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OutputJTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBSeleccionarAlimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnModificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLTituloAgregarAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLLacteo3)
                            .addComponent(jLAptoParaVegetariano3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLTipoComida3)
                                .addComponent(jLCalorias3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OutputCBAptoVegetariano)
                            .addComponent(OutputCBLacteo)
                            .addComponent(OutputJTCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloAgregarAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSeleccionarAlimento1)
                    .addComponent(jCBSeleccionarAlimento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre3)
                    .addComponent(OutputJTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLTipoComida3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCalorias3)
                    .addComponent(OutputJTCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLAptoParaVegetariano3)
                    .addComponent(OutputCBAptoVegetariano))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutputCBLacteo)
                    .addComponent(jLLacteo3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        OutputJTNombre.setText("");
        //Botones
        rbDesayuno.setSelected(false);
        rbAlmuerzo.setSelected(false);
        rbMerienda.setSelected(false);
        rbCena.setSelected(false);
        rbColacion.setSelected(false);
        //Botones
        OutputJTCalorias.setText("");
        OutputCBAptoVegetariano.setSelected(false);
        OutputCBLacteo.setSelected(false);
        OutputJTNombre.requestFocusInWindow();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar5ActionPerformed
        
        String nombreSel = (String) jCBSeleccionarAlimento2.getSelectedItem();
        if (nombreSel == null) return;

        alimento sel = null;
        for (alimento a : alimentos) {
            if (a.getNombre().equals(nombreSel)) {
                sel = a;
                break;
            }
        }
        if (sel == null) return;

        String nombre  = OutputJTNombre.getText();
        String cat = "";
        //Botones
        if (rbDesayuno.isSelected()){
        cat = "D";
        } else if (rbAlmuerzo.isSelected()){
        cat = "A";
        } else if (rbMerienda.isSelected()){
        cat = "M";
        } else if (rbCena.isSelected()){
        cat = "C";
        } else if (rbColacion.isSelected()){
        cat = "CO";
        }
        
        double cal     = Double.parseDouble(OutputJTCalorias.getText());
        boolean apto   = OutputCBAptoVegetariano.isSelected();
        boolean lacteo = OutputCBLacteo.isSelected();

        alimento mod = new alimento(sel.getIdAlimento(), nombre, cat, cal, apto, lacteo);
        alimentoData ad = new alimentoData();

        boolean ok = ad.actualizarAlimento(mod);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Modificado OK");
            cargarCombo();                             
            jCBSeleccionarAlimento2.setSelectedItem(nombre);
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar");
        }

    }//GEN-LAST:event_btnModificar5ActionPerformed

    private void jCBSeleccionarAlimento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSeleccionarAlimento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSeleccionarAlimento2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox OutputCBAptoVegetariano;
    private javax.swing.JCheckBox OutputCBLacteo;
    private javax.swing.JTextField OutputJTCalorias;
    private javax.swing.JTextField OutputJTNombre;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar5;
    private javax.swing.JComboBox<String> jCBSeleccionarAlimento2;
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
