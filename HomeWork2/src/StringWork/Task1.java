package StringWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = sc.nextLine();

        System.out.println("Введите символ:");
        char ch = sc.next().charAt(0);

        char[] massChar = str.toCharArray();

        int count = 0;

        for (int i = 0; i < massChar.length; i++) {
            if (massChar[i] == ch) {
                count++;
            }
        }

        System.out.println(count);
    }
}
