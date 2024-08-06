package com.company;

import java.io.IOException;
import java.io.InputStream;

public class ReadThread implements Runnable {
    InputStream input;

    public void setInput (InputStream input) {
        this.input = input;
    }

    @Override
    public void run () {
        byte[] buffer = new byte[1024];
        int bytesRead;

        try {
            while ((bytesRead = input.read(buffer)) != -1) {
                String message = new String(buffer, 0, bytesRead);
                System.out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
