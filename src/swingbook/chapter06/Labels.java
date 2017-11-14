/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter06;

import java.awt.Color;
import java.awt.Dimension;
import static java.awt.FlowLayout.LEFT;
import static java.awt.FlowLayout.RIGHT;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.BOTTOM;

/**
 *
 * @author Obuhov.Alexey
 */
public class Labels extends JFrame implements SwingConstants {

    public Labels() {
        super("Labels");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);// при закрытии окна заканчиваем работу   
        
        // самая простая надпись   
        JPanel contents = new JPanel();
        JLabel l1 = new JLabel("Ваше имя:");
        JTextField name = new JTextField(20);
        contents.add(l1);
        contents.add(name);
        // надпись со значком   
        //JLabel l2 = new JLabel(new ImageIcon("monkey.gif"));
        JLabel l2 = new JLabel(new RedBullet());
        adjustLabel(l2);
        l2.setHorizontalAlignment(LEFT);
        contents.add(l2);
        // надпись с нестандартным выравниванием 
        JLabel l3 = new JLabel("Текст и значок", new ImageIcon("bulb.gif"), RIGHT);
        adjustLabel(l3);
        l3.setVerticalTextPosition(BOTTOM);
        l3.setHorizontalTextPosition(LEFT);
        contents.add(l3);
        // вывод окна на экран 
        setContentPane(contents);
        setSize(320, 300);
        setVisible(true);
    }

    // метод производит специальную настройку надписи
    private void adjustLabel(JLabel l) {
        l.setOpaque(true);
        l.setBackground(Color.white);
        l.setPreferredSize(new Dimension(250, 100));
    }

    public static void main(String[] args) {
        new Labels();
    }

}
