package com.company;

import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;

public class JFramePractice {
    public static void main (String[] args) {
        Font font = new Font(null, Font.BOLD, 33);
        JFrame jFrame = new JFrame("Felix JFrame");
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.setBounds(100, 100, 500, 500);
        jFrame.setResizable(false);
        jFrame.setBackground(Color.BLACK);
        jFrame.setFont(font);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Confirmed");
        button.addActionListener(new FelixActionListener());

        jFrame.add(button);
        jFrame.setVisible(true);
    }

    public static class FelixActionListener implements ActionListener {
        private static JDialog dialog = new JDialog();

        public FelixActionListener () {
            dialog.setBounds(100, 100, 300, 150);
            dialog.setResizable(false);
            dialog.setLayout(new FlowLayout(FlowLayout.CENTER));
            dialog.getContentPane().setBackground(Color.gray);

            JButton yes = new JButton("Yes");
            JButton no = new JButton("No");

            yes.addActionListener(new ExitActionListener());
            no.addActionListener(new ExitActionListener());

            dialog.add(yes);
            dialog.add(no);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            dialog.setVisible(true);
        }

        public static class ExitActionListener implements ActionListener {
            @Override
            public void actionPerformed (ActionEvent e) {
                dialog.setVisible(false);
            }
        }
    }
}