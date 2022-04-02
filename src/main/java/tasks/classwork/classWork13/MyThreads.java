package main.java.tasks.classwork.classWork13;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class MyThreads {

    public static void main(String[] args) throws InterruptedException {
        /*for (int i = 0; i < 5; i++){
            new Thread(() -> heavyMethod()).start();
        }*/

        Thread t1 = new Thread(() -> heavyMethod());
        Thread t2 = new Thread(() -> heavyMethod());
        Thread t3 = new Thread(() -> {
            try{
                t1.join(); //поток t3 запустится только после того, как отработает поток t1
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        heavyMethod();
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        // t1.join(); //говорит материнскому потоку main ждать, пока поток t1 не закончит работу

        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();
    }

    public static void heavyMethod(){
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++){
            double d = tan(atan(123456789.123456789));
        }

        System.out.printf("I am %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }


}
