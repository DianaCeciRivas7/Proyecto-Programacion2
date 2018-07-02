package Paneles;

import Dialogos.dlgModificarAmenizacion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.Amenizaciones;
import javax.swing.JOptionPane;

public class pnlVerAmenizaciones extends javax.swing.JPanel {

    private Amenizaciones amenizaciones = new Amenizaciones();

    private DefaultTableModel modeloAmenizaciones = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    public pnlVerAmenizaciones() {
        initComponents();

        modeloAmenizaciones.addColumn("Código");
        modeloAmenizaciones.addColumn("Nombre amenización");
        modeloAmenizaciones.addColumn("Costo");
        modeloAmenizaciones.addColumn("Teléfono");

        llenarTabla();
    }

    public void limpiarTabla() {
        for (int posicion = 0; posicion < tblAmenizaciones.getRowCount(); posicion++) {
            modeloAmenizaciones.removeRow(posicion);
            posicion--;
        }
    }

    public void llenarTabla() {
        limpiarTabla();

        for (int column = 0; column < tblAmenizaciones.getColumnModel().getColumnCount(); column++) {
            tblAmenizaciones.getColumnModel().getColumn(column).setResizable(false);
        }
        tblAmenizaciones.getTableHeader().setReorderingAllowed(false);

        ResultSet rs = amenizaciones.obtenerAmenizaciones();

        try {
            while (rs.next()) {
                int codigo = rs.getInt("Cod_Amenizacion");
                String nombreAmenizacion = rs.getString("Nombre_Amenizacion");
                String costo = rs.getString("Costo_Amenizacion");
                String telefono = rs.getString("Telefono");
                modeloAmenizaciones.addRow(new Object[]{codigo, nombreAmenizacion, costo, telefono});
            }
            tblAmenizaciones.setModel(modeloAmenizaciones);
        } catch (Exception e) {
        }
        tblAmenizaciones.setDefaultRenderer(Object.class, new ColorFilas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAmenizaciones = new javax.swing.JTable();
        lblAmenizacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CheckBoxModificar = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblAmenizaciones.setModel(modeloAmenizaciones);
        tblAmenizaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAmenizacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAmenizaciones);

        lblAmenizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAmenizacion.setForeground(new java.awt.Color(0, 0, 0));
        lblAmenizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAmenizacion.setText("Amenizaciones");

        CheckBoxModificar.setBackground(new java.awt.Color(204, 204, 204));
        CheckBoxModificar.setForeground(new java.awt.Color(0, 0, 0));
        CheckBoxModificar.setText("Modificar");
        CheckBoxModificar.setBorder(null);
        CheckBoxModificar.setContentAreaFilled(false);
        CheckBoxModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAmenizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckBoxModificar)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmenizacion)
                    .addComponent(CheckBoxModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblAmenizacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAmenizacionesMouseClicked
        if (CheckBoxModificar.isSelected()) {
            int codigoAmenizacion = Integer.parseInt(modeloAmenizaciones.getValueAt(tblAmenizaciones.getSelectedRow(), 0) + "");
            String nombreAmenizacion = null;
            double costo = 0;
            int telefono = 0;
            ResultSet rs = amenizaciones.obtenerAmenizacion(codigoAmenizacion);

            try {
                while (rs.next()) {
                    nombreAmenizacion = rs.getString("Nombre_Amenizacion");
                    costo = rs.getDouble("Costo_Amenizacion");
                    telefono = rs.getInt("Telefono");
                }
            } catch (Exception e) {
            }

            dlgModificarAmenizacion dlgModificar = new dlgModificarAmenizacion(codigoAmenizacion, nombreAmenizacion, costo, telefono, this);
            dlgModificar.setLocationRelativeTo(null);
            dlgModificar.setModal(true);
            dlgModificar.setVisible(true);
        }
    }//GEN-LAST:event_tblAmenizacionesMouseClicked

    private void CheckBoxModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxModificarActionPerformed
        JOptionPane.showMessageDialog(null, "Elija una fila", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_CheckBoxModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmenizacion;
    private javax.swing.JTable tblAmenizaciones;
    // End of variables declaration//GEN-END:variables
}
