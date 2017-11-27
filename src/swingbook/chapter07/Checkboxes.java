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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author note
 */
public class Checkboxes extends JFrame {

    public Checkboxes() {
        super("Checkboxes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // получаем панель содержимого
        Container c = getContentPane();
        // используем последовательное расположение
        c.setLayout(new FlowLayout());
        // отдельный флажок
        JCheckBox ch1 = new JCheckBox("Я люблю JFC", true);
        // группа связанных флажков в своей собственной панели
        JPanel panel = new JPanel(new GridLayout(0, 1, 0, 5));
        panel.setBorder(BorderFactory.createTitledBorder("Мороженое"));
        String[] names = {"Крем-брюле", "Ром с изюмом", "Шоколадное"};
        for (int i = 0; i < names.length; i++) {
            JCheckBox check = new JCheckBox(names[i]);
            panel.add(check);
        }
// добавляем все в контейнер

        c.add(ch1);
        c.add(panel);
// выводим окно на экран
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Checkboxes();
    }

}
