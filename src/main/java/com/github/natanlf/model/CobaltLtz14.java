package com.github.natanlf.model;

public class CobaltLtz14 extends Car {
    @Override
    public void getHardware() {
        nome = "Cobalt Ltz 1.4";
        motor = "1.4";
        System.out.println("Hardware list");
        System.out.println("\t- Flex");
        System.out.println("\t- Manual");
        System.out.println("\t- Motor 1.4");
        System.out.println("\t- Vidros elétricos");
        System.out.println("\t- Rodas de liga leve");
    }
}
