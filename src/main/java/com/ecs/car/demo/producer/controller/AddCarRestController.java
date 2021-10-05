package com.ecs.car.demo.producer.controller;

import com.ecs.car.demo.producer.message.CarMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

@RestController
public class AddCarRestController {
    @PostMapping(value = "/car/api/add")
    public CarMessage add()throws RestClientException {
        return new CarMessage(null,null);
    }
}