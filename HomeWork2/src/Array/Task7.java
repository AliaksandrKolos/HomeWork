package Array;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        int[] mass = new int[n];

        System.out.println("Введите верхний предел значений массива");
        int maxValue = sc.nextInt();

        System.out.println("Введите нижний предел значений массива");
        int minValue = sc.nextInt();

        Random rnd = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(maxValue + 1 - minValue) + minValue;
        }


        for (int i = 0; i < mass.length-1; i++) {
            for (int j = 0; j < mass.length - i - 1; j++) {
                if (mass[j+1] < mass[j]){
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }


        System.out.println("Массив :");

        for (int elem: mass) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.println("Введите искомое значение");
        int value = sc.nextInt();


        int count = 0;
        int indexElem = -1;

        for (int i = 0; i < mass.length-1; i++) {
            if(mass[i] == value){
                indexElem = i;
                break;
            }
            count++;
        }
        System.out.println("Индекс элемента: "+  indexElem);
        System.out.println("Линейный поиск: " + count + " шаг(-а)(-ов)");


        count = 0;
        int low = 0;
        int high = mass.length-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mass[mid] < value) {
                low = mid + 1;
            } else if (mass[mid] > value) {
                high = mid - 1;
            } else if (mass[mid] == value) {
                break;
            }
            count++;
        }

        System.out.println("Двоичный поиск: " + count + " шаг(-а)(-ов)");
    }
}
