package main.java.tasks.classwork.classWork9;

import java.util.*;

public class MySet2 {

    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

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
