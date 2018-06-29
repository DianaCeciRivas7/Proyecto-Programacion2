package Paneles;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import proyectofinalprogra2.frmPrincipal;

public class pnlMenuLocales extends javax.swing.JPanel {

    frmPrincipal frm;
    
    public pnlMenuLocales(frmPrincipal frm) {
        initComponents();
        this.frm = frm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerLocales = new javax.swing.JButton();
        lblLocales = new javax.swing.JLabel();
        btnNuevoLocal = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 204));

        btnVerLocales.setForeground(new java.awt.Color(0, 0, 0));
        btnVerLocales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ver_off.png"))); // NOI18N
        btnVerLocales.setText("Ver locales registrados");
        btnVerLocales.setToolTipText("");
        btnVerLocales.setBorder(null);
        btnVerLocales.setBorderPainted(false);
        btnVerLocales.setContentAreaFilled(false);
        btnVerLocales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerLocales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerLocalesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerLocalesMouseEntered(evt);
            }
        });
        btnVerLocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerLocalesActionPerformed(evt);
            }
        });

        lblLocales.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLocales.setForeground(new java.awt.Color(0, 0, 0));
        lblLocales.setText("Locales");

        btnNuevoLocal.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevoLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevoLocal_off.png"))); // NOI18N
        btnNuevoLocal.setText("Nuevo local");
        btnNuevoLocal.setBorder(null);
        btnNuevoLocal.setBorderPainted(false);
        btnNuevoLocal.setContentAreaFilled(false);
        btnNuevoLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoLocalMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoLocalMouseEntered(evt);
            }
        });
        btnNuevoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoLocalActionPerformed(evt);
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
                        .addComponent(lblLocales))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnNuevoLocal)
                        .addGap(105, 105, 105)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnVerLocales)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblLocales)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoLocal)
                            .addComponent(btnVerLocales)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerLocalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerLocalesMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Ver_off.png";
        btnVerLocales.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerLocales.setIcon(imagen);
    }//GEN-LAST:event_btnVerLocalesMouseExited

    private void btnVerLocalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerLocalesMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Ver_on.png";
        btnVerLocales.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerLocales.setIcon(imagen);
    }//GEN-LAST:event_btnVerLocalesMouseEntered

    private void btnVerLocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLocalesActionPerformed

    }//GEN-LAST:event_btnVerLocalesActionPerformed

    private void btnNuevoLocalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoLocalMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/NuevoLocal_off.png";
        btnNuevoLocal.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevoLocal.setIcon(imagen);
    }//GEN-LAST:event_btnNuevoLocalMouseExited

    private void btnNuevoLocalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoLocalMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/NuevoLocal_on.png";
        btnNuevoLocal.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevoLocal.setIcon(imagen);
    }//GEN-LAST:event_btnNuevoLocalMouseEntered

    private void btnNuevoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLocalActionPerformed
        frm.agregarPanel(new pnlNuevoLocal());
    }//GEN-LAST:event_btnNuevoLocalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoLocal;
    private javax.swing.JButton btnVerLocales;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLocales;
    // End of variables declaration//GEN-END:variables
}
