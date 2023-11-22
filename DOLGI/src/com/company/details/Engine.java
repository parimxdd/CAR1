package com.company.details; //пакет
//публикуем класс двигателя. класс Engine является нестатическим вложенным классом он связан с конкретным экземпляром класса Car
public class Engine {
    private int power;//private доступно только в пределах этого класса
    private String manufacturer;

    public Engine(int power, String manufacturer) { //создаю конструктор
        this.power = power;//this нужно чтобы внутри метода обратиться к переменным класса
        this.manufacturer = manufacturer;//this нужно чтобы внутри метода обратиться к переменным класса
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;//this нужно чтобы внутри метода обратиться к переменным класса
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;//this нужно чтобы внутри метода обратиться к переменным класса
    }

    @Override
    public String toString() {
        return "Мощность двигателя: " + power +
                " л.с." +
                "\nПроизводитель: " + manufacturer;
    }
}
