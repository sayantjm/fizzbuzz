import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sayantjm on 21/11/20
 */
public class FizzNumberRepository implements Container {

    private List<FizzBuzzNumber> listItems;

    public FizzNumberRepository(List<Integer> listNumbers) {
        listItems = new ArrayList<>();

        if (CollectionUtils.isNotEmpty(listNumbers)) {
            listNumbers.stream().
                    map(number -> new FizzBuzzNumber(number))
                    .forEach(fizzBuzzNumber -> listItems.add(fizzBuzzNumber));
        }
    }

    public List<FizzBuzzNumber> getFizzBuzzNumbers() {
        return listItems;
    }

    @Override
    public Iterator<FizzBuzzNumber> getIterator() {
        return new CollectionOfNumbersIterate(this);
    }
}
