/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Obuhov.Alexey
 */
public class BoxRigidAreas extends JFrame {

    public BoxRigidAreas() {
        super("BoxRigidAreas");
        setSize(250, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        JPanel pVert = BoxLayoutUtils.createVerticalPanel();// вертикальная панель 
        pVert.setBorder(new BevelBorder(1));
        pVert.add(new JButton("Один"));

        JPanel pHor = BoxLayoutUtils.createHorizontalPanel();// горизонтальная панель   
        pHor.setBorder(new BevelBorder(1));
        pHor.add(new JButton("Два"));

        // размер пространства задается в виде объекта  
        // Dimension из пакета java.awt 
        pHor.add(Box.createRigidArea(new Dimension(50, 120)));
        pHor.add(new JButton("Три"));
        pVert.add(pHor);

        getContentPane().add(pVert);// добавляем вертикальную панель в центр окна 

        setVisible(true);// выводим окно на экран   
    }

    public static void main(String[] args) {
        new BoxRigidAreas();
    }

}
