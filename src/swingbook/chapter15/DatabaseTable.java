/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbook.chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Obuhov.Alexey
 */
public class DatabaseTable {
    // параметры подключения

    private static String dsn = "jdbc:odbc:Library",
            uid = "sa",
            pwd = "";

    public static void main(String[] args) {
        // инициализация JDBC
        Connection conn = null;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // объект-соединение с БД
            conn = DriverManager.getConnection(dsn, uid, pwd);
            Statement st = conn.createStatement();
            // выполняем запрос
            ResultSet rs = st.executeQuery("select * from readers");
            // наша модель
            DatabaseTableModel dbm = new DatabaseTableModel(false);
            // таблица и окно
            JTable table = new JTable(dbm);
            JFrame frame = new JFrame("Hi");
            frame.setSize(400, 300);
            frame.getContentPane().add(new JScrollPane(table));
            frame.show();
            // выводим результат запроса на экран
            dbm.setDataSource(rs);
            rs.close();
            conn.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
