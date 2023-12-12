package Array;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int [] mass = new int[20];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = i+1;
        }

        System.out.println("Введите искомое число:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int index = -1;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == value){
                index = i;
                break;
            }
        }
        for (int m: mass) {
            System.out.print(m + " ");
        }
        System.out.println();

        System.out.println("Индекс искомого числа: " + index);

    }
}
