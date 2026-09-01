package String.Level_1;

import java.util.Scanner;

public class NoFormatExp {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

// Uncomment the line below to observe the unhandled RuntimeException
// generateNumberFormatException(text);

        // Call the method that safely handles the NumberFormatException
        handleNumberFormatException(text);

    }
    public static void generateNumberFormatException(String text) {
        // Parsing non-numeric text throws NumberFormatException
        int number = Integer.parseInt(text);
    }

    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught successfully: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught successfully: " + e);
        }
    }
}
