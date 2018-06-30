package Paneles;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.Locales;

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocales = new javax.swing.JTable();
        lblLocal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblLocales.setModel(modeloLocales);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLocal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JTable tblLocales;
    // End of variables declaration//GEN-END:variables
}
