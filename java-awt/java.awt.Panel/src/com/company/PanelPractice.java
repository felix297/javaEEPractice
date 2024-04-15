package com.company;

import java.awt.*;
import java.util.Scanner;

public class PanelPractice {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new BorderLayout());
        frame.setBounds(100, 100, 500, 500);
        frame.setResizable(false);
        frame.setBackground(new Color(22, 27, 34));

        Panel panel1 = new Panel();
        panel1.setLayout(new GridLayout(1, 3));
        panel1.setBackground(Color.WHITE);

        Button button1 = new Button("File");
        Button button2 = new Button("Open");
        Button button3 = new Button("About");

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);

        frame.add(panel1, BorderLayout.NORTH);
        frame.setVisible(true);

    }
}
