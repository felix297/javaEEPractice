package com.company;

public class XiaomiFactory implements ProductFactory {
    @Override
    public Car getCar () {
        return new MiCar();
    }

    @Override
    public Phone getPhone() {
        return new Xiaomi();
    }
}