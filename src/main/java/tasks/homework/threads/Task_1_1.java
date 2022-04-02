package main.java.tasks.homework.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task_1_1 {

    public static void main(String[] args) {

        //Мыши укладываются в список
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            threads.add(new Thread(() -> {

                List<Mouse> mice = new ArrayList<>();
                for (int n = 1; n < 21; n++) {
                    mice.add(new Mouse(n));
                }

                mice.stream().forEach(Mouse::peep);

            }));
        }

//Мыши уклыдваются в стрим
       /* List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            threads.add(new Thread(() -> {

                IntStream.rangeClosed(1, 20).boxed().map(Mouse::new).forEach(Mouse::peep);

            }));
        }*/


        threads.stream().forEach(Thread::start);

        // черновик: создание  и вызов одного потока
        /*Thread t1 = new Thread(() -> {

            List<Mouse> mice = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                mice.add(new Mouse(i));
            }

            mice.stream().forEach(Mouse::peep);

        });

        t1.start();*/

    }

}



