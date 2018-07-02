package Dialogos;

import Paneles.pnlVerActividades;
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

public class dlgModificarActividad extends javax.swing.JDialog {

    private int codAct, codigoFiesta;
    private pnlVerActividades pnlVerActividades;
    private DefaultComboBoxModel modeloFiestas = new DefaultComboBoxModel();
    private ActividadesPorFiesta apf = new ActividadesPorFiesta();
    private Actividades actividades = new Actividades();

    public dlgModificarActividad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public dlgModificarActividad(int codAct, String nomAct, String fecha, int codFiesta, pnlVerActividades pnl) {
        initComponents();
        this.codAct = codAct;
        this.codigoFiesta = codFiesta;
        this.pnlVerActividades = pnl;
        lblCodigo.setText(codAct + "");
        txtNombreActividad.setText(nomAct);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaDate = formato.parse(fecha);
            buscadorFecha.setDate(fechaDate);
        } catch (Exception e) {
        }
        llenarModelo();
        ResultSet rs = new Fiestas().obtenerNombreFiesta(codFiesta);
        String nom = null;
        BucleBusqueda:
        for (int indice = 0; indice < cmbFiestas.getItemCount(); indice++) {
            try {
                while (rs.next()) {                    
                    nom = rs.getString("Nombre_Fiesta");
                }
            } catch (Exception e) {
            }
            if (cmbFiestas.getItemAt(indice).equals(nom)) {
                cmbFiestas.setSelectedItem(cmbFiestas.getItemAt(indice));
                cmbFiestasItemStateChanged(null);
                break BucleBusqueda;
            }
        }
    }
    
    public void llenarModelo() {
        ResultSet rs = new Fiestas().obtenerNombreFiestas();
        
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
        ResultSet rs = new Fiestas().obtenerCodFiesta(nom);
        try {
            while (rs.next()) {
                codigoFiesta = rs.getInt("Cod_Fiesta");
                lblCodFiesta.setText("" + codigoFiesta);
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
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblFiesta = new javax.swing.JLabel();
        cmbFiestas = new javax.swing.JComboBox<>();
        lblCodFiesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCod.setForeground(new java.awt.Color(0, 0, 0));
        lblCod.setText("Codigo:");

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));

        lblNombreActividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreActividad.setText("Nombre actividad:");

        txtNombreActividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreActividadKeyTyped(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Fecha realización:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblFiesta)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(224, 224, 224)
                            .addComponent(cmbFiestas, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCodFiesta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCod)
                            .addGap(18, 18, 18)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblNombreActividad)
                                    .addGap(40, 40, 40)
                                    .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblFecha)
                                    .addGap(42, 42, 42)
                                    .addComponent(buscadorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(376, 376, 376)
                            .addComponent(btnAceptar))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buscadorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFecha))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFiesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbFiestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodFiesta)))
                .addGap(44, 44, 44)
                .addComponent(btnAceptar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
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
        if (!txtNombreActividad.getText().replaceAll(" ", "").isEmpty()) {
            Date fechaIngresada = buscadorFecha.getDate();
            String fecha = "" + formatearFechaIM(fechaIngresada);
            
            Object[] p1 = {lblCodigo.getText(), txtNombreActividad.getText(), fecha};
            
            try {
                actividades.ModificarActividades(p1);
            } catch (Exception e) {
            }
            
            Object[] p2 = {codigoFiesta, codAct};
            try {
                apf.ModificarActividadesPorFiesta(p2);
            } catch (Exception e) {
            }
            
            pnlVerActividades.llenarTabla();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Campos  vacíos", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNombreActividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreActividadKeyTyped
        if (txtNombreActividad.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreActividadKeyTyped

    private void cmbFiestasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiestasItemStateChanged
        String nom = "" + cmbFiestas.getItemAt(cmbFiestas.getSelectedIndex());
        llenarCodFiesta(nom);
    }//GEN-LAST:event_cmbFiestasItemStateChanged
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
            java.util.logging.Logger.getLogger(dlgModificarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgModificarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgModificarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgModificarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgModificarActividad dialog = new dlgModificarActividad(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser buscadorFecha;
    private javax.swing.JComboBox<String> cmbFiestas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodFiesta;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFiesta;
    private javax.swing.JLabel lblNombreActividad;
    private javax.swing.JTextField txtNombreActividad;
    // End of variables declaration//GEN-END:variables
}
