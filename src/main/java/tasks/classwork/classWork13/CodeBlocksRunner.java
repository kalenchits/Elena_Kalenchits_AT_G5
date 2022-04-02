package main.java.tasks.classwork.classWork13;

public class CodeBlocksRunner {

    public static void main(String[] args) {

        //CodeBlocks.method1();
        //new CodeBlocks();

        CodeBlocks b1 = new CodeBlocks();
        CodeBlocks b2 = new CodeBlocks();

        b1.setX(1);
        b2.setY(2);

        b1.setX(3);
        b2.setY(4);

        System.out.println("b1 - x: " + b1.getX());
        System.out.println("b1 - y: " + b1.getY());
        System.out.println("b2 - x: " + b2.getX());
        System.out.println("b2 - y: " + b2.getY());
    }
}
