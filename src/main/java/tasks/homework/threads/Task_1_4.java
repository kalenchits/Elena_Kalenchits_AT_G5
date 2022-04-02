package main.java.tasks.homework.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task_1_4 {

    public static void main(String[] args) {

        List<Mouse> mice = new ArrayList<>();        // создаем 280 мышей
        for (int n = 1; n < 280; n++) {
            mice.add(new Mouse(n));
        }

        mice.forEach(Mouse::peep);  //мыши пикают

        List<Thread> threads = new ArrayList<>();   // создаем 5 дочерних потоков, каждый из которых удаляет одну мышь раз в 300 мс

        for (int i = 1; i < 6; i++) {
            threads.add(new Thread(() -> {
                try {

                    // как удалять элемент стрима с указанием потока?
                    for (int n = 1; n < mice.size() + 1; n++){
                        mice.remove(n);
                        System.out.println("Mouse " + n + " deleted"); //??? как получить реальный номер удаляемой мыши?
                        Thread.sleep(300);
                    }
                } catch (Exception e) {
                    System.out.println("No more mice to delete");
                    //e.printStackTrace();
                }

            }));
        }

        threads.stream().forEach(Thread::start);
    }
}
