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
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class AnonymousClassEvents extends JFrame {
    
    public AnonymousClassEvents() {
        
        super("AnonymousClassEvents");   
        // анонимный класс присоединяется прямо на месте   
        // выход из приложения при закрытии окна   
        addWindowListener(
                new WindowAdapter() {
                                        public void windowClosing(WindowEvent e) {
                                            System.exit(0);   
                                        }
                                    }
                         );   
        JButton button = new JButton("Нажмите меня");   // добавим кнопку   
        getContentPane().add(button);   
        button.addActionListener(getButtonL());// слушатель создается в методе   
        pack(); // выводим окно на экран      
        setVisible(true);
    }
    
    // этот метод создает слушателя для кнопки  
    public ActionListener getButtonL() {   
        return new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionListener");   
            }
        };  
    }  
    
    public static void main(String[] args) {
        new AnonymousClassEvents();  
    }
    
}
