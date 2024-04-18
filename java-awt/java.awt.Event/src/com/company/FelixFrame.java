package com.company;

import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Color;
import java.awt.Frame;

public class FelixFrame extends Frame {
    public FelixFrame () {

    }

    public FelixFrame (String title) {
        super(title);
        setBounds(100, 100, 500, 500);
        setBackground(Color.gray);
        setResizable(false);
        addKeyListener(new FelixKeyAdapter());

        addWindowListener(new FelixWindowAdapter());
    }
    public static class FelixKeyAdapter extends KeyAdapter {
        @Override
        public void keyTyped (KeyEvent e) {
            System.out.println("a key is typed");
        }

        @Override
        public void keyPressed (KeyEvent e) {
            TextField textField = (TextField)e.getSource();
            System.out.println(textField.getText());
        }

        @Override
        public void keyReleased (KeyEvent e) {
            System.out.println("the key is released!");
        }

    }

    public static class FelixWindowAdapter extends WindowAdapter {
        public FelixWindowAdapter() {

        }
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("the frame is opened!");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("the frame is closed!");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("the frame is iconified!");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("the frame is deiconified!");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("the frame is active!");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("the frame is deactiveted");
        }

        @Override
        public void windowStateChanged(WindowEvent e) {
            System.out.println("state change!");
        }

        @Override
        public void windowGainedFocus(WindowEvent e) {
            System.out.println("the frame is focused");
        }

        @Override
        public void windowLostFocus(WindowEvent e) {
            System.out.println("the frame is unfocused");
        }
    }
}