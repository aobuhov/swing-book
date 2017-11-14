/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Obuhov.Alexey
 */
public class ContentPaneAdd extends JFrame {
    
    public ContentPaneAdd() {   
        super("ContentPaneAdd");
        setDefaultCloseOperation(EXIT_ON_CLOSE);   

        
//        setLayout(new FlowLayout());
//        getContentPane().add(new JButton("Один"));
//        getContentPane().add(new JButton("Два"));
        
        // создадим панель с двумя кнопками   
        JPanel contents = new JPanel();   
        contents.add(new JButton("Один"));   
        contents.add(new JButton("Два"));   
        
        // заменим панель содержимого   
        setContentPane(contents);   
        
        // выведем окно на экран   
        setSize(200, 100);   
        setVisible(true);  
    }  
    
    public static void main(String[] args) {   
        new ContentPaneAdd();  
    } 
    
}
