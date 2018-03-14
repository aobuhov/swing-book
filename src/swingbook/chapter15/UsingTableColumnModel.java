/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Obuhov.Alexey
 */
public class UsingTableColumnModel extends JFrame {
    // модель столбцов

    private TableColumnModel columnModel;
    
    // названия столбцов таблицы
    private String[] columnNames = {"Имя", "Любимый цвет", "Напиток" };
    
    // данные для таблицы
    private String[][] data = {{"Иван", "Зеленый", "Апельсиновый сок"}, {"Александр", "Бежевый", "Зеленый чай"}};

    public UsingTableColumnModel() {
        super("UsingTableColumnModel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // наша таблица
        JTable table = new JTable(data, columnNames);
        // получаем стандартную модель
        columnModel = table.getColumnModel();
        // меняем размеры столбцов
        Enumeration e = columnModel.getColumns();
        while (e.hasMoreElements()) {
            TableColumn column = (TableColumn) e.nextElement();
            column.setMinWidth(30);
            column.setMaxWidth(90);
        }

        // создадим пару кнопок
        JPanel buttons = new JPanel();
        JButton move = new JButton("Поменять местами");
        move.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // меняем местами первые два столбца
                columnModel.moveColumn(0, 1);
            }
        });
        buttons.add(move);
        JButton add = new JButton("Добавить");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // добавляем столбец
                TableColumn newColumn = new TableColumn(1, 100);
                newColumn.setHeaderValue("<html><b>Новый!");
                columnModel.addColumn(newColumn);
            }
        });
        buttons.add(add);
        // выводим окно на экран
        getContentPane().add(new JScrollPane(table));
        getContentPane().add(buttons, "South");
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UsingTableColumnModel();
    }
}
