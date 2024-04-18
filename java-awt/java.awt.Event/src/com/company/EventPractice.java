package com.company;

import java.awt.TextField;

public class EventPractice {
    public static void main (String[] args) {
        FelixFrame frame = new FelixFrame("Felix Frame");
        TextField textField = new TextField("key");
        textField.addKeyListener(new FelixFrame.FelixKeyAdapter());
        frame.add(textField);
        frame.setVisible(true);
    }
}