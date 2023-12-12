package cycles;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int max = 10;
        int min = 2;

        int count = 1;
        int n = rnd.nextInt(max + 1 - min) + min;

        while (n != 0){
            System.out.print("Task" + count + ".");
            n--;
            count++;
        }
    }
}
