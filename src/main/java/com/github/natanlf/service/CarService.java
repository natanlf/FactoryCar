package com.github.natanlf.service;

import com.github.natanlf.factory.CarSimpleFactory;
import com.github.natanlf.model.Car;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarService {

    public Car buildCar(String modelo, String level) {
        return CarSimpleFactory.orderCar(modelo, level);
    }
}
