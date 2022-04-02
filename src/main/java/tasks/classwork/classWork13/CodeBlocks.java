package main.java.tasks.classwork.classWork13;

public class CodeBlocks {

    int x;
    static int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        CodeBlocks.y = y;
    }

    static {
        method1();
        System.out.println(" - launched from block of code");
    }

    public static void method1(){
        System.out.print("I am public static void method1");
    }
}
