package main.java.tasks.classwork.classWork5;

public class Calc {

    public int calculate(String action, int x, int y){
        switch (action){
            case "+":
                return add(x,y);
            case "-":
                return substract(x,y);
            case "*":
                return multiply(x,y);
            case "/":
                return divide(x,y);
            default:
                return 0;
        }
    }

    private int add(int x, int y){
        return x + y;
    }

    private int substract(int x, int y){
        return x - y;
    }

    private int multiply(int x, int y){
        return x * y;
    }

    private int divide(int x, int y){
        return x / y;
    }
}

