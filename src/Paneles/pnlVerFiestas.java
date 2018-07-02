package Paneles;

import Dialogos.dlgModificarFiesta;
import TablasDB.ActividadesPorFiesta;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.Fiestas;
import javax.swing.JOptionPane;

public class pnlVerFiestas extends javax.swing.JPanel {

    private Fiestas fiestas = new Fiestas();

    private DefaultTableModel modeloFiestas = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    public pnlVerFiestas() {
        initComponents();

        modeloFiestas.addColumn("Código");
        modeloFiestas.addColumn("Nombre fiesta");
        modeloFiestas.addColumn("Fecha");
        modeloFiestas.addColumn("Ganancia prevista");
        modeloFiestas.addColumn("Amenización");
        modeloFiestas.addColumn("Local");
        modeloFiestas.addColumn("Proyecto");

        llenarTabla();
    }

    public void limpiarTabla() {
        for (int posicion = 0; posicion < tblFiestas.getRowCount(); posicion++) {
            modeloFiestas.removeRow(posicion);
            posicion--;
        }
    }

    public void llenarTabla() {
        limpiarTabla();

        for (int column = 0; column < tblFiestas.getColumnModel().getColumnCount(); column++) {
            tblFiestas.getColumnModel().getColumn(column).setResizable(false);
        }
        tblFiestas.getTableHeader().setReorderingAllowed(false);

        ResultSet rs = fiestas.obtenerFiestas();

        try {
            while (rs.next()) {
                int codigo = rs.getInt("Cod_Fiesta");
                String nombreFiesta = rs.getString("Nombre_Fiesta");
                String fecha = rs.getString("FechaRealizacion");
                String ganancia = rs.getString("Ganancia_Prevista");
                String nombreAmenizacion = rs.getString("Nombre_Amenizacion");
                String nombreLocal = rs.getString("Nombre_Local");
                String proyecto = rs.getString("Descripcion");
                modeloFiestas.addRow(new Object[]{codigo, nombreFiesta, fecha, ganancia, nombreAmenizacion, nombreLocal, proyecto});
            }
            tblFiestas.setModel(modeloFiestas);
        } catch (Exception e) {
        }
        tblFiestas.setDefaultRenderer(Object.class, new ColorFilas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFiestas = new javax.swing.JTable();
        lblFiesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CheckBoxEliminar = new javax.swing.JCheckBox();
        CheckBoxModificar = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblFiestas.setModel(modeloFiestas);
        tblFiestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFiestasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFiestas);

        lblFiesta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFiesta.setForeground(new java.awt.Color(0, 0, 0));
        lblFiesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFiesta.setText("Fiestas");

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
                .addComponent(lblFiesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckBoxEliminar)
                .addGap(29, 29, 29)
                .addComponent(CheckBoxModificar)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiesta)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBoxEliminar)
                        .addComponent(CheckBoxModificar)))
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

    private void tblFiestasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFiestasMouseClicked
        if (CheckBoxEliminar.isSelected()) {
            int eleccion = JOptionPane.showConfirmDialog(null, "Se eliminará la fiesta de múltiples tablas\n¿Desea continuar?", "Atención", JOptionPane.YES_NO_OPTION);
            if (eleccion == 0) {
                int codigoFiesta = Integer.parseInt(modeloFiestas.getValueAt(tblFiestas.getSelectedRow(), 0) + "");
                try {
                    new ActividadesPorFiesta().EliminarActividadesPorFiestaCodFiesta(codigoFiesta);
                    fiestas.EliminarFiestas(codigoFiesta);
                    llenarTabla();
                } catch (Exception e) {
                }
            }
        } else if (CheckBoxModificar.isSelected()) {
            int codigoFiesta = Integer.parseInt(modeloFiestas.getValueAt(tblFiestas.getSelectedRow(), 0) + "");
            String nombreFiesta = null, fecha = null;
            double ganancia = 0;
            int codLocal = 0, codProyecto = 0, codAmenizacion = 0;
            ResultSet rs = fiestas.obtenerFiestaTodos(codigoFiesta);

            try {
                while (rs.next()) {
                    nombreFiesta = rs.getString("Nombre_Fiesta");
                    fecha = rs.getString("FechaRealizacion");
                    ganancia = rs.getDouble("Ganancia_Prevista");
                    codLocal = rs.getInt("Cod_Local_fk");
                    codProyecto = rs.getInt("Cod_Proyecto_fk");
                    codAmenizacion = rs.getInt("Cod_Amenizacion_fk");
                }
            } catch (Exception e) {
            }

            dlgModificarFiesta dlgModificar = new dlgModificarFiesta(codigoFiesta, nombreFiesta, fecha, ganancia, codAmenizacion, codLocal, codProyecto, this);
            dlgModificar.setLocationRelativeTo(null);
            dlgModificar.setModal(true);
            dlgModificar.setVisible(true);
        }
    }//GEN-LAST:event_tblFiestasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxEliminar;
    private javax.swing.JCheckBox CheckBoxModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiesta;
    private javax.swing.JTable tblFiestas;
    // End of variables declaration//GEN-END:variables
}
