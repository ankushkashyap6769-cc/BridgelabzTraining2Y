package String.Level_1;

import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        char[] customCharArray = getCharacters(text);
        char[] builtInCharArray = text.toCharArray();

        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);

        System.out.println("Custom char array length: " + customCharArray.length);
        System.out.println("Built-in toCharArray length: " + builtInCharArray.length);
        System.out.println("Are both character arrays equal? " + areEqual);

    }
}
