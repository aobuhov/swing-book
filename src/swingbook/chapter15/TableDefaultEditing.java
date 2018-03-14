/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter15;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Obuhov.Alexey
 */
public class TableDefaultEditing extends JFrame {
    // название столбцов
    private String[] columns = {"Имя", "Любимый Цвет"};
    
    // данные для таблицы
    private String[][] data = {
        {"Иван", "Зеленый"},
        {"Александр", "Красный"},
        {"Петр", "Синий"}
    };

    public TableDefaultEditing() {
        super("TableDefaultEditing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создаем таблицу
        JTable table = new JTable(data, columns);
        // настраиваем стандартный редактор
        JComboBox combo = new JComboBox(new String[]{"Зеленый", "Желтый", "Белый"});
        DefaultCellEditor editor = new DefaultCellEditor(combo);
        table.getColumnModel().getColumn(1).setCellEditor(editor);
        // выводим окно на экран
        getContentPane().add(new JScrollPane(table));
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TableDefaultEditing();
    }
}
