package main.java.project.bubbles;

import java.lang.Runnable;
import java.lang.InterruptedException;

public class SparklingWater extends Water implements Runnable{

    private Bubble bubble = new Bubble("CO2");
    private Bubble[] bubbles;
    private boolean isOpened;
    private int firstFilledElement;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    public void setOpened(boolean isOpened){
        this.isOpened = isOpened;
    }

    public void checkIsOpened(){
        Thread thread = new Thread(() -> {
            while (!isOpened) {
                System.out.println("Bottle is closed..");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                //while (firstFilledElement < bubbles.length){
                    degas();
                    //Thread.sleep(1000);
                //}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        thread.start();
    }

    public void pump(Bubble[] bubbles){
           this.bubbles = bubbles;
    }

    public int degas() throws InterruptedException {

        while (firstFilledElement < bubbles.length) {

            for (int i = 0; i < 10 + 5 * getTemperature(); i++) {
                if (firstFilledElement < bubbles.length) {
                    this.bubble.Cramp();
                    bubbles[firstFilledElement] = null;
                    firstFilledElement++;
                } else {
                    System.out.println("массив закончился");
                    break;
                }
            }
            System.out.println("degas water");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return firstFilledElement;
    }

    @Override
    public void run() {

    }
}
