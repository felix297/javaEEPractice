package com.company;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.Color;

public class JPanelPractice {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Felix Frame");
        frame.setResizable(false);
        frame.setLayout(new GridLayout(2, 2));
        frame.setBounds(100, 100, 500, 500);
        frame.setBackground(Color.gray);
        frame.setFont(new Font(null, Font.BOLD, 33));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2,2, 10, 10));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        button1.setFont(new Font(null, Font.BOLD, 33));
        button2.setFont(new Font(null, Font.BOLD, 33));
        button3.setFont(new Font(null, Font.BOLD, 33));
        button4.setFont(new Font(null, Font.BOLD, 33));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        frame.add(panel);
        frame.setVisible(true);

    }

}