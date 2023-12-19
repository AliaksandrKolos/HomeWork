package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{

    private int capacityBody;

    public Lorry( String carBrand, String carClass, int weight, Driver driver, Engine engine, int capacityBody) {
        super(carBrand, carClass , weight, driver, engine);
        this.capacityBody = capacityBody;
    }

    public Lorry(){

    }

    @Override
    public String toString(){

        return "Информация об автомобиле:\n" +
                "Бренд авто - " + super.getCarBrand() + "\nКласс авто - " + super.getCarClass() +
                "\nвес авто - " + super.getWeight() + "\nгрузоподъёмность - " + capacityBody + " тонн\n"+
                super.getDriver() + "\n" + super.getEngine();
    }
}
