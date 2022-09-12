package exercises.chapter3;

import java.util.ArrayList;

public class ArrayLists {
    // #3
    ArrayList<Integer> tenNumbers = new ArrayList<>(10);

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : tenNumbers) {
            if (integer % 2 == 0) {
                total += integer;
            }
            return total;
        }
    }
}
// add to commit