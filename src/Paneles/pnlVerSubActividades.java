package Paneles;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.SubActividades;

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

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblSubActividades.setModel(modeloSubActividades);
        jScrollPane1.setViewportView(tblSubActividades);

        lblSubActividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSubActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblSubActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubActividad.setText("Sub-actividades:");

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
                        .addComponent(lblSubActividad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblSubActividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubActividad;
    private javax.swing.JTable tblSubActividades;
    // End of variables declaration//GEN-END:variables
}
