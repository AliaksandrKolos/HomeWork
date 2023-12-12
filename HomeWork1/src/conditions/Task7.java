package conditions;

public class Task7 {
    public static void main(String[] args) {
        int day = 25;
        int month = 12;

        if(day > 19 && month == 1 || day < 19 && month == 2){
            System.out.println("Водолей");
        } else if (day > 18 && month == 2 || day < 21 && month == 3) {
            System.out.println("Рыбы");
        } else if (day > 20 && month == 3 || day < 20 && month == 4) {
            System.out.println("Овен");
        } else if (day > 19 && month == 4 || day < 21 && month == 5) {
            System.out.println("Телец");
        }else if (day > 20 && month == 5 || day < 22 && month == 6){
            System.out.println("Близнецы");
        }else if (day > 21 && month == 6 || day < 23 && month == 7){
            System.out.println("Рак");
        }else if (day > 22 && month == 7 || day < 23 && month == 8){
            System.out.println("Лев");
        }else if (day > 22 && month == 8 || day < 23 && month == 9){
            System.out.println("Дева");
        }else if (day > 22 && month == 9 || day < 23 && month == 10){
            System.out.println("Весы");
        } else if (day > 22 && month == 10 || day < 23 && month == 11) {
            System.out.println("Скорпион");
        }else if (day > 22 && month == 11 || day < 22 && month == 12){
            System.out.println("Стрелец");
        }else if ((day > 22 && month == 12 || day < 20 && month == 1)){
            System.out.println("Козерог");
        }
    }
}
