/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import models.Automovil;
import models.modeloAutomovil;

public class RegistrarAutomovil extends javax.swing.JFrame {
    private static RegistrarAutomovil INSTANCE = null;
    modeloAutomovil modeloAuto = modeloAutomovil.getInstance();
    
    public RegistrarAutomovil() {
        initComponents();
    }
    private synchronized static void createInstance(){
        if(INSTANCE == null){
            INSTANCE = new RegistrarAutomovil();
        }
    }
    public static RegistrarAutomovil getInstance(){
        createInstance();
        return INSTANCE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        txtModelo = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JLabel();
        txtPuertas = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JLabel();
        txtCombustible = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox<>();
        cbCapacidad = new javax.swing.JComboBox<>();
        cbPuertas = new javax.swing.JComboBox<>();
        textFieldPlaca = new javax.swing.JTextField();
        cbCombustible = new javax.swing.JComboBox<>();
        textFieldModelo = new javax.swing.JTextField();
        textFieldFecha = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRAR NUEVO AUTOMÓVIL");

        txtMarca.setText("MARCA");

        txtModelo.setText("MODELO");

        txtFecha.setText("FECHA REGISTRO");

        txtCapacidad.setText("CAPACIDAD");

        txtPuertas.setText("NÚMERO PUERTAS");

        txtPlaca.setText("NÚMERO DE PLACA");

        txtCombustible.setText("COMBUSTIBLE");

        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HONDA", "TOYOTA", "NISSAN", "FORD", "HYUNDAI", "MITSUBISHI", "ISUZU", "AUDI", "VOLVO", "LEXUS", "KIA", "BMW" }));

        cbCapacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Personas", "5 Personas", "7 Personas", "12 Personas", "15 Personas", " " }));

        cbPuertas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Puertas", "4 Puertas", " ", " " }));

        cbCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GASOLINA", "DIESEL", "GAS ", "ELECTRICO", " " }));

        btnRegistrar.setText("REGISTRAR ");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtMarca)
                                        .addGap(88, 88, 88))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtModelo)
                                        .addGap(82, 82, 82)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbMarca, 0, 143, Short.MAX_VALUE)
                                    .addComponent(textFieldModelo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFecha)
                                    .addComponent(txtCapacidad)
                                    .addComponent(txtPuertas)
                                    .addComponent(txtPlaca)
                                    .addComponent(txtCombustible))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldPlaca)
                                    .addComponent(cbPuertas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCapacidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldFecha)
                                    .addComponent(cbCombustible, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnRegistrar)
                                        .addGap(0, 40, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMarca)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo)
                    .addComponent(textFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha)
                    .addComponent(textFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacidad)
                    .addComponent(cbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuertas)
                    .addComponent(cbPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca)
                    .addComponent(textFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCombustible)
                    .addComponent(cbCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String marca = (String)cbMarca.getSelectedItem();
        String modelo = textFieldModelo.getText();
        String fecha = textFieldFecha.getText();
        String capacidad = (String)cbCapacidad.getSelectedItem();
        String puertas = (String)cbPuertas.getSelectedItem();
        String placa = textFieldPlaca.getText();
        String combustible = (String)cbCombustible.getSelectedItem();
        
        Automovil auto = new Automovil(marca,modelo,fecha,capacidad,puertas,placa,combustible);
        modeloAuto.agregarAutomovil(auto);
        
   
        textFieldModelo.setText("");
        textFieldFecha.setText("");
        textFieldPlaca.setText("");
       
        RegistrarAutomovil registro = RegistrarAutomovil.getInstance();
        registro.setVisible(false);
        VentanaAdministrador admin = VentanaAdministrador.getInstance();
        admin.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutomovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutomovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutomovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAutomovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAutomovil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbCapacidad;
    private javax.swing.JComboBox<String> cbCombustible;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbPuertas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldFecha;
    private javax.swing.JTextField textFieldModelo;
    private javax.swing.JTextField textFieldPlaca;
    private javax.swing.JLabel txtCapacidad;
    private javax.swing.JLabel txtCombustible;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtPlaca;
    private javax.swing.JLabel txtPuertas;
    // End of variables declaration//GEN-END:variables
}
