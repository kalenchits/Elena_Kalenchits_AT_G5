package main.java.tasks.classwork.classWork11;

import main.java.tasks.classwork.classWork10.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла","раму","мама","чисто");

        System.out.println(list.stream().anyMatch("мама"::equals));
        System.out.println(list.stream().allMatch(s -> s.contains("м")));
        System.out.println(list.stream().map(s -> s+"м").collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split("а"))).filter(s -> !s.equals("")).collect(Collectors.toList()));

        //отсортировать коллекцию по алфавиту
        System.out.println("отсортировать коллекцию по алфавиту");
        list.stream().sorted().forEach(System.out::println);

        System.out.println("отсортировать колекцию строк по алфавиту в обратном порядке и убрать дубликаты");
        //отсортировать колекцию строк по алфавиту в обратном порядке и убрать дубликаты
        list.stream().sorted((x,y) -> -x.compareTo(y)).distinct().forEach(System.out::println);

        //отсортировать коллекцию людей сначала по полу, а потом по возрасту, вывести результат в консоль и вернуть результирующую коллекцию
        System.out.println("отсортировать коллекцию людей сначала по полу, а потом по возрасту, вывести результат в консоль и вернуть результирующую коллекцию");
        List<Person> people = Arrays.asList(
                new Person("Вася",13, Person.Sex.MAN),
                new Person("Катя",28, Person.Sex.WOMAN),
                new Person("Вова",24, Person.Sex.MAN),
                new Person("Маша",38, Person.Sex.WOMAN),
                new Person("Роман петрович",72, Person.Sex.MAN)
        );

        people.stream().sorted((p1, p2) ->  p1.age != p2.age ? p1.sex.compareTo(p2.sex) : p1.age - p2.age).peek(p -> System.out.println(p.name)).collect(Collectors.toList());

        //разделить слова по символам, отпечататать результат, выбрать символ с максмальным значением среди букв
        System.out.println("разделить слова по символам, отпечататать результат, выбрать символ с максмальным значением среди букв");
        list.stream().flatMap(s -> Arrays.stream(s.split(""))).peek(System.out::println).max(String::compareTo).get();

        //найти человека с минимальным возрастом
        System.out.println("найти человека с минимальным возрастом");
        System.out.println(people.stream().min(Comparator.comparing(p -> p.age)).get().name);

        //найти сумму общего количества букв во всех словах коллекции
        System.out.println("найти сумму общего количества букв во всех словах коллекции");
        long counter = list.stream().flatMap(s -> Arrays.stream(s.split(""))).count();
        System.out.println(counter);

        int count = list.stream().map(s -> s.length()).reduce((x,y) -> x+y).get();
        System.out.println(count);

        int counterNew = list.stream().mapToInt(String::length).sum();
        System.out.println(counterNew);

        //найти количество букв, из которых состоят слова с нечетным количеством букв
        System.out.println("найти количество букв, из которых состоят слова с нечетным количеством букв");

        int amount = list.stream().map(String::length).mapToInt(l -> l % 2 == 1 ? l: 0).sum();
        System.out.println(amount);

        int amount2 = list.stream().map(String::length).collect(Collectors.summingInt(l -> l % 2 == 1 ? l: 0));
        System.out.println(amount2);

        //объединить все элементы в одну строку через разделитель ":" и обернуть тегами <p>...</p>
        System.out.println("объединить все элементы в одну строку через разделитель \":\" и обернуть тегами <p>...</p>");
        System.out.println(list.stream().collect(Collectors.joining(":", "<p>", "</p>")));

        //преобразовать people в map, гле ключом является hash объекта, а знагчением сам объект Person
        System.out.println("преобразовать people в map, гле ключом является hash объекта, а знагчением сам объект Person");
        System.out.println(people.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p)));

        //преобразовать people в map, сгруппировав по полу, и вывести в консоль ключи
        System.out.println("преобразовать people в map, сгруппировав по полу, и вывести в консоль ключи");
        System.out.println(people.stream().collect(Collectors.groupingBy(p -> p.sex)).keySet());
}
}
