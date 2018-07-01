package Paneles;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.Proyectos;

public class pnlVerProyectos extends javax.swing.JPanel {

    private Proyectos proyectos = new Proyectos();

    private DefaultTableModel modeloProyectos = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    public pnlVerProyectos() {
        initComponents();

        modeloProyectos.addColumn("Código");
        modeloProyectos.addColumn("Descripción");
        modeloProyectos.addColumn("Costo previsto");

        llenarTabla();
    }

    public void limpiarTabla() {
        for (int posicion = 0; posicion < tblProyectos.getRowCount(); posicion++) {
            modeloProyectos.removeRow(posicion);
            posicion--;
        }
    }

    public void llenarTabla() {
        limpiarTabla();

        for (int column = 0; column < tblProyectos.getColumnModel().getColumnCount(); column++) {
            tblProyectos.getColumnModel().getColumn(column).setResizable(false);
        }
        tblProyectos.getTableHeader().setReorderingAllowed(false);

        ResultSet rs = proyectos.obtenerProyectos();

        try {
            while (rs.next()) {
                int codigo = rs.getInt("Cod_Proyecto");
                String descripcion = rs.getString("Descripcion");
                String costo = rs.getString("Costo_Previsto");
                modeloProyectos.addRow(new Object[]{codigo, descripcion, costo});
            }
            tblProyectos.setModel(modeloProyectos);
        } catch (Exception e) {
        }
        tblProyectos.setDefaultRenderer(Object.class, new ColorFilas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProyectos = new javax.swing.JTable();
        lblProyecto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblProyectos.setModel(modeloProyectos);
        jScrollPane1.setViewportView(tblProyectos);

        lblProyecto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProyecto.setForeground(new java.awt.Color(0, 0, 0));
        lblProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProyecto.setText("Proyectos");

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
                        .addComponent(lblProyecto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProyecto;
    private javax.swing.JTable tblProyectos;
    // End of variables declaration//GEN-END:variables
}
