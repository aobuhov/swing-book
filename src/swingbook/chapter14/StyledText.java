/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter14;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Obuhov.Alexey
 */
public class StyledText extends JFrame {

    // наш редактор 
    private JTextPane textPane;

    public StyledText() {
        super("StyledText");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        textPane = new JTextPane();// создадим редактор 

        createDocument(textPane);// создание документа и стилей   

        getContentPane().add(new JScrollPane(textPane));// добавим редактор в панель содержимого 

        setSize(400, 300);
        setVisible(true);// выводим окно на экран   
    }

    private void createDocument(JTextPane tp) {
        // настройка стилей  
        // стиль основного текста 
        Style normal = tp.addStyle("Normal", null);
        StyleConstants.setFontFamily(normal, "Verdana");
        StyleConstants.setFontSize(normal, 13);
        // заголовок 
        Style heading = tp.addStyle("Heading", normal);
        StyleConstants.setFontSize(heading, 20);
        StyleConstants.setBold(heading, true);
        // наполняем документ содержимым, используя стили  
        insertString("Незамысловатый Заголовок", tp, heading);
        insertString("Далее идет обычное содержимое,", tp, normal);
        insertString("помеченное стилем Normal.", tp, normal);
        insertString("Еще Один Заголовок", tp, heading);
        // меняем произольную часть текста   
        SimpleAttributeSet red = new SimpleAttributeSet();
        StyleConstants.setForeground(red, Color.red);
        StyledDocument doc = tp.getStyledDocument();
        doc.setCharacterAttributes(5, 5, red, false);
        // добавим компонент в конец текста  
        tp.setCaretPosition(doc.getLength());
        JCheckBox check = new JCheckBox("Все возможно!");
        check.setOpaque(false);
        tp.insertComponent(check);

    }

// вставляет строку в конец документа с переносом,
    // используя заданный стиль оформления
    private void insertString(String s, JTextPane tp, Style style) {
        try {
            Document doc = tp.getDocument();
            doc.insertString(doc.getLength(), s + "\r\n", style);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new StyledText();
    }

}
