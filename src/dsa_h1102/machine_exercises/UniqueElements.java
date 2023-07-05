package dsa_h1102.machine_exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        //Declare an array containing some integers
        int[] inputArray = { 2, 5, 2, 7, 8, 5 };
        //Declare a set called "uniqueElements"
        Set<Integer> uniqueElements = new HashSet<>();
        //Loop through each element in "inputArray"
        for (int i = 0; i < inputArray.length; i++) {
            int element = inputArray[i];
            //If the element is not already in "uniqueElements", add it
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
            }
        }
        //Print out the contents of "uniqueElements"
        System.out.println("Unique elements: " + Arrays.toString(uniqueElements.toArray()));
    }
}
