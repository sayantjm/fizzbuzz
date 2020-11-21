import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sayantjm on 21/11/20
 */
public class FizzBuzzNumberTest {

    @Test
    public void testFizzBuzzNumber() {
        /**
         * Scenario 1: Number that is not multiple
         */
        FizzBuzzNumber number = new FizzBuzzNumber(4);
        assertEquals("4", number.getFizzNumber());

        /**
         * Scenario 2: Number that is multiple of 3
         */
        FizzBuzzNumber numberMult3 = new FizzBuzzNumber(9);
        assertEquals("Fizz", numberMult3.getFizzNumber());

        /**
         * Scenario 3: Number that is multiple of 5
         */
        FizzBuzzNumber numberMult5 = new FizzBuzzNumber(55);
        assertEquals("Buzz", numberMult5.getFizzNumber());

        /**
         * Scenario 4: Number that is multiple of 3 and 5
         */
        FizzBuzzNumber numberMult3And5 = new FizzBuzzNumber(15);
        assertEquals("FizzBuzz", numberMult3And5.getFizzNumber());

        /**
         * Scenario 5: negative number
         */
        FizzBuzzNumber negativeNumber = new FizzBuzzNumber(-6);
        assertEquals("Fizz", negativeNumber.getFizzNumber());
    }
}
