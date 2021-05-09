package pl.coderslab.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleSampleTest {

    @Test
    public void shouldAddTwoIntegersSuccessfully() {
        // given  <--- Tutaj mają być dane wejściowe
        int a = 5;
        int b = 10;

        // when
        int result = a + b;

        // then
        assertEquals(15, result);
    }
}
