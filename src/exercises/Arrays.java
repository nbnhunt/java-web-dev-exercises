package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        // #1
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int num : integerArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        // #2
        String seuss = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        // Solution provided in book produces error:
        String[] seussArray = seuss.split("\\.");
        System.out.println(Arrays.toString(seussArray));



    }
}
// add to commit