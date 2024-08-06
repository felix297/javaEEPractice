package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.io.OutputStream;

public class WriteThread implements Runnable {
    OutputStream output;

    public void setOutput(OutputStream output) {
        this.output = output;
    }

    @Override
    public void run () {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                String msg = scanner.nextLine();
                output.write(msg.getBytes());
                output.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}