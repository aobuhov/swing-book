/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porty.swing;

import java.util.Calendar;
import java.util.Date;
import javax.swing.AbstractCellEditor;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerDateModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Obuhov.Alexey
 */
public class DateCellEditor extends AbstractCellEditor implements TableCellEditor {
    // редактор - прокручивающийся список

    private JSpinner editor;
    
    // конструктор
    public DateCellEditor() {
        // настраиваем прокручивающийся список
        SpinnerDateModel model = new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH);
        editor = new JSpinner(model);
    }
    
    // возвращает компонент, применяемый для редактирования
    public java.awt.Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        // меняем значение и возвращаем список
        editor.setValue(value);
        return editor;
    }

    // возвращает текущее значение в редакторе
    public Object getCellEditorValue() {
        return editor.getValue();
    }
}
