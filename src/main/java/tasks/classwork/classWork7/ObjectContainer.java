package main.java.tasks.classwork.classWork7;

import java.awt.*;

public class ObjectContainer {

    private Object[] container = new Object[10];
    private int counter;

    public void add(Object ob) {

        if (counter < container.length) {
            this.container[counter++] = ob;
        }

    }

    public Object removeLast() {

        Object temp = container[counter - 1]; // забрать объект из ячейки с номером counter - 1
        if (counter > 0) {
            this.container[--counter] = null; // обнулить ячейку массива и перейти на предыдущую ячейку
            return temp;
        }
        return temp;

    }

    public boolean isEmpty() {

        return counter == 0; // вернёт true, если counter=0, то есть массив пустой
    }
}
