package main.java.tasks.homework.cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {

        NumbersFrom0To20 numbersFrom0To20 = new NumbersFrom0To20();
        numbersFrom0To20.printNumbersFrom0To20();
        System.out.println(" -- вывод чисел от 0 до 20");

        OddNumbers oddNumbers = new OddNumbers();
        oddNumbers.printOddNumbers();
        System.out.println(" -- вывод нечетных чисел от 3 до 19");

        int[] newArray = RandomArray.fillRandomArray();

        PrintArray printArray = new PrintArray();
        printArray.printArray(newArray);
        System.out.println(" -- вывод ранее созданного массива");
        // вывод массива System.out.print(Arrays.toString(newArray));

        PrintReversedArray printReversedArray = new PrintReversedArray();
        printReversedArray.printReversedArray(newArray);
        System.out.println(" -- вывод ранее созданного массива в обратном порядке");

        PrintX5Array printX5Array = new PrintX5Array();
        printX5Array.printX5Array(newArray);
        System.out.println(" -- вывод ранее созданного массива, каждый элемент умножен на 5");
        
        PrintPow2Array printPow2Array = new PrintPow2Array();
        printPow2Array.printPow2Array(newArray);
        System.out.println(" -- вывод ранее созданного массива, каждый элемент возведен в квадрат");

        SearchMin searchMin = new SearchMin();
        searchMin.searchMin(newArray);
        System.out.println(" -- минимальный элемент массива");

        ChangePosition changePosition = new ChangePosition();
        changePosition.changePosition(newArray);
        System.out.println(" -- первый и последний элементы поменялись местами");

        SortDescArray sortDescArray = new SortDescArray();
        sortDescArray.sortDesc(newArray);
        System.out.println(" -- массив отсортирован по убыванию");



    }

}
