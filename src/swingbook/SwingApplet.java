/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Obuhov.Alexey
 */
public class SwingApplet extends JApplet{
    
    // этот метод вызывается при создании апплета  
    public void init() {  
        // создание интерфейса  
        JPanel contents = new JPanel();   
        contents.add(new JTextField(10));   
        contents.add(new JButton("Ввод"));   
        setContentPane(contents);  
    } 
    
}
