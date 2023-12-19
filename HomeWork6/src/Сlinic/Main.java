package Сlinic;


public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", 2);
        cat.makeNoise();

        Animal dog = new Dog("Сем", 4);
        dog.makeNoise();

        Animal rat = new Rat("Лариса", 5);
        rat.makeNoise();

    }
}