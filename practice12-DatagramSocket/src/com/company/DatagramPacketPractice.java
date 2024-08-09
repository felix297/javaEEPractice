package com.company;

import java.net.*;

public class DatagramPacketPractice {
    public static void main (String[] args) throws SocketException, UnknownHostException {
//        1. constructor
//        DatagramSocket socket = new DatagramSocket();
//        System.out.println(socket.getLocalSocketAddress());

//        DatagramSocket socket = new DatagramSocket(9999);
//        System.out.println(socket.getLocalSocketAddress());

//        InetAddress local = InetAddress.getByName("localhost");
//        DatagramSocket socket = new DatagramSocket(9999, local);
//        System.out.println(socket.getLocalSocketAddress());
//        System.out.println(socket.getInetAddress());

//        InetSocketAddress local = new InetSocketAddress("localhost", 9999);
//        DatagramSocket socket = new DatagramSocket (local);
//        System.out.println(socket.getLocalSocketAddress());

//        DatagramSocket socket = new DatagramSocket(null);
//        InetSocketAddress local = new InetSocketAddress("localhost", 9999);
//        socket.bind(local);
//        System.out.println(socket.getLocalSocketAddress());

//        2. method()
//        bind()
//        connect()
//        disconnect()
//        close()
//        DatagramSocket socket = new DatagramSocket(null);
//        InetSocketAddress local = new InetSocketAddress("localhost", 9999);
//        InetSocketAddress remote = new InetSocketAddress("localhost", 9998);
//        socket.bind(local);
//        socket.connect(remote);
//        System.out.println(socket.getInetAddress());
//        System.out.println(socket.getBroadcast());
//        socket.disconnect();
//        System.out.println(socket.isConnected());
//        socket.close();
//        System.out.println(socket.isClosed());

//        getInetAddress()
        DatagramSocket socket = new DatagramSocket(null);
        InetSocketAddress local = new InetSocketAddress("localhost", 9999);
        InetSocketAddress remote = new InetSocketAddress("localhost", 9998);
        socket.bind(local);
        socket.connect(remote);
        System.out.println(socket.getInetAddress());
        System.out.println(socket.getLocalAddress());
        System.out.println(socket.getLocalPort());
        System.out.println(socket.getLocalSocketAddress());

        System.out.println(socket.getRemoteSocketAddress());
        System.out.println(socket.getPort());
        System.out.println(socket.getInetAddress());


    }
}