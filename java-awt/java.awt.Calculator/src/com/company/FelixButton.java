package com.company;

import java.awt.Button;
import java.awt.Font;


public class FelixButton extends Button {
    public FelixButton(){};
    public FelixButton(String label) {
        super(label);
        setFont(felixFont);
        setActionCommand(label);
    }

    public static Font felixFont = new Font(null, Font.BOLD, 55);
}
