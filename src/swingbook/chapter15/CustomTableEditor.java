/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter15;

import com.porty.swing.DateCellEditor;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Obuhov.Alexey
 */
public class CustomTableEditor extends JFrame {

    // заголовок столбцов таблицы
    private String[] columns = {"Операция", "Дата"};
    
    // данные таблицы
    private Object[][] data = {
        {"Покупка", new Date()},
        {"Продажа", new Date()}
    };

    public CustomTableEditor() {
        super("CustomTableEditor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создаем таблицу на основе стандартной модели
        DefaultTableModel model = new DefaultTableModel(data, columns) {
        
        // необходимо указать тип столбца
        public Class getColumnClass(int column) {
                return data[0][column].getClass();
            }
        };
        
        JTable table = new JTable(model);
        table.setRowHeight(20);
        // указываем редактор для дат
        table.setDefaultEditor(Date.class, new DateCellEditor());
        // выводим окно на экран
        getContentPane().add(new JScrollPane(table));
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomTableEditor();
    }
}
