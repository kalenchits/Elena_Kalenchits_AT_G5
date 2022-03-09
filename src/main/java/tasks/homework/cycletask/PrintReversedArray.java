package main.java.tasks.homework.cycletask;

public class PrintReversedArray {
    public void printReversedArray(int[] randomArray) {

        for (int i = randomArray.length - 1; i > -1; i--) {
            System.out.print(randomArray[i] + " ");
        }
    }
}
