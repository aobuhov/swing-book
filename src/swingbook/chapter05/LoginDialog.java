/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter05;

import com.porty.swing.GUITools;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Obuhov.Alexey
 */
public class LoginDialog extends JDialog {

    public LoginDialog(JFrame parent) {
        super(parent, "Вход в систему");
        
        // при выходе из диалогового окна работа заканчивается  
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
        getContentPane().add(createGUI());// добавляем расположение в центр окна
        pack();// задаем предпочтительный размер  
        setVisible(true);// выводим окно на экран   
    }

    // открытые ссылки на компоненты для присоединения слушателей событий  
    public JTextField nameField, passwrdField;
    public JButton ok, cancel;

    // этот метод будет возвращать панель с созданным расположением  
    private JPanel createGUI() {
        
        // 1. Создается панель, которая будет содержать   
        // все остальные элементы и панели расположения   
        JPanel main = BoxLayoutUtils.createVerticalPanel();
        // Чтобы интерфейс отвечал требованиям Java,  
        // необходимо отделить его содержимое от границ окна на 12 пикселов. 
        // Для этого используем пустую рамку    
        main.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        
        // 2. Поочередно создаются "полосы", на которые был разбит интерфейс на этапе анализа  
        // а) первое текстовое поле и надпись к нему 
        JPanel name = BoxLayoutUtils.createHorizontalPanel();
        JLabel nameLabel = new JLabel("Имя:");
        name.add(nameLabel);
        name.add(Box.createHorizontalStrut(12));
        nameField = new JTextField(15);
        name.add(nameField);
        
        // б) второе текстовое поле и надпись к нему   
        JPanel password = BoxLayoutUtils.createHorizontalPanel();
        JLabel passwrdLabel = new JLabel("Пароль:");
        password.add(passwrdLabel);
        password.add(Box.createHorizontalStrut(12));
        passwrdField = new JTextField(15);
        password.add(passwrdField);
        
        // в) ряд кнопок  
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        JPanel grid = new JPanel(new GridLayout(1, 2, 5, 0));
        ok = new JButton("OK");
        cancel = new JButton("Отмена");
        grid.add(ok);
        grid.add(cancel);
        flow.add(grid);
        
        // 3. Проводятся необходимые действия по выравниванию компонентов, уточнению их  
        // размеров, приданию одинаковых размеров  
        // а) согласованное выравнивание вложенных панелей   
        BoxLayoutUtils.setGroupAlignmentX(
                new JComponent[]{
                    name, password, main, flow}, Component.LEFT_ALIGNMENT);
        
        // б) центральное выравнивание надписей и текстовых полей  
        BoxLayoutUtils.setGroupAlignmentY(
                new JComponent[]{
                    nameField, passwrdField, nameLabel, passwrdLabel
                }, Component.CENTER_ALIGNMENT);

        // в) одинаковые размеры надписей к текстовым полям   
        GUITools.makeSameSize(new JComponent[]{nameLabel, passwrdLabel
        });
        
        // г) стандартный вид для кнопок   
        GUITools.createRecommendedMargin(new JButton[]{ok, cancel});
        
        // д) устранение "бесконечной" высоты текстовых полей   
        GUITools.fixTextFieldSize(nameField);
        GUITools.fixTextFieldSize(passwrdField);
        
        // 4. Окончательный "сбор" полос в интерфейс  
        main.add(name);
        main.add(Box.createVerticalStrut(12));
        main.add(password);
        main.add(Box.createVerticalStrut(17));
        main.add(flow);
        
        // готово  
        return main;
    }

    // тестовый метод для проверки диалогового окна 
    public static void main(String[] args) {
        new LoginDialog(new JFrame());
    }

}
