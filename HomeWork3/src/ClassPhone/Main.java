package ClassPhone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375333181003", "Nokia", 245);
        Phone phone2 = new Phone("+375292097654", "Iphone", 200);
        Phone phone3 = new Phone("+375333181003", "TCL", 190);

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println();
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());
        System.out.println();


        phone1.receiveCall("Sanya");
        System.out.println(phone1.getNumber());
        System.out.println();

        phone2.receiveCall("Sergey");
        System.out.println(phone2.getNumber());
        System.out.println();

        phone3.receiveCall("Vitalik");
        System.out.println(phone3.getNumber());
        System.out.println();


        phone1.receiveCall("Aleksandr", "+375333181003");
        System.out.println();

        String[] arrayNubmer= {"+375333181003", "+375292097654", "+375333181003"};
        phone1.sendMassage(arrayNubmer);



    }
}
