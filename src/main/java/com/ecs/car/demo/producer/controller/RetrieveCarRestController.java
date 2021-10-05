package com.ecs.car.demo.producer.controller;

import com.ecs.car.demo.producer.message.CarMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

@RestController
public class RetrieveCarRestController {
    @GetMapping(value = "/car/api/retrieve/")
    public CarMessage retrieve()throws RestClientException{
        return null;
    }
}
