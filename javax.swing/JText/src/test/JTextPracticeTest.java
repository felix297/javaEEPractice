package test;

import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import javax.swing.JFrame;

public class JTextPracticeTest {
    private Scanner scanner = new Scanner(System.in);
    private JFrame frame = new JFrame();

    private void init() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setBounds(100, 100, 500, 500);
        frame.setResizable(false);
    }

    private void end() {
        frame.setVisible(true);
        scanner.next();
    }

    @Test
    public void jTextFieldTest () {
        init();

        JTextField text = new JTextField("please input your password", 11);
        frame.add(text);

        end();
    }

    @Test
    public void jPasswordFieldTest () {
        init();
        JPasswordField password = new JPasswordField(11);
        frame.add(password);
        end();
    }

    @Test
    public void jTextAreaTest() {
        init();
        JTextArea textArea = new JTextArea("introduce yourself", 20, 20);
        JScrollPane pane = new JScrollPane(textArea);

        frame.add(pane);
        end();
    }
}