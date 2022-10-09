package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;

public class DayPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an interger: ");
        int dayNum = in.nextInt();

        String day;
        switch (dayNum) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Int doesn't correspond to a day of the week";
        }
        System.out.println(day);
    }
}
