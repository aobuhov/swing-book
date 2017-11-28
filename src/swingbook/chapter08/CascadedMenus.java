/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter08;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

/**
 *
 * @author note
 */
public class CascadedMenus extends JFrame {

    public CascadedMenus() {
        super("CascadedMenus");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создаем строку главного меню
        JMenuBar menuBar = new JMenuBar();
        // создаем выпадающее меню
        JMenu text = new JMenu("Текст");
        // и несколько вложенных меню
        JMenu style = new JMenu("Стиль");
        JMenuItem bold = new JMenuItem("Жирный");
        JMenuItem italic = new JMenuItem("Курсив");
        JMenu font = new JMenu("Шрифт");
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem times = new JMenuItem("Times");
        font.add(arial);
        font.add(times);
        // размещаем все в нужном порядке
        style.add(bold);
        style.add(italic);
        style.addSeparator();
        style.add(font);
        text.add(style);
        menuBar.add(text);
        // помещаем меню в окно
        setJMenuBar(menuBar);
        // разделитель может быть полезен не только в меню
        getContentPane().add(new JSeparator(SwingConstants.VERTICAL), "West");
        // выводим окно на экран
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CascadedMenus();
    }

}
