package main.java.project.bubbles;

public class SparklingWater extends Water{

    private Bubble bubble = new Bubble("CO2");
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
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

}
