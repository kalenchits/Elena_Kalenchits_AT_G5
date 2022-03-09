package main.java.tasks.homework.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        Mouse mouse = new Mouse("Джерри ", 5);
        trainMethodsObjects.processMouse(mouse);

        Souce souse = new Souce("соевый", "красного");
        trainMethodsObjects.processSouce(souse);

        Bee bee = new Bee("девочка", 10);
        trainMethodsObjects.processBee(bee);

        Obstacle obstacle = new Obstacle("в виде какой-то ерунды", "небольшое");
        trainMethodsObjects.processObstacle(obstacle);

        Pineapple pineapple = new Pineapple("гавайский", 5000);
        trainMethodsObjects.processPineapple(pineapple);
    }
}
