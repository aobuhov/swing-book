/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter09;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Obuhov.Alexey
 */
public class ImageListCellRenderer extends DefaultListCellRenderer {

    // метод, возвращающий для элемента рисующий компонент  
    public Component getListCellRendererComponent(JList list, Object data, int idx, boolean isSelected, boolean hasFocus) {
        // проверяем, нужного ли элемент типа   
        if (data instanceof ImageListElement) {
            ImageListElement lie = (ImageListElement) data;
            // получаем текст и значок    
            Icon icon = lie.icon;
            String text = lie.text;
            // используем возможности базового класса    
            JLabel label = (JLabel) super.getListCellRendererComponent(list, text, idx, isSelected, hasFocus);
            label.setIcon(icon);
            return label;
        } else {
            return super.getListCellRendererComponent(list, data, idx, isSelected, hasFocus);
        }
    }
}


