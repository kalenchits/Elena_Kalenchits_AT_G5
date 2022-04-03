package main.java.tasks.homework.threads;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_1_4 {

    public static void main(String[] args) {

       List<Mouse> mice = new ArrayList<>();        // создаем 280 мышей
        for (int n = 1; n < 280; n++) {
            mice.add(new Mouse(n));
        }
        // второй способ создания коллекции мышей
        //List<Mouse> miceNew = IntStream.rangeClosed(1, 280).boxed().map(Mouse::new).collect(Collectors.toList());

        //mice.forEach(Mouse::peep);  //мыши пикают

        List<Thread> threads = new ArrayList<>();   // создаем 5 дочерних потоков, каждый из которых удаляет одну мышь раз в 300 мс

        /*for (int i = 1; i < 6; i++) {
            threads.add(new Thread(() -> {
                while (!miceNew.isEmpty()){
                    System.out.print("Delete ");
                    miceNew.remove(0).peep();
                }
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    System.out.println("No more mice to delete");
                    e.printStackTrace();
                }

            }));*/

        for (int i = 1; i < 6; i++) {
            threads.add(new Thread(() -> {
                try {
                    for (int n = 1; n < mice.size() + 1; n++){
                        System.out.print("Delete by " + Thread.currentThread().getName() + ": ");
                        mice.remove(n).peep();
                        Thread.sleep(300);
                    }
                } catch (Exception e) {
                    System.out.println("No more mice to delete");
                    e.printStackTrace();
                }

            }));


        }

        threads.stream().forEach(Thread::start);
    }
}
