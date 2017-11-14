/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class SwingPainting extends JFrame{

    public SwingPainting() {   
        super("SwingPainting");
        // при закрытии окна завершаем работу
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // добавляем в панель содержимого наш компонент
        
        System.out.println("before creating");
        
        SwingComponent swingComponent = new SwingComponent();
        
        System.out.println("after creating");
        
        getContentPane().add(swingComponent);   
        
        System.out.println("after adding");
        
        // выводим окно на экран   
        setSize(200, 200);   
        setVisible(true);  
        
        System.out.println("after visible");
    }  

    // компонент, использующий возможности Swing  
    class SwingComponent extends JComponent {   
        // прорисовка компонента   
        public void paintComponent(Graphics g) {    
            System.out.println("paintComponent");
            super.paintComponent(g);    
            g.setColor(Color.red);    
            g.fillOval(10, 10, 50, 50);   
        }   // прорисовка рамки   
        
        public void paintBorder(Graphics g) {    
            System.out.println("paintBorder");
            super.paintBorder(g);   
        }  
        
    // прорисовка потомков   
        public void paintChildren(Graphics g) {    
            System.out.println("paintChildren");   
            super.paintChildren(g);   
        }  
    }  
    
    public static void main(String[] args) {   new SwingPainting();  }
    
}


