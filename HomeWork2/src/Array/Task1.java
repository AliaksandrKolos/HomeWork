package Array;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] mass = new int[4];
        Random rnd = new Random();

        for (int i = 0; i <= mass.length-1; i++) {
            mass[i] = rnd.nextInt(99+1-10) + 10;
        }

        boolean flag =  true;

        for (int i = 0; i < mass.length-1; i++) {
            if(mass[i+1] < mass[i]) {
                flag = false;
            }
        }

        if (flag){
            System.out.println("Последовательность возрастающая");
        }else {
            System.out.println("Последовательность не возрастающая");
        }

        for (int n:mass) {
            System.out.print(n + " ");
        }

    }
}
