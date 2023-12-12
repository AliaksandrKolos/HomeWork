package cycles;

public class Task7 {
    public static void main(String[] args) {
        int n = 1357;
        int count = 0;
        int sum = 0;
        boolean flag = false;

        while (n > 0){
            if(n % 10 == 2) {
                flag = true;
            }
            count++;
            sum += n % 10;
            System.out.print(n % 10);
            n /= 10;
        }
        System.out.println(" - число наоборот");


        if(flag) {
            System.out.println("Цифра 2 имеется");
        }else {
            System.out.println("Цифра 2 не имеется");
        }
        System.out.println("Количество цифр в числе = " + count);
        System.out.println("Сумма цифр числа = " + sum);
    }
}
