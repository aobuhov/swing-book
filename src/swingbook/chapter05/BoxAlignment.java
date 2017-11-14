/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Obuhov.Alexey
 */
public class BoxAlignment extends JFrame {

    public BoxAlignment() {
        super("BoxAlignment");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pv = BoxLayoutUtils.createVerticalPanel();// вертикальная панель  
        
        // кнопка с выравниванием по левой границе   
        JButton jb = new JButton("Левая граница");
        jb.setAlignmentX(jb.LEFT_ALIGNMENT);
        pv.add(jb);

        // копка с центральным выравниванием   
        jb = new JButton("Выравнивание по центру");
        jb.setAlignmentX(jb.CENTER_ALIGNMENT);
        pv.add(jb);
    
        // наконец, кнопка с выравниванием по правому краю   
        jb = new JButton("Правая граница");
        jb.setAlignmentX(jb.RIGHT_ALIGNMENT);
        pv.add(jb);
        
        
        getContentPane().add(pv);// добавляем панель в центр окна   

        setVisible(true);// выводим окно на экран   
    }

    public static void main(String[] args) {
        new BoxAlignment();
    }

}
