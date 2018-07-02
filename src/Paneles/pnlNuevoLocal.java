package Paneles;

import TablasDB.Locales;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class pnlNuevoLocal extends javax.swing.JPanel {

    private Locales locales = new Locales();
    private int codigoLocal;

    public pnlNuevoLocal() {
        initComponents();
        llenarCodLocal();
    }

    public void llenarCodLocal() {
        ResultSet rs = locales.obtenerMaxCodLocal();
        try {
            while (rs.next()) {
                codigoLocal = rs.getInt("maximo") + 1;
                lblCodigo.setText("" + codigoLocal);
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCod = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblRenta = new javax.swing.JLabel();
        txtRenta = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblNombreLocal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        lblCod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCod.setForeground(new java.awt.Color(0, 0, 0));
        lblCod.setText("Codigo:");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));

        lblRenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRenta.setForeground(new java.awt.Color(0, 0, 0));
        lblRenta.setText("Costo renta:");

        txtRenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRentaFocusLost(evt);
            }
        });
        txtRenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRentaKeyTyped(evt);
            }
        });

        lblTelefono.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("Teléfono:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

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

        txtLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLocalKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("Dirección:");

        lblNombreLocal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreLocal.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreLocal.setText("Nombre local:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCod)
                            .addGap(18, 18, 18)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTelefono)
                                        .addComponent(lblRenta))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRenta)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombreLocal)
                                        .addComponent(lblDireccion))
                                    .addGap(58, 58, 58)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLocal)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(btnAceptar)
                .addContainerGap(70, Short.MAX_VALUE))
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
        if (!txtRenta.getText().replaceAll(" ", "").isEmpty() && !txtTelefono.getText().replaceAll(" ", "").isEmpty() && !txtDireccion.getText().replaceAll(" ", "").isEmpty() && !txtLocal.getText().replaceAll(" ", "").isEmpty()) {

            Object[] p = {codigoLocal, txtLocal.getText(), txtDireccion.getText(), txtRenta.getText(), txtTelefono.getText()};
            try {
                locales.AgregarLocales(p);
            } catch (Exception e) {
            }
            llenarCodLocal();

            txtDireccion.setText("");
            txtLocal.setText("");
            txtLocal.requestFocus();
            txtRenta.setText("");
            txtTelefono.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Campos  vacíos", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtLocalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocalKeyTyped
        if (txtLocal.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLocalKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtRentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRentaKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtRenta.getText().contains(".")) && caracter != KeyEvent.VK_ENTER) {
            evt.consume();
        }
        if (txtRenta.getText().length() == 0) {
            if (!Character.isDigit(caracter)) {
                evt.consume();
            }
        } else if (txtRenta.getText().length() == 4) {
            if (caracter != '.' && !txtRenta.getText().contains(".")) {
                evt.consume();
            }
        } else if (txtRenta.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRentaKeyTyped

    private void txtRentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRentaFocusLost
        if (!txtRenta.getText().isEmpty()) {
            double num = Math.round(Double.parseDouble(txtRenta.getText()) * 100) / 100.0;
            txtRenta.setText("" + num);
        }
    }//GEN-LAST:event_txtRentaFocusLost

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter) || txtTelefono.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombreLocal;
    private javax.swing.JLabel lblRenta;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtRenta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
