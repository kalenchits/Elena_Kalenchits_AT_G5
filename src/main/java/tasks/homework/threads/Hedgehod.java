package main.java.tasks.homework.threads;

public class Hedgehod {

    private String pattern;
    private String name;

    public Hedgehod(int number) {
        this.name = "Hedgehod <" + number + ">";
    }

    public void tellMe(){
        System.out.println("I am " + name);
        try{
            Thread.sleep(50);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
