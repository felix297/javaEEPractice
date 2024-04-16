package com.company;

import java.awt.event.WindowEvent;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.WindowAdapter;

public class FelixFrame extends Frame {
    public FelixFrame() {};
    public FelixFrame (String title) {
        super(title);
        setBounds(100, 100, 500, 500);
        setBackground(new Color(22, 27, 34));
        setResizable(false);
        addWindowListener(new FelixWindowAdapter());
    }

    public class FelixWindowAdapter extends WindowAdapter {
        @Override
        public void windowClosing (WindowEvent e) {
            System.exit(0);
        }
    }
}
