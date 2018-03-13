/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter07;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import swingbook.chapter05.BoxLayoutUtils;

/**
 *
 * @author note
 */
public class ButtonGroup1 extends JFrame {

    public ButtonGroup1() {
        super("ButtonGroup1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создадим горизонтальную панель с блочным расположением
        JPanel bh = BoxLayoutUtils.createHorizontalPanel();
        // надпись и отступ
        bh.add(new JLabel("Что Вы предпочитаете:"));
        bh.add(Box.createHorizontalStrut(12));
        // несколько выключателей JToggleButton
        JToggleButton b1 = new JToggleButton("Чай", true);
        JToggleButton b2 = new JToggleButton("Кофе");
        JToggleButton b3 = new JToggleButton("Лимонад");
// добавим все кнопки в группу ButtonGroup
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        
// добавим все кнопки в контейнер, учтем при этом рекомендации интерфейса "Metal"

        bh.add(b1);
        bh.add(Box.createHorizontalStrut(2));
        bh.add(b2);
        bh.add(Box.createHorizontalStrut(2));
        bh.add(b3);
        getContentPane().add(bh);
// выводим окно на экран
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonGroup1();
    }

}
