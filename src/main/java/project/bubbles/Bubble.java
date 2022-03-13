package main.java.project.bubbles;

public class Bubble {

    private final double volume = 0.3;
    public String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void Cramp(){
        System.out.println("Cramp!");
    }

    public double getVolume(){
        return volume;
    }


}
