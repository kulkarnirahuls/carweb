package com.ecs.car.demo.producer.service;

import com.ecs.car.demo.producer.message.CarMessage;
import com.ecs.car.demo.producer.model.Car;


import java.util.List;

public interface CarService {
    public CarMessage add(Car car);
    public CarMessage retrieve();
}
