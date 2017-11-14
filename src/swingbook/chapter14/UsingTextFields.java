/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter14;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Obuhov.Alexey
 */
public class UsingTextFields extends JFrame {

    // наши поля  
    JTextField smallField, bigField;

    public UsingTextFields() {
        super("UsingTextFields");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // создаем текстовые поля   
        smallField = new JTextField(10);
        bigField = new JTextField("Текст поля", 25);
        
        // дополнительные настройки   
        bigField.setFont(new Font("Dialog", Font.PLAIN, 16));
        bigField.setHorizontalAlignment(JTextField.RIGHT);
        
        // слушатель окончания ввода  
        smallField.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            // показываем введенный текст   
                                            JOptionPane.showMessageDialog(UsingTextFields.this, "Ваше слово: " + smallField.getText());
                                        }
                                    });
        
        // поле с паролем   
        JPasswordField password = new JPasswordField(15);
        password.setEchoChar('$');
        
        // добавляем поля в окно и выводим его на экран   
        JPanel contents = new JPanel();
        contents.add(smallField);
        contents.add(bigField);
        contents.add(password);
        setContentPane(contents);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UsingTextFields();
    }
}
