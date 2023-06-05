package dsa_h1102;

import java.util.LinkedList;

public class LinkedListFruits {
    public static void main(String[] args) {


        // Create Linkedlist
        LinkedList<String> fruits = new LinkedList<>();


        // Add elements to LinkedList
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        //Print the list
        System.out.println("LinkedList: " + fruits);

        //Add orange to the beginning of the list
        fruits.addFirst("orange");

        //Print the updated list
        System.out.println("Updated list without orange: " + fruits);

        //Remove an element from the list
        fruits.remove(1);

        //Print the updated list
        System.out.println("Updated list without one fruit: " + fruits);

        //Get an element at a specific index
        String fruit = fruits.get(2);
        System.out.println("Fruit at index 2: " + fruit);

        //Print the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: " + size);
    }
}
