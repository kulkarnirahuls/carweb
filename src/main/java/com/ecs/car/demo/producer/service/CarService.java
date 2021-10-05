package com.ecs.car.demo.producer.service;

import com.ecs.car.demo.producer.model.Car;
import com.ecs.car.demo.producer.model.Message;

public interface CarService {
    public Message add(Car car);
}
