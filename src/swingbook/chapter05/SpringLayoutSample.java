/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 *
 * @author Obuhov.Alexey
 */
public class SpringLayoutSample extends JFrame {

    private JButton button1, button2;

    public SpringLayoutSample() {
        
        super("SpringLayoutSample");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // панель с использованием SpringLayout  
        SpringLayout sl = new SpringLayout();
        JPanel contents = new JPanel(sl);
        
        // добавим пару компонентов  
        contents.add(button1 = new JButton("Первая"));
        contents.add(button2 = new JButton("Последняя"));
        
        // настроим распорки 
        sl.putConstraint(SpringLayout.WEST, button1, 5, SpringLayout.WEST, contents);
        sl.putConstraint(SpringLayout.WEST, button2, 5, SpringLayout.EAST, button1);
        
        // выведем окно на экран 
        setContentPane(contents);
        setSize(300, 200);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new SpringLayoutSample();
    }

}
