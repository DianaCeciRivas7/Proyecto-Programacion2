package Paneles;

import TablasDB.Actividades;
import TablasDB.Amenizaciones;
import TablasDB.Fiestas;
import TablasDB.Locales;
import TablasDB.Proyectos;
import TablasDB.SubActividades;
import java.awt.Color;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectofinalprogra2.frmPrincipal;

public class pnlMenuFiestas extends javax.swing.JPanel {

    private frmPrincipal frm;

    public pnlMenuFiestas(frmPrincipal frm) {
        initComponents();
        this.frm = frm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerFiestas = new javax.swing.JButton();
        lblFiestas = new javax.swing.JLabel();
        btNuevaFiesta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuevoProyecto = new javax.swing.JButton();
        btnVerProyectos = new javax.swing.JButton();
        btnVerActividadesPorFiesta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        btnVerFiestas.setForeground(new java.awt.Color(0, 0, 0));
        btnVerFiestas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ver_off.png"))); // NOI18N
        btnVerFiestas.setText("Ver fiestas");
        btnVerFiestas.setToolTipText("");
        btnVerFiestas.setBorder(null);
        btnVerFiestas.setBorderPainted(false);
        btnVerFiestas.setContentAreaFilled(false);
        btnVerFiestas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerFiestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerFiestasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerFiestasMouseEntered(evt);
            }
        });
        btnVerFiestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFiestasActionPerformed(evt);
            }
        });

        lblFiestas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFiestas.setForeground(new java.awt.Color(0, 0, 0));
        lblFiestas.setText("Fiestas");

        btNuevaFiesta.setForeground(new java.awt.Color(0, 0, 0));
        btNuevaFiesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar_off.png"))); // NOI18N
        btNuevaFiesta.setText("Nueva fiesta");
        btNuevaFiesta.setBorder(null);
        btNuevaFiesta.setBorderPainted(false);
        btNuevaFiesta.setContentAreaFilled(false);
        btNuevaFiesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNuevaFiestaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNuevaFiestaMouseEntered(evt);
            }
        });
        btNuevaFiesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevaFiestaActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnNuevoProyecto.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevoProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar2_off.png"))); // NOI18N
        btnNuevoProyecto.setText("Nuevo proyecto");
        btnNuevoProyecto.setBorder(null);
        btnNuevoProyecto.setBorderPainted(false);
        btnNuevoProyecto.setContentAreaFilled(false);
        btnNuevoProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoProyectoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoProyectoMouseEntered(evt);
            }
        });
        btnNuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProyectoActionPerformed(evt);
            }
        });

        btnVerProyectos.setForeground(new java.awt.Color(0, 0, 0));
        btnVerProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ver2_off.png"))); // NOI18N
        btnVerProyectos.setText("Ver proyectos");
        btnVerProyectos.setBorder(null);
        btnVerProyectos.setBorderPainted(false);
        btnVerProyectos.setContentAreaFilled(false);
        btnVerProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerProyectosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerProyectosMouseEntered(evt);
            }
        });
        btnVerProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProyectosActionPerformed(evt);
            }
        });

        btnVerActividadesPorFiesta.setForeground(new java.awt.Color(0, 0, 0));
        btnVerActividadesPorFiesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VerActividadesPorFiesta_off.png"))); // NOI18N
        btnVerActividadesPorFiesta.setText("Ver sub-actividades por fiesta");
        btnVerActividadesPorFiesta.setBorder(null);
        btnVerActividadesPorFiesta.setBorderPainted(false);
        btnVerActividadesPorFiesta.setContentAreaFilled(false);
        btnVerActividadesPorFiesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerActividadesPorFiestaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerActividadesPorFiestaMouseEntered(evt);
            }
        });
        btnVerActividadesPorFiesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActividadesPorFiestaActionPerformed(evt);
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
                        .addComponent(lblFiestas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btNuevaFiesta)
                            .addComponent(btnNuevoProyecto))
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerFiestas)
                    .addComponent(btnVerProyectos)
                    .addComponent(btnVerActividadesPorFiesta)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblFiestas)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btNuevaFiesta)
                            .addComponent(btnVerFiestas))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnNuevoProyecto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnVerProyectos)))
                        .addGap(48, 48, 48)
                        .addComponent(btnVerActividadesPorFiesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1))
                .addGap(0, 131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerFiestasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerFiestasMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Ver_off.png";
        btnVerFiestas.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerFiestas.setIcon(imagen);
    }//GEN-LAST:event_btnVerFiestasMouseExited

    private void btnVerFiestasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerFiestasMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Ver_on.png";
        btnVerFiestas.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerFiestas.setIcon(imagen);
    }//GEN-LAST:event_btnVerFiestasMouseEntered

    private void btnVerFiestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFiestasActionPerformed
        int conteoFiestas = 0;
        ResultSet rs = new Fiestas().obtenerConteoFiestas();
        try {
            while (rs.next()) {
                conteoFiestas = rs.getInt("conteo");
            }
        } catch (Exception e) {
        }

        if (conteoFiestas != 0) {
            frm.agregarPanel(new pnlVerFiestas());
        }
    }//GEN-LAST:event_btnVerFiestasActionPerformed

    private void btNuevaFiestaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevaFiestaMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar_off.png";
        btNuevaFiesta.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btNuevaFiesta.setIcon(imagen);
    }//GEN-LAST:event_btNuevaFiestaMouseExited

    private void btNuevaFiestaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevaFiestaMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar_on.png";
        btNuevaFiesta.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btNuevaFiesta.setIcon(imagen);
    }//GEN-LAST:event_btNuevaFiestaMouseEntered

    private void btNuevaFiestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevaFiestaActionPerformed
        int conteoLocales = 0, conteoProyectos = 0, conteoAmenizaciones = 0;
        ResultSet rs1 = new Locales().obtenerConteoLocales();
        ResultSet rs2 = new Proyectos().obtenerConteoProyectos();
        ResultSet rs3 = new Amenizaciones().obtenerConteoAmenizaciones();
        try {
            while (rs1.next() && rs2.next() && rs3.next()) {
                conteoLocales = rs1.getInt("conteo");
                conteoProyectos = rs2.getInt("conteo");
                conteoAmenizaciones = rs3.getInt("conteo");
            }
        } catch (Exception e) {
        }

        if (conteoLocales != 0) {
            if (conteoProyectos != 0) {
                if (conteoAmenizaciones != 0) {
                    frm.agregarPanel(new pnlNuevaFiesta());
                } else {
                    JOptionPane.showMessageDialog(null, "No hay amenizacion registrada", "Atención", JOptionPane.ERROR_MESSAGE);
                    frm.agregarPanel(new pnlNuevaAmenizacion());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay proyectos registrados", "Atención", JOptionPane.ERROR_MESSAGE);
                frm.agregarPanel(new pnlNuevoProyecto());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay locales registrados", "Atención", JOptionPane.ERROR_MESSAGE);
            frm.agregarPanel(new pnlNuevoLocal());
        }
    }//GEN-LAST:event_btNuevaFiestaActionPerformed

    private void btnNuevoProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProyectoMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar2_off.png";
        btnNuevoProyecto.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevoProyecto.setIcon(imagen);
    }//GEN-LAST:event_btnNuevoProyectoMouseExited

    private void btnNuevoProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProyectoMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Agregar2_on.png";
        btnNuevoProyecto.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnNuevoProyecto.setIcon(imagen);
    }//GEN-LAST:event_btnNuevoProyectoMouseEntered

    private void btnNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProyectoActionPerformed
        frm.agregarPanel(new pnlNuevoProyecto());
    }//GEN-LAST:event_btnNuevoProyectoActionPerformed

    private void btnVerProyectosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerProyectosMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Ver2_off.png";
        btnVerProyectos.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerProyectos.setIcon(imagen);
    }//GEN-LAST:event_btnVerProyectosMouseExited

    private void btnVerProyectosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerProyectosMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Ver2_on.png";
        btnVerProyectos.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerProyectos.setIcon(imagen);
    }//GEN-LAST:event_btnVerProyectosMouseEntered

    private void btnVerProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProyectosActionPerformed
        int conteoProyectos = 0;
        ResultSet rs = new Proyectos().obtenerConteoProyectos();
        try {
            while (rs.next()) {
                conteoProyectos = rs.getInt("conteo");
            }
        } catch (Exception e) {
        }

        if (conteoProyectos != 0) {
            frm.agregarPanel(new pnlVerProyectos());
        }
    }//GEN-LAST:event_btnVerProyectosActionPerformed

    private void btnVerActividadesPorFiestaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerActividadesPorFiestaMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/VerActividadesPorFiesta_on.png";
        btnVerActividadesPorFiesta.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerActividadesPorFiesta.setIcon(imagen);
    }//GEN-LAST:event_btnVerActividadesPorFiestaMouseEntered

    private void btnVerActividadesPorFiestaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerActividadesPorFiestaMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/VerActividadesPorFiesta_off.png";
        btnVerActividadesPorFiesta.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnVerActividadesPorFiesta.setIcon(imagen);
    }//GEN-LAST:event_btnVerActividadesPorFiestaMouseExited

    private void btnVerActividadesPorFiestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActividadesPorFiestaActionPerformed
        int conteoActividades = 0, conteoSubActividades = 0;
        ResultSet rs1 = new Actividades().obtenerConteoActividades();
        ResultSet rs2 = new SubActividades().obtenerConteoSubActividades();
        try {
            while (rs1.next() && rs2.next()) {
                conteoActividades = rs1.getInt("conteo");
                conteoSubActividades = rs2.getInt("conteo");
            }
        } catch (Exception e) {
        }

        if (conteoActividades != 0) {
            if (conteoSubActividades != 0) {
                frm.agregarPanel(new pnlVerSubActividadesPorFiesta());
            } else {
                JOptionPane.showMessageDialog(null, "No hay sub-actividades registradas", "Atención", JOptionPane.ERROR_MESSAGE);
                frm.agregarPanel(new pnlNuevaSubactividad());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay actividades registradas", "Atención", JOptionPane.ERROR_MESSAGE);
            frm.agregarPanel(new pnlNuevaActividad());
        }
    }//GEN-LAST:event_btnVerActividadesPorFiestaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNuevaFiesta;
    private javax.swing.JButton btnNuevoProyecto;
    private javax.swing.JButton btnVerActividadesPorFiesta;
    private javax.swing.JButton btnVerFiestas;
    private javax.swing.JButton btnVerProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFiestas;
    // End of variables declaration//GEN-END:variables
}
