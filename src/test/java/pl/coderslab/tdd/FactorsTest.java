package pl.coderslab.tdd;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactorsTest {

    @Test
    public void shouldGeneratePrimeFactors() {
        // when
        List<Integer> integers = Factors.generatePrimeFactors(10);

        // then
        assertThat(integers, is(List.of(1, 2, 5, 10)));
    }
}