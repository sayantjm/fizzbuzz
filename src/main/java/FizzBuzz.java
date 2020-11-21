import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
    IMPORTANT:
	The aim of this exercise is to showcase your coding skills. Please do not think that we expect you to deliver
	the minnimun ammount of code required for this exercise to work.
	You are allowed to modify all the provided code. Do not think that provided classes have to remain untouched.
	Things that We take into consideration: Use of design patterns, clean code, testing.

    The Problem:
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three print "Fizz" instead of the number
    and for the multiples of five print "Buzz".
    For numbers which are multiples of both three and five print "FizzBuzz".

 */
public class FizzBuzz {

    public static void main(String... args) {
        /**
         * Simple solution without using design patterns
         */
        System.out.println("Simple solution without using design patterns");
        System.out.println("------------------------------------------------------");
        IntStream.rangeClosed(0, 100)
                .mapToObj(number -> new FizzBuzzNumber(number))
                .forEach(x -> System.out.print("<".concat(x.getFizzNumber().concat(">"))));


        /**
         * Solution using Iterator design pattern
         */
        System.out.println("\n------------------------------------------------------");
        System.out.println("Solution using Iterator design pattern");
        System.out.println("------------------------------------------------------");

        List<Integer> listIntegers = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toList());
        FizzNumberRepository repository = new FizzNumberRepository(listIntegers);
        Iterator<FizzBuzzNumber> repositoryIterator = repository.getIterator();
        while(repositoryIterator.hasNext()) {
            System.out.print("<".concat(repositoryIterator.next().getFizzNumber()).concat(">"));
        }
    }
}
