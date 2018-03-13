/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Obuhov.Alexey
 */
public class UsingListModel extends JFrame {

    // наша модель  
    private DefaultListModel dlm;

    public UsingListModel() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // заполним модель данными   
        dlm = new DefaultListModel();
        dlm.add(0, "Кое-что");
        dlm.add(0, "Кое-что еще");
        dlm.add(0, "Еще немного");

        // создаем кнопку и пару списков   
        JPanel contents = new JPanel();
        JButton add = new JButton("Обновить");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dlm.add(0, "Новинка!");
                validate();
            }
        });
        JList list1 = new JList(dlm);
        JList list2 = new JList(dlm);
        
        // добавляем компоненты   
        contents.add(add);
        contents.add(new JScrollPane(list1));
        contents.add(new JScrollPane(list2));
        
        // выведем окно на экран   
        setContentPane(contents);
        setSize(400, 200);
        setVisible(true);  

    }

    public static void main(String[] args) {
        new UsingListModel();
    }
}
