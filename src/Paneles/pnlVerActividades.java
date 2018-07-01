package Paneles;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.Actividades;

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

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblActividades.setModel(modeloActividades);
        jScrollPane1.setViewportView(tblActividades);

        lblActividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblActividad.setForeground(new java.awt.Color(0, 0, 0));
        lblActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActividad.setText("Actividades");

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
                        .addComponent(lblActividad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblActividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JTable tblActividades;
    // End of variables declaration//GEN-END:variables
}
