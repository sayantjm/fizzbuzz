import java.util.Iterator;

/**
 * Created by sayantjm on 21/11/20
 * This class saves the position of the iterator, can check if there are more
 * elements to iterate and returns the value from next position
 */
public class CollectionOfNumbersIterate implements Iterator<FizzBuzzNumber> {

    private int position = 0;
    private FizzNumberRepository fizzNumberRepository;

    public CollectionOfNumbersIterate(FizzNumberRepository fizzNumberRepository) {
        super();
        this.fizzNumberRepository = fizzNumberRepository;
    }

    @Override
    public boolean hasNext() {
        if (position < fizzNumberRepository.getFizzBuzzNumbers().size()) {
            return true;
        }
        return false;
    }

    @Override
    public FizzBuzzNumber next() {
        if (this.hasNext()) {
            return fizzNumberRepository.getFizzBuzzNumbers().get(position++);
        }
        return null;
    }
}
