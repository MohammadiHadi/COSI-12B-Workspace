package Week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("test1.txt"));
        Set<String> wordsInBook = new HashSet<>();
        while (fileScanner.hasNext()) {
        String word = fileScanner.next().toLowerCase();

        wordsInBook.add(word);
        }

        System.out.print("Enter a word to check if it is in the book: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().toLowerCase();

        if (wordsInBook.contains(word)) {
        System.out.println("'" + word + "' is contained in the book.");
        } else {
        System.out.println("'" + word + "' is NOT contained in the book.");
        }
    }
}



