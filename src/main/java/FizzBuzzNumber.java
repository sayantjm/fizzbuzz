/**
 * Created by sayantjm on 21/11/20
 * FizzBuzzNumber is built with a number
 * when getFizzNumber is requested, there is a validation returns a String
 * when the number is multiple of three then Fizz is returned
 * when the number is multiple of five then Buzz is returned
 * when the number is multiple of three and five then FizzBuzz is returned
 * when the number is not a multiple then the number is returned as String
 */
public class FizzBuzzNumber {
    int number;

    public FizzBuzzNumber(int number) {
        this.number = number;
    }

    public String getFizzNumber() {
        return isFizzBuzz(number) ? "FizzBuzz"
                : isFizz(number) ? "Fizz"
                : isBuzz(number) ? "Buzz"
                : String.valueOf(number);
    }

    boolean isFizz(int number) {
        return number % 3 == 0;
    }

    boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    boolean isFizzBuzz(int number) {
        return ((number % 3 == 0) & (number % 5 == 0));
    }
}
