package com.company;

import java.awt.*;
import java.util.Scanner;

public class ButtonPractice {
    public static void main (String[] args) {
        FelixFrame frame = new FelixFrame("Felix Frame");
        Panel panel = new Panel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 500, 50);

        panel.setLayout(null); // try each layout and see what is the difference

        Button buttonFile = new Button("File");
        buttonFile.setBounds(0, 25, 50, 25);
        Button buttonEdit = new Button("Edit");
        buttonEdit.setBounds(50, 25, 50, 25);
        Button buttonAbout = new Button("About");
        buttonAbout.setBounds(100, 25, 50, 25);

        panel.add(buttonFile);
        panel.add(buttonEdit);
        panel.add(buttonAbout);

        frame.add(panel);
        frame.setVisible(true);
    }
}