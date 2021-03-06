/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter09;

import com.porty.swing.CheckBoxListElement;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Obuhov.Alexey
 */
public class CheckBoxListTest {
    // данные списка

    private static Object[] data = {
        new CheckBoxListElement(false, "Корпус"),
        new CheckBoxListElement(false, "<html><h3><font color=red>Колонки"),
        new CheckBoxListElement(false, "Набор шлейфов"),
        new CheckBoxListElement(true, "Системная плата")
    };

    public static void main(String[] args) {
        // создаем список и настраиваем его
        JList list = new CheckBoxList(data);
        // добавляем в окно
        JFrame frame = new JFrame("CheckBoxListTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.getContentPane().add(new JScrollPane(list));
        frame.setVisible(true);
    }
}
