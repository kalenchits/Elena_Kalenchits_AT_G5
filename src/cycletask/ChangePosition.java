package cycletask;

public class ChangePosition {
    public void changePosition(int[] randomArray) {

        int a = randomArray[0];
        randomArray[0] = randomArray[randomArray.length - 1];
        randomArray[randomArray.length - 1] = a;

        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
    }
}
