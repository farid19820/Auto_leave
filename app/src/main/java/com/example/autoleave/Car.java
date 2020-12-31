package com.example.autoleave;

public class Car {

    private int id;
    private String price;
    private String model;
    private String gear_type;
    private String year;
    private String killo_meters;
    private String engine_capacity;
    private String color;
    private String body_type;
    private String tyre_type;
    private String wheel;
    private String extra_features;

    public Car(int id, String price, String model, String gear_type, String year,
               String killo_meters, String engine_capacity, String color, String body_type,
               String tyre_type, String wheel, String extra_features) {
        this.id = id;
        this.price = price;
        this.model = model;
        this.gear_type = gear_type;
        this.year = year;
        this.killo_meters = killo_meters;
        this.engine_capacity = engine_capacity;
        this.color = color;
        this.body_type = body_type;
        this.tyre_type = tyre_type;
        this.wheel = wheel;
        this.extra_features = extra_features;
    }

  /*  public Car(String price, String model, String gear_type, int year, String killo_meters,
               String engine_capacity, String color, String body_type, String tyre_type,
               String wheel, String extra_features) {
        this.price = price;
        this.model = model;
        this.gear_type = gear_type;
        this.year = year;
        this.killo_meters = killo_meters;
        this.engine_capacity = engine_capacity;
        this.color = color;
        this.body_type = body_type;
        this.tyre_type = tyre_type;
        this.wheel = wheel;
        this.extra_features = extra_features;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGear_type() {
        return gear_type;
    }

    public void setGear_type(String gear_type) {
        this.gear_type = gear_type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getKillo_meters() {
        return killo_meters;
    }

    public void setKillo_meters(String killo_meters) {
        this.killo_meters = killo_meters;
    }

    public String getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(String engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBody_type() {
        return body_type;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public String getTyre_type() {
        return tyre_type;
    }

    public void setTyre_type(String tyre_type) {
        this.tyre_type = tyre_type;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getExtra_features() {
        return extra_features;
    }

    public void setExtra_features(String extra_features) {
        this.extra_features = extra_features;
    }
}
