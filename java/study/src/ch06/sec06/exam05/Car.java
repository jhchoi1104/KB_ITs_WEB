package ch06.sec06.exam05;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    String maxSpeed;

    Car(String model) {
        this.model = model;

    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, String maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
