package com.company;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListPractice {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Felix Frame");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton button = new JButton("a button");

        String[] items = {"  ","game", "ball", "computer", "chair"};
        JList list = new JList(items);

        frame.add(list);
        frame.setVisible(true);
    }
}