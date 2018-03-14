/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porty.swing;

import javax.swing.Icon;

/**
 *
 * @author Obuhov.Alexey
 */
public class ImageTableCell {

    public Icon icon;
    public String text;
// удобный конструктор

    public ImageTableCell(String text, Icon icon) {
        this.icon = icon;
        this.text = text;
    }
}
