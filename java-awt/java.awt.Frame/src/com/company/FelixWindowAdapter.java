package com.company;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FelixWindowAdapter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("closing the window");
        System.exit(0);
    }
}
