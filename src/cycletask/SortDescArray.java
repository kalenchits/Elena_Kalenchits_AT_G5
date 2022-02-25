package cycletask;

import java.util.Arrays;
import java.util.Collections;

public class SortDescArray {
    public void sortDesc(int[] randomArray) {

        Arrays.sort(randomArray);
        for (int i = randomArray.length - 1; i > -1; i--) {
            System.out.print(randomArray[i] + " ");
        }
    }

}
