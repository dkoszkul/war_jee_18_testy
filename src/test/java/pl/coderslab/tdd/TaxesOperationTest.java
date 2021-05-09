package pl.coderslab.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxesOperationTest {

    @Test
    public void shouldCalculateVat() {
        // when
        double vatAmount = new TaxesOperation().calculateVat(100, 19);

        // then
        assertEquals(19, vatAmount, 0.1);
    }

}