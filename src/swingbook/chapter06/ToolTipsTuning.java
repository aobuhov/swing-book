/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter06;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ToolTipManager;

/**
 *
 * @author Obuhov.Alexey
 */
public class ToolTipsTuning extends JFrame {

    public ToolTipsTuning() {
        super("ToolTipsTuning");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
  
        // добавим кнопки с подсказками   
        JPanel contents = new JPanel();
        JButton b1 = new JButton("Первая");
        b1.setToolTipText("Подсказка для первой");
        JButton b2 = new JButton("Вторая");
        b2.setToolTipText("Подсказка для второй");
        contents.add(b1);
        contents.add(b2);
       
        // настройка подсказок
        ToolTipManager ttm = ToolTipManager.sharedInstance();
        ttm.setLightWeightPopupEnabled(false);
        ttm.setInitialDelay(1000);
        ttm.setDismissDelay(200);
        ttm.setReshowDelay(1000);

        // выводим окно на экран
        setContentPane(contents);
        setSize(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ToolTipsTuning();
    }
}
