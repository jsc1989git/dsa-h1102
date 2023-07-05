package dsa_h1102.machine_exercises;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        //Step 1: Create an empty HAshPap to represent the phone book
        HashMap<String, String> phoneBook = new HashMap<>();

        //Step 2: Add entries to the phone book
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a name (or 'quit' to stop): ");
            String name = scanner.nextLine();
            if (name.equals("quit")) {
                break;
            }

            System.out.print("Enter a phone number: ");
            String number = scanner.nextLine();
            phoneBook.put(name, number);
        }

        //Step 3: Search the phone book for name
        System.out.print("Enter a name to search for: ");
        String searchName = scanner.nextLine();
        if (phoneBook.containsKey(searchName)) {
            String number = phoneBook.get(searchName);
            System.out.println(number);
        } else {
            System.out.println("Name not found");
        }

        //Step 4: Print out the entire phone book
        for (String name : phoneBook.keySet()) {
            String number = phoneBook.get(name);
            System.out.println(name + ": " + number);
        }
    }
}
