package Paneles;

import TablasDB.Actividades;
import TablasDB.ActividadesPorFiesta;
import TablasDB.Fiestas;
import java.awt.Color;
import java.net.URL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class pnlNuevaActividad extends javax.swing.JPanel {
    
    private DefaultComboBoxModel modeloFiestas = new DefaultComboBoxModel();
    private Fiestas fiestas = new Fiestas();
    private ActividadesPorFiesta apf = new ActividadesPorFiesta();
    private Actividades actividades = new Actividades();
    private int codActividad, codFiesta;
    
    public pnlNuevaActividad() {
        initComponents();
        llenarModelo();
        llenarCodigoActividad();
        cmbFiestasItemStateChanged(null);
    }
    
    public void llenarModelo() {
        ResultSet rs = fiestas.obtenerNombreFiestas();
        
        try {
            while (rs.next()) {
                String nom = rs.getString("Nombre_Fiesta");
                modeloFiestas.addElement(nom);
            }
        } catch (Exception e) {
        }
        cmbFiestas.setModel(modeloFiestas);
    }
    
    public void llenarCodFiesta(String nom) {
        ResultSet rs = fiestas.obtenerCodFiesta(nom);
        try {
            while (rs.next()) {
                codFiesta = rs.getInt("Cod_Fiesta");
                lblCodFiesta.setText("" + codFiesta);
            }
        } catch (Exception e) {
        }
    }
    
    public void llenarCodigoActividad() {
        ResultSet rs = actividades.obtenerMaxCodActividad();
        try {
            while (rs.next()) {
                codActividad = rs.getInt("maximo") + 1;
                lblCodigo.setText("" + codActividad);
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
        lblNombreActividad = new javax.swing.JLabel();
        txtNombreActividad = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        buscadorFecha = new com.toedter.calendar.JDateChooser();
        lblFiesta = new javax.swing.JLabel();
        cmbFiestas = new javax.swing.JComboBox<>();
        lblCodFiesta = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        lblCod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCod.setForeground(new java.awt.Color(0, 0, 0));
        lblCod.setText("Codigo:");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));

        lblNombreActividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreActividad.setText("Nombre actividad:");

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Fecha realización:");

        lblFiesta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFiesta.setForeground(new java.awt.Color(0, 0, 0));
        lblFiesta.setText("De la fiesta:");

        cmbFiestas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFiestas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiestasItemStateChanged(evt);
            }
        });

        lblCodFiesta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodFiesta.setForeground(new java.awt.Color(0, 0, 0));
        lblCodFiesta.setText("*");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNombreActividad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblFecha)
                            .addGap(42, 42, 42)
                            .addComponent(buscadorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblFiesta)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(cmbFiestas, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodFiesta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAceptar))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscadorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFiesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbFiestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodFiesta)))
                .addGap(41, 41, 41)
                .addComponent(btnAceptar)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFiestasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiestasItemStateChanged
        String nom = "" + cmbFiestas.getItemAt(cmbFiestas.getSelectedIndex());
        llenarCodFiesta(nom);
    }//GEN-LAST:event_cmbFiestasItemStateChanged

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
        if (!txtNombreActividad.getText().replaceAll(" ", "").isEmpty()) {
            Date fechaIngresada = buscadorFecha.getDate();
            String fecha = "" + formatearFechaIM(fechaIngresada);
            
            Object[] p1 = {codActividad, txtNombreActividad.getText(), fecha};
            try {
                actividades.AgregarActividades(p1);
            } catch (Exception e) {
            }
            
            Object[] p2 = {codFiesta, codActividad};
            
            try {
                apf.AgregarActividadesPorFiesta(p2);
            } catch (Exception e) {
            }
            
            llenarCodigoActividad();
            txtNombreActividad.setText("");
            txtNombreActividad.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Campos  vacíos", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private com.toedter.calendar.JDateChooser buscadorFecha;
    private javax.swing.JComboBox<String> cmbFiestas;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodFiesta;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFiesta;
    private javax.swing.JLabel lblNombreActividad;
    private javax.swing.JTextField txtNombreActividad;
    // End of variables declaration//GEN-END:variables
}
