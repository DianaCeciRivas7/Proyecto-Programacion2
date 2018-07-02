package Paneles;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.ActividadesPorFiesta;

public class pnlVerSubActividadesPorFiesta extends javax.swing.JPanel {

    private ActividadesPorFiesta apf = new ActividadesPorFiesta();

    private DefaultTableModel modeloActividadesTotal = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    public pnlVerSubActividadesPorFiesta() {
        initComponents();
        
        modeloActividadesTotal.addColumn("Código fiesta");
        modeloActividadesTotal.addColumn("Fiesta");
        modeloActividadesTotal.addColumn("Actividad");
        modeloActividadesTotal.addColumn("SubActividad");
        modeloActividadesTotal.addColumn("Descripción");
        modeloActividadesTotal.addColumn("Fecha");
        modeloActividadesTotal.addColumn("Ingreso");
        modeloActividadesTotal.addColumn("Egreso");

        llenarTabla();
    }

    public void limpiarTabla() {
        for (int posicion = 0; posicion < tblActividadesTotal.getRowCount(); posicion++) {
            modeloActividadesTotal.removeRow(posicion);
            posicion--;
        }
    }

    public void llenarTabla() {
        limpiarTabla();

        for (int column = 0; column < tblActividadesTotal.getColumnModel().getColumnCount(); column++) {
            tblActividadesTotal.getColumnModel().getColumn(column).setResizable(false);
        }
        tblActividadesTotal.getTableHeader().setReorderingAllowed(false);

        ResultSet rs = apf.obtenerActividadesPorFiesta();

        try {
            while (rs.next()) {
                int codigo = rs.getInt("Cod_Fiesta_fk");
                String nombreFiesta = rs.getString("Nombre_Fiesta");
                String nombreActividad = rs.getString("Nombre_Actividad");
                String nombreSubActividad = rs.getString("Nombre_SubActividad");
                String descripcion = rs.getString("Descripcion");
                String fecha = rs.getString("Fecha_Realizacion");
                double ingreso = rs.getDouble("Ingreso");
                double egreso = rs.getDouble("Egreso");
                modeloActividadesTotal.addRow(new Object[]{codigo, nombreFiesta, nombreActividad, nombreSubActividad, descripcion, fecha, ingreso, egreso});
            }
            tblActividadesTotal.setModel(modeloActividadesTotal);
        } catch (Exception e) {
        }
        tblActividadesTotal.setDefaultRenderer(Object.class, new ColorFilasActividadesPorFiesta());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblActividadesTotal = new javax.swing.JTable();
        lblSubActividades = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblActividadesTotal.setModel(modeloActividadesTotal);
        jScrollPane1.setViewportView(tblActividadesTotal);

        lblSubActividades.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSubActividades.setForeground(new java.awt.Color(0, 0, 0));
        lblSubActividades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubActividades.setText("Sub-actividades por fiesta");

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
                        .addComponent(lblSubActividades)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblSubActividades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubActividades;
    private javax.swing.JTable tblActividadesTotal;
    // End of variables declaration//GEN-END:variables
}
