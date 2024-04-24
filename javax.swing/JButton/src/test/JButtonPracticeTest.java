package test;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class JButtonPracticeTest {
    private Scanner scanner = new Scanner(System.in);
    private JFrame frame = new JFrame("Felix Frame");
    private Font font = new Font(null, Font.BOLD, 33);

    public void init () {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setBounds(100, 100, 500, 500);
        frame.setResizable(false);
    }

    public void end() {
        frame.setVisible(true);
        scanner.next();
    }

    @Test
    public void jButtonTest() {
        init();
        JButton file = new JButton("File");
        JButton edit = new JButton("Edit");
        JButton about = new JButton("About");

        file.setToolTipText("file operation");
        file.setFont(font);
        edit.setToolTipText("edit operation");
        edit.setFont(font);
        about.setToolTipText("about operation");
        about.setFont(font);

        frame.add(file);
        frame.add(edit);
        frame.add(about);
        end();
    }

    @Test
    public void jRadioButtonTest() {
        init();
        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("female");
        ButtonGroup group = new ButtonGroup();
        Font font = new Font(null, Font.BOLD, 33);

        male.setFont(font);
        female.setFont(font);

        group.add(male);
        group.add(female);

        frame.add(male);
        frame.add(female);

        end();
    }

    @Test
    public void JCheckBoxTest() {
        init();
        JCheckBox gaming = new JCheckBox("gaming");
        JCheckBox movie = new JCheckBox("watching movie");
        JCheckBox football = new JCheckBox("playing football");

        gaming.setFont(font);
        movie.setFont(font);
        football.setFont(font);

        frame.add(gaming);
        frame.add(movie);
        frame.add(football);
        end();
    }
}