/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porty.swing;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Obuhov.Alexey
 */
public class DatabaseListModel extends AbstractListModel {

    // здесь будем хранить данные  
    private ArrayList data = new ArrayList();
    
    // загрузка из базы данных 
    public void setDataSource(ResultSet rs, String column) {
        try {
            // получаем данные   
            data.clear();
            while (rs.next()) {
                synchronized (data) {
                    data.add(rs.getString(column));
                }

                // оповещаем виды (если они есть)  
                fireIntervalAdded(this, 0, data.size());
            }
            rs.close();
            fireContentsChanged(this, 0, data.size());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public int getSize() {
        synchronized (data) {
            return data.size();
        }
    }

    @Override
    public Object getElementAt(int idx) {
        synchronized (data) {
            return data.get(idx);
        }
    }

}
