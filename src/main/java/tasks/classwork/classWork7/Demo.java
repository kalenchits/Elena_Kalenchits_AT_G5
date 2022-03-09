package main.java.tasks.classwork.classWork7;

public class Demo {

    public static void main(String[] args) {

        String x = String.valueOf(123);
        x = String.join(":","123", "fdg"); //склеивает строки через разделитель 123:fdg
        x = String.format("%s мама %s мыла %s", "раму", "чисто", "быстро"); // %s - регулярка для string формата

        System.out.println(x);
        System.out.printf("%s мама %s мыла %s", "раму", "чисто", "быстро");


    }
}
