/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.AWTEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Obuhov.Alexey
 */
public class MaskingEvents extends JFrame {

    public MaskingEvents() {
        super("MaskingEvents");

        setDefaultCloseOperation(EXIT_ON_CLOSE);   // при закрытии окна - выход   
        disableEvents(AWTEvent.WINDOW_EVENT_MASK);   // отключим события от окна   
        
        // добавим особую кнопку  
        JPanel contents = new JPanel();
        contents.add(new CustomButton("Привет!"));
        setContentPane(contents);
        
        // выведем окно на экран   
        setSize(400, 300);
        setVisible(true);
    }

    // особая кнопка  
    class CustomButton extends JButton {

        public CustomButton(String label) {
            super(label);
            // отключаем события с клавиатуры    
            disableEvents(AWTEvent.KEY_EVENT_MASK);
        }
    }

    public static void main(String[] args) {
        new MaskingEvents();
    }

}
