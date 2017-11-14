/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter07;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Obuhov.Alexey
 */
public class ButtonEvents extends JFrame {

    public ButtonEvents() {
        super("ButtonEvents");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // получаем панель содержимого   
        Container c = getContentPane();
        // создаем кнопку и помещаем ее на север окна   
        JButton button = new JButton("Нажмите меня!");
        c.add(button, "North");
        
        // поле для вывода сообщений о событиях   
        info = new JTextArea("Пока событий не было\n");
        c.add(new JScrollPane(info));

        // привязываем к нашей кнопке слушателей событий 
        // слушатели описаны как внутренние классы  
        button.addActionListener(new ActionL());
        button.addChangeListener(new ChangeL());

        // присоединение слушателя прямо на месте 
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                info.append("Это вы все равно не увидите");
            }
        });
        
        // выводим окно на экран 
        setSize(400, 300);
        setVisible(true);
        
    }
    
    JTextArea info;

    class ActionL implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            info.append("Получено сообщение о нажатии кнопки! От - " + e.getActionCommand() + "\n");
        }
    }

    class ChangeL implements ChangeListener {

        public void stateChanged(ChangeEvent e) {
            info.append("Получено сообщение о смене состояния кнопки!\n");
            // это источник события  
            Object src = e.getSource();
        }
    }

    public static void main(String[] args) {
        new ButtonEvents();
    }

}
