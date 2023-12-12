package cycles;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        double p = rnd.nextDouble(25.0);

        double deposit = 1000;
        int countMonth = 0;


        double sumMonth = deposit / 100 * p;

        while (deposit < 1100){
            countMonth++;
            deposit += sumMonth;
        }

        System.out.println("Количество месяцев " + countMonth);
        System.out.println("Итоговая сумма при процентной ставке " + p + "% равна: " + deposit);







    }
}
