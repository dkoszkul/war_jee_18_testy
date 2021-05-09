package pl.coderslab.tdd.assertions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SimpleCalculatorTest{

    @Test
    public void shouldAdd() {
        // given
        int a = 1;
        int b = 2;

        // when
        int result = new SimpleCalculator().add(a,b);

        // then
        assertThat(result, is(3));
    }

    @Test
    public void shouldAddPositive() {
        // given
        int a = 1;
        int b = 2;

        // when
        int result = new SimpleCalculator().addPositve(a,b);

        // then
        assertThat(result, is(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenXIsNegative() {
        // given
        int a = -1;
        int b = 2;

        // when
        new SimpleCalculator().addPositve(a,b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenYIsNegative() {
        // given
        int a = 1;
        int b = -2;

        // when
        new SimpleCalculator().addPositve(a,b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenXAndYAreNegative() {
        // given
        int a = -1;
        int b = -2;

        // when
        new SimpleCalculator().addPositve(a,b);
    }

    @Test
    public void evaluatesExpression() {
        SimpleCalculator calculator = new SimpleCalculator();
        int sum = calculator.eval("1+2+3");
        assertEquals(6, sum);
    }
}