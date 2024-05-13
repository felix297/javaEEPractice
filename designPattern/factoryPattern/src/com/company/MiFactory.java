package com.company;

public class MiFactory implements CarFactory {
    @Override
    public Car getCar () {
        return new MiCar();
    }

}