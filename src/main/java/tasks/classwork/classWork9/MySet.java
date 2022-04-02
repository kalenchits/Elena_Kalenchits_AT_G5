package main.java.tasks.classwork.classWork9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {
        Set<String> myList = new HashSet<>();
        //разделяет строку на слова по пробелу
        String[] words = "мама мыла раму мыла".split(" ");

        //кладет слова в список myList
        for (String str: words){
            myList.add(str);
        }

        //итератор проверяет, печатает следующий элемент до тех пор, пока он есть
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
