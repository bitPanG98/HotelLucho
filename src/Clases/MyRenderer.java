/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class MyRenderer extends DefaultTableCellRenderer {

    Color background;
    Color foreground;
    Font font;

    public MyRenderer(Color background, Color foreground) {
        super();
        this.background = background;
        this.foreground = foreground;
        this.font= font;
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column ) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        comp.setBackground(background);
        comp.setForeground(foreground);
        
        comp.setFont(new java.awt.Font("Cambria", 1, 11));
        return comp;
    }
}
