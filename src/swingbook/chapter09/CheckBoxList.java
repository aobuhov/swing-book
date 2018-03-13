/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter09;

import com.porty.swing.CheckBoxListElement;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Obuhov.Alexey
 */
public class CheckBoxList extends JList {
    
    // сохраняем все конструкторы
    public CheckBoxList(ListModel model) {
        super(model);
        initList();
    }

    public CheckBoxList(Object[] data) {
        super(data);
        initList();
    }

    public CheckBoxList(java.util.Vector data) {
        super(data);
        initList();
    }

    // специальная настройка списка
    private void initList() {
        setCellRenderer(new CheckBoxCellRenderer());
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                // следим за щелчками
                if (e.getClickCount() == 1 && SwingUtilities.isLeftMouseButton(e)) {
                // нужный нам щелчок
                    int pos = locationToIndex(e.getPoint());
                    CheckBoxListElement cbel = (CheckBoxListElement) getModel().getElementAt(pos);
                    cbel.selected = !cbel.selected;
                    repaint();
                }
            }
        });
    }
    
    // отображающий флажки объект
    public static class CheckBoxCellRenderer extends JCheckBox implements ListCellRenderer {

        public Component getListCellRendererComponent(JList list, Object data, int idx, boolean isSelected, boolean hasFocus) {
            // полагаем, что данные всегда нужного типа
            CheckBoxListElement cbel = (CheckBoxListElement) data;
            // настраиваем флажок
            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }
            setSelected(cbel.selected);
            setText(cbel.text);
            return this;
        }
    }

}
