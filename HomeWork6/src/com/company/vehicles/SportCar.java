package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import javax.swing.*;

public class SportCar extends Car{

    private int maxSpeed;

    public SportCar(String carBrand, String carClass ,int weight, Driver driver, Engine engine, int maxSpeed) {
        super(carBrand, carClass , weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public SportCar(){

    }

    public int getMaxSpeed() {return maxSpeed;}

    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}


    @Override
    public String toString(){

        return "Информация об автомобиле:\n" +
                "Бренд авто - " + super.getCarBrand() + "\nКласс авто - " + super.getCarClass() +
                "\nвес авто - " + super.getWeight() + "\nмаксимальная скорость - " + maxSpeed + "км/ч\n"+
                super.getDriver() + "\n" + super.getEngine();
    }

}
