package com.company;

import java.net.Socket;
import java.io.IOException;
import java.net.InetAddress;

public class Client {
    public static void main (String[] args) {
        Socket client = null;
        try {
            // create a Socket object
            InetAddress clientAddr = InetAddress.getByName("localhost");
            InetAddress serverAddr = InetAddress.getByName("localhost");
            client = new Socket(serverAddr, 9999, clientAddr, 2333);

            // get a read thread
            ReadThread readThread = new ReadThread();
            readThread.setInput(client.getInputStream());
            Thread read = new Thread(readThread);

            // get a write thread
            WriteThread writeThread = new WriteThread();
            writeThread.setOutput(client.getOutputStream());
            Thread write = new Thread(writeThread);

            write.start();
            read.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}