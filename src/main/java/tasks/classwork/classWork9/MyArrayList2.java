package main.java.tasks.classwork.classWork9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList2 {

    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long start1 = System.currentTimeMillis(); //считает кол-во секунд  с 1970 года
        for (int i = 0; i < 10000000; i++){
            myList1.add("word1");
        }
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            myList2.add("word2");
        }
        System.out.println(System.currentTimeMillis() - start2);

    }
}
