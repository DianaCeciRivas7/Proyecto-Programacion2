package Dialogos;

import Paneles.pnlVerAmenizaciones;
import TablasDB.Amenizaciones;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class dlgModificarAmenizacion extends javax.swing.JDialog {

    private int codAme;
    private pnlVerAmenizaciones pnlVerAmenizaciones;
    private Amenizaciones amenizaciones = new Amenizaciones();

    public dlgModificarAmenizacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public dlgModificarAmenizacion(int codAme, String nomAme, double costo, int telefono, pnlVerAmenizaciones pnl) {
        initComponents();
        this.codAme = codAme;
        this.pnlVerAmenizaciones = pnl;
        lblCodigo.setText(codAme + "");
        txtAmenizacion.setText(nomAme);
        txtCosto.setText("" + costo);
        txtTelefono.setText("" + telefono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCod = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombreAmenizacion = new javax.swing.JLabel();
        txtAmenizacion = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCod.setForeground(new java.awt.Color(0, 0, 0));
        lblCod.setText("Codigo:");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));

        lblNombreAmenizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreAmenizacion.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreAmenizacion.setText("Nombre:");

        txtAmenizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmenizacionKeyTyped(evt);
            }
        });

        lblCosto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(0, 0, 0));
        lblCosto.setText("Costo:");

        txtCosto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCostoFocusLost(evt);
            }
        });
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAceptar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombreAmenizacion)
                                .addComponent(lblCosto)
                                .addComponent(lblTelefono))
                            .addGap(76, 76, 76)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTelefono)
                                .addComponent(txtAmenizacion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreAmenizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAmenizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnAceptar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmenizacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmenizacionKeyTyped
        if (txtAmenizacion.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmenizacionKeyTyped

    private void txtCostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostoFocusLost
        if (!txtCosto.getText().isEmpty()) {
            double num = Math.round(Double.parseDouble(txtCosto.getText()) * 100) / 100.0;
            txtCosto.setText("" + num);
        }
    }//GEN-LAST:event_txtCostoFocusLost

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtCosto.getText().contains(".")) && caracter != KeyEvent.VK_ENTER) {
            evt.consume();
        }
        if (txtCosto.getText().length() == 0) {
            if (!Character.isDigit(caracter)) {
                evt.consume();
            }
        } else if (txtCosto.getText().length() == 4) {
            if (caracter != '.' && !txtCosto.getText().contains(".")) {
                evt.consume();
            }
        } else if (txtCosto.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter) || txtTelefono.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

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
        if (!txtTelefono.getText().replaceAll(" ", "").isEmpty() && !txtCosto.getText().replaceAll(" ", "").isEmpty() && !txtAmenizacion.getText().replaceAll(" ", "").isEmpty()) {

            Object[] p = {codAme, txtAmenizacion.getText(), txtCosto.getText(), txtTelefono.getText()};
            try {
                amenizaciones.ModificarAmenizaciones(p);
            } catch (Exception e) {
            }
            
            pnlVerAmenizaciones.llenarTabla();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Campos  vacíos", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed
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
            java.util.logging.Logger.getLogger(dlgModificarAmenizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgModificarAmenizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgModificarAmenizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgModificarAmenizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgModificarAmenizacion dialog = new dlgModificarAmenizacion(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblNombreAmenizacion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtAmenizacion;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
