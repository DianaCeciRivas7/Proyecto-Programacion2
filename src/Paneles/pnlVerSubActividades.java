package Paneles;

import Dialogos.dlgModificarSubActividad;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.SubActividades;
import javax.swing.JOptionPane;

public class pnlVerSubActividades extends javax.swing.JPanel {

    private SubActividades subactividades = new SubActividades();

    private DefaultTableModel modeloSubActividades = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    public pnlVerSubActividades() {
        initComponents();

        modeloSubActividades.addColumn("Código act.");
        modeloSubActividades.addColumn("Nombre act.");
        modeloSubActividades.addColumn("Código subAct.");
        modeloSubActividades.addColumn("Nombre subAct.");
        modeloSubActividades.addColumn("Descripción");
        modeloSubActividades.addColumn("Fecha realización");
        modeloSubActividades.addColumn("Ingreso");
        modeloSubActividades.addColumn("Egreso");

        llenarTabla();
    }

    public void limpiarTabla() {
        for (int posicion = 0; posicion < tblSubActividades.getRowCount(); posicion++) {
            modeloSubActividades.removeRow(posicion);
            posicion--;
        }
    }

    public void llenarTabla() {
        limpiarTabla();

        for (int column = 0; column < tblSubActividades.getColumnModel().getColumnCount(); column++) {
            tblSubActividades.getColumnModel().getColumn(column).setResizable(false);
        }
        tblSubActividades.getTableHeader().setReorderingAllowed(false);

        ResultSet rs = subactividades.obtenerSubActividades();

        try {
            while (rs.next()) {
                int codigoAct = rs.getInt("Cod_Actividad_fk");
                String nombreAct = rs.getString("Nombre_Actividad");
                String codigoSub = rs.getString("Cod_SubActividad");
                String nombreSub = rs.getString("Nombre_SubActividad");
                String descripcion = rs.getString("Descripcion");
                String fecha = rs.getString("Fecha_Realizacion");
                double ingreso = rs.getDouble("Ingreso");
                double egreso = rs.getDouble("Egreso");
                modeloSubActividades.addRow(new Object[]{codigoAct, nombreAct, codigoSub, nombreSub, descripcion, fecha, ingreso, egreso});
            }
            tblSubActividades.setModel(modeloSubActividades);
        } catch (Exception e) {
        }
        tblSubActividades.setDefaultRenderer(Object.class, new ColorFilas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSubActividades = new javax.swing.JTable();
        lblSubActividad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CheckBoxEliminar = new javax.swing.JCheckBox();
        CheckBoxModificar = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblSubActividades.setModel(modeloSubActividades);
        tblSubActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSubActividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSubActividades);

        lblSubActividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSubActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblSubActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubActividad.setText("Sub-actividades:");

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
                .addComponent(lblSubActividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckBoxEliminar)
                .addGap(29, 29, 29)
                .addComponent(CheckBoxModificar)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBoxEliminar)
                        .addComponent(CheckBoxModificar))
                    .addComponent(lblSubActividad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void tblSubActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubActividadesMouseClicked
        if (CheckBoxEliminar.isSelected()) {
            int eleccion = JOptionPane.showConfirmDialog(null, "Se eliminará sub-actividad de múltiples tablas\n¿Desea continuar?", "Atención", JOptionPane.YES_NO_OPTION);
            if (eleccion == 0) {
                int codigoSubActividad = Integer.parseInt(modeloSubActividades.getValueAt(tblSubActividades.getSelectedRow(), 2) + "");
                try {
                    new SubActividades().EliminarSubActividadesSingular(codigoSubActividad);
                    llenarTabla();
                } catch (Exception e) {
                }
            }
        } else if (CheckBoxModificar.isSelected()) {
            int codigoSubActividad = Integer.parseInt(modeloSubActividades.getValueAt(tblSubActividades.getSelectedRow(), 2) + "");
            int codigoActividad = Integer.parseInt(modeloSubActividades.getValueAt(tblSubActividades.getSelectedRow(), 0) + "");
            String nombreSubActividad = null, fecha = null, descripcion = null;
            double ingreso = 0, egreso = 0;
            ResultSet rs = subactividades.obtenerSubActividad(codigoActividad, codigoSubActividad);

            try {
                while (rs.next()) {
                    nombreSubActividad = rs.getString("Nombre_SubActividad");
                    descripcion = rs.getString("Descripcion");
                    fecha = rs.getString("Fecha_Realizacion");
                    ingreso = rs.getDouble("Ingreso");
                    egreso = rs.getDouble("Egreso");
                }
            } catch (Exception e) {
            }
            
            dlgModificarSubActividad dlgModificar = new dlgModificarSubActividad(codigoActividad, nombreSubActividad, descripcion, fecha, ingreso, egreso, codigoActividad, this);
            dlgModificar.setLocationRelativeTo(null);
            dlgModificar.setModal(true);
            dlgModificar.setVisible(true);
        }
    }//GEN-LAST:event_tblSubActividadesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxEliminar;
    private javax.swing.JCheckBox CheckBoxModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubActividad;
    private javax.swing.JTable tblSubActividades;
    // End of variables declaration//GEN-END:variables
}
