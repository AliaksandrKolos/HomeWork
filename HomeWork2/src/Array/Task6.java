package Array;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] mass = new int[n];

        System.out.println("Введите нижний предел значений");
        int lowerLimiit = sc.nextInt();

        System.out.println("ведите верхний предел массива");
        int maxLimit = sc.nextInt();


        Random rnd = new Random();
        System.out.print("Массив: ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(maxLimit + 1 - lowerLimiit) + lowerLimiit;
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mass.length/2; i++) {
            int temp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = temp;
        }

        System.out.print("Инвертированный массив: ");
        for (int k: mass) {
            System.out.print(k + " ");
        }
    }
}
