/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter09;

import java.util.Arrays;
import java.util.Vector;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Obuhov.Alexey
 */
public class SimpleLists extends JFrame {

    // данные для списков  
    private String[] data1 = {"Один", "Два", "Три", "Четыре", "Пять"};
    private String[] data2 = {"Просто", "Легко", "Элементарно", "Как дважды два"};

    public SimpleLists() {
        super("SimpleLists");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // создаем списки   
        JPanel contents = new JPanel();
        JList list1 = new JList(data1);

        // для второго списка используем вектор 
        Vector data = new Vector();
        data.addAll(Arrays.asList(data2));
        JList list2 = new JList(data);

        // динамически наполним вектор  
        Vector big = new Vector();
        for (int i = 0; i < 50; i++) {
            big.add("# " + i);
        }
        JList bigList = new JList(big);
        bigList.setPrototypeCellValue("12345");
        // добавим списки в панель  
        contents.add(list1);
        contents.add(list2);
        contents.add(new JScrollPane(bigList));

        // выведем окно на экран  
        setContentPane(contents);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleLists();
    }

}
