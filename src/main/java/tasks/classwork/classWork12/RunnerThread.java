package main.java.tasks.classwork.classWork12;

import java.util.stream.IntStream;

public class RunnerThread {

    public static void main(String[] args) {


        IntStream.range(1,10).boxed().forEach(i -> System.out.println("pre-text: " + i));

        new Thread(() -> {
            IntStream.range(1,10).boxed().forEach(i -> System.out.println("text: " + i));
        }).start();

        IntStream.range(1,1000).boxed().forEach(i -> System.out.println("post-text: " + i));
    }
}
