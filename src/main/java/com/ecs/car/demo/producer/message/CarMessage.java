package com.ecs.car.demo.producer.message;

import com.ecs.car.demo.producer.model.Car;
import com.ecs.car.demo.producer.model.Message;

import java.util.List;

public class CarMessage {
    private List<Car> cars = null;
    private Message message = null;
    private CarMessage(){ }
    public CarMessage(List<Car> cars, Message message){
        this.cars=cars;
        this.message=message;
    }
    public List<Car> getCars() {
        return cars;
    }

    public Message getMessage() {
        return message;
    }
}
