package com.company;

public class TeslaFactory implements ProductFactory {
    @Override
    public Car getCar () {
        return new Tesla();

    }

    @Override
    public Phone getPhone () {
        return new TeslaPhone();
    }
}