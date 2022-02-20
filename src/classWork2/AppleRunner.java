package classWork2;

import java.applet.AppletContext;

public class AppleRunner {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple2 = new Apple("red", "sweet", 50, 20);

        apple2.getSugar();

        apple.setColor("yellow");
        apple.setTaste("sour");
        apple.setWeight(100);

        System.out.println(apple);
        System.out.println(apple2);
        System.out.println("Apple color: " + apple2.getColor());
    }
}
