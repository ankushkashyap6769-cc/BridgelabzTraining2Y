package String.Level_2;

import java.util.Scanner;

public class CustomStringLength {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        int customLength = 0;
        try {
            while (true) {
                userInput.charAt(customLength);
                customLength++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached end of string
        }

        int builtInLength = userInput.length();

        System.out.println("Length calculated without length() method: " + customLength);
        System.out.println("Length calculated with built-in length() method: " + builtInLength);
    }
}
