/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter07;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Obuhov.Alexey
 */
public class ActionSample extends JFrame {

    public ActionSample() {
        super("ActionSample");
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        // получаем панель содержимого  
        Container c = getContentPane();
        // используем последовательное расположени
        c.setLayout(new FlowLayout());
        
        // создадим пару кнопок, выполняющих одно действие 
        Action action = new SimpleAction();
        JButton button1 = new JButton(action);
        JButton button2 = new JButton(action);
        c.add(button1);
        c.add(button2);
        // выводим окно на экран 
        setSize(300, 100);
        setVisible(true);
    }

// этот внутренний класс инкапсулирует нашу команду
    class SimpleAction extends AbstractAction {

        SimpleAction() {    // установим параметры команды 
            putValue(NAME, " Привет, Action!");  
            putValue(SHORT_DESCRIPTION, "Это подсказка");   
            putValue(MNEMONIC_KEY, new Integer('A'));
        }
        // в этом методе обрабатывается событие, как и в прежнем методе ActionListener

        public void actionPerformed(ActionEvent e) {
            // можно выключить команду, не зная, к каким компонентам она присоединена  
            setEnabled(false);
            // изменим надпись 
            putValue(NAME, " Прощай, Action!");
        }
    }

    public static void main(String[] args) {
        new ActionSample();
    }

}
