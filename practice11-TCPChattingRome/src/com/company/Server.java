package com.company;

import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.InetAddress;

public class Server {
    public static void main (String[] args) {
        ServerSocket server = null;
        Socket client = null;

        try {
            // Create a ServerSocket
            InetAddress serverAddr = InetAddress.getByName("localhost");
            server = new ServerSocket(9999, 3, serverAddr);
            client = server.accept();

            // open a read thread
            ReadThread readThread = new ReadThread();
            readThread.setInput(client.getInputStream());
            Thread read = new Thread (readThread);

            // open a write thread
            WriteThread writeThread = new WriteThread();
            writeThread.setOutput(client.getOutputStream());
            Thread write = new Thread(writeThread);

            read.start();
            write.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}