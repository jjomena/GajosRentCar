package view;

import controler.controladorAdministrador;
import javax.swing.JOptionPane;
import models.Automovil;
import models.Cliente;
import models.modeloAutomovil;
import models.modeloAutomovilAlquilado;
import models.modeloCliente;
import static view.VentanaAdministrador.getInstance;

public class AlquilarAutomovil extends javax.swing.JFrame {
    private static AlquilarAutomovil INSTANCE = null;
    modeloAutomovil modeloAuto = modeloAutomovil.getInstance();
    modeloAutomovilAlquilado modeloAutomovilAlquilados = modeloAutomovilAlquilado.getInstance();
    modeloCliente modeloClientes = modeloCliente.getInstance();

    public AlquilarAutomovil() {
        initComponents();
        ListaAutomovilesDisponibles.setModel(modeloAuto);
        ListaClientes.setModel(modeloClientes);
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

        GUIcrearCliente = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        telefonoTxt = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        correoTxt = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        segundoApTxt = new javax.swing.JTextField();
        segundoApellido = new javax.swing.JLabel();
        primerApTxt = new javax.swing.JTextField();
        primerApellido = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        cedulaTxt = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaClientes = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCedula = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txt1Apellido = new javax.swing.JLabel();
        txt2Apellido = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        txtCedulaConsultado = new javax.swing.JLabel();
        txtNombreConsultado = new javax.swing.JLabel();
        txt1ApellidoConsultado = new javax.swing.JLabel();
        txt2ApellidoConsultado = new javax.swing.JLabel();
        txtCorreoConsultado = new javax.swing.JLabel();
        txtTelefonoConsultado = new javax.swing.JLabel();
        btnAgregarCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        GUIcrearCliente.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        GUIcrearCliente.setMinimumSize(new java.awt.Dimension(396, 390));

        jPanel4.setMinimumSize(new java.awt.Dimension(396, 335));

        telefono.setText("Teléfono:");

        correo.setText("Correo:");

        segundoApellido.setText("Segundo Apellido:");

        primerApellido.setText("Primer Apellido:");

        nombre.setText("Nombre:");

        cedulaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTxtActionPerformed(evt);
            }
        });

        cedula.setText("Cédula:");

        titulo.setText("Crear Cliente");

        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(primerApellido)
                            .addComponent(correo)
                            .addComponent(telefono)
                            .addComponent(nombre)
                            .addComponent(cedula)
                            .addComponent(segundoApellido))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cedulaTxt)
                            .addComponent(nombreTxt)
                            .addComponent(primerApTxt)
                            .addComponent(segundoApTxt)
                            .addComponent(correoTxt)
                            .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(guardarBtn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(titulo)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerApTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primerApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundoApTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(guardarBtn)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout GUIcrearClienteLayout = new javax.swing.GroupLayout(GUIcrearCliente.getContentPane());
        GUIcrearCliente.getContentPane().setLayout(GUIcrearClienteLayout);
        GUIcrearClienteLayout.setHorizontalGroup(
            GUIcrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GUIcrearClienteLayout.setVerticalGroup(
            GUIcrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha)
                    .addComponent(txtCapacidad)
                    .addComponent(txtPuertas)
                    .addComponent(txtPlaca)
                    .addComponent(txtCombustible)
                    .addComponent(txtModelo)
                    .addComponent(txtMarca))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarcaConsultado)
                    .addComponent(txtModeloConsultado)
                    .addComponent(txtFechaConsultado)
                    .addComponent(txtCapacidadConsultado)
                    .addComponent(txtPuertasConsultado)
                    .addComponent(txtPlacaConsultado)
                    .addComponent(txtCombustibleConsultado))
                .addContainerGap())
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
        btnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarActionPerformed(evt);
            }
        });

        ListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListaClientes);

        jLabel3.setText("Clientes Registrados");

        txtCedula.setText("CÉDULA");

        txtNombre.setText("NOMBRE");

        txt1Apellido.setText("PRIMER APELLIDO");

        txt2Apellido.setText("SEGUNDO APELLIDO");

        txtCorreo.setText("CORREO");

        txtTelefono.setText("TELEFONO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1Apellido)
                    .addComponent(txt2Apellido)
                    .addComponent(txtCorreo)
                    .addComponent(txtTelefono)
                    .addComponent(txtNombre)
                    .addComponent(txtCedula))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedulaConsultado)
                    .addComponent(txtNombreConsultado)
                    .addComponent(txt1ApellidoConsultado)
                    .addComponent(txt2ApellidoConsultado)
                    .addComponent(txtCorreoConsultado)
                    .addComponent(txtTelefonoConsultado))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula)
                    .addComponent(txtCedulaConsultado))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(txtNombreConsultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1Apellido)
                    .addComponent(txt1ApellidoConsultado))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2Apellido)
                    .addComponent(txt2ApellidoConsultado))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo)
                    .addComponent(txtCorreoConsultado))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono)
                    .addComponent(txtTelefonoConsultado))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnAgregarCliente.setText("Agregar Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAgregarCliente)
                                            .addComponent(btnAlquilar))
                                        .addContainerGap(127, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(431, 431, 431))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlquilar)
                        .addGap(20, 20, 20))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        // TODO add your handling code here:
        String pCedula = cedulaTxt.getText();
        String pNombre = nombreTxt.getText();
        String pPrimerApellido = primerApTxt.getText();
        String pSegundoApellido = segundoApTxt.getText();
        String pCorreo = correoTxt.getText();
        String pTelefono = telefonoTxt.getText();
        
        controladorAdministrador.crearCliente(pCedula, pNombre, pPrimerApellido, pSegundoApellido, pCorreo, pTelefono);
        
        txtCedulaConsultado.setText("");
        txtNombreConsultado.setText("");
        txt1ApellidoConsultado.setText("");
        txt2ApellidoConsultado.setText("");
        txtCorreoConsultado.setText("");
        txtTelefonoConsultado.setText("");
        
        GUIcrearCliente.setVisible(false);
        AlquilarAutomovil.getInstance().setVisible(true);
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void cedulaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTxtActionPerformed

    private void ListaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaClientesMouseClicked
        int seleccion = ListaClientes.getSelectedIndex();
        if(seleccion!=-1){
            Cliente cliente = modeloClientes.getCliente(seleccion);
            txtCedulaConsultado.setText(cliente.getCedula());
            txtNombreConsultado.setText(cliente.getNombre());
            txt1ApellidoConsultado.setText(cliente.getPrimerApellido());
            txt2ApellidoConsultado.setText(cliente.getSegundoApellido());
            txtCorreoConsultado.setText(cliente.getCorreo());
            txtTelefonoConsultado.setText(cliente.getTelefono());
        }
    }//GEN-LAST:event_ListaClientesMouseClicked

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

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
        GUIcrearCliente.setVisible(true);
        AlquilarAutomovil.getInstance().setVisible(false);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarActionPerformed
        int seleccionAutomovil = ListaAutomovilesDisponibles.getSelectedIndex();
        int seleccionCliente = ListaClientes.getSelectedIndex();
        if(seleccionAutomovil != -1 && seleccionCliente != -1){
            controladorAdministrador.alquilarAutomovil(modeloAuto.getAutomovil(seleccionAutomovil), 
                    seleccionAutomovil, modeloClientes.getCliente(seleccionCliente));
            JOptionPane.showMessageDialog(rootPane, "Listo! Auto alquilado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debe escoger un cliente y un automovil de las listas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlquilarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AlquilarAutomovil registro = AlquilarAutomovil.getInstance();
        registro.setVisible(false);
        VentanaAdministrador admin = VentanaAdministrador.getInstance();
        admin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                AlquilarAutomovil.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame GUIcrearCliente;
    private javax.swing.JList<String> ListaAutomovilesDisponibles;
    private javax.swing.JList<String> ListaClientes;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JLabel cedula;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField primerApTxt;
    private javax.swing.JLabel primerApellido;
    private javax.swing.JTextField segundoApTxt;
    private javax.swing.JLabel segundoApellido;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txt1Apellido;
    private javax.swing.JLabel txt1ApellidoConsultado;
    private javax.swing.JLabel txt2Apellido;
    private javax.swing.JLabel txt2ApellidoConsultado;
    private javax.swing.JLabel txtCapacidad;
    private javax.swing.JLabel txtCapacidadConsultado;
    private javax.swing.JLabel txtCedula;
    private javax.swing.JLabel txtCedulaConsultado;
    private javax.swing.JLabel txtCombustible;
    private javax.swing.JLabel txtCombustibleConsultado;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtCorreoConsultado;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtFechaConsultado;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtMarcaConsultado;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtModeloConsultado;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNombreConsultado;
    private javax.swing.JLabel txtPlaca;
    private javax.swing.JLabel txtPlacaConsultado;
    private javax.swing.JLabel txtPuertas;
    private javax.swing.JLabel txtPuertasConsultado;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JLabel txtTelefonoConsultado;
    // End of variables declaration//GEN-END:variables
}
