package String.Level_3;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static char findFirstNonRepeatingChar(String str) {
        int[] frequency = new int[256];

        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {

        }

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        char result = findFirstNonRepeatingChar(userInput);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
