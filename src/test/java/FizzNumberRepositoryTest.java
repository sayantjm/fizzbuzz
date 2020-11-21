import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by sayantjm on 21/11/20
 */
public class FizzNumberRepositoryTest {
    private FizzNumberRepository repository;
    private List<Integer> listIntegers;

    @BeforeEach
    public void setup() {
        listIntegers = Arrays.asList(0,4,9,15,25);
        FizzNumberRepository repository = new FizzNumberRepository(listIntegers);
    }

    @Test
    public void constructorTest() {
        FizzNumberRepository repository = new FizzNumberRepository(this.listIntegers);
        assertNotNull(repository);
        assertEquals(5, repository.getFizzBuzzNumbers().size());
        assertNotNull(repository.getIterator());
    }

    @Test
    public void iteratorNextTest() {
        List<Integer> listIntegers = Arrays.asList(0,4,9,15,25);
        FizzNumberRepository repository = new FizzNumberRepository(listIntegers);
        assertNotNull(repository);
        assertEquals(5, repository.getFizzBuzzNumbers().size());
        Iterator<FizzBuzzNumber> iterator = repository.getIterator();
        assertNotNull(iterator);
        assertEquals("FizzBuzz", iterator.next().getFizzNumber());
        assertEquals("4", iterator.next().getFizzNumber());
        assertEquals("Fizz", iterator.next().getFizzNumber());
        assertEquals("FizzBuzz", iterator.next().getFizzNumber());
        assertEquals("Buzz", iterator.next().getFizzNumber());
    }

    @Test
    public void iteratorHasNextTest() {
        List<Integer> listIntegers = Arrays.asList(0,4,9,15,25);
        FizzNumberRepository repository = new FizzNumberRepository(listIntegers);
        assertNotNull(repository);
        assertEquals(5, repository.getFizzBuzzNumbers().size());
        Iterator<FizzBuzzNumber> iterator = repository.getIterator();
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        while(iterator.hasNext()) {
            iterator.next();
        }
        assertFalse(iterator.hasNext());
    }
}
