/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter06;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Obuhov.Alexey
 */
public class HTMLabel extends JFrame {

    private String html1 = "<html><b>Слава</b><font size=5 color=red> HTML";
    private String html2 = "<html><font size=4 color=blue>" + "<ul>Список:<li>Один<li>Два";
    private String html3 = "<html><body bgcolor=white><h2>Любой цвет фона";
    private String html4 = "<html><h2>Изображения:<img src=\"file:monkey.gif\">";

    public HTMLabel() {
        super("HTMLabel");
        // при закрытии окна выход   
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // добавляем надписи   
        JPanel contents = new JPanel();
        contents.add(new JLabel(html1));
        contents.add(new JLabel(html2));
        contents.add(new JLabel(html3));
        contents.add(new JLabel(html4));
// выводим окно на экран    
        setContentPane(contents);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HTMLabel();
    }

}
