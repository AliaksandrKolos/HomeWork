package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;


public class Car {

    private String carBrand;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String carBrand, String carClass ,int weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public Car(){

    }

    public String getCarBrand() {return carBrand;}
    public void setCarBrand(String carBrand) {this.carBrand = carBrand;}

    public String getCarClass() {return carClass;}
    public void setCarClass(String carClass) {this.carClass = carClass;}

    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали!");
    }

    public void stop(){
        System.out.println("Останавливаемся!");
    }

    public void turnRight(){
        System.out.println("Поворот направо!");
    }

    public void turnLeft(){
        System.out.println("Поворот налево!");
    }

    @Override
    public String toString(){

        return "Информация об автомобиле:\n" +
                "Бренд авто - " + carBrand +"\n" + "Класс авто - " + carClass + "\n" +
                "вес авто - " + weight +  "\n" + driver + "\n"+ engine;


    }






















}
