package main.java.tasks.classwork.classWork7;

public class ObjectContainerRunner {

    public static void main(String[] args) {

        ObjectContainer objectContainer = new ObjectContainer();

        for (int i = 0; i < 10; i++){
            objectContainer.add(i);
            //objectContainer.add("text");
        }

        for (int i = 0; i < 10; i++){
            System.out.print(objectContainer.removeLast() + " ");
        }


        if (objectContainer.isEmpty()){
            System.out.println("массив пустой");
        }
    }





}
