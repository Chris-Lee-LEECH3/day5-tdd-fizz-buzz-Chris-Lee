package tdd.fizzbuzz;

public class FizzBuzz {

    public static String countOff(int order) {
        boolean isMultipleOf3 = order % 3 == 0;
        boolean isMultipleOf5 = order % 5 == 0;

        if (isMultipleOf3 && isMultipleOf5) {
            return "FizzBuzz";
        }

        if (isMultipleOf3) {
            return "Fizz";
        }

        if (isMultipleOf5) {
            return "Buzz";
        }

        return "" + order;
    }
}
