/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class FirstEvents extends JFrame {

    public FirstEvents() throws HeadlessException {
        super("FirstEvents");

        // при закрытии окна - выход   
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // регистрируем нашего слушателя   
        addKeyListener(new KeyL());

        // выводим окно на экран   
        setSize(200, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FirstEvents();
    }

}
