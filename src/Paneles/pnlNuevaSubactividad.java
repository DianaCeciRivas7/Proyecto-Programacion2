package Paneles;

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

public class pnlNuevaSubactividad extends javax.swing.JPanel {

    private DefaultComboBoxModel modeloActividades = new DefaultComboBoxModel();
    private Actividades actividades = new Actividades();
    private SubActividades subactividades = new SubActividades();

    private int codActividad, codSubactividad;

    public pnlNuevaSubactividad() {
        initComponents();
        llenarModelo();
        llenarCodigoSubActividad();
        cmbActividadesItemStateChanged(null);
    }

    public void llenarModelo() {
        ResultSet rs = actividades.obtenerNombreActividades();

        try {
            while (rs.next()) {
                String nom = rs.getString("Nombre_Actividad");
                modeloActividades.addElement(nom);
            }
        } catch (Exception e) {
        }
        cmbActividades.setModel(modeloActividades);
    }

    public void llenarCodActividad(String nom) {
        ResultSet rs = actividades.obtenerCodActividad(nom);
        try {
            while (rs.next()) {
                codActividad = rs.getInt("Cod_Actividad");
                lblCodActividad.setText("" + codActividad);
            }
        } catch (Exception e) {
        }
    }

    public void llenarCodigoSubActividad() {
        ResultSet rs = subactividades.obtenerMaxCodSubActividad();
        try {
            while (rs.next()) {
                codSubactividad = rs.getInt("maximo") + 1;
                lblCodigo.setText("" + codSubactividad);
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

        lblCod = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombreSubActividad = new javax.swing.JLabel();
        txtNombreSubActividad = new javax.swing.JTextField();
        lblGanancia = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        buscadorFecha = new com.toedter.calendar.JDateChooser();
        btnAceptar = new javax.swing.JButton();
        lblActividad = new javax.swing.JLabel();
        cmbActividades = new javax.swing.JComboBox<>();
        lblCodActividad = new javax.swing.JLabel();
        lblIngreso = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        lblEgreso = new javax.swing.JLabel();
        txtEgreso = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        lblCod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCod.setForeground(new java.awt.Color(0, 0, 0));
        lblCod.setText("Codigo:");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));

        lblNombreSubActividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreSubActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreSubActividad.setText("Nombre sub-actividad:");

        txtNombreSubActividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreSubActividadKeyTyped(evt);
            }
        });

        lblGanancia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGanancia.setForeground(new java.awt.Color(0, 0, 0));
        lblGanancia.setText("Descripción:");

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

        lblCodActividad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblCodActividad.setText("*");

        lblIngreso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIngreso.setForeground(new java.awt.Color(0, 0, 0));
        lblIngreso.setText("Ingreso:");

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

        lblEgreso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEgreso.setForeground(new java.awt.Color(0, 0, 0));
        lblEgreso.setText("Egreso:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
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
                                .addComponent(txtNombreSubActividad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
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
                .addContainerGap(58, Short.MAX_VALUE))
        );
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

            Object[] p = {codActividad, codSubactividad, txtNombreSubActividad.getText(), txtDescripcion.getText(), fecha, ingreso, egreso};
            try {
                subactividades.AgregarSubActividades(p);
            } catch (Exception e) {
            }

            llenarCodigoSubActividad();
            txtNombreSubActividad.setText("");
            txtNombreSubActividad.requestFocus();
            txtDescripcion.setText("");
            txtIngreso.setText("");
            txtEgreso.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Campos  vacíos", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cmbActividadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbActividadesItemStateChanged
        String nom = "" + cmbActividades.getItemAt(cmbActividades.getSelectedIndex());
        llenarCodActividad(nom);
    }//GEN-LAST:event_cmbActividadesItemStateChanged

    private void txtNombreSubActividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSubActividadKeyTyped
        if (txtNombreSubActividad.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreSubActividadKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (txtDescripcion.getText().length() >= 100) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

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

    private void txtIngresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIngresoFocusLost
        if (!txtIngreso.getText().isEmpty()) {
            double num = Math.round(Double.parseDouble(txtIngreso.getText()) * 100) / 100.0;
            txtIngreso.setText("" + num);
        }
    }//GEN-LAST:event_txtIngresoFocusLost

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

    private void txtEgresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEgresoFocusLost
        if (!txtEgreso.getText().isEmpty()) {
            double num = Math.round(Double.parseDouble(txtEgreso.getText()) * 100) / 100.0;
            txtEgreso.setText("" + num);
        }
    }//GEN-LAST:event_txtEgresoFocusLost


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
