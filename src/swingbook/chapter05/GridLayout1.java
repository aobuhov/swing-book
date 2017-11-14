/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Obuhov.Alexey
 */
public class GridLayout1 extends JFrame {

    public GridLayout1() {
        super("GridLayout1");
        setSize(300, 200);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // вспомогательная панель   
        JPanel grid = new JPanel();
        // первые два параметра конструктора GridLayout - количество строк и столбцов в таблице         
        // вторые два - расстояние между ячейками по X и Y   
        GridLayout gl = new GridLayout(2, 0, 5, 12);
        grid.setLayout(gl);
        // создаем 8 кнопок 
        for (int i = 0; i < 8; i++) {
            grid.add(new JButton("Кнопка " + i));
        }
        // помещаем нашу панель в центр окна 
        getContentPane().add(grid);
        // устанавливаем оптимальный размер 
        pack();

        // показываем окно  
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayout1();
    }

}
