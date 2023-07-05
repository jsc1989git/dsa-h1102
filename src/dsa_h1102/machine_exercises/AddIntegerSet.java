package dsa_h1102.machine_exercises;

import java.util.HashSet;
import java.util.Set;

public class AddIntegerSet {
    public static void main(String[] args) {
        //Declare a set of integers called "numbers"
        Set<Integer> numbers = new HashSet<>();
        //Add some integers to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        //Declare an integer variable called "sum" and initialize it to 0
        int sum = 0;
        //Loop through the set and add each integer to the "sum" variable
        for (int number : numbers) {
            sum += number;
        }
        //Print the value of "sum"
        System.out.println("The sum is: " + sum);
    }
}
