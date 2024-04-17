package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private static TextField resText = new TextField();

    public static void main(String[] args) {
        FelixFrame frame = new FelixFrame("Felix Calculator");
        frame.setLayout(null);

        Panel resPanel = new Panel();
        resPanel.setBounds(0, 25, 300, 151);
        resPanel.setLayout(null);

        resText.setFont(new Font(null, Font.BOLD, 100));
        resText.setBounds(5, 0, 300, 151);
        resText.setText("");

        resPanel.add(resText);

        Panel buttonPanel = new Panel();
        buttonPanel.setBounds(0, 175, 300, 324);
        buttonPanel.setLayout(new GridLayout(1, 4));

        Panel buttonPanel1 = new Panel();
        buttonPanel1.setLayout(new GridLayout(4, 1));
        FelixButton button7 = new FelixButton("7");
        FelixButton button4 = new FelixButton("4");
        FelixButton button1 = new FelixButton("1");
        FelixButton button0 = new FelixButton("0");
        buttonPanel1.add(button7);
        buttonPanel1.add(button4);
        buttonPanel1.add(button1);
        buttonPanel1.add(button0);

        Panel buttonPanel2 = new Panel();
        buttonPanel2.setLayout(new GridLayout(4, 1));
        FelixButton button8 = new FelixButton("8");
        FelixButton button5 = new FelixButton("5");
        FelixButton button2 = new FelixButton("2");
        FelixButton buttonPlus = new FelixButton("+");
        buttonPanel2.add(button8);
        buttonPanel2.add(button5);
        buttonPanel2.add(button2);
        buttonPanel2.add(buttonPlus);

        Panel buttonPanel3 = new Panel();
        buttonPanel3.setLayout(new GridLayout(4, 1));
        FelixButton button9 = new FelixButton("9");
        FelixButton button6 = new FelixButton("6");
        FelixButton button3 = new FelixButton("3");
        FelixButton buttonMinus = new FelixButton("-");
        buttonPanel3.add(button9);
        buttonPanel3.add(button6);
        buttonPanel3.add(button3);
        buttonPanel3.add(buttonMinus);

        Panel buttonPanel4 = new Panel();
        buttonPanel4.setLayout(new GridLayout(2, 1));

        Panel panel4_1 = new Panel();
        panel4_1.setLayout(new GridLayout(2,1));
        FelixButton buttonMultiple = new FelixButton("*");
        FelixButton buttonDivide = new FelixButton("/");
        panel4_1.add(buttonMultiple);
        panel4_1.add(buttonDivide);
        buttonPanel4.add(panel4_1);

        Panel panel4_2 = new Panel();
        panel4_2.setLayout(new GridLayout(2, 1));
        FelixButton buttonDel = new FelixButton("DEL", "0");
        FelixButton equalButton = new FelixButton("=", 0);
        buttonDel.setBackground(new Color(255, 207, 72));
        equalButton.setBackground(new Color(200, 145, 209));
        panel4_2.add(buttonDel);
        panel4_2.add(equalButton);
        buttonPanel4.add(panel4_2);

        buttonPanel.add(buttonPanel1);
        buttonPanel.add(buttonPanel2);
        buttonPanel.add(buttonPanel3);
        buttonPanel.add(buttonPanel4);

        frame.add(resPanel);
        frame.add(buttonPanel);
        frame.setVisible(true);
    }

    private static class DelWindowAdapter implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e) {
            resText.setText("");
        }

    }

    private static class FelixWindowAdapter implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e) {
            resText.setText(resText.getText() + e.getActionCommand());

        }
    }

    private static class CalcWindowAdapter implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e) {
            resText.setText(String.valueOf(performCalculate(resText.getText())));
        }

        public int performCalculate (String expression) {
            char[] expressionArr = expression.toCharArray();
            for (int i = 0; i < expression.length(); i++) {
                try {
                    if (expressionArr[i] == '+') {
                        return Integer.parseInt(expression.substring(0, i)) + Integer.parseInt(expression.substring(i + 1));
                    }

                    if (expressionArr[i] == '-') {
                        return Integer.parseInt(expression.substring(0, i)) - Integer.parseInt(expression.substring(i + 1));
                    }

                    if (expressionArr[i] == '*') {
                        return Integer.parseInt(expression.substring(0, i)) * Integer.parseInt(expression.substring(i + 1));
                    }

                    if (expressionArr[i] == '/') {
                        return Integer.parseInt(expression.substring(0, i)) / Integer.parseInt(expression.substring(i + 1));
                    }
                } catch (Exception e) {
                    return -1;
                }

                if (i == expression.length()-1) {
                    return Integer.parseInt(expression);
                }
            }
            return -1;
        }
    }

    private static class FelixButton extends Button {
        public FelixButton(){};
        public FelixButton(String label) {
            super(label);
            setFont(felixFont);
            setActionCommand(label);
            addActionListener(new FelixWindowAdapter());
        }
        public FelixButton(String label, int num) {
            super(label);
            setFont(felixFont);
            setActionCommand(label);
            addActionListener(new CalcWindowAdapter());
        }
        public FelixButton(String label, String num) {
            super(label);
            setFont(new Font(null, Font.BOLD, 30));
            setActionCommand(label);
            addActionListener(new DelWindowAdapter());
        }

        public static Font felixFont = new Font(null, Font.BOLD, 55);
    }
}