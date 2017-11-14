/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Obuhov.Alexey
 */
public class KeyL implements KeyListener {

    public KeyL() {
    }

    //печать символа
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e);
    }

    //нажатие клавишы
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e);
    }

    //отпускание клавиши
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e);
    }
    
}
