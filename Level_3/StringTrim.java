package String.Level_3;
import java.util.Scanner;
public class StringTrim {
    public static int[] getTrimBounds(String str) {
        int start = 0;
        int end = 0;

        try {
            while (true) {
                str.charAt(end);
                end++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
        end--;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String str, int start, int end) {
        if (start > end || start < 0) {
            return "";
        }

        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        int len1 = 0;
        int len2 = 0;

        try {
            while (true) {
                str1.charAt(len1);
                len1++;
            }
        } catch (IndexOutOfBoundsException e) {

        }

        try {
            while (true) {
                str2.charAt(len2);
                len2++;
            }
        } catch (IndexOutOfBoundsException e) {

        }

        if (len1 != len2) {
            return false;
        }

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String userInput = scanner.nextLine();

        int[] bounds = getTrimBounds(userInput);
        String customTrimmed = createSubstring(userInput, bounds[0], bounds[1]);

        String builtInTrimmed = userInput.trim();

        boolean isEqual = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("Custom Trimmed Output : \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed Output: \"" + builtInTrimmed + "\"");
        System.out.println("Are both outputs equal? " + isEqual);
    }
}
