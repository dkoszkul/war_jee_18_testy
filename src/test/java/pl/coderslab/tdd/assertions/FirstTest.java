package pl.coderslab.tdd.assertions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FirstTest {

    @Test
    public void shouldConcatTwoStringsIntoOne() {
        // given
        String a = "Ala";
        String b = "Bela";

        // when
        String result = new First().concatString(a, b);

        // then
        // te asercje są tożsame ze sobą
        assertThat(result, is(a + b));
        assertThat(result, is("AlaBela"));
    }

    @Test
    public void shouldConcatTwoStringsIntoOneWhenFirstIsNull() {
        // given
        String a = null;
        String b = "Bela";

        // when
        String result = new First().concatString(a, b);

        // then
        assertThat(result, is("nullBela"));
    }

    @Test
    public void shouldMultiplyTwoValuesAndReturnProperResult() {
        // given
        int first = 5;
        int second = 10;

        // when
        int result = new First().multiply(first, second);

        // then
        assertThat(result, is(50));
    }

}