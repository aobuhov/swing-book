/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.ContainerOrderFocusTraversalPolicy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class FocusPolicyTest extends JFrame {

    public FocusPolicyTest() {   
        super("FocusPolicyTest");
       // при закрытии окна выход   
       setDefaultCloseOperation(EXIT_ON_CLOSE);   

        // добавляем три кнопки   
        getContentPane().add(new JButton("Левая"), "West");   
        // добавляем эту кнопку второй, но она будет ниже   
        // двух других кнопок   
        JButton button = new JButton("Сменить");   
        button.addActionListener( new ActionListener() {    
            public void actionPerformed(ActionEvent e) {    
                // при нажатии сменим алгоритм для окна     
                setFocusTraversalPolicy(new ContainerOrderFocusTraversalPolicy());    
            }   
        });   
        
        getContentPane().add(button, "South");   
        getContentPane().add(new JButton("Правая"), "East");   

        // выводим окно на экран   
        setSize(200, 200);   
        setVisible(true);  
    }  
    
    public static void main(String[] args) {   
        new FocusPolicyTest();  
    } 
    
}
