 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.AWTKeyStroke;
import java.awt.FlowLayout;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class FocusKeysTest extends JFrame {
    
    // особая кнопка  
    JButton button = new JButton("Особая");  
    
    public FocusKeysTest() {   
        super("FocusKeysTest");
        // выход при закрытии окна   
        setDefaultCloseOperation(EXIT_ON_CLOSE);   

        // настроим клавиши перехода фокуса   
        HashSet set = new HashSet();   
        set.add(AWTKeyStroke.getAWTKeyStroke('Q', KeyEvent.CTRL_MASK));   
        button.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, set);   
        // добавляем пару кнопок   
        getContentPane().setLayout(new FlowLayout());   
        getContentPane().add(button);   
        getContentPane().add(new JButton("Обычная"));   

        // выводим окно на экран   
        setSize(200, 200); 
        setVisible(true); 
    }  

    
    public static void main(String[] args) {   
        new FocusKeysTest();  
    } 
    
}
