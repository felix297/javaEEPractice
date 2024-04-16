package test;

import com.company.FelixFrame;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.awt.*;

public class ButtonPracticeTest {
    @Test
    public void nullLayoutTest() {
        FelixFrame frame = new FelixFrame("Felix Frame");
        Panel panel = new Panel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 500, 50);

        panel.setLayout(null); // try each layout and see what is the difference

        Button buttonFile = new Button("File");
        buttonFile.setBounds(0, 25, 50, 25);
        Button buttonEdit = new Button("Edit");
        buttonEdit.setBounds(50, 25, 50, 25);
        Button buttonAbout = new Button("About");
        buttonAbout.setBounds(100, 25, 50, 25);

        panel.add(buttonFile);
        panel.add(buttonEdit);
        panel.add(buttonAbout);

        frame.add(panel);
        frame.setVisible(true);
        new Scanner(System.in).next();
    }

    @Test
    public void flowLayoutTest() {
        FelixFrame frame = new FelixFrame("Felix Frame");
        frame.setLayout(null);

        Panel panel = new Panel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 25, 500, 30);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        Button buttonFile = new Button("File");
        Button buttonEdit = new Button("Edit");
        Button buttonAbout = new Button("About");

        panel.add(buttonFile);
        panel.add(buttonEdit);
        panel.add(buttonAbout);

        frame.add(panel);

        frame.setVisible(true);
        new Scanner(System.in).next();
    }

    @Test
    public void borderLayoutTest () {
        FelixFrame frame = new FelixFrame("Felix Frame");
        frame.setLayout(null);

        Panel panel = new Panel();
        panel.setBackground(Color.gray);
        panel.setBounds(0, 25, 500, 100);
        panel.setLayout(new BorderLayout());

        Button buttonFile = new Button("File");
        Button buttonEdit = new Button("Edit");
        Button buttonAbout = new Button("About");

        panel.add(buttonFile, BorderLayout.NORTH);
        panel.add(buttonEdit, BorderLayout.CENTER);
        panel.add(buttonAbout, BorderLayout.WEST);

        frame.add(panel);
        frame.setVisible(true);
        new Scanner(System.in).next();
    }

    @Test
    public void gridLayoutTest () {
        FelixFrame frame = new FelixFrame("Felix Frame");
        frame.setLayout(null);

        Panel panel = new Panel();
        panel.setBackground(Color.gray);
        panel.setBounds(0, 25, 500, 50);
        panel.setLayout(new GridLayout(2, 2));

        Button buttonFile = new Button("File");
        Button buttonEdit = new Button("Edit");
        Button buttonAbout = new Button("About");

        panel.add(buttonFile);
        panel.add(buttonEdit);
        panel.add(buttonAbout);

        frame.add(panel);

        frame.setVisible(true);
        new Scanner(System.in).next();
    }
}