/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter06;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

/**
 *
 * @author Obuhov.Alexey
 */
public class RedBullet implements Icon {

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(Color.red);
        g.fillRect(0, 0, 16, 16); 
    }

    @Override
    public int getIconWidth() {
        return 16;
    }

    @Override
    public int getIconHeight() {
        return 16;
    }
    
    
    
}
