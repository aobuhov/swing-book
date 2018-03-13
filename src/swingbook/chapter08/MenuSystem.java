/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter08;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

/**
 *
 * @author note
 */
public class MenuSystem extends JFrame {

    public MenuSystem() {
        super("MenuSystem");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создаем строку главного меню
        JMenuBar menuBar = new JMenuBar();
        // добавляем в нее выпадающие меню
        menuBar.add(createFileMenu());
        menuBar.add(createWhoMenu());
        // и устанавливаем ее в качестве меню нашего окна
        setJMenuBar(menuBar);
        // выводим окно на экран
        setSize(300, 200);
        setVisible(true);
    }

    // создает меню "Файл"
    private JMenu createFileMenu() {
        // создадим выпадающее меню, которое будет содержать обычные пункты меню
        JMenu file = new JMenu("Файл");
        // пункт меню (со значком)
        JMenuItem open = new JMenuItem("Открыть", new ImageIcon("images/open16.gif"));
        // пункт меню из команды
        JMenuItem exit = new JMenuItem(new ExitAction());
        // добавим все в меню
        file.add(open);
        // разделитель
        file.addSeparator();
        file.add(exit);
        return file;
    }

    // создадим забавное меню
    private JMenu createWhoMenu() {

        // создадим выпадающее меню
        JMenu who = new JMenu("Кто ВЫ ?");
        // меню-флажки
        JCheckBoxMenuItem clever = new JCheckBoxMenuItem("Умный");
        JCheckBoxMenuItem smart = new JCheckBoxMenuItem("Красивый");
        JCheckBoxMenuItem tender = new JCheckBoxMenuItem("Нежный");

        // меню-переключатели
        JRadioButtonMenuItem male = new JRadioButtonMenuItem("Мужчина");
        JRadioButtonMenuItem female = new JRadioButtonMenuItem("Женщина");
        // организуем переключатели в логическую группу
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        // добавим все в меню
        who.add(clever);
        who.add(smart);
        who.add(tender);
        // разделитель можно создать и явно
        who.add(new JSeparator());
        who.add(male);
        who.add(female);
        return who;
    }

    // команда выхода из приложения
    class ExitAction extends AbstractAction {

        ExitAction() {
            putValue(NAME, "Выход");
        }

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MenuSystem();
    }

}
