/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import com.porty.swing.SimpleButton;
import com.porty.swing.event.ButtonPressEvent;
import com.porty.swing.event.ButtonPressListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Obuhov.Alexey
 */
public class SimpleButtonTest extends JFrame {
    
    public SimpleButtonTest() {   
        super("SimpleButtonTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);   

        // создаем кнопку и присоединим слушателей   
        SimpleButton button = new SimpleButton();   
        // анонимный класс   
        button.addButtonPressListener(    
                new ButtonPressListener() {     
                    public void buttonPressed(ButtonPressEvent e) {      
                        System.out.println("1!");
                }   
            
        });   
        
        button.addButtonPressListener(new ButtonL());   // внутренний класс   
        
        // добавим кнопку в окно   
        JPanel contents = new JPanel();   
        contents.add(button);   
        setContentPane(contents);   
        
        // выведем окно на экран   
        setSize(400, 300);   
        setVisible(true);  
        }  
    
    class ButtonL implements ButtonPressListener {   
        public void buttonPressed(ButtonPressEvent e) {    
            System.out.println("2!");   
        }  
    }  
    
    public static void main(String[] args) {   
        new SimpleButtonTest();  
    } 
    
}
