package main.java.tasks.classwork.classWork6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Demo {
    public static void main(String[] args) {

        String x = "sdf@mail.ru";

        String[] y = x.split("");
        x.replaceAll("abc", "999");


        //прибавить к строке символ s
        x = x + "s";


        //прибавляет к строке миллион раз строчку в кавычках
        StringBuilder sb = new StringBuilder();

        for (int d = 0; d < 1000000; d++){
            sb.append("dhfdjh");
        }
        System.out.println(sb);


        System.out.println(x);
        boolean z = x.matches("[a-z]+@[a-z]+.[a-z]{2}");
        //строка должна начинаться с как минимум одной буквы от a до z, потом @, потом точка, потом ровно две буквы

        System.out.println(z);



    }
}
