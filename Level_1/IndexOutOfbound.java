package String.Level_1;

import java.util.Scanner;

public class IndexOutOfbound {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

// Uncomment the line below to observe the unhandled RuntimeException
// generateStringIndexOutOfBoundsException(text);

        // Call the method that safely handles the StringIndexOutOfBoundsException
        handleStringIndexOutOfBoundsException(text);

    }
    public static void generateStringIndexOutOfBoundsException(String text) {
        // Accessing an index equal to length, which is out of bounds (0 to length - 1)
        char ch = text.charAt(text.length());
    }

    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            char ch = text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught successfully: " + e);
        }
    }
}
