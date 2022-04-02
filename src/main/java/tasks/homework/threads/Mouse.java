package main.java.tasks.homework.threads;

public class Mouse {

    private String pattern;
    private String name;

    public Mouse(int number) {
        this.name = "Mouse <" + number + ">";
    }

    public String getName() {
        return name;
    }

    public void peep(){
        System.out.println(name + " PEEP!");
        try{
            Thread.sleep(200);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
