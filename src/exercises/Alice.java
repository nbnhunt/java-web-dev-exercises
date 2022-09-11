package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        String paragraph = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?";

        Scanner stringSearch = new Scanner(System.in);
        System.out.println("Search word: ");
        String word = stringSearch.nextLine().toLowerCase();
        stringSearch.close();

        boolean result = paragraph.contains(word);
        System.out.println("The paragraph contains the word: " + word + ": " + result);

    }

}