/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Obuhov.Alexey
 */
public class BorderLayoutSample extends JFrame{

    public BorderLayoutSample() {
        super("BorderLayoutSample");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // получаем панель содержимого 
        Container c = getContentPane();
        
        // добавляем компоненты 
        // в качестве параметров можно использовать строки 

        c.add(new JButton("Север"), "North");
        c.add(new JButton("Юг"), "South");
        // или константы из класса BorderLayout
        c.add(new JLabel("Запад"), BorderLayout.WEST);
        c.add(new JLabel("Восток"), BorderLayout.EAST);
        // если параметр не указывать вовсе, компонент автоматически добавится в центр  
        c.add(new JButton("Центр"));
        // выводим окно на экран  
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutSample();
    }

}
