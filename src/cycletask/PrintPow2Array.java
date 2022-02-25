package cycletask;

public class PrintPow2Array {
    public void printPow2Array(int[] randomArray) {

        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(Math.pow(randomArray[i], 2) + " ");
        }
    }
}
