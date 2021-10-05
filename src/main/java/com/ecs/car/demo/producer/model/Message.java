package com.ecs.car.demo.producer.dto;

public class Message {
    private String message=null;
    private String code=null;

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
