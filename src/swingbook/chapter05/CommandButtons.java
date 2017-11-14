/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Obuhov.Alexey
 */
public class CommandButtons extends JFrame {

    public CommandButtons() {
        super("CommandButtons");
        setSize(350, 250);
        setLocation(150, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel grid = new JPanel(new GridLayout(1, 2, 5, 0)); // создаем панель с табличным расположением для выравнивания размеров кнопок   
        // добавляем компоненты  
        grid.add(new JButton("OK"));
        grid.add(new JButton("Отмена"));
        
        // помещаем полученное в панель с последовательным  
        // расположением, выравненным по правому краю   
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        flow.add(grid);
        
        // получаем панель содержимого   
        Container c = getContentPane();
        
        // помещаем строку кнопок вниз окна  
        c.add(flow, BorderLayout.SOUTH);
        // выводим окно на экран 
        setVisible(true);
    }

    public static void main(String[] args) {
        new CommandButtons();
    }

}
