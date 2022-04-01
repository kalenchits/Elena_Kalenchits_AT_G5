package main.java.tasks.classwork.classWork9;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        //разделяет строку на слова по пробелу
        String[] words = "мама мыла раму мыла".split(" ");
        //кладет слова в список myList
        for (String str: words){
            myList.add(str);
        }
        //печатает в консоль список
        for (String str: myList){
            System.out.println(str);
        }
        //печатает в консоль список, обращение по индексу
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

    }
}
