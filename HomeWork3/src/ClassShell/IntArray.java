package ClassShell;

public class IntArray {
    private int[] massNumber;


    public IntArray(int[] massNumber) {
        this.massNumber = massNumber;
    }

    public IntArray(int n) {
        massNumber = new int[n];
    }

    public IntArray() {
        massNumber = new int[10];
    }


    public int[] sort(boolean boolValue){
        if (boolValue){
            for (int i = 0; i < massNumber.length - 1; i++){
                for (int j = 0; j < massNumber.length - i - 1; j++){
                    if (massNumber[j + 1] < massNumber[j]){
                        int temp = massNumber[j];
                        massNumber[j] = massNumber[j + 1];
                        massNumber[j + 1] = temp;
                    }
                }
            }
            return massNumber;
        }else {
            for (int i = 0; i < massNumber.length - 1; i++){
                for (int j = 0; j < massNumber.length - i - 1; j++){
                    if (massNumber[j] < massNumber[j+1]){
                        int temp = massNumber[j+1];
                        massNumber[j+1] = massNumber[j];
                        massNumber[j] = temp;
                    }
                }
            }
        }
        return massNumber;
    }
}