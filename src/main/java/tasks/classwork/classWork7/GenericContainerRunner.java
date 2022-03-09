package main.java.tasks.classwork.classWork7;

public class GenericContainerRunner {

    public static void main(String[] args) {

        GenericContainer<Integer> container = new GenericContainer<>(); // создан контейнер объектов типа Integer

        for (int i = 0; i < 10; i++){
            container.add(i);
            //objectContainer.add("text"); // не сможет добавить, т.к. создан параметр типа integer
        }
        System.out.println(container + "-created!\n");
        while (!container.isEmpty()){
            int integer = container.removeLast();
            System.out.println("Number " + integer + " removed..");
        }
    }
}
