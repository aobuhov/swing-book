/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Obuhov.Alexey
 */
public class AWTPainting extends Frame {
    
    public AWTPainting() {   
        super("AWTPainting");
       // выход при закрытии окна   
       addWindowListener(new WindowAdapter() {    
           public void windowClosing(WindowEvent e) {    
               System.exit(0);   
           }
       });   
       setSize(200, 200);   
       setVisible(true);  
    }  

    // в этом методе производится рисование  
    public void paint(Graphics g) {   
        // заполняем все красным цветом   
        g.setColor(Color.red);   
        g.fillRect(0, 0, 200, 200);  
    }  
    
    public static void main(String[] args) {   
        new AWTPainting();  
    } 
    
}
