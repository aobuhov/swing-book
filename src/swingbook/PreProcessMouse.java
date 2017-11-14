/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class PreProcessMouse extends JFrame {
    
    PreProcessMouse() {   
        super("PreProcessMouse");
        // при закрытии окна - выход   
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
        // добавим слушателя событий от мыши   
        addMouseListener(new MouseL());   
        // выводим окно на экран   setSize(200, 200);   
        setVisible(true);  
    }  

    // перехват событий от мыши  
    public void processMouseEvent(MouseEvent e) {   
        if ( e.getClickCount() == 1 ) {   
            // один щелчок не пропускаем к слушателям
            return;   
        } else 
            // иначе вызываем метод базового класса   
          super.processMouseEvent(e);  
    }  

    // в этом слушателе будем следить за щелчками мыши  
    class MouseL extends MouseAdapter {   
        public void mouseClicked(MouseEvent e) {    
            System.out.println("ClickCount: " + e.getClickCount());   
        }  
    }  
    
    public static void main(String[] args) {   
        new PreProcessMouse();  
    } 
    
}
