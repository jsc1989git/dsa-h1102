package dsa_h1102;

public class ArraysSpecValue {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] array = {3, 7, 12, 6, 18};
        //Assign a variable for the value to be checked
        int specificValue = 7;
        //Initialize a boolean to check if the value is found
        boolean containsValue = false;

        for (int i = 0; i < array.length; i++) {
            //Check if any of the element in the array is equal to the value to be checked
            if (array[i] == specificValue) {
                //Set boolean value to true if specific value is found
                containsValue = true;
                //Break the loop once the specific value is found
                break;
            }
        }

        if (containsValue) {
            System.out.println("The array contains the value " + specificValue);
        } else {
            System.out.println("The array does not contain the value " + specificValue);
        }
    }
}
