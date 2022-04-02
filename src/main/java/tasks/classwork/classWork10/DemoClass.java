package main.java.tasks.classwork.classWork10;

import java.util.Arrays;
import java.util.List;

public class DemoClass {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла","раму","мама","чисто");
        System.out.println(list.stream().filter("мама"::equals).count());

        //System.out.println(list.stream().filter(x -> list.equals(x)).count());

        list.forEach(System.out::println);
    }
}
