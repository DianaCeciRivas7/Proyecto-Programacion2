package proyectofinalprogra2;

import Paneles.pnlIngresosEgresos;
import Paneles.pnlMenuActividades;
import Paneles.pnlMenuAmenizaciones;
import Paneles.pnlMenuFiestas;
import Paneles.pnlMenuLocales;
import TablasDB.Fiestas;
import TablasDB.SubActividades;
import java.awt.Color;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();

        btnFiestas.setToolTipText("Mostrar fiestas");
        btnLocales.setToolTipText("Mostrar locales registrados");
        btnActividades.setToolTipText("Mostrar actividades");
        btnAmenizaciones.setToolTipText("Mostrar amenizaciones");
        btnIngresosEgresos.setToolTipText("Mostrar ingresos y egresos");
        btnFiestasActionPerformed(null);

        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Control fiestas");
    }

    public void agregarPanel(JPanel pnl) {
        pnlContenido.removeAll();
        pnl.setLocation(0, 0);
        pnl.setSize(1030, 740);
        pnlContenido.add(pnl);
        pnlContenido.revalidate();
        pnlContenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        lblFiestas = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        btnFiestas = new javax.swing.JButton();
        btnLocales = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        btnAmenizaciones = new javax.swing.JButton();
        btnIngresosEgresos = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/ProyectoFiestas.png")).getImage());
        setUndecorated(true);

        pnlSuperior.setBackground(new java.awt.Color(153, 153, 153));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_off.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblFiestas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFiestas.setForeground(new java.awt.Color(0, 0, 0));
        lblFiestas.setText("Administración de fiestas");

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFiestas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar))
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFiestas)
                .addContainerGap())
        );

        pnlOpciones.setBackground(new java.awt.Color(51, 51, 51));

        btnFiestas.setBackground(new java.awt.Color(51, 51, 51));
        btnFiestas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFiestas.setForeground(new java.awt.Color(255, 255, 255));
        btnFiestas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fiestas_off.png"))); // NOI18N
        btnFiestas.setText("Fiestas");
        btnFiestas.setBorder(null);
        btnFiestas.setBorderPainted(false);
        btnFiestas.setContentAreaFilled(false);
        btnFiestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFiestasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFiestasMouseEntered(evt);
            }
        });
        btnFiestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiestasActionPerformed(evt);
            }
        });

        btnLocales.setBackground(new java.awt.Color(51, 51, 51));
        btnLocales.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLocales.setForeground(new java.awt.Color(255, 255, 255));
        btnLocales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Locales_off.png"))); // NOI18N
        btnLocales.setText("Locales");
        btnLocales.setBorder(null);
        btnLocales.setBorderPainted(false);
        btnLocales.setContentAreaFilled(false);
        btnLocales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLocalesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLocalesMouseEntered(evt);
            }
        });
        btnLocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalesActionPerformed(evt);
            }
        });

        btnActividades.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnActividades.setForeground(new java.awt.Color(255, 255, 255));
        btnActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actividades_off.png"))); // NOI18N
        btnActividades.setText("Actividades");
        btnActividades.setBorder(null);
        btnActividades.setBorderPainted(false);
        btnActividades.setContentAreaFilled(false);
        btnActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActividadesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActividadesMouseEntered(evt);
            }
        });
        btnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesActionPerformed(evt);
            }
        });

        btnAmenizaciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAmenizaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnAmenizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amenizaciones_off.png"))); // NOI18N
        btnAmenizaciones.setText("Amenizaciones");
        btnAmenizaciones.setBorder(null);
        btnAmenizaciones.setBorderPainted(false);
        btnAmenizaciones.setContentAreaFilled(false);
        btnAmenizaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAmenizacionesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAmenizacionesMouseEntered(evt);
            }
        });
        btnAmenizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmenizacionesActionPerformed(evt);
            }
        });

        btnIngresosEgresos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIngresosEgresos.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresosEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngresosEgresos_off.png"))); // NOI18N
        btnIngresosEgresos.setText("Ingresos y Egresos");
        btnIngresosEgresos.setBorder(null);
        btnIngresosEgresos.setBorderPainted(false);
        btnIngresosEgresos.setContentAreaFilled(false);
        btnIngresosEgresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresosEgresosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresosEgresosMouseEntered(evt);
            }
        });
        btnIngresosEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosEgresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActividades, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLocales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(btnFiestas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAmenizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresosEgresos)
                .addContainerGap())
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnFiestas)
                .addGap(40, 40, 40)
                .addComponent(btnLocales)
                .addGap(38, 38, 38)
                .addComponent(btnActividades)
                .addGap(38, 38, 38)
                .addComponent(btnAmenizaciones)
                .addGap(38, 38, 38)
                .addComponent(btnIngresosEgresos)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/cerrar_on.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnCerrar.setIcon(imagen);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/cerrar_off.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnCerrar.setIcon(imagen);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnFiestasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiestasMouseEntered
        btnFiestas.setForeground(Color.LIGHT_GRAY);
        ImageIcon imagen;
        String dir = "/Imagenes/Fiestas_on.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnFiestas.setIcon(imagen);
    }//GEN-LAST:event_btnFiestasMouseEntered

    private void btnFiestasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiestasMouseExited
        btnFiestas.setForeground(Color.WHITE);
        ImageIcon imagen;
        String dir = "/Imagenes/Fiestas_off.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnFiestas.setIcon(imagen);
    }//GEN-LAST:event_btnFiestasMouseExited

    private void btnLocalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLocalesMouseExited
        btnLocales.setForeground(Color.WHITE);
        ImageIcon imagen;
        String dir = "/Imagenes/Locales_off.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnLocales.setIcon(imagen);
    }//GEN-LAST:event_btnLocalesMouseExited

    private void btnLocalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLocalesMouseEntered
        btnLocales.setForeground(Color.LIGHT_GRAY);
        ImageIcon imagen;
        String dir = "/Imagenes/Locales_on.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnLocales.setIcon(imagen);
    }//GEN-LAST:event_btnLocalesMouseEntered

    private void btnActividadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActividadesMouseEntered
        btnActividades.setForeground(Color.LIGHT_GRAY);
        ImageIcon imagen;
        String dir = "/Imagenes/Actividades_on.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnActividades.setIcon(imagen);
    }//GEN-LAST:event_btnActividadesMouseEntered

    private void btnActividadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActividadesMouseExited
        btnActividades.setForeground(Color.WHITE);
        ImageIcon imagen;
        String dir = "/Imagenes/Actividades_off.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnActividades.setIcon(imagen);
    }//GEN-LAST:event_btnActividadesMouseExited

    private void btnFiestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiestasActionPerformed
        agregarPanel(new pnlMenuFiestas(this));
    }//GEN-LAST:event_btnFiestasActionPerformed

    private void btnLocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalesActionPerformed
        agregarPanel(new pnlMenuLocales(this));
    }//GEN-LAST:event_btnLocalesActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        agregarPanel(new pnlMenuActividades(this));
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnAmenizacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmenizacionesMouseEntered
        btnAmenizaciones.setForeground(Color.LIGHT_GRAY);
        ImageIcon imagen;
        String dir = "/Imagenes/Amenizaciones_on.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnAmenizaciones.setIcon(imagen);
    }//GEN-LAST:event_btnAmenizacionesMouseEntered

    private void btnAmenizacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmenizacionesMouseExited
        btnAmenizaciones.setForeground(Color.WHITE);
        ImageIcon imagen;
        String dir = "/Imagenes/Amenizaciones_off.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnAmenizaciones.setIcon(imagen);
    }//GEN-LAST:event_btnAmenizacionesMouseExited

    private void btnAmenizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmenizacionesActionPerformed
        agregarPanel(new pnlMenuAmenizaciones(this));
    }//GEN-LAST:event_btnAmenizacionesActionPerformed

    private void btnIngresosEgresosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosEgresosMouseEntered
        btnIngresosEgresos.setForeground(Color.LIGHT_GRAY);
        ImageIcon imagen;
        String dir = "/Imagenes/IngresosEgresos_on.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnIngresosEgresos.setIcon(imagen);
    }//GEN-LAST:event_btnIngresosEgresosMouseEntered

    private void btnIngresosEgresosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosEgresosMouseExited
        btnIngresosEgresos.setForeground(Color.WHITE);
        ImageIcon imagen;
        String dir = "/Imagenes/IngresosEgresos_off.png";
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnIngresosEgresos.setIcon(imagen);
    }//GEN-LAST:event_btnIngresosEgresosMouseExited

    private void btnIngresosEgresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosEgresosActionPerformed
        int conteoFiestas = 0, conteoSubActividades = 0;
        ResultSet rs = new Fiestas().obtenerConteoFiestas();
        try {
            while (rs.next()) {                
                conteoFiestas = rs.getInt("conteo");
            }
        } catch (Exception e) {
        }
        
        rs = new SubActividades().obtenerConteoSubActividades();
        try {
            while (rs.next()) {                
                conteoSubActividades = rs.getInt("conteo");
            }
        } catch (Exception e) {
        }
        
        if (conteoFiestas != 0) {
            if (conteoSubActividades != 0) {
                agregarPanel(new pnlIngresosEgresos());
            } else {
                JOptionPane.showMessageDialog(null, "No hay sub-actividades registradas", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay fiestas registradas", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresosEgresosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnAmenizaciones;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFiestas;
    private javax.swing.JButton btnIngresosEgresos;
    private javax.swing.JButton btnLocales;
    private javax.swing.JLabel lblFiestas;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlSuperior;
    // End of variables declaration//GEN-END:variables
}
