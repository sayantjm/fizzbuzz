import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sayantjm on 21/11/20
 */
public class CollectionOfNumberIterateTest {

    private CollectionOfNumbersIterate collectionOfNumbersIterate;

    @BeforeEach
    public void setup() {
        List<Integer> listIntegers = Arrays.asList(0,4,9,15, 25);
        FizzNumberRepository repository = new FizzNumberRepository(listIntegers);
        collectionOfNumbersIterate = new CollectionOfNumbersIterate(repository);
    }

    @Test
    public void constructorTest() {
        assertNotNull(collectionOfNumbersIterate);
    }

    @Test
    public void hasNextTest() {
        assertTrue(collectionOfNumbersIterate.hasNext());
    }

    @Test
    public void nextTest() {
        assertEquals("FizzBuzz", collectionOfNumbersIterate.next().getFizzNumber());
        assertEquals("4", collectionOfNumbersIterate.next().getFizzNumber());
        assertEquals("Fizz", collectionOfNumbersIterate.next().getFizzNumber());
        assertEquals("FizzBuzz", collectionOfNumbersIterate.next().getFizzNumber());
        assertEquals("Buzz", collectionOfNumbersIterate.next().getFizzNumber());
    }

    @Test
    public void nullPointerExceptionTest() {
        try {
            assertEquals("FizzBuzz", collectionOfNumbersIterate.next().getFizzNumber());
            assertEquals("4", collectionOfNumbersIterate.next().getFizzNumber());
            assertEquals("Fizz", collectionOfNumbersIterate.next().getFizzNumber());
            assertEquals("FizzBuzz", collectionOfNumbersIterate.next().getFizzNumber());
            assertEquals("Buzz", collectionOfNumbersIterate.next().getFizzNumber());
            assertEquals("null", collectionOfNumbersIterate.next().getFizzNumber());
        } catch ( NullPointerException npe) {
            assertNotNull(npe);
        }
    }

    @Test
    public void notHasNextTest() {
        assertEquals("FizzBuzz", collectionOfNumbersIterate.next().getFizzNumber());
        assertEquals("4", collectionOfNumbersIterate.next().getFizzNumber());
        assertEquals("Fizz", collectionOfNumbersIterate.next().getFizzNumber());
        assertEquals("FizzBuzz", collectionOfNumbersIterate.next().getFizzNumber());
        assertEquals("Buzz", collectionOfNumbersIterate.next().getFizzNumber());
        assertFalse(collectionOfNumbersIterate.hasNext());
    }

}
