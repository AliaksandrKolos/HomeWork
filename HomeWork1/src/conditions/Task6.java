package conditions;
public class Task6 {
    public static void main(String[] args) {

        int n = 999;

        if(n % 2 == 0 && n < 10){
            System.out.println(n + " -"+ " четное однозначное число");
        }else if(n % 2 == 0 && n > 9 && n < 100){
            System.out.println(n + " -" + " четное двузначное число");
        }else if(n % 2 == 0 && n < 999 && n > 99){
            System.out.println(n + " -" + " четное трехзначное число");
        }else if(n % 2 != 0 && n < 10){
            System.out.println(n + " -" + " нечетное однозначное число");
        }else if(n % 2 != 0 && n > 9 && n < 100){
            System.out.println(n + " -" + " нечетное двузначное число");
        }else if(n % 2 != 0 && n < 1000 && n > 99){
            System.out.println(n + " -"+ " нечетное трехзначное число");
        }


    }
}
