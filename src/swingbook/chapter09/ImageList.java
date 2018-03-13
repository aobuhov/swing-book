/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter09;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Obuhov.Alexey
 */
public class ImageList {
    // данные списка

    private static Icon bullet = new ImageIcon("bullet.gif");
    private static Object[] data = {
        new ImageListElement(bullet, "Первый"),
        new ImageListElement(bullet, "Второй"),
        new ImageListElement(bullet, "<html><h4><font color=green>И третий!")
    };

    public static void main(String[] args) {
// создаем список и настраиваем его
        JList list = new JList(data);
        list.setCellRenderer(new ImageListCellRenderer());
// добавляем в окно
        JFrame frame = new JFrame("ImageList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.getContentPane().add(new JScrollPane(list));
        frame.setVisible(true);
    }
}
