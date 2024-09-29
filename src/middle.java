import java.util.Scanner;

public class middle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        int word_length;
        do {
            System.out.println("Enter A Odd length word :");
            word = input.next();
            word_length = word.length();
            if (word_length % 2 == 0) {
                System.out.println("You entered word is even or null.");
            }
        } while (word_length % 2 == 0);
        System.out.println("Middle latter of " + word + " : " + word.charAt(word_length / 2));
    }
}