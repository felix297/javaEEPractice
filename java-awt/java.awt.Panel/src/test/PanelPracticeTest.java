package test;

import java.util.Scanner;

import com.company.FelixFrame;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class PanelPracticeTest {
    @Test
    public void panelPracticeTest () {
        Color color = new Color(22, 27, 100);

        Frame frame = FelixFrame.getFrame();
        frame.setLayout(null);

        Panel panel1 = new Panel();
        panel1.setBounds(0, 0, 500, 50);
        panel1.setLayout(null);
        panel1.setBackground(Color.WHITE);

        Button button1 = new Button("File");
        button1.setBackground(color);
        button1.setForeground(Color.WHITE);
        button1.setBounds(0,25,50, 30);
        Button button2 = new Button("Edit");
        button2.setBounds(50,25,50, 30);
        Button button3 = new Button("Selection");
        button3.setBounds(100,25,50, 30);

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);

        frame.add(panel1);
        frame.setVisible(true);

        new Scanner(System.in).next(); // pause the program
    }
}
