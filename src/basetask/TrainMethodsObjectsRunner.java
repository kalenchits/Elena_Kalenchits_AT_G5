package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        Mouse mouse = new Mouse("Джерри ", 5);
        trainMethodsObjects.processMouse(mouse);
    }
}
