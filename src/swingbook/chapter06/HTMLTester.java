/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter06;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Obuhov.Alexey
 */
public class HTMLTester extends JFrame {

    public HTMLTester() {
        super("HTMLTester");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создадим интерфейс и настроим события   
        createGUI();
        attachListeners();
        // выводим окно на экран  
        setSize(400, 300);
        setVisible(true);
    }
    private JTextArea html;
    private JLabel result;
    private JButton update;

    private void createGUI() {
        // в качестве основы используем таблицу  
        JPanel p = new JPanel(new GridLayout(1, 2, 5, 5));
        p.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        // вертикальное блочное расположение  
        Box vertical = new Box(BoxLayout.Y_AXIS);
        // настройка текстового поля   
        JScrollPane scroller = new JScrollPane(html = new JTextArea(10, 10));
        html.setLineWrap(true);
        html.append("<html>");

        // добавляем текстовое поле и надпись  
        vertical.add(new JLabel("Код HTML:"));
        vertical.add(scroller);
        // кнопка обновления текста   
        update = new JButton("Обновить");
        getContentPane().add(update, "South");

        // надпись с результатом   
        JPanel resultPanel = new JPanel(new BorderLayout());
        result = new JLabel();
        resultPanel.add(new JLabel("Результат:"), "North");
        resultPanel.add(new JScrollPane(result));

        // окончательная укладка панелей  
        p.add(vertical);
        p.add(resultPanel);
        getContentPane().add(p);
    }

    private void attachListeners() {
        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // устанавливаем в надписи новый текст    
                result.setText(html.getText());
            }
        });
    }

    public static void main(String[] args) {   
        new HTMLTester();  
    } 
}
