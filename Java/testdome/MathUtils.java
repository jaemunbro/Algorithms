package testdome;

import static java.lang.Math.round;

public class MathUtils {
    public static double average(int a, int b) {
        return (float) (a + b) / 2;
    }

    public static void main(String[] args) {
        System.out.println(average(2,1));
    }
}
