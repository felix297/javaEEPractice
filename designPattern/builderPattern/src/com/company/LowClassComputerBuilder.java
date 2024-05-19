package com.company;

public class LowClassComputerBuilder implements Builder {
    private Computer computer = new Computer();

    @Override
    public LowClassComputerBuilder buildCpu() {
        System.out.print("[core i5-12900k]");
        computer.setCpu("core i5-12900k");
        return this;
    }

    @Override
    public LowClassComputerBuilder buildMonitor () {
        System.out.print("[AOC]");
        computer.setMonitor("AOC");
        return this;
    }

    @Override
    public LowClassComputerBuilder buildKeyboard () {
        System.out.print("[Logitech]");
        computer.setKeyboard("Logitech");
        return this;
    }

    @Override
    public LowClassComputerBuilder buildMemory () {
        System.out.print("[Western Data]");
        computer.setMemory("Western Data");
        return this;
    }

    @Override
}