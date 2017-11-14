/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Obuhov.Alexey
 */
public class VerticalLayout implements LayoutManager {

    private Dimension size = new Dimension(); 
    
    // сигнал расположить компоненты в контейнере  
    @Override
    public void layoutContainer(Container c) {
        Component comps[] = c.getComponents();
        int currentY = 5;
        for (int i = 0; i < comps.length; i++) {
            // предпочтительный размер компонента    
            Dimension pref = comps[i].getPreferredSize();
            // указываем положение компонента на экране   
            comps[i].setBounds(5, currentY, pref.width, pref.height);
            // промежуток в 5 пикселов    
            currentY += 5;
            currentY += pref.height;
        }
    }

    // эти два метода нам не понадобятся 
    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component comp) {
    }

    // предпочтительный размер для контейнера 
    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return calculateBestSize(parent);
    }

    // минимальный размер для контейнера  
    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return calculateBestSize(parent);
    }
    
    // вычисляет оптимальный размер контейнера  
    private Dimension calculateBestSize(Container c) {
        // сначала вычислим длину контейнера  
        Component[] comps = c.getComponents();
        int maxWidth = 0;
        for (int i = 0; i < comps.length; i++) {
            int width = comps[i].getWidth();

            // поиск компонента с максимальной длиной   
            if (width > maxWidth) {
                maxWidth = width;
            }
        }    
        // длина контейнера с учетом левого отступа  
        size.width = maxWidth + 5;
        // вычисляем высоту контейнера  
        int height = 0;
        for (int i = 0; i < comps.length; i++) {
            height += 5;
            height += comps[i].getHeight();
        }
        size.height = height;
        return size;
    }
    
    public static void main(String[] args) {  
        JFrame frame = new JFrame("VerticalLayout");
        frame.setSize(400, 400);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        // панель будет использовать новое расположение 
        JPanel contents = new JPanel(new VerticalLayout());  
        // добавим пару кнопок и текстовое поле  
        contents.add(new JButton("Один"));  
        contents.add(new JButton("Два"));  
        contents.add(new JTextField(30));  
        frame.setContentPane(contents);   
        frame.setVisible(true);  
    } 

}
