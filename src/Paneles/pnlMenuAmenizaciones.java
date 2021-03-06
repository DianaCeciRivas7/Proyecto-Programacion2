package Paneles;

import TablasDB.Amenizaciones;
import java.awt.Color;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import proyectofinalprogra2.frmPrincipal;

public class pnlMenuAmenizaciones extends javax.swing.JPanel {

    private frmPrincipal frm;
    private Amenizaciones amenizaciones = new Amenizaciones();
    
    public pnlMenuAmenizaciones(frmPrincipal frm) {
        initComponents();
        this.frm = frm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerAmenizaciones = new javax.swing.JButton();
        lblAmenizaciones = new javax.swing.JLabel();
        btnNuevaAmenizacion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 204));

        btnVerAmenizaciones.setForeground(new java.awt.Color(0, 0, 0));
        btnVerAmenizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ver_off.png"))); // NOI18N
        btnVerAmenizaciones.setText("Ver amenizaciones");
        btnVerAmenizaciones.setToolTipText("");
        btnVerAmenizaciones.setBorder(null);
        btnVerAmenizaciones.setBorderPainted(false);
        btnVerAmenizaciones.setContentAreaFilled(false);
        btnVerAmenizaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerAmenizaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerAmenizacionesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerAmenizacionesMouseEntered(evt);
            }
        });
        btnVerAmenizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAmenizacionesActionPerformed(evt);
            }
        });

        lblAmenizaciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAmenizaciones.setForeground(new java.awt.Color(0, 0, 0));
        lblAmenizaciones.setText("Amenizaciones");

        btnNuevaAmenizacion.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevaAmenizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar2_off.png"))); // NOI18N
        btnNuevaAmenizacion.setText("Nueva amenizacion");
        btnNuevaAmenizacion.setBorder(null);
        btnNuevaAmenizacion.setBorderPainted(false);
        btnNuevaAmenizacion.setContentAreaFilled(false);
        btnNuevaAmenizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaAmenizacionMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevaAmenizacionMouseEntered(evt);
            }
        });
        btnNuevaAmenizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaAmenizacionActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblAmenizaciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnNuevaAmenizacion)
                        .addGap(105, 105, 105)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnVerAmenizaciones)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblAmenizaciones)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevaAmenizacion)
                            .addComponent(btnVerAmenizaciones)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerAmenizacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerAmenizacionesMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Ver_off.png";
        btnVerAmenizaciones.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerAmenizaciones.setIcon(imagen);
    }//GEN-LAST:event_btnVerAmenizacionesMouseExited

    private void btnVerAmenizacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerAmenizacionesMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Ver_on.png";
        btnVerAmenizaciones.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerAmenizaciones.setIcon(imagen);
    }//GEN-LAST:event_btnVerAmenizacionesMouseEntered

    private void btnVerAmenizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAmenizacionesActionPerformed
        int conteoAmenizaciones = 0;
        ResultSet rs = amenizaciones.obtenerConteoAmenizaciones();
        try {
            while (rs.next()) {                
                conteoAmenizaciones = rs.getInt("conteo");
            }
        } catch (Exception e) {
        }
        
        if (conteoAmenizaciones != 0) {
            frm.agregarPanel(new pnlVerAmenizaciones());
        }
    }//GEN-LAST:event_btnVerAmenizacionesActionPerformed

    private void btnNuevaAmenizacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaAmenizacionMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar2_off.png";
        btnNuevaAmenizacion.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevaAmenizacion.setIcon(imagen);
    }//GEN-LAST:event_btnNuevaAmenizacionMouseExited

    private void btnNuevaAmenizacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaAmenizacionMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar2_on.png";
        btnNuevaAmenizacion.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevaAmenizacion.setIcon(imagen);
    }//GEN-LAST:event_btnNuevaAmenizacionMouseEntered

    private void btnNuevaAmenizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaAmenizacionActionPerformed
        frm.agregarPanel(new pnlNuevaAmenizacion());
    }//GEN-LAST:event_btnNuevaAmenizacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaAmenizacion;
    private javax.swing.JButton btnVerAmenizaciones;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAmenizaciones;
    // End of variables declaration//GEN-END:variables
}
