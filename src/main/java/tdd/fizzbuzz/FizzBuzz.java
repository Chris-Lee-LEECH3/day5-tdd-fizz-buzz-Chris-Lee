package tdd.fizzbuzz;

public class FizzBuzz {

    public static String countOff(int order) {

        if (order % 5 == 0 && order % 3 == 0) {
            return "FizzBuzz";
        }

        if (order % 5 == 0) {
            return "Buzz";
        }

        if (order % 3 == 0) {
            return "Fizz";
        }

        return "" + order;
    }
}
