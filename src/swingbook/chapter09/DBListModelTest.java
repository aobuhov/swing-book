/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter09;

import com.porty.swing.DatabaseListModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Obuhov.Alexey
 */
public class DBListModelTest {

    // параметры базы данных 
    private static String dsn = "jdbc:odbc:Library", uid = "sa", pwd = "", query = "select * from readers";

    public static void main(String[] args) {
        // инициализация JDBC 
        Connection conn = null;
        ResultSet rs = null;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // объект-соединение с базой данных  
            conn = DriverManager.getConnection(dsn, uid, pwd);
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        
        // создаем модель и присоединяем список 
        DatabaseListModel dblm = new DatabaseListModel();
        JList list = new JList(dblm);
        
        // загружаем данные 
        dblm.setDataSource(rs, "surname");
        
        // помещаем список в окно  
        JFrame frame = new JFrame("DBList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.getContentPane().add(new JScrollPane(list));
        frame.setVisible(true);
    }
}
