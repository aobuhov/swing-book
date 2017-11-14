/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter07;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class ButtonMnemonics extends JFrame {

    public ButtonMnemonics() {
        super("ButtonMnemonics");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // получаем панель содержимого   
        Container c = getContentPane();
        // используем последовательное расположение   
        c.setLayout(new FlowLayout());
        // создаем кнопку   
        JButton button = new JButton("Нажмите меня!");
        // мнемоника (русский символ)   
        button.setMnemonic('Н');
        c.add(button);
        // еще одна кнопка, только надпись на английском   
        button = new JButton("All Right!");
        button.setMnemonic('L');
        button.setToolTipText("Жмите смело");
        // Только в JDK1.4 –   
        // button.setDisplayedMnemonicIndex(2);   

        c.add(button);
        // выводим окно на экран   
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonMnemonics();
    }

}
