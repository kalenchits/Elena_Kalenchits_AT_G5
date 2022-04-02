package main.java.tasks.classwork.classWork10;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        //mc.justMethod( x-> System.out.println(x));
        //метод интерфейса принимает стрингу и печатает ее

        //mc.justMethod(System.out::println);
        //то же самое, но короче. Это ссылка на метод - односрочная лямбда, только укороченная запись

        //mc.justMethod(()-> 5);
        //в метод передается объект интерфейса (ничего не принимает, поэтому скобки пустые), который возвращает дабл

        mc.justMethod(ClassX::new);
        //создается объект класса ClassX.

    }
}
