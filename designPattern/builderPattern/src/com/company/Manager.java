package com.company;

public class Manager {
    private Worker worker = null;

    public Manager () {
        this.worker = new Worker();
    }

    public void serving () {
        worker.buildBread();
        worker.buildMeat();
        worker.buildLettuce();
        worker.buildTomato();
    }
}