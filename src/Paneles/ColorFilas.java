package Paneles;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorFilas extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component componenteTabla = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (row % 2 == 0) {
            componenteTabla.setBackground(Color.WHITE);
        } else {
            componenteTabla.setBackground(Color.LIGHT_GRAY);
        }
        return componenteTabla;
    }

}
