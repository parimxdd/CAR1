package com.company.professions;

public class Driver extends Person {
    private String fullName;//private доступно только в пределах этого класса
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        this.fullName = fullName;//this нужно чтобы внутри метода обратиться к переменным класса
        this.drivingExperience = drivingExperience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return fullName +
                "\nСтаж вождения: " + drivingExperience + " лет";
    }
}



