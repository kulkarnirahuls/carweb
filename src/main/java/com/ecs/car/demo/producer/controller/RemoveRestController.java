package com.ecs.car.demo.producer.controller;

import com.ecs.car.demo.producer.message.CarMessage;
import com.ecs.car.demo.producer.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class RemoveRestController {
    @Autowired
    private CarServiceImpl carServiceImpl;

    @DeleteMapping(value ="remove/{id}")
    public CarMessage remove(@PathVariable(name = "id") Long id)throws Exception {
        return carServiceImpl.remove(id);
    }
}
