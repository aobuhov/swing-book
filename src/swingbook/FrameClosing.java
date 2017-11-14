/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class FrameClosing extends JFrame {
    
    public FrameClosing() {   
        super("Заголовок Окна");
       // операция при закрытии окна  
       setDefaultCloseOperation(EXIT_ON_CLOSE);  
       // значок для окна  
       setIconImage(getToolkit().getImage("anim.gif")); 
       // вывод на экран   setSize(300, 100);  
       setVisible(true); 
    } 
    
    public static void main(String[] args) {   
        new FrameClosing();
    } 
    
}
