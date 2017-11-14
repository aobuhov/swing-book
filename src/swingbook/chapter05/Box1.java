/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class Box1 extends JFrame {

    public Box1() {
        super("Box1 - Y");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c = getContentPane();// получаем панель содержимого  
        
        // устанавливаем блочное расположение по  
        // оси Y (столбиком) 
        BoxLayout boxy = new BoxLayout(c, BoxLayout.Y_AXIS);
        c.setLayout(boxy);
        // добавляем компоненты   
        c.add(new JButton("Один"));
        c.add(new JButton("Два"));
        c.add(new JButton("Три"));
        // выводим окно на экран
        setVisible(true);
    }

    static class Box2 extends JFrame {

        public Box2() {
            super("Box2 - X");
        
            // устанавливаем размер и позицию окна 
            setSize(400, 200);
            setLocation(100, 100);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            Container c = getContentPane();// получаем  панель содержимого  
            
            // устанавливаем блочное расположение по оси X (полоской)  
            BoxLayout boxx = new BoxLayout(c, BoxLayout.X_AXIS);
            c.setLayout(boxx);
            // добавляем компоненты   
            c.add(new JButton("Один"));
            c.add(new JButton("Два"));
            c.add(new JButton("Три"));
            // выводим окно на экран    
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        //new Box1();
        //new Box2();
        new a1();
    }
    
    static class a1 {
        String strA1 = "a1";
        
        public a1 () {
            String strA1Inner = "a1_inner";
            class a11 {
                String strA11 = "a11";
                public a11(){
                    System.out.println(strA1);
                    System.out.println(strA1Inner);
                    System.out.println(strA11);
                            
                }
            }
        }
        
    }
}
