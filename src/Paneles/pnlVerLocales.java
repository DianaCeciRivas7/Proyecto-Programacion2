package Paneles;

import Dialogos.dlgModificarLocal;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.Locales;
import javax.swing.JOptionPane;

public class pnlVerLocales extends javax.swing.JPanel {

    private Locales locales = new Locales();

    private DefaultTableModel modeloLocales = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    public pnlVerLocales() {
        initComponents();

        modeloLocales.addColumn("Código");
        modeloLocales.addColumn("Nombre local");
        modeloLocales.addColumn("Dirección");
        modeloLocales.addColumn("Costo de renta");
        modeloLocales.addColumn("Teféfono");

        llenarTabla();
    }

    public void limpiarTabla() {
        for (int posicion = 0; posicion < tblLocales.getRowCount(); posicion++) {
            modeloLocales.removeRow(posicion);
            posicion--;
        }
    }

    public void llenarTabla() {
        limpiarTabla();

        for (int column = 0; column < tblLocales.getColumnModel().getColumnCount(); column++) {
            tblLocales.getColumnModel().getColumn(column).setResizable(false);
        }
        tblLocales.getTableHeader().setReorderingAllowed(false);

        ResultSet rs = locales.obtenerLocales();

        try {
            while (rs.next()) {
                int codigo = rs.getInt("Cod_Local");
                String nombreLocal = rs.getString("Nombre_Local");
                String direccion = rs.getString("Direccion");
                String costo = rs.getString("Costo_Renta");
                String telefono = rs.getString("Telefono_Local");
                modeloLocales.addRow(new Object[]{codigo, nombreLocal, direccion, costo, telefono});
            }
            tblLocales.setModel(modeloLocales);
        } catch (Exception e) {
        }
        tblLocales.setDefaultRenderer(Object.class, new ColorFilas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckBoxModificar = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocales = new javax.swing.JTable();
        lblLocal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

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

        tblLocales.setModel(modeloLocales);
        tblLocales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLocalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLocales);

        lblLocal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLocal.setForeground(new java.awt.Color(0, 0, 0));
        lblLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocal.setText("Locales");

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
                .addComponent(lblLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckBoxModificar)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocal)
                    .addComponent(CheckBoxModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBoxModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxModificarActionPerformed
        JOptionPane.showMessageDialog(null, "Elija una fila", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_CheckBoxModificarActionPerformed

    private void tblLocalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLocalesMouseClicked
        if (CheckBoxModificar.isSelected()) {
            int codigoLocal = Integer.parseInt(modeloLocales.getValueAt(tblLocales.getSelectedRow(), 0) + "");
            String nombreLocal = null, direccion = null;
            double costo = 0;
            int telefono = 0;
            ResultSet rs = locales.obtenerLocal(codigoLocal);

            try {
                while (rs.next()) {
                    nombreLocal = rs.getString("Nombre_Local");
                    direccion = rs.getString("Direccion");
                    costo = rs.getDouble("Costo_Renta");
                    telefono = rs.getInt("Telefono_Local");
                }
            } catch (Exception e) {
            }

            dlgModificarLocal dlgModificar = new dlgModificarLocal(codigoLocal, nombreLocal, direccion, costo, telefono, this);
            dlgModificar.setLocationRelativeTo(null);
            dlgModificar.setModal(true);
            dlgModificar.setVisible(true);
        }
    }//GEN-LAST:event_tblLocalesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JTable tblLocales;
    // End of variables declaration//GEN-END:variables
}
