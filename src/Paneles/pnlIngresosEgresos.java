package Paneles;

import TablasDB.ActividadesPorFiesta;
import TablasDB.Fiestas;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import TablasDB.SubActividades;
import java.util.ArrayList;

public class pnlIngresosEgresos extends javax.swing.JPanel {

    private SubActividades subactividades = new SubActividades();
    private ActividadesPorFiesta apf = new ActividadesPorFiesta();

    private DefaultTableModel modeloIngresosEgresos = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    public pnlIngresosEgresos() {
        initComponents();

        modeloIngresosEgresos.addColumn("Código");
        modeloIngresosEgresos.addColumn("Nombre fiesta");
        modeloIngresosEgresos.addColumn("Fecha");
        modeloIngresosEgresos.addColumn("Ganancia prevista");
        modeloIngresosEgresos.addColumn("Ingresos totales");
        modeloIngresosEgresos.addColumn("Egresos totales");
        modeloIngresosEgresos.addColumn("Monto final");

        llenarTabla();
    }

    public void limpiarTabla() {
        for (int posicion = 0; posicion < tblIngresosEgresos.getRowCount(); posicion++) {
            modeloIngresosEgresos.removeRow(posicion);
            posicion--;
        }
    }

    public void llenarTabla() {
        limpiarTabla();

        for (int column = 0; column < tblIngresosEgresos.getColumnModel().getColumnCount(); column++) {
            tblIngresosEgresos.getColumnModel().getColumn(column).setResizable(false);
        }
        tblIngresosEgresos.getTableHeader().setReorderingAllowed(false);

        ArrayList codigos = new ArrayList();

        ResultSet rs1 = new Fiestas().obtenerCodFiestas();

        try {
            while (rs1.next()) {
                codigos.add(rs1.getInt("Cod_Fiesta"));
            }
        } catch (Exception e) {
        }

        for (int posicion = 0; posicion < codigos.size(); posicion++) {
            rs1 = new Fiestas().obtenerFiesta(Integer.parseInt(codigos.get(posicion).toString()));
            int codigoFiesta = Integer.parseInt(codigos.get(posicion).toString());
            String nombreFiesta = null, fecha = null;
            double ganancia = 0, ingreso = 0, egreso = 0;
            try {
                while (rs1.next()) {
                    nombreFiesta = rs1.getString("Nombre_Fiesta");
                    fecha = rs1.getString("FechaRealizacion");
                    ganancia = rs1.getDouble("Ganancia_Prevista");
                }
            } catch (Exception e) {
            }

            rs1 = subactividades.obtenerIngresoTotal(codigoFiesta);
            try {
                while (rs1.next()) {
                    ingreso = rs1.getDouble("ingresoTotal");
                }
            } catch (Exception e) {
            }

            rs1 = subactividades.obtenerEgresoTotal(codigoFiesta);
            try {
                while (rs1.next()) {
                    egreso = rs1.getDouble("egresoTotal");
                }
            } catch (Exception e) {
            }
            
            rs1 = new Fiestas().obtenerCostoFiesta(codigoFiesta);
            try {
                while (rs1.next()) {                    
                    egreso += rs1.getDouble("Costo_Amenizacion");
                    egreso += rs1.getDouble("Costo_Renta");
                    egreso += rs1.getDouble("Costo_Previsto");
                }
            } catch (Exception e) {
            }

            modeloIngresosEgresos.addRow(new Object[]{codigoFiesta, nombreFiesta, fecha, ganancia, ingreso, egreso, (ingreso - egreso)});
        }

        tblIngresosEgresos.setDefaultRenderer(Object.class, new ColorFilasActividadesPorFiesta());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngresosEgresos = new javax.swing.JTable();
        lblIngresosEgresos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(721, 562));

        tblIngresosEgresos.setModel(modeloIngresosEgresos);
        jScrollPane1.setViewportView(tblIngresosEgresos);

        lblIngresosEgresos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIngresosEgresos.setForeground(new java.awt.Color(0, 0, 0));
        lblIngresosEgresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresosEgresos.setText("Ingresos y egresos");

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
                        .addComponent(lblIngresosEgresos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblIngresosEgresos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIngresosEgresos;
    private javax.swing.JTable tblIngresosEgresos;
    // End of variables declaration//GEN-END:variables
}
