package pl.coderslab.tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
    public static BigDecimal circleArea(int r) {
        if (r < 0) {
            throw new IllegalArgumentException("Radius must be positive value.");
        }
        return BigDecimal.valueOf(Math.PI * Math.pow(r, 2)).setScale(2, RoundingMode.HALF_UP);
    }
}
