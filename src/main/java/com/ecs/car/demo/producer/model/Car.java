package com.ecs.car.demo.producer.model;

public class Car {

    private Long id;
    private String make;
    private String model;
    private String colour;
    private Long year;

    public Car(Long id, String make, String model, String colour, Long year){
        this.id = id;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }
}
