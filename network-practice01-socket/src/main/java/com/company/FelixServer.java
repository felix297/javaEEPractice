package com.company;

import java.io.OutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;

public class FelixServer {
    public static void main (String[] args) {
        try {
            ServerSocket server = new ServerSocket(9888);
            while (true) {
                Socket socket = server.accept();
                InputStream inputStream = socket.getInputStream();
//                OutputStream outputStream = socket.getOutputStream();
                int res;
                while ((res = inputStream.read()) != -1) {
                    System.out.print((char)res);
//                    outputStream.write(res);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}