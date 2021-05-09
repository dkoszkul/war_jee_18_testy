package pl.coderslab.tdd;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void shouldCalculateCircleArea() {
        // when
        BigDecimal result = Circle.circleArea(5);

        // then
        assertThat(result, is(BigDecimal.valueOf(78.54)));

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenRadiusIsNegative() {
        // when
        BigDecimal result = Circle.circleArea(-5);
    }

}