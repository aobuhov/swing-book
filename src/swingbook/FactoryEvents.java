/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class FactoryEvents extends JFrame {
    
    //link to our factory
    private ListenerFactory factory = new ListenerFactory();
    
    public FactoryEvents() {   
        super("FactoryEvents");
        // событие при закрытии окна получаем от фабрики   
        addWindowListener(factory.getWindowL());   
        // добавим кнопку   
        JButton button = new JButton("Нажмите меня");   
        getContentPane().add(button);   
        // слушатель кнопки также создается фабрикой   
        button.addActionListener(factory.getButtonL());   
        
        // выводим окно на экран   
        pack();   
        setVisible(true);  
    }  
    
    public static void main(String[] args) {   
        new FactoryEvents();  
    } 
    
}

//class's factory
class ListenerFactory {
    
// этот метод создает слушателя для кнопки  
    public ActionListener getButtonL() {   
        return new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ButtonListener");
            }
        };
    } 
    
    // слушатель оконных событий  
    public WindowListener getWindowL() {   
        return new WindowL();  
    }  
    
    class WindowL extends WindowAdapter {   
        public void windowClosing(WindowEvent e) {    
            System.exit(0);   
        }  
    } 
    
}


