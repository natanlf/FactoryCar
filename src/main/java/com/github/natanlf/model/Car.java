package com.github.natanlf.model;

public abstract class Car {

    public String nome;
    public String motor;

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Testing all the certificates");
    }

    public void pack() {
        System.out.println("Packing the car");
    }
}
