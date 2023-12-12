package cycles;

public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Количетво числе между А и В = " + (b - a - 1));

        for (int i = b - 1; i > a; i--) {
            System.out.print(i + " ");
        }


    }
}
