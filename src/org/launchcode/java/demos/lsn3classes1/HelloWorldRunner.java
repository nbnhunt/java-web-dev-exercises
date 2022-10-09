package org.launchcode.java.demos.lsn3classes1;

public class HelloWorldRunner {

    // static methods belong to the class as a whole, and not to specific instances of the class
    // also called class methods.
    // static/class methods must not rely on data from a specific object
    public static void main(String[] args) {

        // in the main method, create an instance of your class object HelloWorld
        // the object 'hello' is a variable of the type HelloWorld, and it's value is a new HelloWorld object
        HelloWorld hello = new HelloWorld("Hello World!");
        // hello.sayHello();
        System.out.println(hello.getGreeting());

        HelloWorld goodnight = new HelloWorld("Goodnight, World.");

        System.out.println(goodnight.getGreeting());
    }
}
