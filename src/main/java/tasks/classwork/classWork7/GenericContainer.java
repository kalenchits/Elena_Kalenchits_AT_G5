package main.java.tasks.classwork.classWork7;

public class GenericContainer<T>{ //создание параметризованного класса
    private T[] container; // создана переменная неопределенного типа Т, который будет определен позже
    private int counter;

    public GenericContainer(){
        this.container = (T[]) new Object[10] ;
        this.counter = 0;
    }

    public void add(T ob) {
        if (counter < container.length) {
            this.container[counter++] = ob;
        }
    }

    public T removeLast(){
        T temp = container[counter - 1]; // забрать объект из ячейки с номером counter - 1
        if (counter > 0) {
            this.container[--counter] = null; // обнулить ячейку массива и перейти на предыдущую ячейку
            return temp;
        }
        return temp;
    }

    public boolean isEmpty(){
        return counter == 0; // вернёт true, если counter=0, то есть массив пустой
    }
}
