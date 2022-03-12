package main.java.project.bubbles;

import main.java.tasks.classwork.classWork7.B;

public class Bottle {

    private double volume;
    private int temperature;
    SparklingWater water = new SparklingWater("no", "yes", "no",0);


    public Bottle(double volume, int temperature) {
        this.volume = volume;
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        for (int i = 0; i < bubbles.length; i++){
            bubbles[i] = new Bubble("CO2");
        }
        this.water.pump(bubbles);
        this.temperature = temperature;
    }

    public void open(){
        this.water.setOpened(true);
    }

    public void checkIsOpenedBottle(){
        water.checkIsOpened();
    }

    public void warm(int temperature){
        water.setTemperature(this.temperature);
    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
