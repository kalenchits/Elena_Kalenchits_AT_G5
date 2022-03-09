package main.java.tasks.classwork.classWork7;

import java.util.Locale;

public class EColorRunner {

    public static void main(String[] args) {

        isColor("green");
    }

    private static void isColor(String color) {
        switch (EColor.valueOf(color.toUpperCase(Locale.ROOT))) {
            case RED:
                System.out.println("color " + EColor.RED.name + " hex " + EColor.RED.hex);
                break;
            case BLUE:
                System.out.println("color " + EColor.BLUE.name + " hex " + EColor.BLUE.hex);
                break;
            case GREEN:
                System.out.println("color " + EColor.GREEN.name + " hex " + EColor.GREEN.hex);
                break;
            case YELLOW:
                System.out.println("color " + EColor.YELLOW.name + " hex " + EColor.YELLOW.hex);
                break;
            case PURPLE:
                System.out.println("color " + EColor.PURPLE.name + " hex " + EColor.PURPLE.hex);
                break;
            default:
                System.out.println("Other color");
        }
    }
}
