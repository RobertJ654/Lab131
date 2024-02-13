package com.swing;

import com.swing.scroll.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Table extends JTable {
    
    public Table() {
        getTableHeader().setDefaultRenderer(new TableHeader());
        getTableHeader().setPreferredSize(new Dimension(0, 30));
        setDefaultRenderer(Object.class, new TableCell());
        setRowHeight(30);
    }
    public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0,0,0)); // Color oscuro
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER,panel);
        scroll.getViewport().setBackground(new Color(0,0,0)); // Color claro
        scroll.setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 0)); // Sin borde
    }            
            
            
    public class TableHeader extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            com.setBackground(new Color(0,0,0)); // Color del header
            com.setForeground(new Color(200, 200, 200)); // Color del texto
            com.setFont(com.getFont().deriveFont(Font.BOLD, 12));
            return com;
        }
    }
    public class TableCell extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (isCellSelected(row, column)) { 
                if (row%2 == 0) {
                    com.setBackground(new Color(25,32,38)); // Seleccionado
                } else {
                    com.setBackground(new Color(25,32,38)); // Seleccionado
                }
            } else {
                if (row%2 == 0) {
                    com.setBackground(new Color(35,42,48)); // Color claro
                } else {
                    com.setBackground(new Color(25,32,38)); // Color oscuro
                }
            }
            setBorder(new EmptyBorder(0, 5, 0, 5));
            com.setForeground(new Color(200, 200, 200));
            return com;
        }
    }
    
    
    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.setRowCount(0);
    }
    
}
