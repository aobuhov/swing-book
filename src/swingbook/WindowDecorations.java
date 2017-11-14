/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author Obuhov.Alexey
 */
public class WindowDecorations {

    public static void main(String[] args) {
        //включим украшения для окон 
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);

        //окно с рамкой 
        JFrame frame = new JFrame("Oкнo с рамкой");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);

        //диалоговое окно 
        JDialog dialog = new JDialog(frame, "Диалог"); 
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(150, 100);
        
        //так можно задавать тип оформления окна 
        dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
        dialog.setVisible(true);
    }
}
