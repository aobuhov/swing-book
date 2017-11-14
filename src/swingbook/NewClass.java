/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.InputVerifier;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Obuhov.Alexey
 */
public class NewClass extends JFrame {
    
    public NewClass (){
    
        super("test");
        setSize(100, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container contentPane =  getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        Container verticalBox = Box.createVerticalBox();
        contentPane.add(verticalBox, BorderLayout.NORTH);
        
        //first answer
        Container verticalBoxAnswer = Box.createVerticalBox();
        
        JCheckBox checkBox1 = new JCheckBox("<html>это текст первого вопроса и пусть он будет безграничным</html>");
        JTextField textFieldAdditional = new JTextField();
        textFieldAdditional.setMinimumSize(new Dimension(10, 20));
        textFieldAdditional.setPreferredSize(new Dimension(300, 20));
        textFieldAdditional.setMaximumSize(new Dimension(400, 20));
        
        verticalBoxAnswer.add(checkBox1);
        verticalBoxAnswer.add(textFieldAdditional);
        
        verticalBox.add(verticalBoxAnswer);
        //second answer
        JCheckBox checkBox2 = new JCheckBox("<html>это текст первого вопроса и пусть он будет бузграничным</html>");
        JTextField textFieldAdditional2 = new JTextField();
        textFieldAdditional2.setMinimumSize(new Dimension(10, 20));
        textFieldAdditional2.setPreferredSize(new Dimension(30, 20));
        textFieldAdditional2.setMaximumSize(new Dimension(30, 20));
        //textFieldAdditional2.setInputVerifier(new NumericVerifier(9, EnFieldFillMode.mustBeFilled));
        
        verticalBoxAnswer.add(checkBox2);
        verticalBoxAnswer.add(textFieldAdditional2);
        
        verticalBox.add(verticalBoxAnswer);
        
        //third answer
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new NewClass();
        
    }
    
}
