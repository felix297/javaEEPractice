package com.company;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class PaintPractice {
    private static ArrayList<Point> points = new ArrayList<>();
    private static PaintFrame frame = new PaintFrame("Felix Frame");
    public static void main(String[] args) {
        frame.setLayout(null);
        frame.addMouseListener(new FelixMouseListener());
        Panel panel = new Panel();
        frame.setVisible(true);
    }

    private static class FelixMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked (MouseEvent e) {
            Point point = new Point(e.getX(), e.getY());
            points.add(point);
            frame.repaint();
        }
    }

    public static class PaintFrame extends Frame {
        public PaintFrame() {}
        public PaintFrame(String title) {
            super(title);
            setBounds(100, 100, 500, 500);
            setBackground(Color.gray);
            setResizable(false);
            setFont(new Font(null, Font.BOLD, 33));
            addWindowListener(new FelixWindowAdapter());
        }

        @Override
        public void paint(Graphics g) {
            g.setColor(Color.BLACK);

            for (Point ele : points){
                g.fillOval(ele.x, ele.y, 10,10);
                System.out.println("painted a point");
            }
        }

        private static class FelixWindowAdapter extends WindowAdapter {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
    }
}