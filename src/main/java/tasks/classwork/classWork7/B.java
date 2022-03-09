package main.java.tasks.classwork.classWork7;

public class B {

    public static void main(String[] args) {

        A a = new A(){
            public int foo(int x){
                int y = super.foo(x);
                System.out.println(y);
                return y;
            }
        };
        a.foo(5);


    }
}
