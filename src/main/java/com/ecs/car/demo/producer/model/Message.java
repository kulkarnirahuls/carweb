package com.ecs.car.demo.producer.model;

import com.ecs.car.demo.producer.util.ServiceEnum;

import javax.persistence.criteria.CriteriaBuilder;

public class Message {
    private String message=null;
    private String code=null;

    public Message(String code, String message){
        this.code = code;
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
