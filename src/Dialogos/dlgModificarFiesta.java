package Dialogos;

import Paneles.pnlVerFiestas;
import TablasDB.Amenizaciones;
import TablasDB.Fiestas;
import TablasDB.Locales;
import TablasDB.Proyectos;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.net.URL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class dlgModificarFiesta extends javax.swing.JDialog {

    private int codFiesta, codProyecto, codLocal, codAmenizacion;
    private pnlVerFiestas pnlVerFiestas;
    private DefaultComboBoxModel modeloLocales = new DefaultComboBoxModel(), modeloAmenizaciones = new DefaultComboBoxModel(), modeloProyectos = new DefaultComboBoxModel();
    private Locales locales = new Locales();
    private Amenizaciones amenizaciones = new Amenizaciones();
    private Proyectos proyectos = new Proyectos();

    public dlgModificarFiesta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public dlgModificarFiesta(int codFiesta, String nomFiesta, String fecha, double ganancia, int codAmenizacion, int codLocal, int codProyecto, pnlVerFiestas pnl) {
        initComponents();
        this.codFiesta = codFiesta;
        this.codProyecto = codProyecto;
        this.codLocal = codLocal;
        this.codAmenizacion = codAmenizacion;

        this.pnlVerFiestas = pnl;
        lblCodigo.setText(codFiesta + "");
        txtNombreFiesta.setText(nomFiesta);
        txtGanancia.setText("" + ganancia);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaDate = formato.parse(fecha);
            buscadorFecha.setDate(fechaDate);
        } catch (Exception e) {
        }
        
        llenarModelos();
        
        ResultSet rs = locales.obtenerNombreLocal(codLocal);
        String nom = null;
        BucleBusqueda:
        for (int indice = 0; indice < cmbLocales.getItemCount(); indice++) {
            try {
                while (rs.next()) {
                    nom = rs.getString("Nombre_Local");
                }
            } catch (Exception e) {
            }
            if (cmbLocales.getItemAt(indice).equals(nom)) {
                cmbLocales.setSelectedItem(cmbLocales.getItemAt(indice));
                cmbLocalesItemStateChanged(null);
                break BucleBusqueda;
            }
        }
        
        rs = amenizaciones.obtenerNombreAmenizacion(codAmenizacion);
        nom = null;
        BucleBusqueda:
        for (int indice = 0; indice < cmbAmenizaciones.getItemCount(); indice++) {
            try {
                while (rs.next()) {
                    nom = rs.getString("Nombre_Amenizacion");
                }
            } catch (Exception e) {
            }
            if (cmbAmenizaciones.getItemAt(indice).equals(nom)) {
                cmbAmenizaciones.setSelectedItem(cmbAmenizaciones.getItemAt(indice));
                cmbAmenizacionesItemStateChanged(null);
                break BucleBusqueda;
            }
        }
        
        rs = proyectos.obtenerProyecto(codProyecto);
        nom = null;
        BucleBusqueda:
        for (int indice = 0; indice < cmbProyectos.getItemCount(); indice++) {
            try {
                while (rs.next()) {
                    nom = rs.getString("Descripcion");
                }
            } catch (Exception e) {
            }
            if (cmbProyectos.getItemAt(indice).equals(nom)) {
                cmbProyectos.setSelectedItem(cmbProyectos.getItemAt(indice));
                cmbProyectosItemStateChanged(null);
                break BucleBusqueda;
            }
        }
    }

    public void llenarModelos() {
        ResultSet rs = locales.obtenerNombreLocales();

        try {
            while (rs.next()) {
                String nom = rs.getString("Nombre_Local");
                modeloLocales.addElement(nom);
            }
        } catch (Exception e) {
        }
        cmbLocales.setModel(modeloLocales);

        rs = proyectos.obtenerDescripcionProyectos();

        try {
            while (rs.next()) {
                String descripcion = rs.getString("Descripcion");
                modeloProyectos.addElement(descripcion);
            }
        } catch (Exception e) {
        }
        cmbProyectos.setModel(modeloProyectos);

        rs = amenizaciones.obtenerNombreAmenizaciones();

        try {
            while (rs.next()) {
                String nom = rs.getString("Nombre_Amenizacion");
                modeloAmenizaciones.addElement(nom);
            }
        } catch (Exception e) {
        }
        cmbAmenizaciones.setModel(modeloAmenizaciones);
    }

    public void llenarCodLocal(String nom) {
        ResultSet rs = locales.obtenerCodLocal(nom);
        try {
            while (rs.next()) {
                codLocal = rs.getInt("Cod_Local");
                lblCodLocal.setText("" + codLocal);
            }
        } catch (Exception e) {
        }
    }

    public void llenarCodProyecto(String nom) {
        ResultSet rs = proyectos.obtenerCodProyecto(nom);
        try {
            while (rs.next()) {
                codProyecto = rs.getInt("Cod_Proyecto");
                lblCodProyecto.setText("" + codProyecto);
            }
        } catch (Exception e) {
        }
    }

    public void llenarCodAmenizacion(String nom) {
        ResultSet rs = amenizaciones.obtenerCodAmenizacion(nom);
        try {
            while (rs.next()) {
                codAmenizacion = rs.getInt("Cod_Amenizacion");
                lblCodAmenizacion.setText("" + codAmenizacion);
            }
        } catch (Exception e) {
        }
    }

    public String formatearFechaIM(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblProyecto = new javax.swing.JLabel();
        lblNombreFiesta = new javax.swing.JLabel();
        buscadorFecha = new com.toedter.calendar.JDateChooser();
        lblCod = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblAmenizacion = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        txtNombreFiesta = new javax.swing.JTextField();
        lblCodLocal = new javax.swing.JLabel();
        lblCodAmenizacion = new javax.swing.JLabel();
        cmbLocales = new javax.swing.JComboBox<>();
        cmbProyectos = new javax.swing.JComboBox<>();
        lblGanancia = new javax.swing.JLabel();
        cmbAmenizaciones = new javax.swing.JComboBox<>();
        txtGanancia = new javax.swing.JTextField();
        lblCodProyecto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblProyecto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProyecto.setForeground(new java.awt.Color(0, 0, 0));
        lblProyecto.setText("Proyecto:");

        lblNombreFiesta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreFiesta.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreFiesta.setText("Nombre fiesta:");

        lblCod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCod.setForeground(new java.awt.Color(0, 0, 0));
        lblCod.setText("Codigo:");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Fecha realización:");

        btnAceptar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_off.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblAmenizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAmenizacion.setForeground(new java.awt.Color(0, 0, 0));
        lblAmenizacion.setText("Amenización:");

        lblLocal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLocal.setForeground(new java.awt.Color(0, 0, 0));
        lblLocal.setText("Local:");

        txtNombreFiesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreFiestaKeyTyped(evt);
            }
        });

        lblCodLocal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodLocal.setForeground(new java.awt.Color(0, 0, 0));
        lblCodLocal.setText("*");

        lblCodAmenizacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodAmenizacion.setForeground(new java.awt.Color(0, 0, 0));
        lblCodAmenizacion.setText("*");

        cmbLocales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbLocales.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLocalesItemStateChanged(evt);
            }
        });

        cmbProyectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProyectos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProyectosItemStateChanged(evt);
            }
        });

        lblGanancia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGanancia.setForeground(new java.awt.Color(0, 0, 0));
        lblGanancia.setText("Ganancia prevista:");

        cmbAmenizaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAmenizaciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAmenizacionesItemStateChanged(evt);
            }
        });

        txtGanancia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGananciaFocusLost(evt);
            }
        });
        txtGanancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGananciaKeyTyped(evt);
            }
        });

        lblCodProyecto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodProyecto.setForeground(new java.awt.Color(0, 0, 0));
        lblCodProyecto.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLocal)
                        .addGap(437, 437, 437))
                    .addComponent(lblAmenizacion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreFiesta)
                        .addGap(74, 74, 74)
                        .addComponent(txtNombreFiesta, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblProyecto)
                            .addGap(127, 127, 127)
                            .addComponent(cmbProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCodProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFecha)
                                .addComponent(lblGanancia))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscadorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmbAmenizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCodAmenizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmbLocales, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCodLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAceptar))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreFiesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreFiesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblFecha))
                            .addComponent(buscadorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAmenizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbLocales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodLocal)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbAmenizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCodAmenizacion)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodProyecto))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Aceptar_off.png";
        btnAceptar.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnAceptar.setIcon(imagen);
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Aceptar_on.png";
        btnAceptar.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnAceptar.setIcon(imagen);
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (!txtNombreFiesta.getText().replaceAll(" ", "").isEmpty() && !txtGanancia.getText().replaceAll(" ", "").isEmpty()) {
            Date fechaIngresada = buscadorFecha.getDate();
            String fecha = "" + formatearFechaIM(fechaIngresada);

            Object[] p = {codFiesta, txtNombreFiesta.getText(), fecha, txtGanancia.getText(), codAmenizacion, codLocal, codProyecto};
            try {
                new Fiestas().ModificarFiestas(p);
            } catch (Exception e) {
            }

            pnlVerFiestas.llenarTabla();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Campos  vacíos", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNombreFiestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreFiestaKeyTyped
        if (txtNombreFiesta.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreFiestaKeyTyped

    private void cmbLocalesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLocalesItemStateChanged
        String nom = "" + cmbLocales.getItemAt(cmbLocales.getSelectedIndex());
        llenarCodLocal(nom);
    }//GEN-LAST:event_cmbLocalesItemStateChanged

    private void cmbProyectosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProyectosItemStateChanged
        String nom = "" + cmbProyectos.getItemAt(cmbProyectos.getSelectedIndex());
        llenarCodProyecto(nom);
    }//GEN-LAST:event_cmbProyectosItemStateChanged

    private void cmbAmenizacionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAmenizacionesItemStateChanged
        String nom = "" + cmbAmenizaciones.getItemAt(cmbAmenizaciones.getSelectedIndex());
        llenarCodAmenizacion(nom);
    }//GEN-LAST:event_cmbAmenizacionesItemStateChanged

    private void txtGananciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGananciaFocusLost
        if (!txtGanancia.getText().isEmpty()) {
            double num = Math.round(Double.parseDouble(txtGanancia.getText()) * 100) / 100.0;
            txtGanancia.setText("" + num);
        }
    }//GEN-LAST:event_txtGananciaFocusLost

    private void txtGananciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGananciaKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtGanancia.getText().contains(".")) && caracter != KeyEvent.VK_ENTER) {
            evt.consume();
        }
        if (txtGanancia.getText().length() == 0) {
            if (!Character.isDigit(caracter)) {
                evt.consume();
            }
        } else if (txtGanancia.getText().length() == 4) {
            if (caracter != '.' && !txtGanancia.getText().contains(".")) {
                evt.consume();
            }
        } else if (txtGanancia.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtGananciaKeyTyped
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
            java.util.logging.Logger.getLogger(dlgModificarFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgModificarFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgModificarFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgModificarFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgModificarFiesta dialog = new dlgModificarFiesta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private com.toedter.calendar.JDateChooser buscadorFecha;
    private javax.swing.JComboBox<String> cmbAmenizaciones;
    private javax.swing.JComboBox<String> cmbLocales;
    private javax.swing.JComboBox<String> cmbProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAmenizacion;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodAmenizacion;
    private javax.swing.JLabel lblCodLocal;
    private javax.swing.JLabel lblCodProyecto;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGanancia;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblNombreFiesta;
    private javax.swing.JLabel lblProyecto;
    private javax.swing.JTextField txtGanancia;
    private javax.swing.JTextField txtNombreFiesta;
    // End of variables declaration//GEN-END:variables
}
