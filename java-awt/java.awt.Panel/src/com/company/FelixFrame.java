package com.company;

import java.awt.*;

public class FelixFrame {
    public static Frame getFrame() {
        Frame frame = new Frame();
        frame.setBounds(100, 100, 500, 500);
        frame.setBackground(new Color(22, 27, 34));
        frame.setResizable(false);
        FelixWindowAdapter felixWindowAdapter = new FelixWindowAdapter();
        frame.addWindowListener(felixWindowAdapter);
        return frame;
    }




}