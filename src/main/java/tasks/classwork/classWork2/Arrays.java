package main.java.tasks.classwork.classWork2;

import java.util.List;
import java.util.Random;

public class Arrays {
    public static List<String> asList;

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int e = 0;
        for (int i =0; i < 10; i++){
            array[i]=random.nextInt(100);
            e = i;
        }
        for (int i: array) {
            System.out.print(i + " ");
        }
        int summa = 0;
        for (int i =0; i < 10; i++){
            summa += array[i];
        }
        int srednee = summa / array.length;
        System.out.println("среднее значение " + srednee);
    }
}
