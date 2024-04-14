package com.company;

import java.awt.Color;
import java.awt.Frame;

public class FelixFrame {
    /**
     *
     * @return a default Frame object
     */
    public Frame getFrame () {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(110,70,750,650);
        frame.setBackground(new Color(22, 27, 34));

        FelixWindowAdapter felixWindowAdapter = new FelixWindowAdapter();
        frame.addWindowListener(felixWindowAdapter);
        return frame;
    }
}