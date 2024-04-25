package com.microsoft.model;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import com.microsoft.util.SnakeUtils;

public class MainWindow extends JFrame{

    public MainWindow () {

    }

    public MainWindow (String title) {
        super(title);
        setResizable(false);
        setBounds(SnakeUtils.getMainWindowX(), SnakeUtils.getMainWindowY(), SnakeUtils.getMainWindowWidth(), SnakeUtils.getMainWindowHeight());
        setLayout(new FlowLayout(FlowLayout.CENTER));

    }
}
