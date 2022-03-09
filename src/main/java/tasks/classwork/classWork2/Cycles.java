package main.java.tasks.classwork.classWork2;

public class Cycles {
    public static void main(String[] args) {
        int i = 23;
        for (i = 23; i < 28; i++){
            if (i % 13 == 0) {
                System.out.println("continue!");
                //break;
                //return;
                //continue;
            }
            System.out.println("i is : " + i);
        }
        System.out.println("number is : " + i);
    }
}
