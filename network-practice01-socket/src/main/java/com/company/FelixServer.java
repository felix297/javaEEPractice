package com.company;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;

public class FelixServer {
    public static void main (String[] args) {
//        try {
//            1. contructor
//            non-arg contructor()
//            ServerSocket server = new ServerSocket();
//            InetSocketAddress address = new InetSocketAddress("localhost", 9999);
//            server.bind(address);
//            System.out.println(server.getLocalPort());

//            arg-constructor()
//            ServerSocket server = new ServerSocket(9999);
//            ServerSocket server = new ServerSocket(9999, 3);
//            InetAddress local = InetAddress.getByName("localhost");
//            ServerSocket server = new ServerSocket(9999, 3, local);

//            2. method
//            accept()
//            InetAddress local = InetAddress.getByAddress(new byte[]{(127), 0, 0, 1});
//            ServerSocket server = new ServerSocket(9999, 3, local);
//            Socket client = server.accept();
//            System.out.println(server.getLocalSocketAddress().toString());

//            bind()
//            InetSocketAddress serverAddr = new InetSocketAddress("localhost", 9999);
//            ServerSocket server = new ServerSocket();
//            server.bind(serverAddr);
//            server.bind(serverAddr, 3);
//            System.out.println(server.getLocalSocketAddress());

//            getInetAddress()
//            getLocalPort()
//            getLocalSocketAddress()
//            InetAddress serverAddr = InetAddress.getByName("localhost");
//            ServerSocket server = new ServerSocket(9999, 3, serverAddr);
//            server.accept();
//            System.out.println(server.getLocalSocketAddress());
//            System.out.println(server.getInetAddress());
//            System.out.println(server.getLocalPort());
//            server.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}