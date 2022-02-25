package classWork4;

public class Bike extends Vehicle implements Movable{

    public Bike(String color, int speed){
        super(color, speed);
    }

    @Override
    public void start() {
        System.out.println("Bike has started");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");
    }
}
