package com.ecs.car.demo.producer.controller;

import com.ecs.car.demo.producer.message.CarMessage;
import com.ecs.car.demo.producer.model.Car;
import com.ecs.car.demo.producer.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AddCarRestController {
    @Autowired
    private CarServiceImpl carServiceImpl;

    @PostMapping(value = "add")
    public CarMessage add(@RequestBody Car car)throws Exception {
      return carServiceImpl.add(car);
    }
}