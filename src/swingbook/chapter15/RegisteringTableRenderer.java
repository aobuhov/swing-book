/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter15;

import com.porty.swing.ImageTableCell;
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
public class RegisteringTableRenderer extends JFrame {

    public RegisteringTableRenderer() {
        super("RegisteringTableRenderer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создаем таблицы на основе нашей модели
        JTable table = new JTable(new SpecialModel());
        // регистрируем объект для прорисовки новых данных
        table.setDefaultRenderer(ImageTableCell.class, new ImageTableCellRenderer());
        // выводим окно на экран
        getContentPane().add(new JScrollPane(table));
        pack();
        setVisible(true);
    }

    // модель таблицы
    class SpecialModel extends AbstractTableModel {

        // значки
        private Icon image1 = new ImageIcon("clip1.gif"), image2 = new ImageIcon("clip2.gif");
        // названия столбцов
        private String[] columnNames = {"Компания", "Адрес"};

        // данные таблицы
        private Object[][] data = {
            {new ImageTableCell("MegaWorks", image1), "<html><font color=\"red\">Париж"},
            {new ImageTableCell("TerraMedia", image2), "<html><b>С.-Петербург"}
        };

        // количество столбцов
        public int getColumnCount() {
            return columnNames.length;
        }

        // названия столбцов
        public String getColumnName(int column) {
            return columnNames[column];
        }

        // количество строк
        public int getRowCount() {
            return data.length;
        }

        // тип данных столбца
        public Class getColumnClass(int column) {
            return data[0][column].getClass();
        }
        
        // значение в ячейке
        public Object getValueAt(int row, int column) {
            return data[row][column];
        }
    }

    public static void main(String[] args) {
        new RegisteringTableRenderer();
    }
}
