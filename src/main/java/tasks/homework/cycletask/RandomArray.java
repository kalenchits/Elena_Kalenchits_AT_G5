package main.java.tasks.homework.cycletask;

import java.util.Random;

public class RandomArray {

    public static int[] fillRandomArray() {

        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            array[i] = random.nextInt(20);
            //System.out.print(array[i] + " ");
        }
        return array;
    }
}
