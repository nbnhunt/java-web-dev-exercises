package exercises;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        input.close();
        System.out.println("Hello " + name);

    }


}
