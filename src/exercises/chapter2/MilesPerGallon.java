package exercises.chapter2;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {

        Scanner gallons = new Scanner(System.in);
        System.out.println("How full is your tank?");
        int gas = gallons.nextInt();

        Scanner miles = new Scanner(System.in);
        System.out.println("How far are you going?");
        int distance = miles.nextInt();

        gallons.close();
        miles.close();

        System.out.println("You will get " + distance/gas + " miles to the gallon.");

    }

}
