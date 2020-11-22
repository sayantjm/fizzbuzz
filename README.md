## Background 
The Aeroplane class already defines a method called "fly" and has an implementation for it.
The Car class already has an implementation for "drive".
   
## The problem  
Write a program that prints the numbers from 1 to 100.
But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".

For numbers which are multiples of both three and five print "FizzBuzz".

## Solution 1
The shortest way for doing it is using a lambda 
## Solution 2
As the proposal was to use some patter and not the shortest solution, we have Used the Iterator Design Pattern. This pattern allows the iteration through a collection of specific items.

* The Container is the interface used for providing the iterator
* CollectionOfNumbersIterate: Implements the iterator for the specific item FizzBuzzNumber
* FizzBuzzNumber: Class that is able to identify if a number is multiple of 3, 5 or both.
* FizzNumberRepository: Creates the iterator for FizzBuzzNumber
