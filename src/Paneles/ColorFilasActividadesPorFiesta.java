package Paneles;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorFilasActividadesPorFiesta extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component componenteTabla = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (Integer.parseInt(table.getValueAt(row, 0) + "") % 2 == 0) {
            componenteTabla.setBackground(new Color(153, 204, 255));
        } else {
            componenteTabla.setBackground(new Color(204, 255, 153));
        }
        return componenteTabla;
    }
    
}
