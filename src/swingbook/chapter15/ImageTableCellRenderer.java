/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter15;

import com.porty.swing.ImageTableCell;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Obuhov.Alexey
 */
public class ImageTableCellRenderer extends DefaultTableCellRenderer {
    // метод возвращает компонент для прорисовки
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
        boolean hasFocus, int row, int column) {
        // получаем объект нужного типа
        ImageTableCell imageCell = (ImageTableCell) value;
        // получаем настроенную надпись от базового класса
        JLabel label = (JLabel) super.getTableCellRendererComponent(table,
                imageCell.text, isSelected, hasFocus, row, column);
        // устанавливаем значок
        label.setIcon(imageCell.icon);
        return label;
    }
}
