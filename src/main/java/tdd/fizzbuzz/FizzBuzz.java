package tdd.fizzbuzz;

public class FizzBuzz {

    public static String countOff(int order) {

        if (order % 3 == 0) {
            return "Fizz";
        }

        return "" + order;
    }
}
