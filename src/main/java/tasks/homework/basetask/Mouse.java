package main.java.tasks.homework.basetask;

public class Mouse {
    String name;
    int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails(){
        System.out.println( "Я мышь, меня зовут " + this.name + " и мне " + this.age + " лет");
    }
}

