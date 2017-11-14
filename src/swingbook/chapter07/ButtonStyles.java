/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter07;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

/**
 *
 * @author Obuhov.Alexey
 */
public class ButtonStyles extends JFrame {

    public ButtonStyles() {
        super("ButtonStyles");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // используем последовательное расположение 
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // самая простая кнопка  
        JButton button = new JButton("Обычная кнопка");
        c.add(button);
        
        // кнопка со значками на все случаи жизни 
        button = new JButton();
        button.setIcon(new ImageIcon("images/b1.gif"));
        button.setRolloverIcon(new ImageIcon("images/b1r.gif"));
        button.setPressedIcon(new ImageIcon("images/b1p.gif"));
        button.setDisabledIcon(new ImageIcon("images/b1d.gif"));
    
        // для такой кнопки лучше убрать все ненужные рамки и закраску 
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        c.add(button);
        
        // кнопка с измененным цветом и HTML-текстом  
        button = new JButton("<html><h2><font color=\"yellow\">Зеленая кнопка");
        button.setBackground(Color.green);
        c.add(button);

        // изменение выравнивания текста и изображения   
        button = new JButton("Изменение выравнивания", new ImageIcon("images/button.gif"));
        button.setMargin(new Insets(10, 10, 10, 10));
        button.setVerticalAlignment(SwingConstants.TOP);
        button.setHorizontalAlignment(SwingConstants.RIGHT);
        button.setHorizontalTextPosition(SwingConstants.LEFT);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setIconTextGap(10);

        // сделаем кнопку большой, чтобы увидеть выравнивание   
        button.setPreferredSize(new Dimension(300, 100));
        c.add(button);

        // отключенная кнопка   
        button = new JButton("Выключено");
        button.setEnabled(false);
        c.add(button);
        
        // выводим окно на экран   
        setSize(400, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonStyles();
    }

}
