package main.java.tasks.classwork.classWork6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

    public static void main(String[] args) throws ParseException {

        //работа с датами

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        //делает из строки объект даты
        Date date = dateFormat.parse("04.06.2012");

        String text = dateFormat.format(new Date());

        System.out.println(text);
        //вернет true, если дата в date после сегодняшней и false, если не позже
        System.out.println(date.after(new Date()));
    }
}
