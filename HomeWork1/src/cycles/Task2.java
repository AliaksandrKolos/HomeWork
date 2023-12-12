package cycles;

public class Task2 {
    public static void main(String[] args) {
        int n = 1;
        do {
            if (n % 5 == 0){
                System.out.println(n);
            }
            n++;
        }while (n < 101);
    }
}
