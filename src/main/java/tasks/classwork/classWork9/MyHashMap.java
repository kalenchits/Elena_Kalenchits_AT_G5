package main.java.tasks. classwork.classWork9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyHashMap {

    public static void main(String[] args) {

        Map<Integer, String> wordsMap = new HashMap<Integer, String>();
        String[] words = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < words.length; i++){
            wordsMap.put(i, words[i]);
        }

        for (int i: wordsMap.keySet()){
            System.out.println(i);
        }

        for (String s: wordsMap.values()){
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> entry: wordsMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        //Entry - это дочерний интерфейс, вложенный в Map

    }


}
