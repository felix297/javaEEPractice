package com.company;

import java.awt.*;

public class FramePractice{
    public static void main (String[] args) {
        Frame frame = new Frame();
        frame.setResizable(true);
        frame.setBounds(200, 200, 100, 200);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        Panel panel = new Panel();
        Panel panel1 = new Panel();
        panel.setBounds(50,50,50,25);
        panel.setVisible(true);
        panel.setBackground(Color.CYAN);
        frame.add(panel);
        panel1.setBounds(50,50,50,25);
        panel1.setVisible(true);
        panel1.setBackground(Color.BLACK);
        frame.add(panel1);
    }

}