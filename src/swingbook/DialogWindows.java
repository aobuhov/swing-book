/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Obuhov.Alexey
 */
public class DialogWindows extends JFrame {

    public DialogWindows() {
        super("DialogWindows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);// выход при закрытии  
        
        // пара кнопок, вызывающих создание диалоговых окон   
        JButton button1 = new JButton("Обычное окно");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = createDialog("Немодальное", false);
                dialog.setVisible(true);
            }
        }
        );
        JButton button2 = new JButton("Модальное окно");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = createDialog("Модальное", true);

                dialog.setVisible(true);
            }
        });

        // создаем панель содержимого и выводим окно на экран 
        JPanel contents = new JPanel();
        contents.add(button1);
        contents.add(button2);
        setContentPane(contents);
        setSize(350, 100);
        setVisible(true);
    }

// создает диалоговое окно 
    private JDialog createDialog(String title, boolean modal) {
        JDialog dialog = new JDialog(this, title, modal);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(200, 60);
        return dialog;
    }

    public static void main(String[] args) {
        new DialogWindows();
    }

}
