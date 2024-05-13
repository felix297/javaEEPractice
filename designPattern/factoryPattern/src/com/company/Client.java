package com.company;

public class Client {
    public static void main (String args[]) {
        System.out.println("=================ordinary method===============");
        Car miCar = new MiCar();
        Car tesla = new Tesla();

        miCar.name();
        tesla.name();

        System.out.println("=================simple factory=================");
        new MiFactory().getCar().name();
        new TeslaFactory().getCar().name();
    }
}