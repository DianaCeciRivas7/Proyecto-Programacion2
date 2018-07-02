package Paneles;

import Dialogos.dlgModificarActividad;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.Actividades;
import TablasDB.ActividadesPorFiesta;
import TablasDB.SubActividades;
import javax.swing.JOptionPane;

public class pnlVerActividades extends javax.swing.JPanel {

    private Actividades actividades = new Actividades();

    private DefaultTableModel modeloActividades = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    public pnlVerActividades() {
        initComponents();

        modeloActividades.addColumn("Código");
        modeloActividades.addColumn("Nombre actividad");
        modeloActividades.addColumn("Fecha de realización");

        llenarTabla();
    }

    public void limpiarTabla() {
        for (int posicion = 0; posicion < tblActividades.getRowCount(); posicion++) {
            modeloActividades.removeRow(posicion);
            posicion--;
        }
    }

    public void llenarTabla() {
        limpiarTabla();

        for (int column = 0; column < tblActividades.getColumnModel().getColumnCount(); column++) {
            tblActividades.getColumnModel().getColumn(column).setResizable(false);
        }
        tblActividades.getTableHeader().setReorderingAllowed(false);

        ResultSet rs = actividades.obtenerActividades();

        try {
            while (rs.next()) {
                int codigo = rs.getInt("Cod_Actividad");
                String nombreActividad = rs.getString("Nombre_Actividad");
                String fecha = rs.getString("Fecha");
                modeloActividades.addRow(new Object[]{codigo, nombreActividad, fecha});
            }
            tblActividades.setModel(modeloActividades);
        } catch (Exception e) {
        }
        tblActividades.setDefaultRenderer(Object.class, new ColorFilas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblActividades = new javax.swing.JTable();
        lblActividad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CheckBoxEliminar = new javax.swing.JCheckBox();
        CheckBoxModificar = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblActividades.setModel(modeloActividades);
        tblActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblActividades);

        lblActividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActividad.setText("Actividades");

        CheckBoxEliminar.setBackground(new java.awt.Color(204, 204, 204));
        CheckBoxEliminar.setForeground(new java.awt.Color(0, 0, 0));
        CheckBoxEliminar.setText("Eliminar");
        CheckBoxEliminar.setBorder(null);
        CheckBoxEliminar.setContentAreaFilled(false);
        CheckBoxEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxEliminarActionPerformed(evt);
            }
        });

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
                .addComponent(lblActividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckBoxEliminar)
                .addGap(29, 29, 29)
                .addComponent(CheckBoxModificar)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblActividad)
                    .addComponent(CheckBoxEliminar)
                    .addComponent(CheckBoxModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesMouseClicked
        if (CheckBoxEliminar.isSelected()) {
            int eleccion = JOptionPane.showConfirmDialog(null, "Se eliminará actividad de múltiples tablas\n¿Desea continuar?", "Atención", JOptionPane.YES_NO_OPTION);
            if (eleccion == 0) {
                int codigoActividad = Integer.parseInt(modeloActividades.getValueAt(tblActividades.getSelectedRow(), 0) + "");
                try {
                    new ActividadesPorFiesta().EliminarActividadesPorFiestaCodActividad(codigoActividad);
                    new SubActividades().EliminarSubActividades(codigoActividad);
                    actividades.EliminarActividades(codigoActividad);
                    llenarTabla();
                } catch (Exception e) {
                }
            }
        } else if (CheckBoxModificar.isSelected()) {
            int codigoActividad = Integer.parseInt(modeloActividades.getValueAt(tblActividades.getSelectedRow(), 0) + "");
            int codigoFiesta = 0;
            String nombreActividad = null, fecha = null;
            ResultSet rs = actividades.obtenerActividad(codigoActividad);

            try {
                while (rs.next()) {
                    nombreActividad = rs.getString("Nombre_Actividad");
                    fecha = rs.getString("Fecha");
                }
            } catch (Exception e) {
            }

            rs = new ActividadesPorFiesta().obtenerCodigoFiesta(codigoActividad);
            try {
                while (rs.next()) {
                    codigoFiesta = rs.getInt("Cod_Fiesta_fk");
                }
            } catch (Exception e) {
            }
            
            dlgModificarActividad dlgModificar = new dlgModificarActividad(codigoActividad, nombreActividad, fecha, codigoFiesta, this);
            dlgModificar.setLocationRelativeTo(null);
            dlgModificar.setModal(true);
            dlgModificar.setVisible(true);
        }
    }//GEN-LAST:event_tblActividadesMouseClicked

    private void CheckBoxEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxEliminarActionPerformed
        if (CheckBoxEliminar.isSelected()) {
            JOptionPane.showMessageDialog(null, "Elija una fila", "Atención", JOptionPane.INFORMATION_MESSAGE);
            CheckBoxModificar.setEnabled(false);
        } else {
            CheckBoxModificar.setEnabled(true);
        }
    }//GEN-LAST:event_CheckBoxEliminarActionPerformed

    private void CheckBoxModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxModificarActionPerformed
        if (CheckBoxModificar.isSelected()) {
            JOptionPane.showMessageDialog(null, "Elija una fila", "Atención", JOptionPane.INFORMATION_MESSAGE);
            CheckBoxEliminar.setEnabled(false);
        } else {
            CheckBoxEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_CheckBoxModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxEliminar;
    private javax.swing.JCheckBox CheckBoxModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JTable tblActividades;
    // End of variables declaration//GEN-END:variables
}
