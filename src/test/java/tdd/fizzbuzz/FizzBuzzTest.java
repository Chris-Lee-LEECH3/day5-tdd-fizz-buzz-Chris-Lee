package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_order_1() {
        // given
        int order = 1;

        // when
        String word = FizzBuzz.countOff(order);

        // then
        String exceptedResult = "1";

        assertEquals(exceptedResult, word);
    }

    @Test
    public void should_return_2_when_order_2() {
        // given
        int order = 2;

        // when
        String word = FizzBuzz.countOff(order);

        // then
        String exceptedResult = "2";

        assertEquals(exceptedResult, word);
    }

}
