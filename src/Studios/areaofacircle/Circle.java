package Studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius) {

        if (radius <= 0) {
            System.err.println("That won't work.");
        } else if (radius.isNaN()) {
            System.err.println("please use a number.");
        } else {
            return 3.14 * radius * radius;
        }
        return radius;

    }
}
