package Dialogos;

import Paneles.pnlVerSubActividades;
import TablasDB.Actividades;
import TablasDB.SubActividades;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.net.URL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class dlgModificarSubActividad extends javax.swing.JDialog {

    private int codSubActividad, codActividad;
    private pnlVerSubActividades pnlVerSubActividades;
    private DefaultComboBoxModel modeloSubActividades = new DefaultComboBoxModel();
    private SubActividades subactividades = new SubActividades();

    public dlgModificarSubActividad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public dlgModificarSubActividad(int codSubActividad, String nomSubActividad, String descripcion, String fecha, double ingreso, double egreso, int codActividad, pnlVerSubActividades pnl) {
        initComponents();
        this.codSubActividad = codSubActividad;
        this.codActividad = codActividad;
        this.pnlVerSubActividades = pnl;
        lblCodigo.setText(codSubActividad + "");
        txtNombreSubActividad.setText(nomSubActividad);
        txtDescripcion.setText(descripcion);
        txtIngreso.setText("" + ingreso);
        txtEgreso.setText("" + egreso);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaDate = formato.parse(fecha);
            buscadorFecha.setDate(fechaDate);
        } catch (Exception e) {
        }
        llenarModelo();
        ResultSet rs = new Actividades().obtenerNombreActividad(codActividad);
        String nom = null;
        BucleBusqueda:
        for (int indice = 0; indice < cmbActividades.getItemCount(); indice++) {
            try {
                while (rs.next()) {
                    nom = rs.getString("Nombre_Actividad");
                }
            } catch (Exception e) {
            }
            if (cmbActividades.getItemAt(indice).equals(nom)) {
                cmbActividades.setSelectedItem(cmbActividades.getItemAt(indice));
                cmbActividadesItemStateChanged(null);
                break BucleBusqueda;
            }
        }
    }

    public void llenarModelo() {
        ResultSet rs = new Actividades().obtenerNombreActividades();

        try {
            while (rs.next()) {
                String nom = rs.getString("Nombre_Actividad");
                modeloSubActividades.addElement(nom);
            }
        } catch (Exception e) {
        }
        cmbActividades.setModel(modeloSubActividades);
    }

    public void llenarCodActividad(String nom) {
        ResultSet rs = new Actividades().obtenerCodActividad(nom);
        try {
            while (rs.next()) {
                codActividad = rs.getInt("Cod_Actividad");
                lblCodActividad.setText("" + codActividad);
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

        txtEgreso = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        buscadorFecha = new com.toedter.calendar.JDateChooser();
        btnAceptar = new javax.swing.JButton();
        lblActividad = new javax.swing.JLabel();
        cmbActividades = new javax.swing.JComboBox<>();
        lblCod = new javax.swing.JLabel();
        lblCodActividad = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblIngreso = new javax.swing.JLabel();
        lblNombreSubActividad = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        txtNombreSubActividad = new javax.swing.JTextField();
        lblEgreso = new javax.swing.JLabel();
        lblGanancia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtEgreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEgresoFocusLost(evt);
            }
        });
        txtEgreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEgresoKeyTyped(evt);
            }
        });

        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

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

        lblActividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblActividad.setText("De la actividad:");

        cmbActividades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbActividades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbActividadesItemStateChanged(evt);
            }
        });

        lblCod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCod.setForeground(new java.awt.Color(0, 0, 0));
        lblCod.setText("Codigo:");

        lblCodActividad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblCodActividad.setText("*");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));

        lblIngreso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIngreso.setForeground(new java.awt.Color(0, 0, 0));
        lblIngreso.setText("Ingreso:");

        lblNombreSubActividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreSubActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreSubActividad.setText("Nombre sub-actividad:");

        txtIngreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIngresoFocusLost(evt);
            }
        });
        txtIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresoKeyTyped(evt);
            }
        });

        txtNombreSubActividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreSubActividadKeyTyped(evt);
            }
        });

        lblEgreso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEgreso.setForeground(new java.awt.Color(0, 0, 0));
        lblEgreso.setText("Egreso:");

        lblGanancia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGanancia.setForeground(new java.awt.Color(0, 0, 0));
        lblGanancia.setText("Descripción:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGanancia)
                            .addComponent(lblEgreso)
                            .addComponent(lblIngreso)
                            .addComponent(lblActividad)
                            .addComponent(lblNombreSubActividad)
                            .addComponent(lblFecha))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmbActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCodActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnAceptar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEgreso, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIngreso)
                                .addComponent(buscadorFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreSubActividad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreSubActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreSubActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(buscadorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodActividad)))
                .addGap(27, 27, 27)
                .addComponent(btnAceptar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEgresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEgresoFocusLost
        if (!txtEgreso.getText().isEmpty()) {
            double num = Math.round(Double.parseDouble(txtEgreso.getText()) * 100) / 100.0;
            txtEgreso.setText("" + num);
        }
    }//GEN-LAST:event_txtEgresoFocusLost

    private void txtEgresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEgresoKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtEgreso.getText().contains(".")) && caracter != KeyEvent.VK_ENTER) {
            evt.consume();
        }
        if (txtEgreso.getText().length() == 0) {
            if (!Character.isDigit(caracter)) {
                evt.consume();
            }
        } else if (txtEgreso.getText().length() == 4) {
            if (caracter != '.' && !txtEgreso.getText().contains(".")) {
                evt.consume();
            }
        } else if (txtEgreso.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEgresoKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (txtDescripcion.getText().length() >= 100) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

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
        if (!txtNombreSubActividad.getText().replaceAll(" ", "").isEmpty() && !txtDescripcion.getText().replaceAll(" ", "").isEmpty()) {
            Date fechaIngresada = buscadorFecha.getDate();
            String fecha = "" + formatearFechaIM(fechaIngresada);

            double ingreso, egreso;
            if (txtIngreso.getText().replaceAll(" ", "").isEmpty()) {
                ingreso = 0;
            } else {
                ingreso = Double.parseDouble(txtIngreso.getText());
            }
            if (txtEgreso.getText().replaceAll(" ", "").isEmpty()) {
                egreso = 0;
            } else {
                egreso = Double.parseDouble(txtEgreso.getText());
            }

            Object[] p = {codActividad, codSubActividad, txtNombreSubActividad.getText(), txtDescripcion.getText(), fecha, ingreso, egreso};
            try {
                subactividades.ModificarSubActividades(p);
            } catch (Exception e) {
            }

            pnlVerSubActividades.llenarTabla();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Campos  vacíos", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cmbActividadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbActividadesItemStateChanged
        String nom = "" + cmbActividades.getItemAt(cmbActividades.getSelectedIndex());
        llenarCodActividad(nom);
    }//GEN-LAST:event_cmbActividadesItemStateChanged

    private void txtIngresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIngresoFocusLost
        if (!txtIngreso.getText().isEmpty()) {
            double num = Math.round(Double.parseDouble(txtIngreso.getText()) * 100) / 100.0;
            txtIngreso.setText("" + num);
        }
    }//GEN-LAST:event_txtIngresoFocusLost

    private void txtIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresoKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtIngreso.getText().contains(".")) && caracter != KeyEvent.VK_ENTER) {
            evt.consume();
        }
        if (txtIngreso.getText().length() == 0) {
            if (!Character.isDigit(caracter)) {
                evt.consume();
            }
        } else if (txtIngreso.getText().length() == 4) {
            if (caracter != '.' && !txtIngreso.getText().contains(".")) {
                evt.consume();
            }
        } else if (txtIngreso.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIngresoKeyTyped

    private void txtNombreSubActividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSubActividadKeyTyped
        if (txtNombreSubActividad.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreSubActividadKeyTyped
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
            java.util.logging.Logger.getLogger(dlgModificarSubActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgModificarSubActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgModificarSubActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgModificarSubActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgModificarSubActividad dialog = new dlgModificarSubActividad(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbActividades;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodActividad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEgreso;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGanancia;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JLabel lblNombreSubActividad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEgreso;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombreSubActividad;
    // End of variables declaration//GEN-END:variables
}
