package com.company;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Frame;
import java.awt.Color;

public class FelixFrame extends Frame {
    public FelixFrame() {

    }

    public FelixFrame (String title) {
        super(title);
        setResizable(false);
        setBackground(new Color(22, 27, 34));
        setBounds(100, 100, 500, 500);
        addWindowListener(new FelixWindowAdapter());
    }

    private static class FelixWindowAdapter extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

}