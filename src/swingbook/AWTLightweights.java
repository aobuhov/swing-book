/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Obuhov.Alexey
 */
public class AWTLightweights extends Frame{
    
    public AWTLightweights() {   
        super("AWTLightweights");
       // при закрытии окна приложение завершается   
       addWindowListener( new WindowAdapter() {    
           public void windowClosing(WindowEvent e) {    
               System.exit(0);
            }   
        }
        );   
    
        // добавляем пару легковесных компонентов   
        Lightweight1 lt1 = new Lightweight1();   
        Lightweight2 lt2 =  new Lightweight2();   

        // укажем координаты вручную, чтобы компоненты перекрывались   
        setLayout(null);   
        lt1.setBounds(0, 0, 200, 200);   
        lt2.setBounds(0, 0, 200, 200);   
        add(lt2);   
        add(lt1);   

        // последним добавляем тяжеловесный компонент   
        Button button = new Button("Тяжелая!");   
        button.setBounds(50, 50, 80, 30);   
        add(button);   

        // выводим окно на экран   
        setSize(200, 200);   
        setVisible(true);  
    }  

    // легковесный компонент - синий квадрат  
    class Lightweight1 extends Component {  
        public void paint(Graphics g) {    
            g.setColor(Color.blue);    
            g.fillRect(20, 40, 100, 100);   
        }  
    }  

    // легковесный компонент - красный кружок  
    class Lightweight2 extends Component {   
        public void paint(Graphics g) {    
            g.setColor(Color.red);    
            g.fillOval(20, 30, 90, 90);   
        }  
    }  
    
    public static void main(String[] args) {   
        new AWTLightweights();  
    } 
    
}
