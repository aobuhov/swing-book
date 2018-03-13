/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter07;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

/**
 *
 * @author note
 */
public class ToggleButtons extends JFrame {

    public ToggleButtons() {
        super("ToggleButtons");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // получаем панель содержимого
        Container c = getContentPane();
        // используем последовательное расположение
        c.setLayout(new FlowLayout());
        // создадим пару кнопок JToggleButton
        button1 = new JToggleButton("Первая", true);
        button2 = new JToggleButton("Вторая", false);
        // добавим слушатель события о смене состояния
        button2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                button1.setSelected(!button1.isSelected());

            }
        });
        c.add(button1);
        c.add(button2);
        // выводим окно на экран
        pack();
        setVisible(true);
    }

    // ссылки на используемые кнопки
    private JToggleButton button1, button2;

    public static void main(String[] args) {
        new ToggleButtons();
    }
    
}
