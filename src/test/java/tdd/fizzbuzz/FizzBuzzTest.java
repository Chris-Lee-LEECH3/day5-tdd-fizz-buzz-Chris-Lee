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

    @Test
    public void should_return_Fizz_when_order_is_3_and_multiple_of_3() {
        // given
        int order = 3;

        // when
        String word = FizzBuzz.countOff(order);

        // then
        String exceptedResult = "Fizz";

        assertEquals(exceptedResult, word);
    }

    @Test
    public void should_return_Fizz_when_order_is_6_and_multiple_of_3() {
        // given
        int order = 6;

        // when
        String word = FizzBuzz.countOff(order);

        // then
        String exceptedResult = "Fizz";

        assertEquals(exceptedResult, word);
    }

}
