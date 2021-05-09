package pl.coderslab.tdd.assertions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldAdd() {
        // given
        int a = 1;
        int b = 2;

        // when
        int result = calculator.add(a, b);

        // then
        assertThat(result, is(3));
    }

    @Test
    public void shouldSubtract() {
        // given
        int a = 1;
        int b = 2;

        // when
        int result = calculator.subtract(a, b);

        // then
        assertThat(result, is(-1));
    }

    @Test
    public void shouldMultiply() {
        // given
        int a = 3;
        int b = 2;

        // when
        int result = calculator.multiply(a, b);

        // then
        assertThat(result, is(6));
    }

    @Test
    public void shouldDivide() {
        // given
        int a = 6;
        int b = 2;

        // when
        int result = calculator.divide(a, b);

        // then
        assertThat(result, is(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenDivideByZero() {
        // given
        int a = 6;
        int b = 0;

        // when
        int result = calculator.divide(a, b);
    }

    @Test
    public void shouldReturnTrueWhenLeftGreater() {
        // given
        int a = 6;
        int b = 2;

        // when
        boolean result = calculator.greater(a, b);

        // then
        assertThat(result, is(true));
    }

    @Test
    public void shouldReturnFalseWhenLeftSmaller() {
        // given
        int a = 2;
        int b = 6;

        // when
        boolean result = calculator.greater(a, b);

        // then
        assertThat(result, is(false));
    }

    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.eval("1+2+3");
        assertEquals(6, sum);
    }
}