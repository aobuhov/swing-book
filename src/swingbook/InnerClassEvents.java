/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Obuhov.Alexey
 */
public class InnerClassEvents extends JFrame {
    
    private JTextField text;
    private JButton button;
    
    public InnerClassEvents () {
        
        super("InnerClassEvents");   
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // при закрытии окна - выход   
        getContentPane().setLayout(new FlowLayout());   // последовательное расположение   
        
        getContentPane().add(text = new JTextField(10));   // добавим текстовое поле   
        getContentPane().add(button = new JButton("Нажмите"));   // и кнопку   
        button.addActionListener(new ButtonL());   // будем следить за нажатиями кнопки   
        pack();   // выводим окно на экран   
        setVisible(true);
    }
    
    // класс - слушатель нажатия на кнопку  
    class ButtonL implements ActionListener {   
        public void actionPerformed(ActionEvent e) {
            System.out.println(text.getText());   
        }  
    }  

    public static void main(String[] args) {
        new InnerClassEvents();  
    } 

}
