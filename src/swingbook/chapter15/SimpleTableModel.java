/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter15;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Obuhov.Alexey
 */
public class SimpleTableModel extends JFrame {

    public SimpleTableModel() {
        super("SimpleTableModel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создаем таблицу на основе нашей модели
        JTable table = new JTable(new SimpleModel());
        table.setRowHeight(32);
        getContentPane().add(new JScrollPane(table));
        // выводим окно на экран
        setSize(400, 300);
        setVisible(true);
    }

    // наша модель
    class SimpleModel extends AbstractTableModel {
        // количество строк

        public int getRowCount() {
            return 100000;
        }
        // количество столбцов

        public int getColumnCount() {
            return 3;
        }
            // тип данных, хранимых в столбце

        public Class getColumnClass(int column) {
            switch (column) {
                case 1:
                    return Boolean.class;
                case 2:
                    return Icon.class;
                default:
                    return Object.class;
            }
        }
        // данные в ячейке

        public Object getValueAt(int row, int column) {
            boolean flag = (row % 2 == 0) ? true : false;
            // разные данные для разных стобцов
            switch (column) {
                case 0:
                    return "" + row;
                case 1:
                    return new Boolean(flag);
                case 2:
                    return new ImageIcon("Table.gif");
            }
            return "Пусто";
        }
    }

    public static void main(String[] args) {
        new SimpleTableModel();
    }
}
