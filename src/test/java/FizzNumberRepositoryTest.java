import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

    /**
     * Before executing any of the tests the list of values is created
     * and the repository is created
     */
    @BeforeEach
    public void setup() {
        listIntegers = Arrays.asList(0,4,9,15,25);
        FizzNumberRepository repository = new FizzNumberRepository(listIntegers);
    }

    /**
     * Testing the constructor
     */
    @Test
    public void constructorTest() {
        FizzNumberRepository repository = new FizzNumberRepository(this.listIntegers);
        assertNotNull(repository);
        assertEquals(5, repository.getFizzBuzzNumbers().size());
        assertNotNull(repository.getIterator());
    }

    /**
     * Testing constructor with a null list of numbers
     */
    @Test
    public void creatingRepositoryWithNullListTest() {
        FizzNumberRepository repository = new FizzNumberRepository(null);
        assertNotNull(repository);
        assertEquals(0, repository.getFizzBuzzNumbers().size());
        assertNotNull(repository.getIterator());
    }

    /**
     * Testing constructor with an empty list of numbers
     */
    @Test
    public void creatingRepositoryWithEmptyListTest() {
        FizzNumberRepository repository = new FizzNumberRepository(new ArrayList<>());
        assertNotNull(repository);
        assertEquals(0, repository.getFizzBuzzNumbers().size());
        assertNotNull(repository.getIterator());
    }

    /**
     * Testing method next until the iterator finishes
     */
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
    }

    /**
     * Null is returned if there is not more values and next() is requested
     */
    @Test
    public void nullIsReturnedWhenNoNextValuesTest() {
        List<Integer> listIntegers = Arrays.asList(25);
        FizzNumberRepository repository = new FizzNumberRepository(listIntegers);
        assertNotNull(repository);
        assertEquals(1, repository.getFizzBuzzNumbers().size());
        Iterator<FizzBuzzNumber> iterator = repository.getIterator();
        assertNotNull(iterator);
        assertEquals("Buzz", iterator.next().getFizzNumber());
        FizzBuzzNumber next = iterator.next();
        assertNull(next);
    }

    /**
     * Checking hasNext is true while there are pending elements
     * and it is false where there are no more elements
     */
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
