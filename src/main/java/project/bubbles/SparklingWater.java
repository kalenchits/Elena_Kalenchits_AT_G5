package main.java.project.bubbles;

import java.lang.Runnable;
import java.lang.InterruptedException;

public class SparklingWater extends Water implements Runnable{

    private Bubble bubble = new Bubble("CO2");
    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    private void checkIsOpened(){
        Thread thread = run() -> {
            while (!isOpened) {
                System.out.println("Bottle is closed..");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            degas();
        };
        thread.start();
    }

    public void pump(Bubble[] bubbles){
           this.bubbles = bubbles;
    }

    public void degas(){

        for (int i = bubbles.length - 1; i > (-1); i--){
            this.bubble.Cramp();
            bubbles[i] = null;
        }

        System.out.println("degas water");

    }

    @Override
    public void run() {

    }
}
