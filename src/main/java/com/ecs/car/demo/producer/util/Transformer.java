package com.ecs.car.demo.producer.util;

import com.ecs.car.demo.producer.model.Car;
import com.ecs.car.demo.producer.repo.entity.CarEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.config.Configuration;

import java.util.List;

public class Transformer {
    public Transformer(){}
    public static CarEntity transformModelToEntity(Car carModel){
        CarEntity carEntity = new CarEntity();
        carEntity.setMake(carModel.getMake());
        carEntity.setModel(carModel.getModel());
        carEntity.setColour(carModel.getColour());
        carEntity.setYear(carModel.getYear());
        return carEntity;
    }

    public static Car transformEntityToModel(CarEntity carEntity){
        Car car = new Car();
        car.setId(carEntity.getId());
        car.setMake(carEntity.getMake());
        car.setModel(carEntity.getModel());
        car.setColour(carEntity.getColour());
        car.setYear(carEntity.getYear());
        return car;
    }

    public static List<Car> transformEntityToModel(List<CarEntity> cars){
        List<Car> carsModels = null;
        ModelMapper modelMapper = new ModelMapper();
        carsModels = modelMapper.map(cars, new TypeToken<List<Car>>() {}.getType());
        return carsModels;
    }
}
