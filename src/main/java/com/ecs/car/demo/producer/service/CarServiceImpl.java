package com.ecs.car.demo.producer.service;

import com.ecs.car.demo.producer.message.CarMessage;
import com.ecs.car.demo.producer.model.Car;
import com.ecs.car.demo.producer.model.Message;
import com.ecs.car.demo.producer.repo.CarRepository;
import com.ecs.car.demo.producer.util.ServiceEnum;
import com.ecs.car.demo.producer.util.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class CarServiceImpl implements CarService {
    Logger logger = Logger.getLogger("local");   //Just to log instead of SOP

    @Autowired
    private CarRepository carRepo;

    @Override
    public CarMessage add(Car car){
        CarMessage carMessage = null;
        try{
            //Add Car
            carRepo.save(Transformer.transformModelToEntity(car));
            carMessage = new CarMessage(null,
                    new Message(ServiceEnum.S001.toString(),
                            "Car has been added successfully"));
        }catch (Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
            carMessage = new CarMessage(null,
                    new Message(ServiceEnum.E001.toString(),
                            e.getMessage()));
        }
        return carMessage;
    }

    @Override
    public CarMessage retrieve() {
        CarMessage carMessage = null;
        try{
            //Retrieve Cars
            carMessage = new CarMessage(Transformer.transformEntityToModel(carRepo.findAll()),
                    new Message(ServiceEnum.S002.toString(),
                           "Cars retrieved successfully"));
        }catch (Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
            carMessage = new CarMessage(null,
                    new Message(ServiceEnum.E002.toString(),
                            e.getMessage()));
        }
        return carMessage;
    }
}
