package org.launchcode.java.demos.lsn2controlflowandcollections;

public class HelloMethods {

    public static void main(String[] args) {
        // for the static method from Message.java, we call the class, and use dot notation for the method, passing an argument.
        // you don't need to instance this class to get the method, because it's declared as static.
        String message = Message.getMessage("fr");
        System.out.println(message);
    }

}

/*
methods should be static when they do not refer to any instance fields(variables), but may refer to static fields(variables).
these methods are considered utilitarian. calculating or fetching. None of the fun stuff.
 */
