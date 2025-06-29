
package nutricionistaVista.dietas;

import conexion.alimentoData;
import entidades.alimento;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class dietasAutomatica extends javax.swing.JPanel {

    /**
     * Creates new form dietasConsultarDieta
     */
    public dietasAutomatica() {
        initComponents();
       alimentoData = new alimentoData();
        cargarAlimentos();
        agregarListenersAComboBox();
        agregarListenersATextFields();
    }
    
    private List<alimento> alimentos;
    private alimentoData alimentoData; 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDietasConsultarDieta = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox2Desayuno1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jTextField2Desayuno1 = new javax.swing.JTextField();
        jComboBox2Desayuno3 = new javax.swing.JComboBox<>();
        jTextField2Desayuno2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2Desayuno2 = new javax.swing.JComboBox<>();
        jTextField2Desayuno3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jComboBox2Almuerzo1 = new javax.swing.JComboBox<>();
        jTextField2Almuerzo1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2Almuerzo2 = new javax.swing.JComboBox<>();
        jTextField2Almuerzo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBox2Almuerzo3 = new javax.swing.JComboBox<>();
        jTextField2Almuerzo3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jComboBox2Merienda2 = new javax.swing.JComboBox<>();
        jTextField2Merienda2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jComboBox2Merienda1 = new javax.swing.JComboBox<>();
        jTextField2Merienda1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jComboBox2Merienda3 = new javax.swing.JComboBox<>();
        jTextField2Merienda3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jComboBox2Cena1 = new javax.swing.JComboBox<>();
        jTextField2Cena1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jComboBox2Cena2 = new javax.swing.JComboBox<>();
        jComboBox2Cena3 = new javax.swing.JComboBox<>();
        jTextField2Cena2 = new javax.swing.JTextField();
        jTextField2Cena3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jComboBox2Colacion = new javax.swing.JComboBox<>();
        jTextField2Colaciones = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        Colacion = new javax.swing.JLabel();
        jBLimpiar2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldCaloriasDeLaDieta2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();

        jPanelDietasConsultarDieta.setBackground(new java.awt.Color(204, 255, 255));
        jPanelDietasConsultarDieta.setForeground(new java.awt.Color(153, 255, 255));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox2Desayuno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2Desayuno1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Porciones");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Porciones");

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Porciones");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2Desayuno3, 0, 114, Short.MAX_VALUE)
                    .addComponent(jComboBox2Desayuno1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2Desayuno2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField2Desayuno1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField2Desayuno2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField2Desayuno3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Desayuno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Desayuno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2Desayuno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox2Desayuno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Desayuno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Desayuno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Desayuno");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Almuerzo");

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Porciones");

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Porciones");

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Porciones");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBox2Almuerzo3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2Almuerzo3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBox2Almuerzo2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2Almuerzo2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBox2Almuerzo1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2Almuerzo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Almuerzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Almuerzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Almuerzo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Almuerzo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Almuerzo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Almuerzo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(16, 16, 16))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Merienda");

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Porciones");

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Porciones");

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Porciones");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2Merienda2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2Merienda1, 0, 114, Short.MAX_VALUE)
                    .addComponent(jComboBox2Merienda3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextField2Merienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextField2Merienda2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextField2Merienda3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)))
                .addGap(35, 35, 35))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jComboBox2Merienda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Merienda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Merienda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Merienda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Merienda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Merienda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(16, 16, 16))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Cena");

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Porciones");

        jComboBox2Cena2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2Cena2ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Porciones");

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Porciones");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2Cena3, 0, 114, Short.MAX_VALUE)
                    .addComponent(jComboBox2Cena2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2Cena1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField2Cena1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField2Cena3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField2Cena2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)))
                .addGap(37, 37, 37))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Cena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Cena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Cena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Cena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Cena3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Cena3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(21, 21, 21))
        );

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Porciones");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2Colacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2Colaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2Colacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField2Colaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Colacion.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        Colacion.setForeground(new java.awt.Color(0, 0, 0));
        Colacion.setText("Colacion");

        jBLimpiar2.setText("Limpiar");
        jBLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar2ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar dieta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Calorias de la dieta");

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Kcal");

        javax.swing.GroupLayout jPanelDietasConsultarDietaLayout = new javax.swing.GroupLayout(jPanelDietasConsultarDieta);
        jPanelDietasConsultarDieta.setLayout(jPanelDietasConsultarDietaLayout);
        jPanelDietasConsultarDietaLayout.setHorizontalGroup(
            jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDietasConsultarDietaLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDietasConsultarDietaLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(134, 134, 134))
                    .addGroup(jPanelDietasConsultarDietaLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDietasConsultarDietaLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDietasConsultarDietaLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(148, 148, 148)))
                .addGap(241, 241, 241))
            .addGroup(jPanelDietasConsultarDietaLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(Colacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelDietasConsultarDietaLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDietasConsultarDietaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldCaloriasDeLaDieta2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31))
                    .addComponent(jLabel30))
                .addGap(107, 107, 107)
                .addComponent(jBLimpiar2)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelDietasConsultarDietaLayout.setVerticalGroup(
            jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDietasConsultarDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDietasConsultarDietaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Colacion)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDietasConsultarDietaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelDietasConsultarDietaLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCaloriasDeLaDieta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31)))
                            .addGroup(jPanelDietasConsultarDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBLimpiar2)
                                .addComponent(jButton2)))
                        .addGap(57, 57, 57))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDietasConsultarDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDietasConsultarDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2Desayuno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2Desayuno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2Desayuno1ActionPerformed

    private void jComboBox2Cena2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2Cena2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2Cena2ActionPerformed

    private void jBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar2ActionPerformed
    limpiarFormularioSinMensaje();
    }//GEN-LAST:event_jBLimpiar2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    generarDietaAutomatica();
    }//GEN-LAST:event_jButton2ActionPerformed
//metodos y funciones
    
    private void generarDietaAutomatica() {
         try {
            if (alimentos == null || alimentos.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay alimentos disponibles en la base de datos");
                return;
            }

            // Limpiar formulario antes de generar
            limpiarFormularioSinMensaje();

            Random random = new Random();

            // Generar TODOS los alimentos para cada comida (sin campos vacíos)
            generarComidaCompletaAleatoria(random, "D", 
                new JComboBox[]{jComboBox2Desayuno1, jComboBox2Desayuno2, jComboBox2Desayuno3},
                new JTextField[]{jTextField2Desayuno1, jTextField2Desayuno2, jTextField2Desayuno3});

            generarComidaCompletaAleatoria(random, "A", 
                new JComboBox[]{jComboBox2Almuerzo1, jComboBox2Almuerzo2, jComboBox2Almuerzo3},
                new JTextField[]{jTextField2Almuerzo1, jTextField2Almuerzo2, jTextField2Almuerzo3});

            generarComidaCompletaAleatoria(random, "M", 
                new JComboBox[]{jComboBox2Merienda1, jComboBox2Merienda2, jComboBox2Merienda3},
                new JTextField[]{jTextField2Merienda1, jTextField2Merienda2, jTextField2Merienda3});

            generarComidaCompletaAleatoria(random, "C", 
                new JComboBox[]{jComboBox2Cena1, jComboBox2Cena2, jComboBox2Cena3},
                new JTextField[]{jTextField2Cena1, jTextField2Cena2, jTextField2Cena3});

            // Generar colación
            generarColacionAleatoria(random);

            // Calcular calorías totales automáticamente
            calcularCaloriasTotales();

            JOptionPane.showMessageDialog(this, "Dieta automática generada correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar la dieta automática: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void generarComidaCompletaAleatoria(Random random, String categoria,JComboBox<String>[] combos, JTextField[] textFields) {
        
        List<alimento> alimentosDeCategoria = new ArrayList<>();
        for (alimento a : alimentos) {
            if (categoria.equals(a.getCategoria())) {
                alimentosDeCategoria.add(a);
            }
        }

        if (alimentosDeCategoria.isEmpty()) {
            System.out.println("No hay alimentos disponibles para la categoría: " + categoria);
            return;
        }

   
        for (int i = 0; i < combos.length; i++) {
       
            int indiceAleatorio = random.nextInt(alimentosDeCategoria.size());
            alimento alimentoSeleccionado = alimentosDeCategoria.get(indiceAleatorio);
            combos[i].setSelectedItem(alimentoSeleccionado.getNombre());

            int porcionesAleatorias = random.nextInt(10) + 1;
            textFields[i].setText(String.valueOf(porcionesAleatorias));
        }
    }

    private void generarColacionAleatoria(Random random) {
        List<alimento> alimentosColacion = new ArrayList<>();
        for (alimento a : alimentos) {
            if ("CO".equals(a.getCategoria())) {
                alimentosColacion.add(a);
            }
        }

        if (!alimentosColacion.isEmpty()) {
            int indiceAleatorio = random.nextInt(alimentosColacion.size());
            alimento alimentoSeleccionado = alimentosColacion.get(indiceAleatorio);

            jComboBox2Colacion.setSelectedItem(alimentoSeleccionado.getNombre());

            int porcionesAleatorias = random.nextInt(10) + 1;
            jTextField2Colaciones.setText(String.valueOf(porcionesAleatorias));
        }
    }
    
   private void cargarAlimentos() {
        try {
            alimentos = alimentoData.listarAlimentos();
            
            if (alimentos == null || alimentos.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay alimentos registrados en la base de datos");
                return;
            }
            
            limpiarComboBoxesAlimentos();
            
            for (alimento a : alimentos) {
                String nombre = a.getNombre();
                String categoria = a.getCategoria();
                
                switch (categoria) {
                    case "D":
                        jComboBox2Desayuno1.addItem(nombre);
                        jComboBox2Desayuno2.addItem(nombre);
                        jComboBox2Desayuno3.addItem(nombre);
                        break;
                    case "A":
                        jComboBox2Almuerzo1.addItem(nombre);
                        jComboBox2Almuerzo2.addItem(nombre);
                        jComboBox2Almuerzo3.addItem(nombre);
                        break;
                    case "M":
                        jComboBox2Merienda1.addItem(nombre);
                        jComboBox2Merienda2.addItem(nombre);
                        jComboBox2Merienda3.addItem(nombre);
                        break;
                    case "C":
                        jComboBox2Cena1.addItem(nombre);
                        jComboBox2Cena2.addItem(nombre);
                        jComboBox2Cena3.addItem(nombre);
                        break;
                    case "CO":
                        jComboBox2Colacion.addItem(nombre);
                        break;
                }
            }
            
            System.out.println("Alimentos cargados correctamente: " + alimentos.size());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar alimentos: " + e.getMessage());
            e.printStackTrace();
        }
    }
   
    private void calcularCaloriasTotales() {
         double totalCalorias = 0;

         // Sumar calorías de cada comida
         totalCalorias += calcularCaloriasPorComida(jComboBox2Desayuno1, jTextField2Desayuno1);
         totalCalorias += calcularCaloriasPorComida(jComboBox2Desayuno2, jTextField2Desayuno2);
         totalCalorias += calcularCaloriasPorComida(jComboBox2Desayuno3, jTextField2Desayuno3);

         totalCalorias += calcularCaloriasPorComida(jComboBox2Almuerzo1, jTextField2Almuerzo1);
         totalCalorias += calcularCaloriasPorComida(jComboBox2Almuerzo2, jTextField2Almuerzo2);
         totalCalorias += calcularCaloriasPorComida(jComboBox2Almuerzo3, jTextField2Almuerzo3);

         totalCalorias += calcularCaloriasPorComida(jComboBox2Merienda1, jTextField2Merienda1);
         totalCalorias += calcularCaloriasPorComida(jComboBox2Merienda2, jTextField2Merienda2);
         totalCalorias += calcularCaloriasPorComida(jComboBox2Merienda3, jTextField2Merienda3);

         totalCalorias += calcularCaloriasPorComida(jComboBox2Cena1, jTextField2Cena1);
         totalCalorias += calcularCaloriasPorComida(jComboBox2Cena2, jTextField2Cena2);
         totalCalorias += calcularCaloriasPorComida(jComboBox2Cena3, jTextField2Cena3);

         totalCalorias += calcularCaloriasPorComida(jComboBox2Colacion, jTextField2Colaciones);

         // Mostrar el total en el campo de calorías (ajusta el nombre del campo)
         jTextFieldCaloriasDeLaDieta2.setText(String.format("%.2f", totalCalorias));
     }
    private double calcularCaloriasPorComida(JComboBox<String> comboBox, JTextField tfPorciones) {
        try {
            String nombreAlimento = (String) comboBox.getSelectedItem();

            if (nombreAlimento != null && !tfPorciones.getText().trim().isEmpty()) {
                int porciones = Integer.parseInt(tfPorciones.getText().trim());

                // Buscar el alimento en la lista para obtener sus calorías
                for (alimento a : alimentos) {
                    if (a.getNombre().equals(nombreAlimento)) {
                        return a.getCalorias() * porciones;
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Porciones inválidas en " + comboBox.getName() + ": " + tfPorciones.getText());
        }
        return 0;
    }
    // LISTENERS PARA CÁLCULO AUTOMÁTICO DE CALORÍAS
    private void agregarListenersAComboBox() {
        jComboBox2Desayuno1.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Desayuno2.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Desayuno3.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Almuerzo1.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Almuerzo2.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Almuerzo3.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Merienda1.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Merienda2.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Merienda3.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Cena1.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Cena2.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Cena3.addActionListener(e -> calcularCaloriasTotales());
        jComboBox2Colacion.addActionListener(e -> calcularCaloriasTotales());
    }
    
     private void agregarListenersATextFields() {
        agregarListenerPorcion(jTextField2Desayuno1);
        agregarListenerPorcion(jTextField2Desayuno2);
        agregarListenerPorcion(jTextField2Desayuno3);
        
        agregarListenerPorcion(jTextField2Almuerzo1);
        agregarListenerPorcion(jTextField2Almuerzo2);
        agregarListenerPorcion(jTextField2Almuerzo3);
        
        agregarListenerPorcion(jTextField2Merienda1);
        agregarListenerPorcion(jTextField2Merienda2);
        agregarListenerPorcion(jTextField2Merienda3);
        
        agregarListenerPorcion(jTextField2Cena1);
        agregarListenerPorcion(jTextField2Cena2);
        agregarListenerPorcion(jTextField2Cena3);
        
        agregarListenerPorcion(jTextField2Colaciones);
    }
    
    private void agregarListenerPorcion(JTextField textField) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calcularCaloriasTotales();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                calcularCaloriasTotales();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                calcularCaloriasTotales();
            }
        });
    }

    private void limpiarComboBoxesAlimentos() {
        jComboBox2Desayuno1.removeAllItems();
        jComboBox2Desayuno2.removeAllItems();
        jComboBox2Desayuno3.removeAllItems();
        jComboBox2Almuerzo1.removeAllItems();
        jComboBox2Almuerzo2.removeAllItems();
        jComboBox2Almuerzo3.removeAllItems();
        jComboBox2Merienda1.removeAllItems();
        jComboBox2Merienda2.removeAllItems();
        jComboBox2Merienda3.removeAllItems();
        jComboBox2Cena1.removeAllItems();
        jComboBox2Cena2.removeAllItems();
        jComboBox2Cena3.removeAllItems();
        jComboBox2Colacion.removeAllItems();
    }
     
    private void limpiarFormularioSinMensaje() {
        // Limpiar ComboBoxes de alimentos (mantener opciones pero sin selección)
        jComboBox2Desayuno1.setSelectedIndex(-1);
        jComboBox2Desayuno2.setSelectedIndex(-1);
        jComboBox2Desayuno3.setSelectedIndex(-1);
        jComboBox2Almuerzo1.setSelectedIndex(-1);
        jComboBox2Almuerzo2.setSelectedIndex(-1);
        jComboBox2Almuerzo3.setSelectedIndex(-1);
        jComboBox2Merienda1.setSelectedIndex(-1);
        jComboBox2Merienda2.setSelectedIndex(-1);
        jComboBox2Merienda3.setSelectedIndex(-1);
        jComboBox2Cena1.setSelectedIndex(-1);
        jComboBox2Cena2.setSelectedIndex(-1);
        jComboBox2Cena3.setSelectedIndex(-1);
        jComboBox2Colacion.setSelectedIndex(-1);

        // Limpiar TextFields de porciones
        jTextField2Desayuno1.setText("");
        jTextField2Desayuno2.setText("");
        jTextField2Desayuno3.setText("");
        jTextField2Almuerzo1.setText("");
        jTextField2Almuerzo2.setText("");
        jTextField2Almuerzo3.setText("");
        jTextField2Merienda1.setText("");
        jTextField2Merienda2.setText("");
        jTextField2Merienda3.setText("");
        jTextField2Cena1.setText("");
        jTextField2Cena2.setText("");
        jTextField2Cena3.setText("");
        jTextField2Colaciones.setText("");
        // Limpiar calorías totales
        jTextFieldCaloriasDeLaDieta2.setText("");
    }

    
  //metodos y funciones

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Colacion;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2Almuerzo1;
    private javax.swing.JComboBox<String> jComboBox2Almuerzo2;
    private javax.swing.JComboBox<String> jComboBox2Almuerzo3;
    private javax.swing.JComboBox<String> jComboBox2Cena1;
    private javax.swing.JComboBox<String> jComboBox2Cena2;
    private javax.swing.JComboBox<String> jComboBox2Cena3;
    private javax.swing.JComboBox<String> jComboBox2Colacion;
    private javax.swing.JComboBox<String> jComboBox2Desayuno1;
    private javax.swing.JComboBox<String> jComboBox2Desayuno2;
    private javax.swing.JComboBox<String> jComboBox2Desayuno3;
    private javax.swing.JComboBox<String> jComboBox2Merienda1;
    private javax.swing.JComboBox<String> jComboBox2Merienda2;
    private javax.swing.JComboBox<String> jComboBox2Merienda3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelDietasConsultarDieta;
    private javax.swing.JTextField jTextField2Almuerzo1;
    private javax.swing.JTextField jTextField2Almuerzo2;
    private javax.swing.JTextField jTextField2Almuerzo3;
    private javax.swing.JTextField jTextField2Cena1;
    private javax.swing.JTextField jTextField2Cena2;
    private javax.swing.JTextField jTextField2Cena3;
    private javax.swing.JTextField jTextField2Colaciones;
    private javax.swing.JTextField jTextField2Desayuno1;
    private javax.swing.JTextField jTextField2Desayuno2;
    private javax.swing.JTextField jTextField2Desayuno3;
    private javax.swing.JTextField jTextField2Merienda1;
    private javax.swing.JTextField jTextField2Merienda2;
    private javax.swing.JTextField jTextField2Merienda3;
    private javax.swing.JTextField jTextFieldCaloriasDeLaDieta2;
    // End of variables declaration//GEN-END:variables
}
