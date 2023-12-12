package ClassShell;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6};
        IntArray intArray = new IntArray(mass);
        System.out.println(Arrays.toString(intArray.sort(false)));
    }
}



