/**
 * Created by sayantjm on 21/11/20
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
