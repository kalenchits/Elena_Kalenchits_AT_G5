package main.java.project.bubbles;

import main.java.tasks.classwork.classWork7.B;

public class Bottle {

    private double volume;
    SparklingWater water = new SparklingWater("no", "yes", "no",20);


    public Bottle(double volume) {
        this.volume = volume;
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        for (int i = 0; i < bubbles.length; i++){
            bubbles[i] = new Bubble("CO2");
        }
        this.water.pump(bubbles);

    }

    // как передалать созданный массив в метод
    /* public void open(){
        water.degas(bubbles);
    }
    */
}
