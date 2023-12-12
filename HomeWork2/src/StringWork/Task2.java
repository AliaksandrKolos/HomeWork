package StringWork;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        do{
            System.out.println("Введите строку:");
            str = sc.nextLine();
        }while (str.isEmpty());

        System.out.println("Введите символ который хотите заменить:");
        char symbol1 = sc.next().charAt(0);

        System.out.println("Введите символ на который хотите заменить:");
        char symbol2 = sc.next().charAt(0);

        char[] massChar = str.toCharArray();

        for (int i = 0; i < massChar.length; i++) {
            if (massChar[i] == symbol1){
                massChar[i] = symbol2;
            }
        }

        for (char n: massChar) {
            System.out.print(n);
        }








    }
}
