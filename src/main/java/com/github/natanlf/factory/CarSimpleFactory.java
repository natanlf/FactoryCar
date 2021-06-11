package com.github.natanlf.factory;

import com.github.natanlf.model.Car;
import com.github.natanlf.model.CobaltLtz14;
import com.github.natanlf.model.CobaltLtz18Auto;
import com.github.natanlf.model.PrismaLtz14;

public class CarSimpleFactory {

    public static Car orderCar(String modelo, String versao) {
        Car car = null;

        if("Cobalt".equals(modelo)) {
            if("ltz18auto".equals(versao)) {
                car = new CobaltLtz18Auto();
            } else if ("ltz14".equals(versao)) {
                car = new CobaltLtz14();
            }
        } else if ("Prisma".equals(modelo)) {
            if ("ltz14".equals(versao)) {
                car = new PrismaLtz14();
            }
        }

        car.getHardware();
        car.assemble();
        car.certificates();
        car.pack();

        return car;
    }
}
