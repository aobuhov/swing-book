/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Obuhov.Alexey
 */
public class LowLevelEvents extends JFrame {

    JTextArea out = new JTextArea();
    
    public LowLevelEvents() throws HeadlessException {
        super("LowLevelEvents");

        // при закрытии окна - выход   
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //добавим текстовое поле
        
        getContentPane().add(new JScrollPane(out));
        //и кнопку
        JButton button = new JButton("Источник события");
        getContentPane().add(button, "South");

        //регистрируем нашего слушателя
        OurListener ol = new OurListener();
        button.addKeyListener(ol);
        button.addMouseListener(ol);
        button.addMouseMotionListener(ol);
        button.addFocusListener(ol);

        // выводим окно на экран   
        setSize(400, 300);
        setVisible(true);

    }

    class OurListener implements MouseListener, MouseMotionListener, MouseWheelListener, KeyListener, FocusListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void keyTyped(KeyEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void focusGained(FocusEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void focusLost(FocusEvent e) {
            out.append(e.toString() + "\n");
        }

    }

    public static void main(String[] args) {
        new LowLevelEvents();
    }

}
