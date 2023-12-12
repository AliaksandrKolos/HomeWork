package conditions;

public class Task8 {
    public static void main(String[] args) {
        int n = 14;
        int m = 4;

        switch (n){
            case (6):
                System.out.print("шестёрка");
                break;
            case (7):
                System.out.print("семёрка");
                break;
            case (8):
                System.out.print("восьмёрка");
                break;
            case (9):
                System.out.print("девятка");
                break;
            case (10):
                System.out.print("десятка");
                break;
            case (11):
                System.out.print("валет");
                break;
            case (12):
                System.out.print("дама");
                break;
            case (13):
                System.out.print("король");
                break;
            case (14):
                System.out.print("туз");
                break;
        }

        switch (m){
            case (1):
                System.out.println(" пики");
                break;
            case (2):
                System.out.println(" трефы");
                break;
            case (3):
                System.out.println(" бубны");
                break;
            case (4):
                System.out.println(" червы");
        }
    }
}
