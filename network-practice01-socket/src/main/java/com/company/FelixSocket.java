package com.company;

import java.net.SocketAddress;
import java.net.Proxy;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;


public class FelixSocket {
    public static void main (String[] args) throws IOException {
//        一、InetAddress
//        1. contructor: non

//        2. methodes

//        getAllByName()
//        一个域名是可以有多个ip地址的，为了负载均衡
//        InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
//        for (InetAddress ele: addresses) {
//            System.out.println(ele.getHostAddress());
//        }

//        getByName()
//        InetAddress address = InetAddress.getByName("www.baidu.com");
//        System.out.println(address.getHostAddress());

//        getByAddress()
//        InetAddress address = InetAddress.getByAddress(new byte[]{(byte) 192, (byte) 168, 1,1});
//        InetAddress address = InetAddress.getByAddress("www.tom.com", new byte[]{(byte)192,(byte)168,1,1});
//        System.out.println(address.getHostName());
//        System.out.println(address.getHostAddress());

//        getLocalHost()
//        InetAddress address = InetAddress.getLocalHost();
//        System.out.println(address.getHostName());
//        System.out.println(address.getHostAddress());

//        getLoopbackAddress() 环回地址
//        InetAddress address = InetAddress.getLoopbackAddress();
//        System.out.println(address.getHostName());
//        System.out.println(address.getHostAddress());

//        getAddress() raw address
//        InetAddress address = InetAddress.getLoopbackAddress();
//        byte[] addressByte = address.getAddress();
//        for (byte ele : addressByte) {
//            System.out.print(ele+".");
//        }

//        getCanonicalAddress()
//        InetAddress address = InetAddress.getLoopbackAddress();
//        System.out.println(address.getCanonicalHostName());
//        System.out.println(address.getHostName());
//        System.out.println(address.getHostAddress());

//        getHostName()
//        InetAddress address = InetAddress.getByAddress("localhost", new byte[]{(byte)127,0,0,1});
//        System.out.println(address.getHostName());
//        System.out.println(address.getHostAddress());

//        isAnyLocalAddress()
//        InetAddress address = InetAddress.getByName("www.baidu.com");
//        InetAddress address1 = InetAddress.getByAddress(new byte[]{0,0,0,0});
//        InetAddress address2 = InetAddress.getByName("::");
//        System.out.println(address.isAnyLocalAddress());
//        System.out.println(address1.isAnyLocalAddress());
//        System.out.println(address2.isAnyLocalAddress());

//        InetAddress address = InetAddress.getByName("::");
//        System.out.println(address.isLinkLocalAddress());

//        InetAddress address = InetAddress.getLoopbackAddress();
//        InetAddress address1 = InetAddress.getByAddress("www.tom.com", new byte[]{1,1,1,1});
//        System.out.println(address1.isLoopbackAddress());

//        1. contructor
//        InetAddress local = InetAddress.getByName("localhost");
//        Socket port1001 = new Socket("localhost", 9999);
//        Socket port1002 = new Socket(local, 9999);
//        Socket port1003 = new Socket("localhost", 9999, local, 1003);
//        Socket port1004 = new Socket(local, 9999, local, 1004);
//        Socket port1005 = new Socket(new Proxy(Proxy.Type.HTTP, new Socket("localhost", 9999).getRemoteSocketAddress()));

//        2. method
//        bind()
//        Socket client = new Socket("localhost", 9999);
//        SocketAddress address = client.getRemoteSocketAddress();

//        Socket client2 = new Socket();
//        client2.bind(address);
//        System.out.println(client.getPort());


    }
}