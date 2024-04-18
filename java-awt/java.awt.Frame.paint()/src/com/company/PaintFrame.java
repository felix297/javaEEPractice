package com.company;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;

public class PaintFrame extends Frame {
    public PaintFrame() {}
    public PaintFrame(String title) {
        super(title);
        setBounds(100, 100, 500, 500);
        setBackground(Color.gray);
        setResizable(false);
        setFont(new Font(null, Font.BOLD, 33));
        addWindowListener(new FelixWindowAdapter());
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(50, 50, 100, 300);
    }

    private static class FelixWindowAdapter extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
