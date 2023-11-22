package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;//private доступно только в пределах этого класса

    public SportCar(String brand, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;//this нужно чтобы внутри метода обратиться к переменным класса
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nПредельная скорость: " + maxSpeed + " км/ч";
    }
}