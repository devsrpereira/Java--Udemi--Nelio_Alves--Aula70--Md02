package util;

public class Calculator {
    public final double PI = 3.14159;

    public double circunference(double radius) {
        return 2.00 * PI * radius;
    }

    public double volume(double radius) {
        return 4.00 * PI * Math.pow(radius,3) / 3.00;
    }

}
