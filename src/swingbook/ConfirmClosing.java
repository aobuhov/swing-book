/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Obuhov.Alexey
 */
public class ConfirmClosing extends JFrame {

    public ConfirmClosing() {
        super("Приложение");
        
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);  // отключаем операцию закрытия  
        
        // добавляем слушателя событий от окна   
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // потверждение выхода    
                int res = JOptionPane.showConfirmDialog(null, "Действительно выйти?");
                if (res == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        // выводим окно на экран 
        setSize(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConfirmClosing();
    }

}
