package dsa_h1102;

import java.util.Scanner;

public class ArraySumUserInput {
    public static void main(String[] args) {
        //Create an integer array with five elements
        int[] array = new int[5];
        //Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five values.");

        //Instruct the user to input 5 values
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value no. " + (i+1) + ": ");
            array[i] = input.nextInt();
        }

        //Initialize a variable for the sum of the array's values
        int sum = 0;

        //For loop to iterate through the elements of the array and get the sum of all elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        //Display the sum of the array's values
        System.out.println("The sum of the array's values is: " + sum);
    }
}
