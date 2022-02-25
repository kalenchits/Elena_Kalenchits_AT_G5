package cycletask;

public class SearchMin {
    public void searchMin(int[] randomArray){

        int min = randomArray[0];

        for (int i = 0; i < randomArray.length; i++) {
            min = Math.min(min, randomArray[i]);
        }
        System.out.print(min);

    }
}
