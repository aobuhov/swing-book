/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porty.swing;

/**
 *
 * @author Obuhov.Alexey
 */
public class CheckBoxListElement {
    
    // удобный конструктор
    public CheckBoxListElement(boolean selected, String text) {
        this.selected = selected;
        this.text = text;
    }
    
    // данные элемента
    public boolean selected;
    public String text;
    
}
