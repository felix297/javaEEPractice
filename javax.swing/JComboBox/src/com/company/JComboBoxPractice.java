package com.company;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JComboBox;

public class JComboBoxPractice {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Felix Frame");
        frame.setResizable(false);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"please select your rank", "top", "high", "medium", "low"};
        JComboBox box = new JComboBox(items);

        frame.add(box);
        frame.setVisible(true);
    }
}