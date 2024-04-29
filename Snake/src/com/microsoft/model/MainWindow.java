package com.microsoft.model;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import com.microsoft.util.SnakeUtils;

public class MainWindow {
    private static final CardLayout cardLayout = new CardLayout();
    private static final JFrame mainWindow = new JFrame();

    public static void run() {
        mainWindow.setTitle("Snake");
        mainWindow.setResizable(false);
        mainWindow.setBounds(SnakeUtils.getMainWindowX(), SnakeUtils.getMainWindowY(), SnakeUtils.getMainWindowWidth(), SnakeUtils.getMainWindowHeight());
        mainWindow.setLayout(cardLayout);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel initPane = new JPanel(null);
        JPanel upper = new JPanel(new BorderLayout());
        JPanel lower = new JPanel(new GridLayout(2, 1));
        upper.setBounds(SnakeUtils.getContentPaneX(), SnakeUtils.getContentPaneY(), SnakeUtils.getContentPaneWidth(), SnakeUtils.getContentPaneHeight() / 2);
        lower.setBounds(SnakeUtils.getContentPaneX(), SnakeUtils.getContentPaneHeight() / 2, SnakeUtils.getContentPaneWidth(), SnakeUtils.getContentPaneHeight() / 2);

        JPanel lowerStart = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel lowerExit = new JPanel(new FlowLayout(FlowLayout.CENTER));

        ImageIcon bgImage = SnakeUtils.getBGImage();
        JLabel label = new JLabel("", JLabel.CENTER);
        label.setIcon(bgImage);

        Font font = new Font(null, Font.ITALIC, 33);

        JLabel start = new JLabel("start");
        start.setForeground(new Color(46, 204, 112));
        start.setFont(font);
        start.setHorizontalAlignment(JLabel.CENTER);
        start.addMouseListener(new FelixMouseAdapter());

        JLabel exit = new JLabel("exit");
        exit.setForeground(new Color(202, 133, 47));
        exit.setFont(font);
        exit.setHorizontalAlignment(JLabel.CENTER);
        exit.addMouseListener(new FelixMouseAdapter());

        upper.add(label, BorderLayout.CENTER);
        lowerStart.add(start);
        lowerExit.add(exit);
        lower.add(lowerStart);
        lower.add(lowerExit);
        initPane.add(upper);
        initPane.add(lower);

        mainWindow.add(initPane, "initPane");
        mainWindow.setVisible(true);
    }

    public static class FelixMouseAdapter extends MouseAdapter {
        @Override
        public void mouseClicked (MouseEvent e) {
            JLabel label = (JLabel)e.getSource();
            if (label.getText() == "exit") {
                System.exit(0);
            }

            if (label.getText() == "start") {
                GamePane gamePane = new GamePane();
                mainWindow.add(gamePane, "gamePane");

                cardLayout.show(mainWindow.getContentPane(), "gamePane");
                gamePane.requestFocusInWindow();
            }
        }
    }
}
