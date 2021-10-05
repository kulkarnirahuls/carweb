package com.ecs.car.demo.producer.controller;

import com.ecs.car.demo.producer.message.CarMessage;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class RetrieveCarRestController {
    @GetMapping(value = "retrieve/all")
    public CarMessage retrieveAll()throws ResourceNotFoundException {
        return null;
    }


}
