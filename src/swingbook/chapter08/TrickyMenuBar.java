/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter08;

import javax.management.JMException;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author note
 */
public class TrickyMenuBar extends JFrame {

    public TrickyMenuBar() {
        super("TrickyMenuBar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создаем главную полоску меню
        JMenuBar menuBar = new JMenuBar();
        // добавляем в нее выпадающие меню
        menuBar.add(new JMenu("Файл"));
        menuBar.add(new JMenu("Правка"));
        // мы знаем, что используется блочное расположение, так что заполнитель вполне уместен
        menuBar.add(Box.createHorizontalGlue());
        // теперь поместим в полоску меню не выпадающее меню, а надпись со значком
        JLabel icon = new JLabel(new ImageIcon("anim.gif"));
        icon.setBorder(BorderFactory.createLoweredBevelBorder());
        menuBar.add(icon);
        
        menuBar.add(new JMenu("Else"));
        // помещаем меню в наше окно
        setJMenuBar(menuBar);
        // выводим окно на экран
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TrickyMenuBar();
    }

}
