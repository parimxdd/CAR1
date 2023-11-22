package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;//this нужно чтобы внутри метода обратиться к переменным класса
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override //метод является переопределенным методом из суперкласса
    public String toString() {
        return "Марка автомобиля: " + brand +
                "\nКласс автомобиля: " + carClass +
                "\nВес: " + weight +
                "\nВодитель: " + driver +
                "\nДвигатель: " + engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;//this нужно чтобы внутри метода обратиться к переменным класса
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;//this нужно чтобы внутри метода обратиться к переменным класса
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;//this нужно чтобы внутри метода обратиться к переменным класса
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;//this нужно чтобы внутри метода обратиться к переменным класса
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}