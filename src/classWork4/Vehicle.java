package classWork4;

public abstract class Vehicle extends Machinary{

    String color;
    int speed;

    public Vehicle(String color, int speed) {
        super("Vehicle");
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
