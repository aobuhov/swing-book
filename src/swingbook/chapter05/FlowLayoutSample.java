/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class FlowLayoutSample extends JFrame {

    public FlowLayoutSample() {
        super("FlowLayout1");
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // получаем панель содержимого   
        Container c = getContentPane();
        
        // устанавливаем последовательное расположение с выравниванием компонентов по центру   
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        // добавляем компоненты 
        c.add(new JButton("Один"));
        c.add(new JButton("Два"));
        c.add(new JButton("Три"));
        // выводим окно на экран  
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutSample();
    }

}
