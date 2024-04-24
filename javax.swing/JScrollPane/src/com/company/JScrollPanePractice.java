package com.company;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import java.awt.*;

public class JScrollPanePractice {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Felix Frame");
        frame.setResizable(false);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setBackground(Color.DARK_GRAY);
        frame.setBounds(100, 100, 500, 500);
        frame.setFont(new Font(null, Font.BOLD, 33));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea text = new JTextArea("this is text area", 10, 10);
        text.setFont(new Font(null, Font.BOLD, 20));
        JScrollPane pane = new JScrollPane(text);

        frame.add(pane);
        frame.setVisible(true);
    }
}