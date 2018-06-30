package Paneles;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.Fiestas;

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

        llenarTabla("");
    }

    public void limpiarTabla() {
        for (int posicion = 0; posicion < tblFiestas.getRowCount(); posicion++) {
            modeloFiestas.removeRow(posicion);
            posicion--;
        }
    }

    public void llenarTabla(String texto) {
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

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblFiestas.setModel(modeloFiestas);
        jScrollPane1.setViewportView(tblFiestas);

        lblFiesta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFiesta.setForeground(new java.awt.Color(0, 0, 0));
        lblFiesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFiesta.setText("Fiestas");

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
                        .addComponent(lblFiesta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblFiesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiesta;
    private javax.swing.JTable tblFiestas;
    // End of variables declaration//GEN-END:variables
}
