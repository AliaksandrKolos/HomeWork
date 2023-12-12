package conditions;

public class Task4 {
    public static void main(String[] args) {
        int years = 300;

        if(years % 4 == 0 && years % 100 != 0 || years % 400 == 0){
            System.out.println("366 дней, год високосный");
        }else {
            System.out.println("365 дней, год не високосный");
        }
    }
}
