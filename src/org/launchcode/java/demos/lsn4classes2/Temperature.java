package org.launchcode.java.demos.lsn4classes2;

public class Temperature {

    private double farenheit;

    // static fields(variables) are shared by all instances of the class
    // saves time over storing absolute zero in farenheit in each instance of this class
    private static double absoluteZeroFarenheit = -459.67;

    // and Java doesn't have a constant keyword for its fields(variables)
    // so it becomes:
    // "static final"
    public static final double PI = 3.14159;

    // static is shared, final is never changing, static final is just accommodating the lack of "constant"

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double aFarenheit) {

        if (aFarenheit < absoluteZeroFarenheit) {
            throw new IllegalArgumentException("Value is below absolute zero");
        }

        farenheit = aFarenheit;
    }
}
