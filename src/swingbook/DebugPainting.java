/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.DebugGraphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RepaintManager;

/**
 *
 * @author Obuhov.Alexey
 */
public class DebugPainting extends JFrame {
    
    public DebugPainting() {   

        super("DebugPainting");
        setDefaultCloseOperation(EXIT_ON_CLOSE);   // выход при закрытии окна   
        
        // добавляем рисующий компонент   
        PaintingComponent pc = new PaintingComponent();   
        getContentPane().add(pc);   

        // включаем для него отладку графики   
        RepaintManager.currentManager(null).setDoubleBufferingEnabled(false);   
        pc.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION | DebugGraphics.FLASH_OPTION); 
        
        DebugGraphics.setFlashTime(500);   
        DebugGraphics.setFlashCount(3);   

        // выводим окно на экран   
        setSize(200, 200);   
        setVisible(true);  
        
    }  

    // компонент, который что-то рисует  
    class PaintingComponent extends JPanel {   
        
        public void paintComponent(Graphics g) {    
            super.paintComponent(g);
        
            // три простые фигуры    
            g.setColor(Color.orange);    
            g.fillRect(10, 10, 100, 100);    

            g.setColor(Color.green);    
            g.drawOval(50, 50, 50, 50);    

            g.setColor(Color.blue);    
            g.fillOval(100, 20, 50, 50);   

        }
        
    }  
    
    public static void main(String[] args) {  
    
        new DebugPainting();  
        
    } 
    
}
