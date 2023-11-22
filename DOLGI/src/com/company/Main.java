package com.company;
import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(400, "Toyota");
        Driver driver = new Driver("Парвина Махсудова", 1);
        Car car = new Car("Toyota Camry 55", "A", 1000, driver, engine);
        System.out.println(car.toString());

        Lorry lorry = new Lorry("Toyota Land Cruiser", "C", 3000, driver, engine, 100);
        System.out.println(lorry.toString());

        SportCar sportCar = new SportCar("Infiniti", "JX", 1500, driver, engine, 500);
        System.out.println(sportCar.toString());

        System.out.println(engine.getManufacturer());
        engine.setManufacturer("Infiniti JX");
        System.out.println(engine.getManufacturer());
    }
}
