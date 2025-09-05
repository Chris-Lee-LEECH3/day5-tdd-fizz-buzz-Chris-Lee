package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_order_1() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int order = 1;

        // when
        String word = fizzBuzz.countOff(order);

        // then
        String exceptedResult = "1";

        assertEquals(exceptedResult, word);
    }

}
