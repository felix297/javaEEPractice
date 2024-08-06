package com.company;

import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientA {
    public static void main (String[] args) {
        try {
            Socket client = new Socket("localhost", 9999);
            OutputStream output = client.getOutputStream();
            output.write("Hi!".getBytes());
            output.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}