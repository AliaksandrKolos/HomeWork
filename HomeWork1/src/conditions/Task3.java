package conditions;

public class Task3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;


        if(num1 > num2 && num3 > num2) {
            System.out.println(num1 + num3);
        } else if (num2 > num1 && num3 > num1) {
            System.out.println(num2 + num3);
        }else {
            System.out.println(num1 + num2);
        }
    }
}

