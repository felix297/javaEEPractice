package com.company;

public class Computer {
    private String memory;
    private String cpu;
    private String monitor;
    private String keyboard;

    public String getMemory () {
        return memory;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMonitor () {
        return monitor;
    }

    public String getKeyboard () {
        return keyboard;
    }

    public void setMemory (String memory) {
        this.memory = memory;
    }

    public void setCpu (String cpu) {
        this.cpu = cpu;
    }

    public void setMonitor (String monitor) {
        this.monitor = monitor;
    }

    public void setKeyboard (String keyboard) {
        this.keyboard = keyboard;
    }
}