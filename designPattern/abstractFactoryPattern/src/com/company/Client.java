package com.company;

public class Client {
    public static void main (String args[]) {
        ProductFactory teslaFactory = new TeslaFactory();
        teslaFactory.getCar().lighting();
        teslaFactory.getPhone().call();

        ProductFactory mi = new XiaomiFactory();

        mi.getCar();

    }

}