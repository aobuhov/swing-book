/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Obuhov.Alexey
 */
public class BoxGlues extends JFrame {

    public BoxGlues() {
        super("BoxGlues");
        setSize(250, 200); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // панель с вертикальным блочным расположением 
        // в нее поместим все остальные панели 
        JPanel main = BoxLayoutUtils.createVerticalPanel();
        // вертикальная панель 
        JPanel pVert = BoxLayoutUtils.createVerticalPanel();
        pVert.setBorder(new BevelBorder(1));
        // заполнитель перед компонентами отодвинет их вниз 
        pVert.add(Box.createVerticalGlue());
        pVert.add(new JButton("Один"));
        pVert.add(new JButton("Два"));
        // горизонтальная панель 
        // теперь можно разместить компоненты по центру 
        JPanel рНоr = BoxLayoutUtils.createHorizontalPanel();
        рНоr.setBorder(new BevelBorder(1));
        рНоr.add(Box.createHorizontalGlue());
        рНоr.add(new JButton("Три"));
        рНоr.add(new JButton("Четыре"));
        рНоr.add(Box.createHorizontalGlue());
        // укладываем панели вертикально 
        main.add(pVert);
        main.add(Box.createVerticalStrut(15));
        main.add(рНоr);
        // добавляем панель в центр окна 
        getContentPane().add(main);
        // выводим окно на экран 
        //pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxGlues();
    }

}
