package pl.coderslab.tdd.assertions;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int divider) {
        if (divider == 0) {
            throw new IllegalArgumentException("Divider needs to be different than 0");
        }
        return x / divider;
    }

    public boolean greater(int a, int b) {
        return a > b;
    }
}
