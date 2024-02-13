package com.swing;

import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class TableCellRender implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        DefaultTableModel model = (DefaultTableModel)value;
        JScrollPane js = new JScrollPane();
        JTable table = new JTable(model);
        js.setViewportView(table);
        return js;
    }
    

    
}
