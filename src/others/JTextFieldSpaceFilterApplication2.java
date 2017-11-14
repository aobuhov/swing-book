/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Obuhov.Alexey
 */
public class JTextFieldSpaceFilterApplication2 extends JFrame {

    public class SpaceDocumentFilter extends DocumentFilter {

        public SpaceDocumentFilter() {
        }

        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            if (string == null) {
                return;
            }
            replace(fb, offset, 0, string, attr);
        }

        public void remove(DocumentFilter.FilterBypass fb, int offset, int length) throws BadLocationException {
            replace(fb, offset, length, "", null);
        }

        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            fb.replace(offset, length, checkInput(text, offset), attrs);
        }

        private String checkInput(String proposedValue, int offset) throws BadLocationException {
            // Убираем все пробелы из строки для вставки 
            return proposedValue.replaceAll("\\s", "#");
        }
    }

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JTextField jTextField = null;

    private JTextField getJTextField() {
        if (jTextField == null) {
            jTextField = new JTextField();
            jTextField.setBounds(new Rectangle(30, 29, 223, 26));
            // Устанавливаем фильтр для документа строки ввода    
            if (jTextField.getDocument() instanceof AbstractDocument) {
                ((AbstractDocument) jTextField.getDocument()).setDocumentFilter(new SpaceDocumentFilter());
            }
        }
        return jTextField;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JTextFieldSpaceFilterApplication2 thisClass = new JTextFieldSpaceFilterApplication2();
                thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thisClass.setVisible(true);
            }
        });
    }

    public JTextFieldSpaceFilterApplication2() {
        super();
        initialize();
    }

    private void initialize() {
        this.setSize(300, 200);
        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
    }

    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(getJTextField(), null);
        }
        return jContentPane;
    }

}
