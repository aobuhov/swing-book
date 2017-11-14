/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porty.swing;

import com.porty.swing.event.ButtonPressEvent;
import com.porty.swing.event.ButtonPressListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventListener;
import java.util.Iterator;
import javax.swing.JComponent;
import javax.swing.event.EventListenerList;

/**
 *
 * @author Obuhov.Alexey
 */
public class SimpleButton extends JComponent {
    
    private EventListenerList listenerList = new EventListenerList();
    
    private ButtonPressEvent event = new ButtonPressEvent(this);
    
    // конструктор - присоединяет к кнопке слушателя события от мыши 
    public SimpleButton() {
        
        addMouseListener(new PressL());
        setPreferredSize(new Dimension(100, 100));
    }
    
   // присоединяет слушателя нажатия кнопки  
    public void addButtonPressListener(EventListener l) {   
        listenerList.add(ButtonPressListener.class, (ButtonPressListener) l);  
    }  

    // отсоединяет слушателя нажатия кнопки  
    public void removeButtonPressListener(EventListener l) {
        listenerList.remove(ButtonPressListener.class, (ButtonPressListener) l);  
    }
    
    // прорисовывает кнопку 
    public void paintComponent(Graphics g) {   
        
        g.setColor(Color.green);   // зальем зеленым цветом   
        g.fillRect(0, 0, getWidth(), getHeight());   // рамка   
        g.setColor(Color.black);   
        g.draw3DRect(0, 0, getWidth(), getHeight(), true);  
        
    } 
    
    // оповещает слушателей о событии  
    protected void fireButtonPressed() {   
        
        for (ButtonPressListener listener: listenerList.getListeners(ButtonPressListener.class)){
            listener.buttonPressed(event);  
        } 
    } 
    
    // внутренний класс, следит за нажатиями мыши  
    class PressL extends MouseAdapter {   
        // нажатие мыши в области кнопки   
        public void mousePressed(MouseEvent e) {    
            // оповестим слушателей    
            fireButtonPressed();   
        }  
    } 
    
}
