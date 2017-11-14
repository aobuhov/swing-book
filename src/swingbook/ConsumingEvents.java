/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class ConsumingEvents extends JFrame{
    
    public ConsumingEvents() {   
        super("ConsumingEvents");
        // при закрытии окна - выход   
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
        // прибавляем первого слушателя   
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                // поглощаем единичное нажатие мыши     
                if (e.getClickCount() == 1)      
                    e.consume();     
                System.out.println("1");    
            }   
        });   
        
        addMouseListener(new MouseAdapter() {    
            public void mousePressed(MouseEvent e) {     
                // не обрабатываем поглощенное событие     
                if ( !e.isConsumed() ) {      
                    System.out.println("2");    
                } else {
                    System.out.println("3");    
                }   
            }
        });   
        
        // выводим окно на экран   
        setSize(300, 200);   
        setVisible(true);  
    }  
    
    public static void main(String[] args) {   
        new ConsumingEvents();  
    } 
    
}
