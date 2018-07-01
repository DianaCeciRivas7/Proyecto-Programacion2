package Paneles;

import TablasDB.Actividades;
import TablasDB.Fiestas;
import TablasDB.SubActividades;
import java.awt.Color;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectofinalprogra2.frmPrincipal;

public class pnlMenuActividades extends javax.swing.JPanel {

    private frmPrincipal frm;

    public pnlMenuActividades(frmPrincipal frm) {
        initComponents();
        this.frm = frm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerSubactividades = new javax.swing.JButton();
        btnVerActividades = new javax.swing.JButton();
        lblActividades = new javax.swing.JLabel();
        btnNuevaActividad = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuevaSubactividad = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        btnVerSubactividades.setForeground(new java.awt.Color(0, 0, 0));
        btnVerSubactividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ver2_off.png"))); // NOI18N
        btnVerSubactividades.setText("Ver sub-actividades");
        btnVerSubactividades.setBorder(null);
        btnVerSubactividades.setBorderPainted(false);
        btnVerSubactividades.setContentAreaFilled(false);
        btnVerSubactividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerSubactividadesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerSubactividadesMouseEntered(evt);
            }
        });
        btnVerSubactividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSubactividadesActionPerformed(evt);
            }
        });

        btnVerActividades.setForeground(new java.awt.Color(0, 0, 0));
        btnVerActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ver_off.png"))); // NOI18N
        btnVerActividades.setText("Ver actividades");
        btnVerActividades.setToolTipText("");
        btnVerActividades.setBorder(null);
        btnVerActividades.setBorderPainted(false);
        btnVerActividades.setContentAreaFilled(false);
        btnVerActividades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerActividadesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerActividadesMouseEntered(evt);
            }
        });
        btnVerActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActividadesActionPerformed(evt);
            }
        });

        lblActividades.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblActividades.setForeground(new java.awt.Color(0, 0, 0));
        lblActividades.setText("Fiestas");

        btnNuevaActividad.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevaActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar_off.png"))); // NOI18N
        btnNuevaActividad.setText("Nueva actividad");
        btnNuevaActividad.setBorder(null);
        btnNuevaActividad.setBorderPainted(false);
        btnNuevaActividad.setContentAreaFilled(false);
        btnNuevaActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaActividadMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevaActividadMouseEntered(evt);
            }
        });
        btnNuevaActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActividadActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnNuevaSubactividad.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevaSubactividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar2_off.png"))); // NOI18N
        btnNuevaSubactividad.setText("Nuevo sub-actividad");
        btnNuevaSubactividad.setBorder(null);
        btnNuevaSubactividad.setBorderPainted(false);
        btnNuevaSubactividad.setContentAreaFilled(false);
        btnNuevaSubactividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaSubactividadMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevaSubactividadMouseEntered(evt);
            }
        });
        btnNuevaSubactividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSubactividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblActividades))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevaActividad)
                            .addComponent(btnNuevaSubactividad))
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerActividades)
                            .addComponent(btnVerSubactividades, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblActividades)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevaActividad)
                            .addComponent(btnVerActividades))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnNuevaSubactividad))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnVerSubactividades))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerSubactividadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerSubactividadesMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Ver2_off.png";
        btnVerSubactividades.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerSubactividades.setIcon(imagen);
    }//GEN-LAST:event_btnVerSubactividadesMouseExited

    private void btnVerSubactividadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerSubactividadesMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Ver2_on.png";
        btnVerSubactividades.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerSubactividades.setIcon(imagen);
    }//GEN-LAST:event_btnVerSubactividadesMouseEntered

    private void btnVerActividadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerActividadesMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Ver_off.png";
        btnVerActividades.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerActividades.setIcon(imagen);
    }//GEN-LAST:event_btnVerActividadesMouseExited

    private void btnVerActividadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerActividadesMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Ver_on.png";
        btnVerActividades.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerActividades.setIcon(imagen);
    }//GEN-LAST:event_btnVerActividadesMouseEntered

    private void btnVerActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActividadesActionPerformed
        int conteoActividades = 0;
        ResultSet rs = new Actividades().obtenerConteoActividades();
        try {
            while (rs.next()) {
                conteoActividades = rs.getInt("conteo");
            }
        } catch (Exception e) {
        }

        if (conteoActividades != 0) {
            frm.agregarPanel(new pnlVerActividades());
        } else {
            JOptionPane.showMessageDialog(null, "No hay actividades registradas", "Atención", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerActividadesActionPerformed

    private void btnNuevaActividadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaActividadMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar_off.png";
        btnNuevaActividad.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevaActividad.setIcon(imagen);
    }//GEN-LAST:event_btnNuevaActividadMouseExited

    private void btnNuevaActividadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaActividadMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar_on.png";
        btnNuevaActividad.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevaActividad.setIcon(imagen);
    }//GEN-LAST:event_btnNuevaActividadMouseEntered

    private void btnNuevaActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActividadActionPerformed
        int conteoFiestas = 0;
        ResultSet rs = new Fiestas().obtenerConteoFiestas();
        try {
            while (rs.next()) {
                conteoFiestas = rs.getInt("conteo");
            }
        } catch (Exception e) {
        }

        if (conteoFiestas != 0) {
            frm.agregarPanel(new pnlNuevaActividad());
        } else {
            JOptionPane.showMessageDialog(null, "No hay fiestas registradas", "Atención", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNuevaActividadActionPerformed

    private void btnNuevaSubactividadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSubactividadMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar2_off.png";
        btnNuevaSubactividad.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevaSubactividad.setIcon(imagen);
    }//GEN-LAST:event_btnNuevaSubactividadMouseExited

    private void btnNuevaSubactividadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSubactividadMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar2_on.png";
        btnNuevaSubactividad.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevaSubactividad.setIcon(imagen);
    }//GEN-LAST:event_btnNuevaSubactividadMouseEntered

    private void btnNuevaSubactividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSubactividadActionPerformed
        int conteoActividades = 0;
        ResultSet rs = new Actividades().obtenerConteoActividades();
        try {
            while (rs.next()) {
                conteoActividades = rs.getInt("conteo");
            }
        } catch (Exception e) {
        }

        if (conteoActividades != 0) {
            frm.agregarPanel(new pnlNuevaSubactividad());
        } else {
            JOptionPane.showMessageDialog(null, "No hay actividades registradas", "Atención", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNuevaSubactividadActionPerformed

    private void btnVerSubactividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSubactividadesActionPerformed
        int conteoSubActividades = 0;
        ResultSet rs = new SubActividades().obtenerConteoSubActividades();
        try {
            while (rs.next()) {
                conteoSubActividades = rs.getInt("conteo");
            }
        } catch (Exception e) {
        }

        if (conteoSubActividades != 0) {
            frm.agregarPanel(new pnlVerSubActividades());
        } else {
            JOptionPane.showMessageDialog(null, "No hay sub-actividades registradas", "Atención", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerSubactividadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaActividad;
    private javax.swing.JButton btnNuevaSubactividad;
    private javax.swing.JButton btnVerActividades;
    private javax.swing.JButton btnVerSubactividades;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblActividades;
    // End of variables declaration//GEN-END:variables
}
