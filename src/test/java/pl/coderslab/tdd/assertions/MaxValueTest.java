package pl.coderslab.tdd.assertions;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaxValueTest {

    @Test
    public void findLargest() {
        // given
        int[] list = new int[]{1,2,3};

        // when
        int result = MaxValue.largest(list);

        // then
        assertThat(result, is(3));
    }

    @Test
    public void findLargestWhenLargestInTheMiddle() {
        // given
        int[] list = new int[]{1,4,2};

        // when
        int result = MaxValue.largest(list);

        // then
        assertThat(result, is(4));
    }

    @Test
    public void findLargestWhenAllAreTheSame() {
        // given
        int[] list = new int[]{1,1,1};

        // when
        int result = MaxValue.largest(list);

        // then
        assertThat(result, is(1));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenTableIsEmpty() {
        // when
        MaxValue.largest(new int[]{});
    }

}
