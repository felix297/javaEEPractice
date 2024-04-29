package com.microsoft.model;

import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import com.microsoft.util.SnakeUtils;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class GamePane extends JPanel {
    private ArrayList<Position> snake = new ArrayList<>();
    private int headLength = SnakeUtils.getSnakeHeadLength();
    private int tailLength = SnakeUtils.getSnakeTailLength();
    private int initPosX = SnakeUtils.getSnakeInitPosX();
    private int initPosY = SnakeUtils.getSnakeInitPosY();
    private Position headPos = new Position(initPosX, initPosY);
    private ImageIcon headImage = SnakeUtils.getSnakeHead();
    private ImageIcon tailImage = SnakeUtils.getSnakeTail();
    private int length = 4;
    private Timer timer = new Timer(100, new FelixActionListener());
    private boolean status = true;
    private String dir = SnakeUtils.getDefaultDirection();

    public GamePane () {
        this.init();
    }

    public void init(){
        this.snake.add(headPos);
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new FelixKeyAdapter());
        this.requestFocusInWindow();
//        timer.start();
    }

    private void moveBody() {
        for (int count = length - 1; count > 0; count--) {
            snake.get(count).setX(snake.get(count - 1).getX());
            snake.get(count).setY(snake.get(count - 1).getY());
        }
    }

    public void moveRight () {
        moveBody();
        headPos.setX(headPos.getX() + headLength);
    }

    public void moveLeft () {
        moveBody();
        headPos.setX(headPos.getX() - headLength);
    }

    public void moveUp () {
        moveBody();
        headPos.setY(headPos.getY() - headLength);
    }

    public void moveDown () {
        moveBody();
        headPos.setY(headPos.getY() + headLength);
    }

    public void move() {
        if (dir.equals("right")) {
            moveRight();
            repaint();
        }

        if (dir.equals("left")) {
            moveLeft();
            repaint();
        }

        if (dir.equals("up")) {
            moveUp();
            repaint();
        }

        if (dir.equals("down")) {
            moveDown();
            repaint();
        }
    }

    private void shiftDir (KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            dir = "right";
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            dir = "left";
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            dir = "up";
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            dir = "down";
        }
    }

    public class FelixActionListener implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e) {
            move();
            repaint();
       }
    }

    public class FelixKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed (KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                status = !status;
                if (status) {
                    timer.start();
                } else {
                    timer.stop();
                }
            }

            shiftDir(e);

        }
    }

    @Override
    protected void paintComponent (Graphics graphics) {
        super.paintComponent(graphics);

        headImage.paintIcon(this, graphics, snake.get(0).getX(), snake.get(0).getY());
        for (int count = 1; count < length; count++) {
            snake.add(new Position(snake.get(0).getX() - count*tailLength, snake.get(0).getY() + headLength/2 - tailLength/2));
            tailImage.paintIcon(this, graphics, snake.get(count).getX(), snake.get(count).getY());
        }
    }

    private static class Position {
        private int X;
        private int Y;

        public Position () {
        }

        public Position (int X, int Y) {
            this.X = X;
            this.Y = Y;
        }

        public int getX () {
            return this.X;
        }

        public void setX (int X) {
            this.X = X;
        }

        public int getY () {
            return this.Y;
        }

        public void setY (int Y) {
            this.Y = Y;
        }
    }
}
