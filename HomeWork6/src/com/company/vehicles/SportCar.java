package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{

    private int maxSpeed;

    public SportCar(String carBrand, String carClass ,int weight, Driver driver, Engine engine, int maxSpeed) {
        super(carBrand, carClass , weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {return maxSpeed;}

    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}


    @Override
    public String toString(){

        return "Информация об автомобиле:" +
                " \n" + "Бренд авто - " + getCarBrand() +"\n" + "Класс авто - " + getCarClass() + "\n" +
                "вес авто - " + getWeight() + "\n" +

                "\nВодитель: \nФИО - " + getDriver().getFullName() + "\nстаж вождения - " + getDriver().getDriveExp() + " лет\n" +

                "\nДвигатель:\nпроизводитель - " + getEngine().getManufacturer() + "\nмощность - " +  getEngine().getPower() + " сил\n" +
                "максимальная скорость - " + maxSpeed;
    }

}
