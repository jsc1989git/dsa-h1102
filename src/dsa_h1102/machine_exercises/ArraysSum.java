package dsa_h1102.machine_exercises;

public class ArraysSum {
    public static void main(String[] args) {
        //Declare and initialize array
        int[] array = {25, 4, 16, 9, 10};
        //Initialize sum
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            //Calculate sum of array values
            sum += array[i];
        }

        System.out.println("The sum of the array's values is: " + sum);
    }
}
