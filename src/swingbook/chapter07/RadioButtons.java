/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter07;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author note
 */
public class RadioButtons extends JFrame {

    public RadioButtons() {
        super("RadioButtons");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // получаем панель содержимого
        Container c = getContentPane();
        // используем последовательное расположение
        c.setLayout(new FlowLayout());

        // отдельный переключатель
        JRadioButton r1 = new JRadioButton("Сам по себе");

        // группа связанных переключателей в своей собственной панели
        JPanel panel = new JPanel(new GridLayout(0, 1, 0, 5));
        panel.setBorder(BorderFactory.createTitledBorder("Внешний вид"));
        ButtonGroup bg = new ButtonGroup();
        String[] names = {"Внешний вид Java", "MS Windows", "CDE/Motif"};
        for (int i = 0; i < names.length; i++) {
            JRadioButton radio = new JRadioButton(names[i]);
            panel.add(radio);

            bg.add(radio);
        }
        // добавляем все в контейнер
        c.add(r1);
        c.add(panel);
        // выводим окно на экран
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtons();
    }

}
