package main.java.project.bubbles;

public class Bottle {

    private double volume;
    private int temperature;
    SparklingWater water = new SparklingWater("no", "yes", "no",0);
    //private SparklingWater water;


    public Bottle(double volume, int temperature) {

        //SparklingWater water = new SparklingWater("no", "yes","no", temperature);
        //так не прокатывает

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
        Thread thread = new Thread(() -> {
            try {
                water.degas();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();

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
