package dsa_h1102.pseudocode;

public class BubbleSort {
    //Function to sort an array of integers in ascending order using the bubble sort algorithm
    function bubbleSort(arr):
        //Get the length of the input array
        n = length(arr)

        //Outer loop to iterate over the array elements
        for i = 0 to n-1
            //Inner loop to compare adjacent elements
            for j = 0 to n-i-2:
                //Swap adjacent elements if they are in the wrong order
                if arr[j] > arr[j+1]:
                    temp = arr[j]
                    arr[j] = arr[j+1]
                    arr[j+1] = temp

    //Return
}
