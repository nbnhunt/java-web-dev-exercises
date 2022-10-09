package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        Cat salem = new Cat(8) {
            // implemented stuff to remove angry red line after unexpected merge error
            @Override
            public String noise() {
                return null;
            }
        };

    }
}
