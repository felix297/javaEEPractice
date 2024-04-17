package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.Color;

import com.company.FelixFrame;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class TextFieldPractice {
    @Test
    public void textFieldPracticeTest () {
        FelixFrame frame = new FelixFrame("Felix Frame");
        frame.setLayout(null);

        Panel navigation = new Panel();
        navigation.setBackground(Color.gray);
        navigation.setLayout(new FlowLayout(FlowLayout.LEFT));
        navigation.setBounds(0, 25, 500, 30);

        Button file = new Button("File");
        Button edit = new Button("Edit");
        Button about = new Button("About");

        navigation.add(file);
        navigation.add(edit);
        navigation.add(about);

        frame.add(navigation);

        Panel body = new Panel();
        body.setBackground(Color.lightGray);
        body.setBounds(0, 50, 500, 445);
        body.setLayout(new FlowLayout(FlowLayout.LEFT));

        TextField textField = new TextField();
        TextField textField1 = new TextField(10);
        TextField textField2 = new TextField("your name");
        System.out.println(textField2.getColumns());
        TextField textField3 = new TextField("your password", 10);
        System.out.println(textField3.getColumns());

        body.add(textField);
        body.add(textField1);
        body.add(textField2);
        body.add(textField3);

        frame.add(body);

        frame.setVisible(true);
        new Scanner(System.in).next();
    }

    @Test
    public void testFieldEventTest() {
        FelixFrame frame = new FelixFrame("Felix Frame");

        frame.setLayout(null);
        Panel navigation = new Panel();
        navigation.setBackground(Color.gray);
        navigation.setLayout(new FlowLayout(FlowLayout.LEFT));
        navigation.setBounds(0, 25, 500, 30);

        Button file = new Button("File");
        Button edit = new Button("Edit");
        Button about = new Button("About");

        navigation.add(file);
        navigation.add(edit);
        navigation.add(about);

        Panel body = new Panel();
        body.setBackground(Color.lightGray);
        body.setBounds(0, 50, 500, 445);
        body.setLayout(new FlowLayout(FlowLayout.CENTER));

        TextField textField = new TextField(10);
        textField.setEchoChar('*');
        textField.addActionListener(new FelixEventListener());

        body.add(textField);

        frame.add(body);
        frame.add(navigation);

        frame.setVisible(true);
        new Scanner(System.in).next();
    }

    private class FelixEventListener implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e) {
            TextField textField = (TextField) e.getSource();
            System.out.println(textField.getText());
        }
    }
}