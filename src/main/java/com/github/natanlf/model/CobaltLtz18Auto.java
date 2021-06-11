package com.github.natanlf.model;

public class CobaltLtz18Auto extends Car {
    @Override
    public void getHardware() {
        nome = "Cobalt Ltz 1.8";
        motor = "1.8";
        System.out.println("Hardware list");
        System.out.println("\t- Flex");
        System.out.println("\t- Automático");
        System.out.println("\t- Freio ABS");
        System.out.println("\t- Motor 1.8");
        System.out.println("\t- Bancos de Couro");
        System.out.println("\t- Vidros elétricos");
    }
}
