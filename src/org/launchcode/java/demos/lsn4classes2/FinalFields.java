package org.launchcode.java.demos.lsn4classes2;

// fields are variables

public class FinalFields {

    public final int intValue = 42;
    // public final double doubleValue;
    public final FortyTwo objectValue = new FortyTwo();

    public static void main(String[] args) {

        FinalFields demo = new FinalFields();

        // demo.doubleValue = 42.0;
        // the book says that should be allowed but intelliJ says 'no'.

        // See 5.1.1. in the book. you dont' need to type that out
        // final fields can't be changed after initialization
        // for primitive fields
        // for final object fields we can change the values in the object

    }

}
