package com.company;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;
import java.net.URL;

public class JLabelPractice {
    public static void main (String[] args) throws Exception {
        JFrame frame = new JFrame("Felix Frame");
        Font font = new Font(null, Font.BOLD, 33);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBounds(100, 100, 500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFont(font);

        ImageIcon microsoft = new ImageIcon("D:\\desktop\\microsoft.png");
        Image microsoft_scale = microsoft.getImage();
        microsoft.setImage(microsoft_scale.getScaledInstance(33, 33, Image.SCALE_DEFAULT));

        JLabel label = new JLabel("Microsoft", microsoft, SwingConstants.CENTER);
        label.setIcon(microsoft);
        label.setFont(font);

        frame.add(label);
        frame.setVisible(true);
    }
}
