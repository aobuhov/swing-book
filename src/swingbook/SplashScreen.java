/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import javax.swing.JComponent;
import javax.swing.JWindow;

/**
 *
 * @author Obuhov.Alexey
 */
public class SplashScreen extends JWindow {

    // необходимые нам изображения  
    private Image capture;
    private Image splash = getToolkit().getImage("splash.gif");

    public SplashScreen() {
        super();
        // размер и положение окна на экране   
        setLocation(200, 100);
        setSize(300, 300);
        // снимаем экранную копию   
        try {
            Robot robot = new Robot();
            capture = robot.createScreenCapture(new Rectangle(200, 100, 500, 400));
        } catch (Exception ex) {
            ex.printStackTrace();

        }

        getContentPane().add(new Splash());// добавляем компонент-заставку  
        setVisible(true);// выводим окно на экран
        
        // заканчиваем работу по истечении некоторого времени  
        try {
            Thread.currentThread().sleep(10000);
        } catch (Exception e) {
        }
        System.exit(0);
    }


    // компонент рисует заставку 
    class Splash extends JComponent {

        public void paintComponent(Graphics g) {
            // рисуем копию экрана  
            g.drawImage(capture, 0, 0, this);
            // и поверх нее - рисунок с заставкой  
            g.drawImage(splash, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        new SplashScreen();
    }

}
