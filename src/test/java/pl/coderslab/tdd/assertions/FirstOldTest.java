package pl.coderslab.tdd.assertions;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FirstOldTest {

    @Test
    public void testConcatString() {
        // given
        String first = "ala";
        String second = "bela";

        // when
        String result = new First().concatString(first, second);

        // then
        assertThat(result)
                .isNotNull()
                .isNotEmpty()
                .isEqualTo("alabela");

    }
}