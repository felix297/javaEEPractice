package com.company;

import java.net.StandardSocketOptions;
import java.io.InputStream;
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

//        isMCGlobal()
//        InetAddress address = InetAddress.getByAddress(new byte[]{(byte)224, 0,1,0}); // 224.0.1.0 到 238.255.255.255：用于全球范围的多播。
//        System.out.println(address.isMCGlobal());

//        isMCLinkLocal()
//        InetAddress address = InetAddress.getByName("ff05::1");
//        System.out.println(address.isMCLinkLocal());
//        System.out.println(address.isMCNodeLocal());
//        System.out.println(address.isMCOrgLocal());
//        System.out.println(address.isMCSiteLocal());
//        System.out.println(address.isMulticastAddress());

//        isSiteLocalAddress()
//        InetAddress address = InetAddress.getByName("127.0.0.1");
//        System.out.println(address.isLoopbackAddress());
//        System.out.println(address.isSiteLocalAddress());

//        isReachable()
//        InetAddress address = InetAddress.getByName("www.baidu.com");
//        System.out.println(address.isReachable(10000));
//        System.out.println(address.isReachable(null, 1, 1000));

//        toString()
//        InetAddress address = InetAddress.getByName("localhost");
//        System.out.println(address.toString());
//        System.out.println(address.getHostAddress());
//        System.out.println(InetAddress.getLocalHost());

//        二、InetSocketAddress
//        1. contructor
//        InetSocketAddress socketAddress = new InetSocketAddress(9999);
//        InetSocketAddress socketAddress1 = new InetSocketAddress("localhost", 9999);
//        InetAddress ip = InetAddress.getByName("localhost");
//        InetSocketAddress socketAddress2 = new InetSocketAddress(ip, 9999);

//        2. method
//        InetSocketAddress.createUnresolved()
//        InetSocketAddress socketAddress = InetSocketAddress.createUnresolved("www.tom.com", 9999);
//        System.out.println(socketAddress.getHostName());
//        System.out.println(socketAddress.getAddress().getHostAddress());

//        getAddress()
//        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 9999);
//        System.out.println(address.getAddress().getHostAddress());

//        getHostName()
//        InetSocketAddress address = new InetSocketAddress(InetAddress.getByAddress("www.baidu.com", new byte[]{127,0,0,1}), 9999);
//        System.out.println(address.getHostName());
//        System.out.println(address.getHostString());
//        System.out.println(address.getPort());
//        System.out.println(address.isUnresolved());
//        System.out.println(address.toString());

//        三、Socket
//        1. contructor
//        InetAddress local = InetAddress.getByName("localhost");
//        Socket port1001 = new Socket("localhost", 9999);
//        Socket port1002 = new Socket(local, 9999);
//        Socket port1003 = new Socket("localhost", 9999, local, 1003);
//        Socket port1004 = new Socket(local, 9999, local, 1004);
//        Socket port1005 = new Socket(new Proxy(Proxy.Type.HTTP, new Socket("localhost", 9999).getRemoteSocketAddress()));

//        2. method
//        bind()
//        Socket localP = new Socket();
//
//        InetSocketAddress localAddr = new InetSocketAddress("localhost", 1002);
//        localP.bind(localAddr); // bind() 似乎会在你短时间内多次 bind 的时候被占用端口，即 1002 端口没有那么快被释放，即你的 Socket bind 了一个端口之后，即使你的 Socket 被close了，端口可能也没有被释放
//
//        InetSocketAddress remoteAddr = new InetSocketAddress("www.baidu.com", 80);
//        localP.connect(remoteAddr, 1000);

//        close()
//        Socket client = new Socket("www.baidu.com", 80);
//        client.close();

//        connect()
//        Socket client = new Socket();
//        InetSocketAddress baiduServer = new InetSocketAddress("www.baidu.com", 80);
//        client.connect(baiduServer);
//        client.close();

//        Socket client2 = new Socket();
//        InetSocketAddress bjtuServer = new InetSocketAddress("www.bjtu.edu.cn", 80);
//        client2.connect(bjtuServer, 300);
//        client2.close();

//        getInetAddress()
//        Socket client = new Socket("www.baidu.com", 80);
//        System.out.println(client.getInetAddress().toString());
//        client.close();

//        getInputStream()
//        Socket client = new Socket("www.baidu.com", 80);
//        InputStream input = client.getInputStream();
//        int ch;
//        while ((ch = input.read()) != -1) {
//            System.out.println((char)ch);
//        }
//        client.close();

//        getKeepAlive()
//        Socket client = new Socket("www.google.com", 80);
//        System.out.println(client.getKeepAlive());
//        client.setKeepAlive(true);
//        System.out.println(client.getKeepAlive());
//        client.close();

//        getLocalAddress()
//        Socket client = new Socket("www.google.com", 80);
//        System.out.println(client.getLocalAddress().getHostName());
//        System.out.println(client.getLocalPort());
//        client.close();

//        Socket client = new Socket();
//        InetSocketAddress localAddress = new InetSocketAddress("localhost", 9999);
//        InetSocketAddress remoteAddress = new InetSocketAddress("www.google.com", 80);
//        client.bind(localAddress);
//        client.connect(remoteAddress);
//        System.out.println(client.getLocalAddress());
//        System.out.println(client.getLocalPort());
//        client.close();

//        getLocalSocketAddress() 相当于 getLocalAddress() 和 getLocalPort() 的组合体
//        Socket client = new Socket("www.baidu.com", 80);
//        InetSocketAddress remoteAddress = (InetSocketAddress) client.getLocalSocketAddress();
//        System.out.println(remoteAddress.getHostName() + remoteAddress.getPort());
//        client.close();

//        getOOBIine()
//        Socket client = new Socket("www.baidu.com", 80);
//        System.out.println(client.getOOBInline());
//        client.close();
//        Socket client = new Socket("www.baidu.com", 80);
//        client.setOOBInline(true);
//        System.out.println(client.getOOBInline());
//        client.close();

//        getOption()
//        Socket client = new Socket("www.baidu.com", 80);
//        System.out.println(client.getOption(StandardSocketOptions.SO_KEEPALIVE));
//        System.out.println(client.getOption(StandardSocketOptions.SO_RCVBUF));
//        client.close();

//        getOutputStream()
//        Socket client = new Socket("localhost", 9888);
//        OutputStream output = client.getOutputStream();
//        output.write("hello!".getBytes());
//        client.close();

//        getReceiveBufferSize()
//        Socket client = new Socket("localhost", 9888);
//        System.out.println(client.getReceiveBufferSize());
//        client.close();

//        getRemoteSocketAddress()
//        InetAddress remote = InetAddress.getByName("www.baidu.com");
//        Socket client = new Socket(remote, 80);
//        System.out.println(client.getRemoteSocketAddress());
//        client.close();

//        getReuseAddress()
//        InetAddress remote = InetAddress.getByName("www.baidu.com");
//        Socket client = new Socket(remote, 80);
//        System.out.println(client.getReuseAddress());
//        client.close();

//        setReuseAddress()
//        InetAddress remote = InetAddress.getByName("www.baidu.com");
//        Socket client = new Socket(remote, 80);
//        System.out.println(client.getReuseAddress());
//        client.setReuseAddress(true);
//        System.out.println(client.getReuseAddress());
//        client.close();

//        getSendBuffSize()
//        InetAddress remote = InetAddress.getByName("www.baidu.com");
//        Socket client = new Socket(remote, 80);
//        System.out.println(client.getSendBufferSize());
//        client.setSendBufferSize(100000);
//        System.out.println(client.getSendBufferSize());
//        client.close();

//        getSoLinger()
//        InetAddress remote = InetAddress.getByName("www.baidu.com");
//        Socket client = new Socket(remote, 80);
//        System.out.println(client.getSoLinger());
//        client.setSoLinger(true, 10);
//        System.out.println(client.getSoLinger());
//        client.close();

//        getSoTimeout()
//        InetAddress remote = InetAddress.getByName("www.baidu.com");
//        Socket client = new Socket(remote, 80);
//        System.out.println(client.getSoTimeout());
//        client.setSoTimeout(10);
//        System.out.println(client.getSoTimeout());
//        client.close();

//        isBound()
//        InetSocketAddress local = new InetSocketAddress(9888);
//        InetSocketAddress remote = new InetSocketAddress("www.baidu.com",2009);
//        Socket client = new Socket();
//        System.out.println(client.isBound());
//        client.bind(local);
//        System.out.println(client.isConnected());
//        client.connect(remote);
//        System.out.println(client.isConnected());
//        System.out.println(client.isBound());
//        client.close();
//        System.out.println(client.isClosed());

//        isInputShutdown()
//        InetAddress remote = InetAddress.getByName("www.baidu.com");
//        Socket client = new Socket(remote, 80);
//        InputStream input = client.getInputStream();
//        System.out.println(client.isInputShutdown());
//        input.close();
//        System.out.println(client.isInputShutdown());
//        System.out.println(client.isClosed());
//        client.close();

//        getTcpNoDelay()
//        Socket client = new Socket ("www.baidu.com", 80);
//        System.out.println(client.getTcpNoDelay());
//        client.setTcpNoDelay(true);
//        System.out.println(client.getTcpNoDelay());
//        client.close();

//        getTrafficClass()
//        Socket client = new Socket("www.baidu.com", 80);
//        System.out.println(client.getTrafficClass());
//        client.setTrafficClass(0x10);
//        System.out.println(client.getTrafficClass());
//        client.close();
    }
}