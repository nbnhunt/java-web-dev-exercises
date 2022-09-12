package Studios;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius: ");
        double radius = input.nextDouble();
        double radiusCircle = Circle.getArea(radius);

        input.close();

        System.out.println("The area of your circle of radius " + radius + " is: " + radiusCircle);


    }
}
