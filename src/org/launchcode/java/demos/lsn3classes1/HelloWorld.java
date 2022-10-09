package org.launchcode.java.demos.lsn3classes1;

public class HelloWorld {

    private String greeting = "Hello, World";

    // after fields(variables) are declared, you can add the constructor
    // constructors set initial values of fields when creating a new object
    // they are the blueprint part of the "classes are blueprints of objects"
    public HelloWorld(String greeting) {
        this.greeting = greeting;
    }

    // getter
    public String getGreeting() {
        return greeting;
    }

    // setter
    public void setGreeting(String aGreeting) {
        greeting = aGreeting;
    }

    // public void sayHello() {
        // this local variable is shadowing the earlier field
        // String greeting = "Goodnight, World.";

        // System.out.println(greeting);

        // System.out.println(this.greeting);
    // }

}