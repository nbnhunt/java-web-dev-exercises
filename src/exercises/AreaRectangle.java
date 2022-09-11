package exercises;

import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {

        Scanner length = new Scanner(System.in);
        System.out.println("What is the length of your rectangle:");
        int wide = length.nextInt();


        Scanner width = new Scanner(System.in);
        System.out.println("What is the height of your rectangle:");
        int tall = width.nextInt();

        length.close();
        width.close();

        System.out.println("The area of your rectangle is: " + wide * tall);

    }
}
