package dsa_h1102.machine_exercises;

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        //Step 1: Read in a text string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text string: ");
        String text = scanner.nextLine();

        //Step 2: Split the string into words and convert to lowercase
        String[] words = text.toLowerCase().split("\\W+");

        //Step 3: Create a HashMap to store word frequencies
        HashMap<String, Integer> frequencies = new HashMap<>();

        //Step 4: Loop over each word and update the frequency count
        for (String word : words) {
            if (frequencies.containsKey(word)) {
                frequencies.put(word, frequencies.get(word) + 1);
            } else {
                frequencies.put(word, 1);
            }
        }

        //Step 5: Print out the word frequencies
        for (String word : frequencies.keySet()) {
            int frequency = frequencies.get(word);
            System.out.println(word + ": " + frequency);
        }
    }
}
