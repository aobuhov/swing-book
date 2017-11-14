/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter06;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Obuhov.Alexey
 */
public class UsingBorderFactory extends JFrame {

    public UsingBorderFactory() {
        super("UsingBorderFactory");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // рамка для панели содержимого 
        JPanel cp = (JPanel) getContentPane();
        cp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), "Сделано на фабрике рамок"));
        // выводим окно на экран  
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UsingBorderFactory();
    }

}
