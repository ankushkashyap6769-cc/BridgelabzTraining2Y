package String.Level_1;

import java.util.Scanner;

public class StringCompare {
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        boolean isCustomEqual = compareStrings(str1, str2);
        boolean isBuiltInEqual = str1.equals(str2);

        boolean resultsMatch = (isCustomEqual == isBuiltInEqual);

        System.out.println("Custom charAt comparison result: " + isCustomEqual);
        System.out.println("Built-in equals comparison result: " + isBuiltInEqual);
        System.out.println("Do both comparison results match? " + resultsMatch);
    }
}
