package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Kolos A.D.", 5);
        Engine engine = new Engine("General Motors", 658);

        Car car1 = new Car("Audi", "Е",2000, driver, engine);
        Car car2 = new SportCar("Audi", "Е",2000, driver, engine, 326);
        Car car3 = new Lorry("Kamaz", "Е",2000, driver, engine, 30);






    }
}
