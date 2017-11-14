/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class UsingEventQueue extends JFrame {
    
    public UsingEventQueue() {   
        super("UsingEventQueue");
        // выход при закрытии окна   
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        // кнопка и ее слушатель   
        JButton button = new JButton("Генерировать событие");   
        button.addActionListener(new ActionListener() {    
            public void actionPerformed(ActionEvent e) {     
                // генерируем событие закрытия окна     
                getToolkit().getSystemEventQueue().postEvent(      
                        new WindowEvent(UsingEventQueue.this, WindowEvent.WINDOW_CLOSING));    
            }   
        });   
        
        // добавим кнопку в панель содержимого   
        getContentPane().setLayout(new FlowLayout());   
        getContentPane().add(button);   
    
        // выведем окно на экран   
        setSize(400, 300);   
        setVisible(true); 
    }  
    
    public static void main(String[] args) {   
        new UsingEventQueue();  
    }
    
}
