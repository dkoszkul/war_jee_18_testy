package pl.coderslab.tdd;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static List<Integer> generatePrimeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
