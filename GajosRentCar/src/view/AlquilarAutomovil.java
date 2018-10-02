package view;

import models.Automovil;
import models.modeloAutomovil;
import models.modeloAutomovilAlquilados;

public class AlquilarAutomovil extends javax.swing.JFrame {
    private static AlquilarAutomovil INSTANCE = null;
    modeloAutomovil modeloAuto = modeloAutomovil.getInstance();
    modeloAutomovilAlquilados modeloAutomovilAlquilado = new modeloAutomovilAlquilados();

    public AlquilarAutomovil() {
        initComponents();
        ListaAutomovilesDisponibles.setModel(modeloAuto);
    }
    
    private synchronized static void createInstance(){
        if(INSTANCE == null){
            INSTANCE = new AlquilarAutomovil();
        }
    }
    
    public static AlquilarAutomovil getInstance(){
        createInstance();
        return INSTANCE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaAutomovilesDisponibles = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtMarca = new javax.swing.JLabel();
        txtModelo = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JLabel();
        txtPuertas = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JLabel();
        txtCombustible = new javax.swing.JLabel();
        txtMarcaConsultado = new javax.swing.JLabel();
        txtModeloConsultado = new javax.swing.JLabel();
        txtFechaConsultado = new javax.swing.JLabel();
        txtCapacidadConsultado = new javax.swing.JLabel();
        txtPuertasConsultado = new javax.swing.JLabel();
        txtPlacaConsultado = new javax.swing.JLabel();
        txtCombustibleConsultado = new javax.swing.JLabel();
        btnAlquilar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ALQUILER DE AUTOMOVILES");

        ListaAutomovilesDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaAutomovilesDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaAutomovilesDisponibles);

        jLabel2.setText("Automóiviles Disponibles para Alquilar");

        txtMarca.setText("MARCA");

        txtModelo.setText("MODELO");

        txtFecha.setText("FECHA REGISTRO");

        txtCapacidad.setText("CAPACIDAD");

        txtPuertas.setText("NÚMERO PUERTAS");

        txtPlaca.setText("NÚMERO DE PLACA");

        txtCombustible.setText("COMBUSTIBLE");

        txtMarcaConsultado.setText("#marca");

        txtModeloConsultado.setText("#modelo");

        txtFechaConsultado.setText("#Fecha");

        txtCapacidadConsultado.setText("#Capacidad");

        txtPuertasConsultado.setText("#NumPuertas");

        txtPlacaConsultado.setText("#NumPlaca");

        txtCombustibleConsultado.setText("#Combustible");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(txtMarca)
                            .addGap(58, 58, 58))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtModelo)
                            .addGap(52, 52, 52)))
                    .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPuertas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCombustible, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarcaConsultado)
                    .addComponent(txtModeloConsultado)
                    .addComponent(txtFechaConsultado)
                    .addComponent(txtCapacidadConsultado)
                    .addComponent(txtPuertasConsultado)
                    .addComponent(txtPlacaConsultado)
                    .addComponent(txtCombustibleConsultado))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca)
                    .addComponent(txtMarcaConsultado))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo)
                    .addComponent(txtModeloConsultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha)
                    .addComponent(txtFechaConsultado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacidad)
                    .addComponent(txtCapacidadConsultado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuertas)
                    .addComponent(txtPuertasConsultado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca)
                    .addComponent(txtPlacaConsultado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCombustible)
                    .addComponent(txtCombustibleConsultado))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        btnAlquilar.setText("Alquilar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(606, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(180, 180, 180))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(btnAlquilar))))
                    .addComponent(jLabel2))
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlquilar)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaAutomovilesDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaAutomovilesDisponiblesMouseClicked

        int seleccion = ListaAutomovilesDisponibles.getSelectedIndex();
        if(seleccion!=-1){
            Automovil automovil = modeloAuto.getAutomovil(seleccion);
            txtMarcaConsultado.setText(automovil.getMarcar());
            txtModeloConsultado.setText(automovil.getModelo());
            txtFechaConsultado.setText(automovil.getFechaRegistro());
            txtCapacidadConsultado.setText(automovil.getCapacidad());
            txtPuertasConsultado.setText(automovil.getCapacidad());
            txtPlacaConsultado.setText(automovil.getNumPlaca());
            txtCombustibleConsultado.setText(automovil.getCombustible());
        }
    }//GEN-LAST:event_ListaAutomovilesDisponiblesMouseClicked

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
            java.util.logging.Logger.getLogger(AlquilarAutomovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlquilarAutomovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlquilarAutomovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlquilarAutomovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlquilarAutomovil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaAutomovilesDisponibles;
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtCapacidad;
    private javax.swing.JLabel txtCapacidadConsultado;
    private javax.swing.JLabel txtCombustible;
    private javax.swing.JLabel txtCombustibleConsultado;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtFechaConsultado;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtMarcaConsultado;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtModeloConsultado;
    private javax.swing.JLabel txtPlaca;
    private javax.swing.JLabel txtPlacaConsultado;
    private javax.swing.JLabel txtPuertas;
    private javax.swing.JLabel txtPuertasConsultado;
    // End of variables declaration//GEN-END:variables
}
