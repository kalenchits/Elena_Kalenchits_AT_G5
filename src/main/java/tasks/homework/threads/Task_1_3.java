package main.java.tasks.homework.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task_1_3 {

    public static void main(String[] args) {


        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            threads.add(new Thread(() -> {

                IntStream.rangeClosed(1, 26).boxed().filter(n -> n % 2 == 1).map(Mouse::new).forEach(Mouse::peep);
            }));
        }

        threads.stream().forEach(Thread::start);

    }
}
