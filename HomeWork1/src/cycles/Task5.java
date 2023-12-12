package cycles;

public class Task5 {
    public static void main(String[] args) {
        int a = 28;
        int b = 5;

        int count = 0;

        for (int i = b; i <= a ; i += b) {
            count += b;
        }
        System.out.println("Длина незанятой части отрезка А = " + (a - count));
    }
}
