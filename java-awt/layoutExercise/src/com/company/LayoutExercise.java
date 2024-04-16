package com.company;

import java.awt.*;

public class LayoutExercise {
    public static void main (String[] args) {
        FelixFrame frame = new FelixFrame("Felix Frame");
        frame.setLayout(null);

        Panel alternative = new Panel();
        Panel body = new Panel();

        alternative.setBackground(Color.gray);
        alternative.setBounds(0, 25, 500, 25);
        alternative.setLayout(new FlowLayout(FlowLayout.LEFT));
        body.setBackground(Color.lightGray);
        body.setBounds(0, 50, 500, 450);
        body.setLayout(new GridLayout(2, 3));

        Button File = new Button("File");
        Button Edit = new Button("Edit");
        Button About = new Button("About");
        Button Help = new Button("Help");

        alternative.add(File);
        alternative.add(Edit);
        alternative.add(About);
        alternative.add(Help);


        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(2,1));
        panel2.add(new Button("button2.1"));
        panel2.add(new Button("button2.2"));
        Panel panel5 = new Panel();
        panel5.setLayout(new GridLayout(1, 2));
        panel5.add(new Button("button5.1"));
        panel5.add(new Button("button5.2"));

        body.add(new Button("button1"));
        body.add(panel2);
        body.add(new Button("button3"));
        body.add(new Button("button4"));
        body.add(panel5);
        body.add(new Button("button6"));

        frame.add(alternative);
        frame.add(body);

        frame.setVisible(true);
    }
}