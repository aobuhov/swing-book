/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter06;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Obuhov.Alexey
 */
public class LabelMnemonic extends JFrame {

    public LabelMnemonic() {
        super("LabelMnemonic");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // добавим пару текстовых полей   
        JPanel contents = new JPanel(new GridLayout(2, 2));
        JTextField tf = new JTextField(10);
        JLabel label = new JLabel("Ваше имя (N):");
        // настройка мнемоники   
        label.setLabelFor(tf);
        label.setDisplayedMnemonic('N');

        // добавляем компоненты в таблицу   
        contents.add(new JLabel("Ваша фамилия:"));
        contents.add(new JTextField(10));
        contents.add(label);
        contents.add(tf);

        // выведем окно на экран  
        setContentPane(contents);
        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        new LabelMnemonic();
    }

}
