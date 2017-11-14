/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Obuhov.Alexey
 */
public class Borders extends JFrame {
    
    public Borders() {   
        super("Borders");
       setDefaultCloseOperation(EXIT_ON_CLOSE);  
       // создаем панели с всевозможными рамками   
       JPanel contents = new JPanel(new GridLayout(3, 2, 5, 5));   
       contents.add(createPanel(new TitledBorder("Рамка с заголовком"), "TitledBorder"));   
       contents.add(createPanel(new EtchedBorder(), "EtchedBorder")); 
       contents.add(createPanel(new BevelBorder(BevelBorder.LOWERED), "BevelBorder"));
       contents.add(createPanel(new SoftBevelBorder(BevelBorder.RAISED), "SoftBevelBorder")); 
       contents.add(createPanel(new LineBorder(Color.green, 5), "LineBorder"));  
       contents.add(createPanel(new MatteBorder(new ImageIcon("anim.gif")), "MatteBorder"));  
       // выводим окно на экран  
       
       setContentPane(contents); 
       pack(); 
       setVisible(true);  
    }  
    
    // метод создает панель с рамкой и надписью 
    private JPanel createPanel(Border b, String text) { 
        JPanel panel = new JPanel(new BorderLayout()); 
        panel.add(new JLabel(text)); 
        panel.setBorder(new CompoundBorder(b, new EmptyBorder(30, 30, 30, 30))); 
        return panel;
    }  
    
    public static void main(String[] args) {  
        new Borders();  
    } 
    
}
