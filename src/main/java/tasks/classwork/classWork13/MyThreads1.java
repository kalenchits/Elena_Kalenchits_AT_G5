package main.java.tasks.classwork.classWork13;

public class MyThreads1 {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        //созданный объект указывает на конкретную команту, в которую забегает блок кода. кто первый обежал, тот и запустился. второй будет ждать, пока не закончит первый.

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("t-%s, ", i);
                }
            }
        }).start();

        Thread.sleep(1000);

        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().sleep(1000);
                System.out.printf("m-%s, ", i);
            }
        }

    }


}
