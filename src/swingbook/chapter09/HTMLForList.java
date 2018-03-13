/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter09;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Obuhov.Alexey
 */
public class HTMLForList {

    // данные списка  
    private static Object[] data = {"<html><font size=4 color=red>Первый", new ImageIcon("line.gif"), "<html><h2><font color=yellow>Большой"};

    public static void main(String[] args) {
        // создаем список   
        JList list = new JList(data);
        // помещаем его в окно  
        JFrame frame = new JFrame("HTMLForList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.getContentPane().add(new JScrollPane(list));
        frame.setVisible(true);
    }
}
