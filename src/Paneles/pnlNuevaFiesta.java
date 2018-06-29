package Paneles;

import TablasDB.Amenizaciones;
import TablasDB.Fiestas;
import TablasDB.Locales;
import TablasDB.Proyectos;
import java.awt.Color;
import java.net.URL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class pnlNuevaFiesta extends javax.swing.JPanel {

    private DefaultComboBoxModel modeloLocales = new DefaultComboBoxModel(), modeloAmenizaciones = new DefaultComboBoxModel(), modeloProyectos = new DefaultComboBoxModel();
    private Locales locales = new Locales();
    private Amenizaciones amenizaciones = new Amenizaciones();
    private Proyectos proyectos = new Proyectos();
    private Fiestas fiestas = new Fiestas();
    private int codigoLocal, codigoProyecto, codigoAmenizacion, codigoFiesta;

    public pnlNuevaFiesta() {
        initComponents();
        llenarModelos();
        llenarCodigoFiesta();
        cmbAmenizacionesItemStateChanged(null);
        cmbLocalesItemStateChanged(null);
        cmbProyectosItemStateChanged(null);
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
                codigoLocal = rs.getInt("Cod_Local");
                lblCodLocal.setText("" + codigoLocal);
            }
        } catch (Exception e) {
        }
    }

    public void llenarCodProyecto(String nom) {
        ResultSet rs = proyectos.obtenerCodProyecto(nom);
        try {
            while (rs.next()) {
                codigoProyecto = rs.getInt("Cod_Proyecto");
                lblCodProyecto.setText("" + codigoProyecto);
            }
        } catch (Exception e) {
        }
    }

    public void llenarCodAmenizacion(String nom) {
        ResultSet rs = amenizaciones.obtenerCodAmenizacion(nom);
        try {
            while (rs.next()) {
                codigoAmenizacion = rs.getInt("Cod_Amenizacion");
                lblCodAmenizacion.setText("" + codigoAmenizacion);
            }
        } catch (Exception e) {
        }
    }

    public void llenarCodigoFiesta() {
        ResultSet rs = fiestas.obtenerMaxCodFiesta();
        try {
            while (rs.next()) {
                codigoFiesta = rs.getInt("maximo") + 1;
                lblCodigo.setText("" + codigoFiesta);
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
        lblFecha = new javax.swing.JLabel();
        lblAmenizacion = new javax.swing.JLabel();
        txtNombreFiesta = new javax.swing.JTextField();
        lblCodAmenizacion = new javax.swing.JLabel();
        cmbProyectos = new javax.swing.JComboBox<>();
        cmbAmenizaciones = new javax.swing.JComboBox<>();
        lblCodProyecto = new javax.swing.JLabel();
        lblProyecto = new javax.swing.JLabel();
        lblNombreFiesta = new javax.swing.JLabel();
        buscadorFecha = new com.toedter.calendar.JDateChooser();
        lblCodigo = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblLocal = new javax.swing.JLabel();
        lblCodLocal = new javax.swing.JLabel();
        cmbLocales = new javax.swing.JComboBox<>();
        lblGanancia = new javax.swing.JLabel();
        txtGanancia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        lblCod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCod.setForeground(new java.awt.Color(0, 0, 0));
        lblCod.setText("Codigo:");

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Fecha realización:");

        lblAmenizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAmenizacion.setForeground(new java.awt.Color(0, 0, 0));
        lblAmenizacion.setText("Amenización:");

        lblCodAmenizacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodAmenizacion.setForeground(new java.awt.Color(0, 0, 0));
        lblCodAmenizacion.setText("*");

        cmbProyectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProyectos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProyectosItemStateChanged(evt);
            }
        });

        cmbAmenizaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAmenizaciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAmenizacionesItemStateChanged(evt);
            }
        });

        lblCodProyecto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodProyecto.setForeground(new java.awt.Color(0, 0, 0));
        lblCodProyecto.setText("*");

        lblProyecto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProyecto.setForeground(new java.awt.Color(0, 0, 0));
        lblProyecto.setText("Proyecto:");

        lblNombreFiesta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreFiesta.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreFiesta.setText("Nombre fiesta:");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));

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

        lblLocal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLocal.setForeground(new java.awt.Color(0, 0, 0));
        lblLocal.setText("Local:");

        lblCodLocal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodLocal.setForeground(new java.awt.Color(0, 0, 0));
        lblCodLocal.setText("*");

        cmbLocales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbLocales.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLocalesItemStateChanged(evt);
            }
        });

        lblGanancia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGanancia.setForeground(new java.awt.Color(0, 0, 0));
        lblGanancia.setText("Ganancia prevista:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLocal)
                        .addGap(0, 577, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addContainerGap(140, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
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
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (!txtNombreFiesta.getText().replaceAll(" ", "").isEmpty() && !txtGanancia.getText().replaceAll(" ", "").isEmpty()) {
            Date fechaIngresada = buscadorFecha.getDate();
            String fecha = "" + formatearFechaIM(fechaIngresada);

            Object[] p = {codigoFiesta, txtNombreFiesta.getText(), fecha, txtGanancia.getText(), codigoAmenizacion, codigoLocal, codigoProyecto};
            try {
                fiestas.AgregarFiestas(p);
            } catch (Exception e) {
            }
            
            llenarCodigoFiesta();
            txtNombreFiesta.setText("");
            txtNombreFiesta.requestFocus();
            txtGanancia.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Campos  vacíos", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        ImageIcon imagen;
        String dir = "/Imagenes/Aceptar_on.png";
        btnAceptar.setForeground(new Color(0, 102, 102));
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnAceptar.setIcon(imagen);
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        ImageIcon imagen;
        String dir = "/Imagenes/Aceptar_off.png";
        btnAceptar.setForeground(Color.BLACK);
        URL url = this.getClass().getResource(dir);
        imagen = new ImageIcon(url);
        btnAceptar.setIcon(imagen);
    }//GEN-LAST:event_btnAceptarMouseExited


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
