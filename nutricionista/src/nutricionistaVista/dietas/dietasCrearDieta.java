
package nutricionistaVista.dietas;

import conexion.alimentoData;
import conexion.pacienteData;
import entidades.alimento;
import entidades.paciente;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author ferna
 */
public class dietasCrearDieta extends javax.swing.JPanel {

    //Listas para combobox
    private JComboBox<String> comboPacientes;
    private List<paciente> listaPacientes;
    private pacienteData pacienteData;
    private List<alimento> alimentos;
    private alimentoData alimentoData;

    
    public dietasCrearDieta() {
        initComponents();
        
        pacienteData = new pacienteData();
        cargarPacientes();
        alimentoData = new alimentoData();
        cargarAlimentos();
        agregarListenersAComboBox();
        agregarListenersATextFields();

        
        //Evitar modificaciones de los datos del paciente
        outputEdadPaciente.setEditable(false);
        outputAlturaPaciente.setEditable(false);
        outputPesoPaciente.setEditable(false);
        //Evitar modificacion de los Botones
        rbHombre.setEnabled(false);
        rbMujer.setEnabled(false);
        rbCeliaquia.setEnabled(false);
        rbVegetariano.setEnabled(false);
        rbIntoleranteLactosa.setEnabled(false);
        rbSubirPeso.setEnabled(false);
        rbBajarPeso.setEnabled(false);
        rbMantenerPeso.setEnabled(false);
    }
    private void cargarAlimentos() {
        alimentos = alimentoData.listarAlimentos();

        // Limpiar todos los ComboBox
        jComboBoxDesayuno1.removeAllItems();
        jComboBoxDesayuno2.removeAllItems();
        jComboBoxDesayuno3.removeAllItems();
        jComboBoxAlmuerzo1.removeAllItems();
        jComboBoxAlmuerzo2.removeAllItems();
        jComboBoxAlmuerzo3.removeAllItems();
        jComboBoxMerienda1.removeAllItems();
        jComboBoxMerienda2.removeAllItems();
        jComboBoxMerienda3.removeAllItems();
        jComboBoxCena1.removeAllItems();
        jComboBoxCena2.removeAllItems();
        jComboBoxCena3.removeAllItems();
        jComboBoxColacion.removeAllItems();

        for (alimento a : alimentos) {
            String nombre = a.getNombre();
            String categoria = a.getCategoria(); 
            if ("D".equals(categoria)) {
                jComboBoxDesayuno1.addItem(nombre);
                jComboBoxDesayuno2.addItem(nombre);
                jComboBoxDesayuno3.addItem(nombre);
            } else if ("A".equals(categoria)) {
                jComboBoxAlmuerzo1.addItem(nombre);
                jComboBoxAlmuerzo2.addItem(nombre);
                jComboBoxAlmuerzo3.addItem(nombre);
            } else if ("M".equals(categoria)) {
                jComboBoxMerienda1.addItem(nombre);
                jComboBoxMerienda2.addItem(nombre);
                jComboBoxMerienda3.addItem(nombre);
            } else if ("C".equals(categoria)) {
                jComboBoxCena1.addItem(nombre);
                jComboBoxCena2.addItem(nombre);
                jComboBoxCena3.addItem(nombre);
            } else if ("CO".equals(categoria)) {
                jComboBoxColacion.addItem(nombre);
            }
        }
    }
    
    private double calcularCaloriasPorComida(JComboBox<String> comboBox, JTextField tfPorciones) {
        try {
            String nombreAlimento = (String) comboBox.getSelectedItem();

            if (nombreAlimento != null && !tfPorciones.getText().trim().isEmpty()) {
                int porciones = Integer.parseInt(tfPorciones.getText().trim());

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

    
    private void calcularCaloriasTotales() {
        double totalCalorias = 0;
        totalCalorias += calcularCaloriasPorComida(jComboBoxDesayuno1, jTextFieldDesayuno1);
        totalCalorias += calcularCaloriasPorComida(jComboBoxDesayuno2, jTextFieldDesayuno2);
        totalCalorias += calcularCaloriasPorComida(jComboBoxDesayuno3, jTextFieldDesayuno3);
        totalCalorias += calcularCaloriasPorComida(jComboBoxAlmuerzo1, jTextFieldAlmuerzo1);
        totalCalorias += calcularCaloriasPorComida(jComboBoxAlmuerzo2, jTextFieldAlmuerzo2);
        totalCalorias += calcularCaloriasPorComida(jComboBoxAlmuerzo3, jTextFieldAlmuerzo3);
        totalCalorias += calcularCaloriasPorComida(jComboBoxMerienda1, jTextFieldMerienda1);
        totalCalorias += calcularCaloriasPorComida(jComboBoxMerienda2, jTextFieldMerienda2);
        totalCalorias += calcularCaloriasPorComida(jComboBoxMerienda3, jTextFieldMerienda3);
        totalCalorias += calcularCaloriasPorComida(jComboBoxCena1, jTextFieldCena1);
        totalCalorias += calcularCaloriasPorComida(jComboBoxCena2, jTextFieldCena2);
        totalCalorias += calcularCaloriasPorComida(jComboBoxCena3, jTextFieldCena3);
        totalCalorias += calcularCaloriasPorComida(jComboBoxColacion, jTextFieldColaciones);
        jTextFieldCaloriasDeLaDieta.setText(String.format("%.2f", totalCalorias));
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
     
    private void agregarListenersAComboBox() {
        jComboBoxDesayuno1.addActionListener(e -> calcularCaloriasTotales());
        jComboBoxDesayuno2.addActionListener(e -> calcularCaloriasTotales());
        jComboBoxDesayuno3.addActionListener(e -> calcularCaloriasTotales());

        jComboBoxAlmuerzo1.addActionListener(e -> calcularCaloriasTotales());
        jComboBoxAlmuerzo2.addActionListener(e -> calcularCaloriasTotales());
        jComboBoxAlmuerzo3.addActionListener(e -> calcularCaloriasTotales());

        jComboBoxMerienda1.addActionListener(e -> calcularCaloriasTotales());
        jComboBoxMerienda2.addActionListener(e -> calcularCaloriasTotales());
        jComboBoxMerienda3.addActionListener(e -> calcularCaloriasTotales());

        jComboBoxCena1.addActionListener(e -> calcularCaloriasTotales());
        jComboBoxCena2.addActionListener(e -> calcularCaloriasTotales());
        jComboBoxCena3.addActionListener(e -> calcularCaloriasTotales());

        jComboBoxColacion.addActionListener(e -> calcularCaloriasTotales());
    }
    
    private void agregarListenersATextFields() {
        agregarListenerPorcion(jTextFieldDesayuno1);
        agregarListenerPorcion(jTextFieldDesayuno2);
        agregarListenerPorcion(jTextFieldDesayuno3);
        agregarListenerPorcion(jTextFieldAlmuerzo1);
        agregarListenerPorcion(jTextFieldAlmuerzo2);
        agregarListenerPorcion(jTextFieldAlmuerzo3);
        agregarListenerPorcion(jTextFieldMerienda1);
        agregarListenerPorcion(jTextFieldMerienda2);
        agregarListenerPorcion(jTextFieldMerienda3);
        agregarListenerPorcion(jTextFieldCena1);
        agregarListenerPorcion(jTextFieldCena2);
        agregarListenerPorcion(jTextFieldCena3);
        agregarListenerPorcion(jTextFieldColaciones);
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDietaCrearDieta = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxPacientes = new javax.swing.JComboBox<>();
        outputPesoPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        outputEdadPaciente = new javax.swing.JTextField();
        outputAlturaPaciente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rbSubirPeso = new javax.swing.JCheckBox();
        rbBajarPeso = new javax.swing.JCheckBox();
        rbMantenerPeso = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        rbMujer = new javax.swing.JCheckBox();
        rbHombre = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        rbVegetariano = new javax.swing.JCheckBox();
        rbIntoleranteLactosa = new javax.swing.JCheckBox();
        rbCeliaquia = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Colacion = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jComboBoxDesayuno1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldDesayuno1 = new javax.swing.JTextField();
        jComboBoxDesayuno3 = new javax.swing.JComboBox<>();
        jTextFieldDesayuno2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxDesayuno2 = new javax.swing.JComboBox<>();
        jTextFieldDesayuno3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jComboBoxAlmuerzo1 = new javax.swing.JComboBox<>();
        jTextFieldAlmuerzo1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxAlmuerzo2 = new javax.swing.JComboBox<>();
        jTextFieldAlmuerzo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBoxAlmuerzo3 = new javax.swing.JComboBox<>();
        jTextFieldAlmuerzo3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jComboBoxCena1 = new javax.swing.JComboBox<>();
        jTextFieldCena1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jComboBoxCena2 = new javax.swing.JComboBox<>();
        jComboBoxCena3 = new javax.swing.JComboBox<>();
        jTextFieldCena2 = new javax.swing.JTextField();
        jTextFieldCena3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jComboBoxMerienda2 = new javax.swing.JComboBox<>();
        jTextFieldMerienda2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxMerienda1 = new javax.swing.JComboBox<>();
        jTextFieldMerienda1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jComboBoxMerienda3 = new javax.swing.JComboBox<>();
        jTextFieldMerienda3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jComboBoxColacion = new javax.swing.JComboBox<>();
        jTextFieldColaciones = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        outputTMT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        rbActividadLeve = new javax.swing.JCheckBox();
        rbSedentario = new javax.swing.JCheckBox();
        rbModerada = new javax.swing.JCheckBox();
        rbMuyActivo = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldCaloriasDeLaDieta = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccionar paciente");

        comboBoxPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPacientesActionPerformed(evt);
            }
        });

        outputPesoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputPesoPacienteActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Altura");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Peso actual");

        outputEdadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputEdadPacienteActionPerformed(evt);
            }
        });

        outputAlturaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputAlturaPacienteActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Objetivo");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbSubirPeso.setText("Subir de peso");

        rbBajarPeso.setText("Bajar de peso");

        rbMantenerPeso.setText("Mantener peso");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSubirPeso)
                    .addComponent(rbBajarPeso)
                    .addComponent(rbMantenerPeso))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSubirPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbBajarPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMantenerPeso)
                .addGap(12, 12, 12))
        );

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Genero");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbMujer.setText("Mujer");

        rbHombre.setText("Hombre");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMujer)
                    .addComponent(rbHombre))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(rbHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbMujer)
                .addContainerGap())
        );

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Condicion");

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbVegetariano.setText("Vegetariano");

        rbIntoleranteLactosa.setText("Intolerante Lactosa");

        rbCeliaquia.setText("Celiaco");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbVegetariano)
                    .addComponent(rbIntoleranteLactosa)
                    .addComponent(rbCeliaquia))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(rbVegetariano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCeliaquia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbIntoleranteLactosa)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel2.setText("años");

        jLabel3.setText("kilogramos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(outputAlturaPaciente)
                            .addComponent(outputEdadPaciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(outputPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputAlturaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel8)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel9)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Desayuno");

        jLabel11.setText("Cena");

        Colacion.setText("Colacion");

        jLabel13.setText("Almuerzo");

        jLabel14.setText("Merienda");

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBoxDesayuno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDesayuno1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Porciones");

        jLabel18.setText("Porciones");

        jLabel19.setText("Porciones");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxDesayuno3, 0, 114, Short.MAX_VALUE)
                    .addComponent(jComboBoxDesayuno1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDesayuno2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextFieldDesayuno1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextFieldDesayuno2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextFieldDesayuno3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDesayuno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDesayuno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDesayuno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBoxDesayuno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDesayuno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDesayuno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setText("Porciones");

        jLabel21.setText("Porciones");

        jLabel22.setText("Porciones");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBoxAlmuerzo3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAlmuerzo3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBoxAlmuerzo2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAlmuerzo2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBoxAlmuerzo1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAlmuerzo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAlmuerzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAlmuerzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAlmuerzo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAlmuerzo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAlmuerzo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAlmuerzo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(16, 16, 16))
        );

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setText("Porciones");

        jComboBoxCena2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCena2ActionPerformed(evt);
            }
        });

        jLabel27.setText("Porciones");

        jLabel28.setText("Porciones");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxCena3, 0, 114, Short.MAX_VALUE)
                    .addComponent(jComboBoxCena2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxCena1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextFieldCena1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextFieldCena3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextFieldCena2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)))
                .addGap(37, 37, 37))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCena3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCena3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(21, 21, 21))
        );

        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setText("Porciones");

        jLabel24.setText("Porciones");

        jLabel25.setText("Porciones");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxMerienda2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxMerienda1, 0, 114, Short.MAX_VALUE)
                    .addComponent(jComboBoxMerienda3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextFieldMerienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextFieldMerienda2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextFieldMerienda3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jComboBoxMerienda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMerienda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMerienda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMerienda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMerienda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMerienda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(16, 16, 16))
        );

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel29.setText("Porciones");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxColacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldColaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxColacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextFieldColaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel12.setText("Tasa Metabolica Total");

        jLabel15.setText("Kcal");

        jButton1.setText("Limpiar");

        jButton2.setText("Guardar dieta");

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel16.setText("Nivel de actividad fisica");

        rbActividadLeve.setText("Actividad leve");

        rbSedentario.setText("Sedentario");

        rbModerada.setText("Moderada");

        rbMuyActivo.setText("Muy activo");

        jLabel30.setText("Calorias de la dieta");

        jLabel31.setText("Kcal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(132, 132, 132))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Colacion)
                                .addGap(101, 101, 101)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbSedentario)
                                    .addComponent(jLabel16)
                                    .addComponent(rbActividadLeve)
                                    .addComponent(rbModerada)
                                    .addComponent(rbMuyActivo))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(59, 59, 59))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel12))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jButton3))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(outputTMT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel15)))))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextFieldCaloriasDeLaDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel31))
                                            .addComponent(jLabel30)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(60, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(141, 141, 141))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Colacion)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12)
                    .addComponent(jLabel30))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 99, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(rbSedentario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbActividadLeve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbModerada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMuyActivo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(outputTMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTextFieldCaloriasDeLaDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelDietaCrearDietaLayout = new javax.swing.GroupLayout(jPanelDietaCrearDieta);
        jPanelDietaCrearDieta.setLayout(jPanelDietaCrearDietaLayout);
        jPanelDietaCrearDietaLayout.setHorizontalGroup(
            jPanelDietaCrearDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDietaCrearDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDietaCrearDietaLayout.setVerticalGroup(
            jPanelDietaCrearDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDietaCrearDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDietaCrearDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDietaCrearDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void outputAlturaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputAlturaPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputAlturaPacienteActionPerformed

    private void outputEdadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputEdadPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputEdadPacienteActionPerformed

    private void outputPesoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputPesoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputPesoPacienteActionPerformed

    private void jComboBoxCena2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCena2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCena2ActionPerformed

    private void comboBoxPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPacientesActionPerformed
       //Combobox Eventos
       actualizarDetallesPaciente();
    }//GEN-LAST:event_comboBoxPacientesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON PARA CALCULAR IMB INVOCAR FUNCION 
        
        calcularTasaMetabolica();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxDesayuno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDesayuno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDesayuno1ActionPerformed


    //Funciones
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
            
            //Setear datos
            rbSubirPeso.setSelected(false);
            rbBajarPeso.setSelected(false);
            rbMantenerPeso.setSelected(false);
            
            
            if ("subir".equalsIgnoreCase(p.getObjetivo())){
            rbSubirPeso.setSelected(true);
            } else if ("bajar".equalsIgnoreCase(p.getObjetivo())){
            rbBajarPeso.setSelected(true);
            } else if ("mantener".equalsIgnoreCase(p.getObjetivo())){
            rbMantenerPeso.setSelected(true);
            }
            
            
            
            // Configurar condiciones especiales
            rbCeliaquia.setSelected(p.isCeliaco());
            rbVegetariano.setSelected(p.isVegetariano());
            rbIntoleranteLactosa.setSelected(p.isIntoleranteLactosa());
        }
    }
    
    //Funcion de la tasa metabolica basal
    
    private void calcularTasaMetabolica(){
    //Variables
        int edad = Integer.parseInt(outputEdadPaciente.getText());
        System.out.println("Edad");
        System.out.println(edad);
        
        double altura = Double.parseDouble(outputAlturaPaciente.getText());
        System.out.println("Altura del paciente");
        System.out.println(altura);
        System.out.println("Altura del paciente posterior al calculo");
        altura = altura * 100;
        
        double peso = Double.parseDouble(outputPesoPaciente.getText());
        System.out.println("Peso del paciente");
        System.out.println(peso);
        
        //Ecuacion de Harris-Benedict para calcular la tasa metabolica basal
        double tmb = 0;
        
        if (rbHombre.isSelected()){
        //Calculo para hombres
        tmb = (10 * peso ) + (6.25 * altura) - (5 * edad) + 5;
        } else if (rbMujer.isSelected()) {
        tmb = ((10 * peso) + (6.25 * altura) - (5 * edad) + 5) - 161;
        }
        
        System.out.println("Tasa metabolica sin calculo de actividad fisica:");
        System.out.println(tmb);
        
        //Factor de actividad
        
        double factorDeActividad = 1.0;
        
        if(rbSedentario.isSelected()){
        factorDeActividad = 1.2;
        } else if (rbActividadLeve.isSelected()){
        factorDeActividad = 1.37;
        } else if (rbModerada.isSelected()){
        factorDeActividad = 1.55;
        } else if (rbMuyActivo.isSelected()){
        factorDeActividad = 1.72;
        }
        
        //Tasa metabolica total (TMB + FactorDeActividad)
        
        double tmt = tmb * factorDeActividad;
        int tmtTruncado = (int) tmt;
        
        outputTMT.setText(String.valueOf(tmtTruncado));
    }
    
    
    //Funciones
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Colacion;
    private javax.swing.JComboBox<String> comboBoxPacientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxAlmuerzo1;
    private javax.swing.JComboBox<String> jComboBoxAlmuerzo2;
    private javax.swing.JComboBox<String> jComboBoxAlmuerzo3;
    private javax.swing.JComboBox<String> jComboBoxCena1;
    private javax.swing.JComboBox<String> jComboBoxCena2;
    private javax.swing.JComboBox<String> jComboBoxCena3;
    private javax.swing.JComboBox<String> jComboBoxColacion;
    private javax.swing.JComboBox<String> jComboBoxDesayuno1;
    private javax.swing.JComboBox<String> jComboBoxDesayuno2;
    private javax.swing.JComboBox<String> jComboBoxDesayuno3;
    private javax.swing.JComboBox<String> jComboBoxMerienda1;
    private javax.swing.JComboBox<String> jComboBoxMerienda2;
    private javax.swing.JComboBox<String> jComboBoxMerienda3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelDietaCrearDieta;
    private javax.swing.JTextField jTextFieldAlmuerzo1;
    private javax.swing.JTextField jTextFieldAlmuerzo2;
    private javax.swing.JTextField jTextFieldAlmuerzo3;
    private javax.swing.JTextField jTextFieldCaloriasDeLaDieta;
    private javax.swing.JTextField jTextFieldCena1;
    private javax.swing.JTextField jTextFieldCena2;
    private javax.swing.JTextField jTextFieldCena3;
    private javax.swing.JTextField jTextFieldColaciones;
    private javax.swing.JTextField jTextFieldDesayuno1;
    private javax.swing.JTextField jTextFieldDesayuno2;
    private javax.swing.JTextField jTextFieldDesayuno3;
    private javax.swing.JTextField jTextFieldMerienda1;
    private javax.swing.JTextField jTextFieldMerienda2;
    private javax.swing.JTextField jTextFieldMerienda3;
    private javax.swing.JTextField outputAlturaPaciente;
    private javax.swing.JTextField outputEdadPaciente;
    private javax.swing.JTextField outputPesoPaciente;
    private javax.swing.JTextField outputTMT;
    private javax.swing.JCheckBox rbActividadLeve;
    private javax.swing.JCheckBox rbBajarPeso;
    private javax.swing.JCheckBox rbCeliaquia;
    private javax.swing.JCheckBox rbHombre;
    private javax.swing.JCheckBox rbIntoleranteLactosa;
    private javax.swing.JCheckBox rbMantenerPeso;
    private javax.swing.JCheckBox rbModerada;
    private javax.swing.JCheckBox rbMujer;
    private javax.swing.JCheckBox rbMuyActivo;
    private javax.swing.JCheckBox rbSedentario;
    private javax.swing.JCheckBox rbSubirPeso;
    private javax.swing.JCheckBox rbVegetariano;
    // End of variables declaration//GEN-END:variables
}
