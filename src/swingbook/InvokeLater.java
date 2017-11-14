/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Obuhov.Alexey
 */
public class InvokeLater extends JFrame {
    
    public InvokeLater() {  
        super("InvokeLater");
        // при закрытии окна - выход   
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
        // добавим кнопку со слушателем   
        button = new JButton("Выполнить сложную работу");   
        button.addActionListener(new ActionListener() {    
            public void actionPerformed(ActionEvent e) {     
                // запустим отдельный поток     
                new ComplexJobThread().start();     
                button.setText("Подождите...");    
            }   
        });   
        
        // настроим панель содержимого и выведем окно на экран   
        getContentPane().setLayout(new FlowLayout());   
        getContentPane().add(new JTextField(20));   
        getContentPane().add(button);   
        setSize(300, 200);   
        setVisible(true);  
    }  
    
    private JButton button;  

    // поток, выполняющий "сложную работу"  
    class ComplexJobThread extends Thread {   
        public void run() {    
            try {     
                // изобразим задержку     
                sleep(3000);     
                // работа закончена, нужно изменить интерфейс 
                EventQueue.invokeLater(new Runnable() {      
                    public void run() {       
                        button.setText("Работа завершена");      
                    }     
                });    
            } catch (Exception ex) {     
                ex.printStackTrace();    
            }   
        }  
    }  
    
    public static void main(String[] args) {   
        new InvokeLater();  
    } 
}
