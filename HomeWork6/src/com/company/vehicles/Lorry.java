package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{

    private int capacityBody;

    public Lorry( String carBrand, String carClass, int weight, Driver driver, Engine engine, int capacityBody) {
        super(carBrand, carClass , weight, driver, engine);
        this.capacityBody = capacityBody;
    }

    @Override
    public String toString(){

        return "Информация об автомобиле:" +
                " \n" + "Бренд авто - " + getCarBrand() +"\n" + "Класс авто - " + getCarClass() + "\n" +
                "вес авто - " + getWeight() + "\n" + "грузоподъёмность - " + capacityBody + " тонн" +

                "\nВодитель: \nФИО - " + getDriver().getFullName() + "\nстаж вождения - " + getDriver().getDriveExp() + " лет\n" +

                "\nДвигатель:\nпроизводитель - " + getEngine().getManufacturer() + "\nмощность - " +  getEngine().getPower() + " сил";
    }
}