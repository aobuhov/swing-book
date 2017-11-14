/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

/**
 *
 * @author Obuhov.Alexey
 */
public class KeyBindingTest extends JFrame {
    
    public KeyBindingTest() {   
        
        super("KeyBindingTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);   // выход при закрытии окна   
        
        // настраиваем карты команд и входных событий для корневой панели приложения   
        InputMap im = getRootPane().getInputMap();   
        ActionMap am = getRootPane().getActionMap();   

        // срабатывает при отпускании сочетания Ctrl+A   
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK, true), "Action");   
        // срабатывает при печати буквы 'Я'   
        im.put(KeyStroke.getKeyStroke('Я'), "Action");   
        am.put("Action", new AnAction());   

        // выводим окно на экран   
        setSize(200, 200);   
        setVisible(true);  
    }  

    // класс нашей команды  
    class AnAction extends AbstractAction {   
        public void actionPerformed(ActionEvent e) {    
            System.out.println("OK");   
        }  
    }  
    
    public static void main(String[] args) {   
        new KeyBindingTest();  
    } 
    
}
