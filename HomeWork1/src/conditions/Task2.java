package conditions;

public class Task2 {
    public static void main(String[] args) {
        int num = 2;

        switch (num){
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;
            case (6):
                System.out.println("Суббота");
                break;
            case (7):
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня нет.");
        }

        System.out.println("--------------------");

        num = 4;

        if(num == 1){
            System.out.println("Понедельник");
        } else if (num == 2) {
            System.out.println("Вторник");
        } else if (num == 3) {
            System.out.println("Среда");
        } else if (num == 4) {
            System.out.println("Четверг");
        } else if (num == 5) {
            System.out.println("Пятница");
        } else if (num == 6) {
            System.out.println("Суббота");
        } else if (num == 7) {
            System.out.println("Воскресенье");
        }else {
            System.out.println("Такого дня нет.");
        }
    }
}
