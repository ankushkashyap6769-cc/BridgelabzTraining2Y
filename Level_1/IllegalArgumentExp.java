package String.Level_1;

import java.util.Scanner;

public class IllegalArgumentExp {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

// Uncomment the line below to observe the unhandled RuntimeException
// generateIllegalArgumentException(text);

        // Call the method that safely handles the Exception
        handleIllegalArgumentException(text);

    }
    public static void generateIllegalArgumentException(String text) {
        // Setting start index greater than end index throws StringIndexOutOfBoundsException (subclass of IndexOutOfBoundsException/RuntimeException)
        String sub = text.substring(5, 2);
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            String sub = text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught successfully: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught successfully: " + e);
        }
    }
}
