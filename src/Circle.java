import java.util.Scanner;

public class Circle {

    static double PI = 3.14159265359;

    public static void area(double radius) {
        System.out.println(PI * (radius * radius));
    }

    public static void circumference(double radius) {
        System.out.println(PI * 2 * radius);
    }

}
