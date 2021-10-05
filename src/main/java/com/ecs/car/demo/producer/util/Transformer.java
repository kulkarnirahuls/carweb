package com.ecs.car.demo.producer.util;

import com.ecs.car.demo.producer.model.Car;
import com.ecs.car.demo.producer.repo.entity.CarEntity;

public class Transformer {
    public Transformer(){}
    public static CarEntity transformModelToEntity(Car carModel){
        return new CarEntity(
                carModel.getMake(),
                carModel.getModel(),
                carModel.getColour(),
                carModel.getYear());
    }

    public static Car transformEntityToModel(CarEntity carEntity){
        return new Car(
                carEntity.getId(),
                carEntity.getMake(),
                carEntity.getModel(),
                carEntity.getColour(),
                carEntity.getYear());
    }
}
