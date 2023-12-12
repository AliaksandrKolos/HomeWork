package cycles;

public class Task3 {
    public static void main(String[] args) {
        int num = 10;
        int fuctorialNum = 1;

        for (int i = 1; i <= num; i++) {
            fuctorialNum *= i;
        }
        System.out.println(fuctorialNum);
    }
}
